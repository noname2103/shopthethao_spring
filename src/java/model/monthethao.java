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
/**
 *
 * @author trung
 */
@Entity (name = "monthethao")
public class monthethao {
    @Id
    private Integer Mamon ;
    private String TenMon ;
    private String HinhAnh ;
    
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "MaMon")
    private List<monthethao> listmonthethao;

    public monthethao() {
    }

    public monthethao(Integer Mamon, String TenMon, String HinhAnh) {
        this.Mamon = Mamon;
        this.TenMon = TenMon;
        this.HinhAnh = HinhAnh;
    }

    public Integer getMamon() {
        return Mamon;
    }

    public void setMamon(Integer Mamon) {
        this.Mamon = Mamon;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public List<monthethao> getListmonthethao() {
        return listmonthethao;
    }

    public void setListmonthethao(List<monthethao> listmonthethao) {
        this.listmonthethao = listmonthethao;
    }
    
}
