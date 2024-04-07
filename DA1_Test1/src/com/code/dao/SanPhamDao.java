package com.code.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.code.db.DBHelper;
import com.code.model.CTNhapHang;
import com.code.model.HoaDonChiTiet;
import com.code.model.LoaiSanPham;
import com.code.model.SanPham;
import com.code.model.LoaiSanPham;

import java.math.BigInteger;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SanPhamDao {

    public static List<SanPham> getAllSanPham() {
        List<SanPham> list = new ArrayList<>();
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "SELECT a.masp , a.tensp, a.gia, b.tenloai, a.hinh FROM SANPHAM a inner join LoaiSP b on a.maloai = b.maloai";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                SanPham sv = new SanPham();
                sv.setMaSP(rs.getString(1));
                sv.setTenSP(rs.getString(2));
                sv.setGia(rs.getFloat(3));
                sv.setMaLoai(rs.getString(4));
                sv.setHinhAnh(rs.getString(5));

                list.add(sv);
            }
        } catch (Exception e) {
            System.out.println("Lỗi Kết Nối");
            e.printStackTrace();
        }
        return list;
    }

    public static List<LoaiSanPham> getAllLoaiSP() {
        List<LoaiSanPham> list = new ArrayList<>();
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "SELECT  * FROM LoaiSP";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                LoaiSanPham sv = new LoaiSanPham();
                sv.setMaLoai(rs.getString(1));
                sv.setTenLoai(rs.getString(2));
                list.add(sv);
            }
        } catch (Exception e) {
            System.out.println("Lỗi Kết Nối");
            e.printStackTrace();
        }
        return list;
    }

    public static int insertLoaiSP(LoaiSanPham nv) {
        int rs = 0;
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "INSERT INTO LoaiSP VALUES (?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nv.getMaLoai());
            stmt.setString(2, nv.getTenLoai());

            rs = stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("ket noi loi");
        }
        return rs;
    }

    public static int insertSanPham(SanPham nv) {
        int rs = 0;

        try {

            Connection con = DBHelper.getDBConnection();
            String sql = "INSERT INTO SanPham VALUES (?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nv.getMaSP());
            stmt.setString(2, nv.getTenSP());
            stmt.setFloat(3, nv.getGia());
            stmt.setString(4, nv.getMaLoai());
            stmt.setString(5, nv.getHinhAnh());

            rs = stmt.executeUpdate();
            System.out.print(rs);
        } catch (Exception e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }
        return rs;
    }

    public static int updateSanPham(SanPham nv) {
        int rs = 0;
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "UPDATE SANPHAM SET tensp=?, gia=?, maloai=?, hinh=? WHERE masp=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(5, nv.getMaSP());
            stmt.setString(1, nv.getTenSP());
            stmt.setFloat(2, nv.getGia());
            stmt.setString(3, nv.getMaLoai());
            stmt.setString(4, nv.getHinhAnh());
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }
        return rs;
    }

    public static int deleteSanPham(String ma) {
        int rs = 0;
        try {

            Connection con = DBHelper.getDBConnection();
            System.out.println("ket noi thanh cong");
            String sql = "delete from SanPham  where masp = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, ma);
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }

        return rs;
    }

    public static List<SanPham> TimKiem(String ma) {
        List<SanPham> listSV = new ArrayList<>();
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "select a.MASP, a.TENSP, a.GIA, b.tenloai, a.HINH from SANPHAM a inner join LOAISP b on a.maloai = b.maloai where a.tensp like '%";
            sql += ma + "%'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                SanPham sv = new SanPham();
                sv.setMaSP(rs.getString(1));
                sv.setTenSP(rs.getString(2));
                sv.setGia(rs.getFloat(3));
                sv.setMaLoai(rs.getString(4));
                sv.setHinhAnh(rs.getString(5));

                listSV.add(sv);
            }
        } catch (Exception e) {
            System.out.println("Lỗi Kết Nối");
            e.printStackTrace();
        }
        return listSV;
    }

    public static List<SanPham> TimKiemTheoLoai(String ma) {
        List<SanPham> listSV = new ArrayList<>();
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "select a.MASP, a.TENSP, a.GIA, b.tenloai, a.HINHANH from SANPHAM a inner join LOAISP b on a.maloai = b.maloai where b.TENLOAI ='";
            sql += ma + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                SanPham sv = new SanPham();
                sv.setMaSP(rs.getString(1));
                sv.setTenSP(rs.getString(2));
                sv.setGia(rs.getFloat(3));
                sv.setMaLoai(rs.getString(4));
                sv.setHinhAnh(rs.getString(5));

                listSV.add(sv);
            }
        } catch (Exception e) {
            System.out.println("Lỗi Kết Nối");
            e.printStackTrace();
        }
        return listSV;
    }

    // Thêm Kha
    public List<SanPham> getAllExceptByID(String ma) {
        List<SanPham> list = new ArrayList<>();
        Connection con = DBHelper.getDBConnection();
        String sql = "SELECT * FROM SanPham WHERE masp = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, ma);
            try (ResultSet rs = stm.executeQuery()) {
                while (rs.next()) {
                    SanPham sv = new SanPham();
                    sv.setMaSP(rs.getString(1));
                    sv.setTenSP(rs.getString(2));
                    sv.setGia(rs.getFloat(3));
                    sv.setMaLoai(rs.getString(4));
                    sv.setHinhAnh(rs.getString(5));
                    list.add(sv);
                }

            }
        } catch (SQLException ex) {
            System.out.println("Lỗi SQL: " + ex.getMessage());
            ex.printStackTrace();
            // Hoặc ghi log lỗi
        }
        return list;
    }

