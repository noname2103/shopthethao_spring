/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.List;
import javafx.scene.text.Text;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author trung
 */
@Entity (name="sanpham")
public class sanpham {
    @Id
    private Integer MaSP;
    @ManyToMany
    @JoinColumn(name ="loaisanpham")
    private loaisanpham loaisanpham;
    @ManyToMany
    @JoinColumn(name ="monthethao")
    private monthethao monthethao;
    
    private String TenSP;
    private String HinhAnh ;
    private Text MoTa;
    private Integer Gia ;
    private Integer MaMon;
    private Integer MaLoai;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "MaGioHang")
    private List<giohang> listgiohang;

    public sanpham() {
    }

    public sanpham(Integer MaSP, loaisanpham loaisanpham, monthethao monthethao, String TenSP, String HinhAnh, Text MoTa, Integer Gia, Integer MaMon, Integer MaLoai) {
        this.MaSP = MaSP;
        this.loaisanpham = loaisanpham;
        this.monthethao = monthethao;
        this.TenSP = TenSP;
        this.HinhAnh = HinhAnh;
        this.MoTa = MoTa;
        this.Gia = Gia;
        this.MaMon = MaMon;
        this.MaLoai = MaLoai;
    }

    public Integer getMaSP() {
        return MaSP;
    }

    public void setMaSP(Integer MaSP) {
        this.MaSP = MaSP;
    }

    public loaisanpham getLoaisanpham() {
        return loaisanpham;
    }

    public void setLoaisanpham(loaisanpham loaisanpham) {
        this.loaisanpham = loaisanpham;
    }

    public monthethao getMonthethao() {
        return monthethao;
    }

    public void setMonthethao(monthethao monthethao) {
        this.monthethao = monthethao;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public Text getMoTa() {
        return MoTa;
    }

    public void setMoTa(Text MoTa) {
        this.MoTa = MoTa;
    }

    public Integer getGia() {
        return Gia;
    }

    public void setGia(Integer Gia) {
        this.Gia = Gia;
    }

    public Integer getMaMon() {
        return MaMon;
    }

    public void setMaMon(Integer MaMon) {
        this.MaMon = MaMon;
    }

    public Integer getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(Integer MaLoai) {
        this.MaLoai = MaLoai;
    }

    public List<giohang> getListgiohang() {
        return listgiohang;
    }

    public void setListgiohang(List<giohang> listgiohang) {
        this.listgiohang = listgiohang;
    }
    
}
