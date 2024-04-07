package com.code.dao;

import com.code.db.DBHelper;
import com.code.model.HoaDon;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HoaDonDao {

    public List<HoaDon> getAllSelect() {
        List<HoaDon> list = new ArrayList<>();
        Connection con = DBHelper.getDBConnection();
        String sql = "select * from hoadon";
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMaHD(rs.getString("maHD"));
                hd.setMaKH(rs.getString("maKH"));
                hd.setMaNV(rs.getString("maNV"));
                hd.setNgayNhap(rs.getString("NgayNhap"));
                hd.setTongSoLuong(rs.getInt("TongSoLuong"));
                hd.setTongtien(rs.getFloat("tongTien"));
                hd.setHinhThucTT(rs.getString("HINHTHUCTT"));
                hd.setTrangThaiTT(rs.getBoolean("TRANGTHAITT"));
                list.add(hd);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(HoaDonDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<HoaDon> getAllByID(String ma) {
        List<HoaDon> list = new ArrayList<>();
        String sql = "SELECT * FROM HoaDon WHERE maHD = ?";
        Connection con = DBHelper.getDBConnection();
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, ma);
            try (ResultSet rs = stm.executeQuery()) {
                while (rs.next()) {
                    HoaDon hd = new HoaDon();
                    hd.setMaHD(rs.getString("maHD"));
                    hd.setMaKH(rs.getString("maKH"));
                    hd.setMaNV(rs.getString("maNV"));
                    hd.setNgayNhap(rs.getString("NgayNhap"));
                    hd.setTongSoLuong(rs.getInt("TongSoLuong"));
                    hd.setTongtien(rs.getFloat("tongTien"));
                    hd.setHinhThucTT(rs.getString("HINHTHUCTT"));
                    hd.setTrangThaiTT(rs.getBoolean("TRANGTHAITT"));
                    list.add(hd);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi SQL: " + ex.getMessage());
            ex.printStackTrace();
            // Hoặc ghi log lỗi
        }
        return list;
    }

    public List<HoaDon> getAllSelectHDCT(String maHD) {
        List<HoaDon> list = new ArrayList<>();
        Connection con = DBHelper.getDBConnection();
        String sql = "select * from CHITIETHOADON a join HoaDon b on a.MAHD = b.MAHD where a.maHD = ?";
        try (PreparedStatement psm = con.prepareStatement(sql)) {
            psm.setString(1, maHD);
            try (ResultSet rs = psm.executeQuery()) {
                while (rs.next()) {
                    HoaDon hd = new HoaDon();
                    hd.setId(rs.getInt("ID"));
                    hd.setMaHD(rs.getString("maHD"));
                    hd.setMaKH(rs.getString("maKH"));
                    hd.setMaNV(rs.getString("maNV"));
                    hd.setMaSP(rs.getString("MaSP"));
                    hd.setMaMau(rs.getInt("MaMau"));
                    hd.setMaSize(rs.getInt("MaSize"));
                    hd.setGia(rs.getFloat("Gia"));
                    hd.setNgayNhap(rs.getString("NgayNhap"));
                    hd.setTongSoLuong(rs.getInt("TongSoLuong"));
                    hd.setTongtien(rs.getFloat("tongTien"));
                    hd.setHinhThucTT(rs.getString("HINHTHUCTT"));
                    hd.setTrangThaiTT(rs.getBoolean("TRANGTHAITT"));
                    hd.setSoLuong(rs.getInt("SoLuong"));
                    hd.setGiamGia(rs.getFloat("GiamGia"));
                    list.add(hd);
                }
            } catch (Exception e) {
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(HoaDonDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void insertHD(HoaDon hd) {
        String sql = "insert into hoadon values(?,?,?,?,?,?,?,?)";
        Connection con = DBHelper.getDBConnection();
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, hd.getMaHD());
            stm.setString(2, hd.getMaKH());
            stm.setString(3, hd.getNgayNhap());
            stm.setString(4, hd.getMaNV());
            stm.setFloat(5, 0);
            stm.setInt(6, 0);
            stm.setBoolean(7, false);
            stm.setString(8, hd.getHinhThucTT());
            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateHD(HoaDon hd) {
        String sql = "update HoaDon set maKH =?,ngayNhap =?,MaNV=?, hinhThucTT =?,TrangThaiTT =? where maHD =?";
        Connection con = DBHelper.getDBConnection();
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(6, hd.getMaHD());
            stm.setString(1, hd.getMaKH());
            stm.setString(2, hd.getNgayNhap());
            stm.setString(3, hd.getMaNV());
            stm.setString(4, hd.getHinhThucTT());
            stm.setBoolean(5, hd.isTrangThaiTT());
            stm.execute();
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }

    public void updateSL(HoaDon hd) {
        String sql = "update HoaDon set tongsoluong=?,tongtien =? where maHD =?";
        Connection con = DBHelper.getDBConnection();
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(3, hd.getMaHD());
            stm.setInt(1, hd.getTongSoLuong());
            stm.setFloat(2, hd.getTongtien());
            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int deleteHD(String ma) {
        int check = 0;
        String sql = "delete HoaDon where maHD =?";
        Connection con = DBHelper.getDBConnection();
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, ma);

            stm.execute();
            check = 1;
        } catch (Exception e) {
//            e.printStackTrace();
        }
        return check;
    }

    public void insetHDCYT(HoaDon hd) {
        String sql = "INSERT INTO CHITIETHOADON VALUES(?,?,?,?,?,?,?)";
        Connection con = DBHelper.getDBConnection();
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, hd.getMaSP());
            pstm.setString(2, hd.getMaHD());
            pstm.setInt(3, hd.getSoLuong());
            pstm.setFloat(4, hd.getGia());
            pstm.setFloat(5, hd.getGiamGia());
            pstm.setInt(6, hd.getMaMau());
            pstm.setInt(7, hd.getMaSize());
            pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void updateHDCT(int soLuong, float giamGia , int id){
    String sql ="update chiTietHoaDon set  SoLuong = ?,giamGia=? where  ID =?";
    Connection con = DBHelper.getDBConnection();
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1,soLuong);
            pstm.setFloat(2,giamGia);
            pstm.setInt(3, id);
            pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void deleteHDCT(int id){
    String sql = "Delete from CHITIETHOADON WHERE ID =?";
    Connection con = DBHelper.getDBConnection();
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
}
