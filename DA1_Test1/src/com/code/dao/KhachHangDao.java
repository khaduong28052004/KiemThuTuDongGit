package com.code.dao;

import com.code.db.DBHelper;
import com.code.model.KhachHang;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KhachHangDao {

    Connection con = DBHelper.getDBConnection();

    public List<KhachHang> getAllExceptByID(String ma) {
        List<KhachHang> list = new ArrayList<>();
        String sql = "SELECT * FROM khachHang WHERE makh != ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, ma);
            try (ResultSet rs = stm.executeQuery()) {
                while (rs.next()) {
                    KhachHang kh = new KhachHang();
                    kh.setMaKH(rs.getString("MaKH"));
                    kh.setTENKH(rs.getString("TenKH"));
                    kh.setEMAIL(rs.getString("Email"));
                    kh.setSODT(rs.getString("SoDT"));
                    kh.setDIACHI(rs.getString("DiaChi"));
                    kh.setGioiTinh(rs.getBoolean("GioiTinh"));
                    kh.setNgaySinh(rs.getString("NgaySinh"));
                    list.add(kh);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi SQL: " + ex.getMessage());
            ex.printStackTrace();
            // Hoặc ghi log lỗi
        }
        return list;
    }
public List<KhachHang> getAllTheoMa(String ma) {
        List<KhachHang> list = new ArrayList<>();
        String sql = "SELECT * FROM khachHang a inner join HoaDon b on a.makh=b.makh where maHD = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, ma);
            try (ResultSet rs = stm.executeQuery()) {
                while (rs.next()) {
                    KhachHang kh = new KhachHang();
                    kh.setMaKH(rs.getString("MaKH"));
                    kh.setTENKH(rs.getString("TenKH"));
                    kh.setEMAIL(rs.getString("Email"));
                    kh.setSODT(rs.getString("SoDT"));
                    kh.setDIACHI(rs.getString("DiaChi"));
                    kh.setGioiTinh(rs.getBoolean("GioiTinh"));
                    kh.setNgaySinh(rs.getString("NgaySinh"));
                    list.add(kh);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi SQL: " + ex.getMessage());
            ex.printStackTrace();
            // Hoặc ghi log lỗi
        }
        return list;
    }
    public List<KhachHang> getSelectAll() {
        List<KhachHang> list = new ArrayList<>();
        try {
            String sql = "Select * from KhachHang";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setMaKH(rs.getString("MaKH"));
                kh.setTENKH(rs.getString("TenKH"));
                kh.setEMAIL(rs.getString("Email"));
                kh.setSODT(rs.getString("SoDT"));
                kh.setDIACHI(rs.getString("DiaChi"));
                kh.setGioiTinh(rs.getBoolean("GioiTinh"));
                kh.setNgaySinh(rs.getString("NgaySinh"));
                list.add(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void insertSQL(KhachHang kh) {
        String sql = "insert into KhachHang values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ptm = con.prepareStatement(sql);
            ptm.setString(1, kh.getMaKH());
            ptm.setString(2, kh.getTENKH());
            ptm.setBoolean(3, kh.isGioiTinh());
            ptm.setString(4, kh.getNgaySinh());
            ptm.setString(5, kh.getSODT());
            ptm.setString(6, kh.getEMAIL());
            ptm.setString(7, kh.getDIACHI());
            ptm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateSQL(KhachHang kh) {
        String sql = "UPDATE  KhachHang set TenKH =?, GioiTinh =?,NgaySinh =?,SoDT =?,Email =?, DiaChi=? WHERE MaKH = ?";
        try {
            PreparedStatement ptm = con.prepareStatement(sql);
            ptm.setString(7, kh.getMaKH());
            ptm.setString(1, kh.getTENKH());
            ptm.setBoolean(2, kh.isGioiTinh());
            ptm.setString(3, kh.getNgaySinh());
            ptm.setString(4, kh.getSODT());
            ptm.setString(5, kh.getEMAIL());
            ptm.setString(6, kh.getDIACHI());
            ptm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int deleteSQL(KhachHang kh) {
        int check = 0;
        String sql = "Delete KhachHang where MaKH = ?";
        try {
            PreparedStatement ptm = con.prepareStatement(sql);
            ptm.setString(1, kh.getMaKH());
            ptm.execute();
            check = 1;
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }

    public List<KhachHang> getAllByID(String ma) {
        List<KhachHang> list = new ArrayList<>();
        String sql = "SELECT * FROM khachHang WHERE makh = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, ma);
            try (ResultSet rs = stm.executeQuery()) {
                while (rs.next()) {
                    KhachHang kh = new KhachHang();
                    kh.setMaKH(rs.getString("MaKH"));
                    kh.setTENKH(rs.getString("TenKH"));
                    kh.setEMAIL(rs.getString("Email"));
                    kh.setSODT(rs.getString("SoDT"));
                    kh.setDIACHI(rs.getString("DiaChi"));
                    kh.setGioiTinh(rs.getBoolean("GioiTinh"));
                    kh.setNgaySinh(rs.getString("NgaySinh"));
                    list.add(kh);
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

    public List<KhachHang> getAllByDate(java.util.Date tuNgay, java.util.Date denNgay) {
        List<KhachHang> list = new ArrayList<>();
        String sql = "SELECT KHACHHANG.TENKH, HOADON.NGAYNHAP FROM KHACHHANG INNER JOIN HOADON ON KHACHHANG.MAKH = HOADON.MAKH";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setDate(1, new java.sql.Date(tuNgay.getTime()));
            stm.setDate(2, new java.sql.Date(denNgay.getTime()));
            try (ResultSet rs = stm.executeQuery()) {
                while (rs.next()) {
                    KhachHang kh = new KhachHang();
                    kh.setMaKH(rs.getString("MaKH"));
                    kh.setTENKH(rs.getString("TenKH"));
                    kh.setEMAIL(rs.getString("Email"));
                    kh.setSODT(rs.getString("SoDT"));
                    kh.setDIACHI(rs.getString("DiaChi"));
                    kh.setGioiTinh(rs.getBoolean("GioiTinh"));
                    kh.setNgaySinh(rs.getString("NgaySinh"));
                    list.add(kh);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi SQL: " + ex.getMessage());
            ex.printStackTrace();
            // Hoặc ghi log lỗi
        }
        return list;
    }

    public List<KhachHang> getAllKHBy(String ten, String sdt) {
        List<KhachHang> list = new ArrayList<>();
        String sql = "select * from khachHang  where tenKH like ? or sodt = ?";
        if (!ten.equals("") && !sdt.equals("")) {
            sql = "select * from khachHang  where tenKH like ? and sodt =?";
        }

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1,"%"+ ten+"%");
            stm.setString(2, sdt);
            try (ResultSet rs = stm.executeQuery()) {
                while (rs.next()) {
                    KhachHang kh = new KhachHang();
                    kh.setMaKH(rs.getString("MaKH"));
                    kh.setTENKH(rs.getString("TenKH"));
                    kh.setEMAIL(rs.getString("Email"));
                    kh.setSODT(rs.getString("SoDT"));
                    kh.setDIACHI(rs.getString("DiaChi"));
                    kh.setGioiTinh(rs.getBoolean("GioiTinh"));
                    kh.setNgaySinh(rs.getString("NgaySinh"));
                    list.add(kh);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi SQL: " + ex.getMessage());
            ex.printStackTrace();
            // Hoặc ghi log lỗi
        }
        return list;
    }
}
