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
@Entity (name ="thanhvien")
public class thanhvien {
    @Id
    private Integer MaTV;
    private String TenKH;
    private String Email;
    private String DiaChi;
    private String MatKhau;
}