// Them Duy
    public List<HoaDonChiTiet> getAllByDate(Date tuNgay, Date denNgay) {
        List<HoaDonChiTiet> list = new ArrayList<>();
        Connection con = DBHelper.getDBConnection();
        String sql = "SELECT CHITIETHOADON.*, CHITIETNHAPHANG.* FROM CHITIETHOADON INNER JOIN CHITIETNHAPHANG ON CHITIETHOADON.MASP = CHITIETNHAPHANG.MASP";
        try (PreparedStatement psm = con.prepareStatement(sql)) {
            psm.setDate(1, new java.sql.Date(tuNgay.getTime()));
            psm.setDate(2, new java.sql.Date(denNgay.getTime()));
            try (ResultSet rs = psm.executeQuery()) {
                while (rs.next()) {
                    HoaDonChiTiet hdct = new HoaDonChiTiet();
                    CTNhapHang sv = new CTNhapHang();
                    hdct.setMaSP(rs.getString("maSP"));
                    hdct.setTenSP(rs.getString("tenSP"));
                    hdct.setGia(rs.getFloat("gia"));
                    hdct.setSize(rs.getString("tenSize"));
                    hdct.setMau(rs.getString("tenMau"));
                    hdct.setMaKH(rs.getString("maKH"));
                    hdct.setTenKH(rs.getString("tenKH"));
                    hdct.setsDT(rs.getString("SoDT"));
                    hdct.setDiaChi(rs.getString("DiaChi"));
                    hdct.setSoLuong(rs.getInt("SoLuong"));
                    hdct.setGiamGia(rs.getFloat("GiamGia"));
                    hdct.setHinhThucTT(rs.getString("hinhThucTT"));
                    hdct.setTenNV(rs.getString("tenNV"));
                    sv.setMaCTNH(rs.getInt(1));
                    sv.setMaNhap(rs.getString(2));
                    sv.setMaSP(rs.getString(3));
                    sv.setDonGia(rs.getFloat(5));
                    list.add(hdct);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonChiTietDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
// mới thêm

    public List<SanPham> getAllSPByMaLoai(String maLoai, String ten) {
        List<SanPham> list = new ArrayList<>();
        String sql = "select * from sanpham  where MALOAI =?";

        if (!ten.equals("")) {
            sql = "select * from sanpham  where MALOAI =? and tenSP like ?";
        }
        Connection con = DBHelper.getDBConnection();
        try (PreparedStatement pstm = con.prepareStatement(sql)) {
            pstm.setString(1, maLoai);
            if (!ten.equals("")) {
                pstm.setString(2, "%"+ten+"%");
            }
            try (ResultSet rs = pstm.executeQuery()) {
                while (rs.next()) {
                    SanPham sp = new SanPham();
                    sp.setMaSP(rs.getString("maSP"));
                    sp.setTenSP(rs.getString("TenSP"));
                    sp.setGia(rs.getFloat("Gia"));
                    list.add(sp);
                }
            }
        } catch (Exception e) {
        }
        return list;
    }

}
