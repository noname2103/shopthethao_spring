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
import javax.persistence.OneToMany;
/**
 *
 * @author trung
 */
@Entity (name ="thanhvien")
public class thanhvien {
    @Id
    private Integer MaTV;
    private String TenKH;
    private String Email;
    private String DiaChi;
    private String MatKhau;
    
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "MaGioHang")
    private List<giohang> listgiohang;

    public thanhvien() {
    }

    public thanhvien(Integer MaTV, String TenKH, String Email, String DiaChi, String MatKhau) {
        this.MaTV = MaTV;
        this.TenKH = TenKH;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.MatKhau = MatKhau;
    }

    public Integer getMaTV() {
        return MaTV;
    }

    public void setMaTV(Integer MaTV) {
        this.MaTV = MaTV;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public List<giohang> getListgiohang() {
        return listgiohang;
    }

    public void setListgiohang(List<giohang> listgiohang) {
        this.listgiohang = listgiohang;
    }
    
    
}
