/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code.dao;

import com.code.db.DBHelper;
import com.code.model.Mau;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phuck
 */
public class MauDao {

    public static List<Mau> getAllMau() {
        List<Mau> list = new ArrayList<>();
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "SELECT * FROM Mau";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Mau sv = new Mau();
                sv.setMaMau(rs.getInt(1));
                sv.setTenMau(rs.getString(2));

                list.add(sv);
            }
        } catch (Exception e) {
            System.out.println("Lỗi Kết Nối");
            e.printStackTrace();
        }
        return list;
    }

    public static int insertMau(Mau nv) {
        int rs = 0;
        try {

            Connection con = DBHelper.getDBConnection();
            String sql = "INSERT INTO Mau VALUES (?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nv.getTenMau());

            rs = stmt.executeUpdate();
            System.out.print(rs);
        } catch (Exception e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }
        return rs;
    }


public static List<Mau> TimKiem(String ma) {
        List<Mau> list = new ArrayList<>();
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "SELECT DISTINCT  a.mamau, a.tenmau FROM Mau a inner join ChiTietSanPham b on a.mamau = b.mamau where maSP='"+ma+"'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Mau sv = new Mau();
                sv.setMaMau(rs.getInt(1));
                sv.setTenMau(rs.getString(2));

                list.add(sv);
            }
        } catch (Exception e) {
            System.out.println("Lỗi Kết Nối");
            e.printStackTrace();
        }
        return list;
    }

    
        
//    Them: Kha
    public List<Mau> getAllExceptByID(int ma) {
        List<Mau> list = new ArrayList<>();
        Connection con = DBHelper.getDBConnection();
        String sql = "SELECT * FROM Mau WHERE maMau = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, ma);
            try (ResultSet rs = stm.executeQuery()) {
                while (rs.next()) {
                    Mau sv = new Mau();
                    sv.setMaMau(rs.getInt(1));
                    sv.setTenMau(rs.getString(2));
                    list.add(sv);
                }
            }
        } catch (Exception ex) {
            System.out.println("Lỗi SQL: " + ex.getMessage());
            ex.printStackTrace();
            // Hoặc ghi log lỗi
        }
        return list;
    }

}
