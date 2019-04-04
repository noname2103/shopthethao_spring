/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 *
 * @author trung
 */
@Entity (name = "admin")
public class admin {
    @Id
    private Integer MaAdmin;
    private String MatKhau;

    public admin() {
    }

    public admin(Integer MaAdmin, String MatKhau) {
        this.MaAdmin = MaAdmin;
        this.MatKhau = MatKhau;
    }

    public Integer getMaAdmin() {
        return MaAdmin;
    }

    public void setMaAdmin(Integer MaAdmin) {
        this.MaAdmin = MaAdmin;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }
    
}
