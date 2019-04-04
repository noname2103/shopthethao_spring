/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.util.ArrayList;
import java.util.Locale.Category;
import javax.persistence.Query;
import model.sanpham;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author DELL
 */
public class sanphamDAO {
    public ArrayList<sanpham> getAllcategory(){
         Session session = HibernateUtil.getSessionFactory().getCurrentSession();
         Transaction transaction = session.beginTransaction();
         org.hibernate.Query query = session.createQuery("from sanpham");
         ArrayList<sanpham> list = (ArrayList<sanpham>) query.list();
         transaction.commit();
         return list;
    }
    
    public static void main(String[] args) {
        System.out.println(new sanphamDAO().getAllcategory().size());
    }
}
