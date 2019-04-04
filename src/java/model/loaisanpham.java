/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
/**
/**
 *
 * @author trung
 */
@Entity (name = "loaisanpham")
public class loaisanpham {
    @Id
    private Integer MaLoai;
    private String TenLoai ;
    private String HinhAnh ;
    
//    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//    @JoinColumn(name = "MaLoai")
//    private List<loaisanpham> listloaisanpham;

    public loaisanpham() {
    }
    
    public loaisanpham(Integer MaLoai, String TenLoai, String HinhAnh) {
        this.MaLoai = MaLoai;
        this.TenLoai = TenLoai;
        this.HinhAnh = HinhAnh;
    }

    public Integer getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(Integer MaLoai) {
        this.MaLoai = MaLoai;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

//    public List<loaisanpham> getListloaisanpham() {
//        return listloaisanpham;
//    }
//
//    public void setListloaisanpham(List<loaisanpham> listloaisanpham) {
//        this.listloaisanpham = listloaisanpham;
//    }
    
}
