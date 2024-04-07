/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code.dao;

import com.code.db.DBHelper;
import com.code.model.SanPhamChiTiet;
import com.raven.form.ChiTietSP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phuck
 */
public class SanPhamChiTietDao {

    public static List<SanPhamChiTiet> getAllChiTietSP(String ma) {
        List<SanPhamChiTiet> list = new ArrayList<>();
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "select b.id, b.masp, a.TENMAU, c.TENSIZE, b.DONGIA, b.SOLUONG from Mau a inner join CHITIETSANPHAM b on a.mamau = b.mamau inner join size c on b.masize = c.masize where b.masp ='" + ma + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                SanPhamChiTiet sv = new SanPhamChiTiet();
                sv.setMaSPCT(rs.getInt(1));
                sv.setMaSP(rs.getString(2));
                sv.setTenMau(rs.getString(3));
                sv.setTenSize(rs.getString(4));
                sv.setDonGia(rs.getFloat(5));
                sv.setSoLuong(rs.getInt(6));
                list.add(sv);
            }
        } catch (Exception e) {
            System.out.println("Lỗi Kết Nối");
            e.printStackTrace();
        }
        return list;
    }

    public int getAllSoLuong(String ma) {
        int soLuong = 0;
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "select sum(soLuong) from CHITIETSANPHAM where MASP ='" + ma + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                soLuong = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("Lỗi Kết Nối");
            e.printStackTrace();
        }
        return soLuong;
    }

    public static int insertCTSP(SanPhamChiTiet nv) {
        int rs = 0;
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "INSERT INTO ChiTietSanPham (masp,mamau,masize,dongia,soluong)VALUES (?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nv.getMaSP());
            stmt.setInt(2, nv.getMaMau());
            stmt.setInt(3, nv.getMaSize());
            stmt.setFloat(4, nv.getDonGia());
            stmt.setInt(5, nv.getSoLuong());
            rs = stmt.executeUpdate();
            System.out.print(rs);
        } catch (Exception e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }
        return rs;
    }

    public static int updateCTSP(SanPhamChiTiet nv) {
        int rs = 0;
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "UPDATE ChiTietSanPham SET  soLuong=?, mamau=?, masize=? WHERE id=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, nv.getSoLuong());
            stmt.setInt(2, nv.getMaMau());
            stmt.setInt(3, nv.getMaSize());

            stmt.setInt(4, nv.getMaSPCT());
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }
        return rs;
    }

    public static int updateLaiSL(SanPhamChiTiet nv) {
        int rs = 0;
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "UPDATE CHITIETSANPHAM SET  soLuong=? WHERE masp=? and mamau=? and maSize=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, nv.getSoLuong());
            stmt.setString(2, nv.getMaSP());
            stmt.setInt(3, nv.getMaMau());
            stmt.setInt(4, nv.getMaSize());

            rs = stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }
        return rs;
    }

    public static int deleteCTSP(Integer ma) {
        int rs = 0;
        try {

            Connection con = DBHelper.getDBConnection();
            System.out.println("ket noi thanh cong");
            String sql = "delete from ChiTietSanPham  where ID = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, ma);
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }

        return rs;
    }

    public static List<SanPhamChiTiet> getAllMau() {
        List<SanPhamChiTiet> list = new ArrayList<>();
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "SELECT  b.tenmau FROM ChiTietSanPham a inner join Mau b on a.mamau = b.mamau where a.masp=?";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                SanPhamChiTiet sv = new SanPhamChiTiet();
                sv.setMaMau(rs.getInt(1));
                sv.setMaSP(rs.getString(2));
                list.add(sv);
            }
        } catch (Exception e) {
            System.out.println("Lỗi Kết Nối");
            e.printStackTrace();
        }
        return list;
    }

    public static List<SanPhamChiTiet> getAllTen() {
        List<SanPhamChiTiet> list = new ArrayList<>();
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "SELECT  b.tenmau FROM ChiTietSanPham a inner join Size b on a.maSize = b.maSize where a.masp=?";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                SanPhamChiTiet sv = new SanPhamChiTiet();
                sv.setMaSize(rs.getInt(1));
                sv.setMaSP(rs.getString(2));
                list.add(sv);
            }
        } catch (Exception e) {
            System.out.println("Lỗi Kết Nối");
            e.printStackTrace();
        }
        return list;
    }

    public static List<SanPhamChiTiet> getAllChiTiet() {
        List<SanPhamChiTiet> list = new ArrayList<>();
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "select b.id, b.masp, a.tenMau, c.tenSize, b.DONGIA, b.SOLUONG from Mau a inner join CHITIETSANPHAM b on a.mamau = b.mamau inner join size c on b.masize = c.masize";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                SanPhamChiTiet sv = new SanPhamChiTiet();
                sv.setMaSPCT(rs.getInt(1));
                sv.setMaSP(rs.getString(2));
                sv.setMaMau(rs.getInt(3));
                sv.setMaSize(rs.getInt(4));
                sv.setDonGia(rs.getFloat(5));
                sv.setSoLuong(rs.getInt(6));
                list.add(sv);
            }
        } catch (Exception e) {
            System.out.println("Lỗi Kết Nối");
            e.printStackTrace();
        }
        return list;
    }

    // Thêm Kha:
    public List<SanPhamChiTiet> getAllSPById(String ma) {
        List<SanPhamChiTiet> list = new ArrayList<>();
        Connection con = DBHelper.getDBConnection();
        String sql = "SELECT * FROM ChiTietSanPham where maSP =?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, ma);
            try (ResultSet rs = stm.executeQuery()) {
                while (rs.next()) {
                    SanPhamChiTiet sv = new SanPhamChiTiet();
                    sv.setMaSPCT(rs.getInt(1));
                    sv.setMaSP(rs.getString(2));
                    sv.setMaMau(rs.getInt(3));
                    sv.setMaSize(rs.getInt(4));
                    sv.setDonGia(rs.getFloat(5));
                    sv.setSoLuong(rs.getInt(6));
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

    public SanPhamChiTiet getList(String maSP, int maMau, int maSize) {
        Connection con = DBHelper.getDBConnection();
        String sql = "Select * from chiTietSanPham where maSP = ? and maMau = ? and maSize =?";
        SanPhamChiTiet spct = new SanPhamChiTiet();
        try (PreparedStatement pstm = con.prepareStatement(sql)) {
            pstm.setString(1, maSP);
            pstm.setInt(2, maMau);
            pstm.setInt(3, maSize);
            try (ResultSet rs = pstm.executeQuery()) {
                while (rs.next()) {
                    spct.setSoLuong(rs.getInt("SoLuong"));

                }
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
        return spct;
    }

    public void updateSL(int soLuong, String maSP, int maMau, int maSize) {
        Connection con = DBHelper.getDBConnection();
        String sql = "Update  chiTietSanPham set SoLuong = ? where maSP = ? and maMau = ? and maSize =?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, soLuong);
            pstm.setString(2, maSP);
            pstm.setInt(3, maMau);
            pstm.setInt(4, maSize);
            pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamChiTietDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<SanPhamChiTiet> size(String maSP, int mau) {
        List<SanPhamChiTiet> list = new ArrayList<>();
        String sql = "select masize, soLuong  from chiTietSanPham where mamau = ? and maSP = ?";
        Connection con = DBHelper.getDBConnection();
        try (PreparedStatement pstm = con.prepareStatement(sql)) {
            pstm.setInt(1, mau);
            pstm.setString(2, maSP);
            try (ResultSet rs = pstm.executeQuery()) {
                while (rs.next()) {
                    SanPhamChiTiet sv = new SanPhamChiTiet();
                    sv.setMaSize(rs.getInt(1));
                    sv.setSoLuong(rs.getInt(2));
                    list.add(sv);
                }
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<SanPhamChiTiet> getAllSLKho(String maSP, int mau, int maSize) {
        List<SanPhamChiTiet> list = new ArrayList<>();
        String sql = "select masize, soLuong from chiTietSanPham where mamau = ? and maSP = ? and maSize =?";
        Connection con = DBHelper.getDBConnection();
        try (PreparedStatement pstm = con.prepareStatement(sql)) {
            pstm.setInt(1, mau);
            pstm.setString(2, maSP);
            pstm.setInt(3, maSize);
            try (ResultSet rs = pstm.executeQuery()) {
                while (rs.next()) {
                    SanPhamChiTiet sv = new SanPhamChiTiet();
                    sv.setMaSize(rs.getInt(1));
                    sv.setSoLuong(rs.getInt(2));
                    list.add(sv);
                }
            }
        } catch (Exception e) {
        }
        return list;
    }

}
