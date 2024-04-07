/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code.dao;

import com.code.db.DBHelper;
import com.code.model.CTNhapHang;
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
public class CTNhapHangDao {
    
    public static List<CTNhapHang> getAllNhapHang(String ma) {
        List<CTNhapHang> list = new ArrayList<>();
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "SELECT a.id, a.maNhap, a.masp, a.soluong, a.dongia, b.tenMau, c.tenSize from CHITIETNHAPHANG a inner join Mau b on a.mamau = b.mamau inner join size c on a.masize = c.masize where a.maNhap='"+ma+"'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                CTNhapHang sv = new CTNhapHang();
                sv.setMaCTNH(rs.getInt(1));
                sv.setMaNhap(rs.getString(2));
                sv.setMaSP(rs.getString(3));
                sv.setSoLuong(rs.getInt(4));
                sv.setDonGia(rs.getFloat(5));
                sv.setTenMau(rs.getString(6));
                sv.setTenSize(rs.getString(7));
             
                list.add(sv);
            }
        } catch (Exception e) {
            System.out.println("Lỗi Kết Nối");
            e.printStackTrace();
        }
        return list;
    }

    public static int insertCTNhapHang(CTNhapHang nv) {
        int rs = 0;

        try {

            Connection con = DBHelper.getDBConnection();
            String sql = "INSERT INTO CHITIETNHAPHANG VALUES (?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nv.getMaNhap());
            stmt.setString(2, nv.getMaSP());
            stmt.setInt(3, nv.getSoLuong());
            stmt.setFloat(4, nv.getDonGia());
            stmt.setInt(5, nv.getMaMau());
            stmt.setInt(6, nv.getMaSize());

            rs = stmt.executeUpdate();
            System.out.print(rs);
        } catch (Exception e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }
        return rs;
    }

    public static int updateCTNhapHang(CTNhapHang nv) {
        int rs = 0;
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "UPDATE ChiTietNhapHang SET NGAYNHAP=?, MASP=?, SOLUONG=?, DONGIA=?, MAMAU=?, MASIZE=? WHERE ID=?";
            PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(7, nv.getMaCTNH());
            stmt.setString(1, nv.getMaNhap());
            stmt.setString(2, nv.getMaSP());
            stmt.setInt(3, nv.getSoLuong());
            stmt.setFloat(4, nv.getDonGia());
            stmt.setInt(5, nv.getMaMau());
            stmt.setInt(6, nv.getMaSize());
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }
        return rs;
    }

    public static int deleteCTNhapHang(String ma) {
        int rs = 0;
        try {
            Connection con = DBHelper.getDBConnection();
            System.out.println("ket noi thanh cong");
            String sql = "delete from CHITIETNHAPHANG  where ID = ?";
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
