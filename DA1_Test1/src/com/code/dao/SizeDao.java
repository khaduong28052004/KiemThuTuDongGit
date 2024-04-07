/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code.dao;

import com.code.db.DBHelper;
import com.code.model.Size;
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
public class SizeDao {

    public static List<Size> getAllSize() {
        List<Size> list = new ArrayList<>();
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "SELECT * FROM Size";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Size sv = new Size();
                sv.setMaSize(rs.getInt(1));
                sv.setTenSize(rs.getString(2));

                list.add(sv);
            }
        } catch (Exception e) {
            System.out.println("Lỗi Kết Nối");
            e.printStackTrace();
        }
        return list;
    }

    public static int insertSize(Size nv) {
        int rs = 0;

        try {

            Connection con = DBHelper.getDBConnection();
            String sql = "INSERT INTO Size(tenSize) VALUES (?)";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, nv.getTenSize());

            rs = stmt.executeUpdate();
            System.out.print(rs);
        } catch (Exception e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }
        return rs;
    }
public static List<Size> TimKiem(String ma) {
        List<Size> list = new ArrayList<>();
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "SELECT DISTINCT  a.masize ,a.tenSize FROM Size a inner join ChiTietSanPham b on a.maSize = b.maSize where maSP='"+ma+"'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Size sv = new Size();
                sv.setMaSize(rs.getInt(1));
                sv.setTenSize(rs.getString(2));

                list.add(sv);
            }
        } catch (Exception e) {
            System.out.println("Lỗi Kết Nối");
            e.printStackTrace();
        }
        return list;
    }
  

public static List<Size> fillToSize(String ma1, String ma2) {
        List<Size> list = new ArrayList<>();
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "select b.masize, b.tenSize from CHITIETSANPHAM a inner join Size b on a.MASIZE = b.MASIZE inner join Mau c on a.mamau = c.mamau where a.MASP = '"+ma1+"' and  c.tenMau = N'"+ma2+"'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Size sv = new Size();
                sv.setMaSize(rs.getInt(1));
                sv.setTenSize(rs.getString(2));

                list.add(sv);
            }
        } catch (Exception e) {
            System.out.println("Lỗi Kết Nối");
            e.printStackTrace();
        }
        return list;
}

   // Thêm Kha 
    public List<Size> getAllExceptByID(int ma) {
        List<Size> list = new ArrayList<>();
        Connection con = DBHelper.getDBConnection();
        String sql = "SELECT * FROM Size WHERE maSize = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, ma);
            try (ResultSet rs = stm.executeQuery()) {
                while (rs.next()) {
                    Size sv = new Size();
                    sv.setMaSize(rs.getInt(1));
                    sv.setTenSize(rs.getString(2));
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
