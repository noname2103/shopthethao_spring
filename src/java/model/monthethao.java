/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import javax.persistence.Entity;
import javax.persistence.Id;
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
}
