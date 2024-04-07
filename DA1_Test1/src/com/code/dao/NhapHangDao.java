/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code.dao;

import com.code.db.DBHelper;
import com.code.model.NhapHang;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
public class NhapHangDao {

    public static List<NhapHang> getAllNhapHang() {
        List<NhapHang> list = new ArrayList<>();
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "SELECT * FROM NHAPHANG";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                NhapHang sv = new NhapHang();
                sv.setMaNhap(rs.getString(1));
                sv.setNgayNhap(rs.getString(2));
                sv.setMaNV(rs.getString(3));
                sv.setMaNCC(rs.getString(4));
                sv.setTongTien(rs.getFloat(5));
                sv.setTongSoLuong(rs.getInt(6));
                sv.setHinhThucTT(rs.getString(7));
                list.add(sv);
            }
        } catch (Exception e) {
            System.out.println("Lỗi Kết Nối");
            e.printStackTrace();
        }
        return list;
    }

    public static int insertNhapHang(NhapHang nv) {
        int rs = 0;
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "INSERT INTO NHAPHANG VALUES (?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nv.getMaNhap());
            stmt.setString(2, nv.getNgayNhap());
            stmt.setString(3, nv.getMaNV());
            stmt.setString(4, nv.getMaNCC());
            stmt.setFloat(5, nv.getTongTien());
            stmt.setInt(6, nv.getTongSoLuong());
            stmt.setString(7, nv.getHinhThucTT());

            rs = stmt.executeUpdate();
            System.out.print(rs);
        } catch (Exception e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }
        return rs;
    }

    public static int updateNhapHang(NhapHang nv) {
        int rs = 0;
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "UPDATE NHAPHANG SET NGAYNHAP=?, MANV=?, MANCC=?, TONGTIEN=?, TONGSOLUONG=?, HINHTHUCTT=? WHERE MANHAP=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(7, nv.getMaNhap());
            stmt.setString(1, nv.getNgayNhap());
            stmt.setString(2, nv.getMaNV());
            stmt.setString(3, nv.getMaNCC());
            stmt.setFloat(4, nv.getTongTien());
            stmt.setInt(5, nv.getTongSoLuong());
            stmt.setString(6, nv.getHinhThucTT());
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }
        return rs;
    }
    
    public static int updateNhapHang2(NhapHang nv) {
        int rs = 0;
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "UPDATE NHAPHANG SET TONGTIEN=?, TONGSOLUONG=? WHERE MANHAP=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(3, nv.getMaNhap());
            stmt.setFloat(1, nv.getTongTien());
            stmt.setInt(2, nv.getTongSoLuong());
            
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }
        return rs;
    }

    public static int deleteNhapHang(String ma) {
        int rs = 0;
        try {
            Connection con = DBHelper.getDBConnection();
            System.out.println("ket noi thanh cong");
            String sql = "delete from NHAPHANG  where MANHAP = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, ma);
             rs = stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }
        return rs;
    }
}
