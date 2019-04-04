/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
/**
 *
 * @author trung
 */
@Entity (name = "giohang")
public class giohang {
    @Id
    private Integer MaGH;
    @ManyToMany
    @JoinColumn(name ="sanpham")
    private sanpham sanpham;
    @ManyToMany
    @JoinColumn(name ="thanhvien")
    private thanhvien thanhvien;
    private Integer MaTV;
    private Integer MaSP;
    private Integer TongGia;
    private String DiaChiGiaoHang;

    public giohang() {
    }

    public giohang(Integer MaGH, sanpham sanpham, thanhvien thanhvien, Integer MaTV, Integer MaSP, Integer TongGia, String DiaChiGiaoHang) {
        this.MaGH = MaGH;
        this.sanpham = sanpham;
        this.thanhvien = thanhvien;
        this.MaTV = MaTV;
        this.MaSP = MaSP;
        this.TongGia = TongGia;
        this.DiaChiGiaoHang = DiaChiGiaoHang;
    }

    public Integer getMaGH() {
        return MaGH;
    }

    public void setMaGH(Integer MaGH) {
        this.MaGH = MaGH;
    }

    public sanpham getSanpham() {
        return sanpham;
    }

    public void setSanpham(sanpham sanpham) {
        this.sanpham = sanpham;
    }

    public thanhvien getThanhvien() {
        return thanhvien;
    }

    public void setThanhvien(thanhvien thanhvien) {
        this.thanhvien = thanhvien;
    }

    public Integer getMaTV() {
        return MaTV;
    }

    public void setMaTV(Integer MaTV) {
        this.MaTV = MaTV;
    }

    public Integer getMaSP() {
        return MaSP;
    }

    public void setMaSP(Integer MaSP) {
        this.MaSP = MaSP;
    }

    public Integer getTongGia() {
        return TongGia;
    }

    public void setTongGia(Integer TongGia) {
        this.TongGia = TongGia;
    }

    public String getDiaChiGiaoHang() {
        return DiaChiGiaoHang;
    }

    public void setDiaChiGiaoHang(String DiaChiGiaoHang) {
        this.DiaChiGiaoHang = DiaChiGiaoHang;
    }
    
    
}
