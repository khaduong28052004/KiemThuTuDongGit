package com.code.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.code.db.DBHelper;
import com.code.model.NhanVien;

import java.math.BigInteger;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JPasswordField;

public class NhanVienDao {

    public static List<NhanVien> getAllNhanVien() {
        List<NhanVien> list = new ArrayList<>();
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "SELECT * FROM NhanVien";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                NhanVien sv = new NhanVien();
                sv.setMaNV(rs.getString(1));
                sv.setHoTen(rs.getString(2));
                sv.setNgaySinh(rs.getString(3));
                sv.setEmail(rs.getString(4));
                sv.setSoDienThoai(rs.getString(5));
                sv.setGioiTinh(rs.getBoolean(6));
                sv.setChucVu(rs.getBoolean(7));
                sv.setDiaChi(rs.getString(8));
                sv.setMatKhau(rs.getString(9));
                sv.setHinhAnh(rs.getString(10));

                list.add(sv);
            }
        } catch (Exception e) {
            System.out.println("Lỗi Kết Nối");
            e.printStackTrace();
        }
        return list;
    }

    public static int insertNhanVien(NhanVien nv) {
        int rs = 0;

        try {

            Connection con = DBHelper.getDBConnection();
            String sql = "INSERT INTO NhanVien VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nv.getMaNV());
            stmt.setString(2, nv.getHoTen());
            stmt.setString(3, nv.getNgaySinh());
            stmt.setString(4, nv.getEmail());
            stmt.setString(5, nv.getSoDienThoai());
            stmt.setBoolean(6, nv.getGioiTinh());
            stmt.setBoolean(7, nv.getChucVu());
            stmt.setString(8, nv.getDiaChi());
            stmt.setString(9, nv.getMatKhau());
            stmt.setString(10, nv.getHinhAnh());
            rs = stmt.executeUpdate();
            System.out.print(rs);
        } catch (Exception e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }
        return rs;
    }

    public static int updateNhanVien(NhanVien nv) {
        int rs = 0;
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "UPDATE NhanVien SET tennv=?, ngaySinh=?, Email=?, soDT=?, gioiTinh=?, chucVu=?, diaChi=?, matKhau=? , HINH=? WHERE maNV=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(10, nv.getMaNV());
            stmt.setString(1, nv.getHoTen());
            stmt.setString(2, nv.getNgaySinh());
            stmt.setString(3, nv.getEmail());
            stmt.setString(4, nv.getSoDienThoai());
            stmt.setBoolean(5, nv.getGioiTinh());
            stmt.setBoolean(6, nv.getChucVu());
            stmt.setString(7, nv.getDiaChi());
            stmt.setString(8, nv.getMatKhau());
            stmt.setString(9, nv.getHinhAnh());
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }
        return rs;
    }

    public static int deleteNhanVien(String ma) {
        int rs = 0;
        try {

            Connection con = DBHelper.getDBConnection();
            System.out.println("ket noi thanh cong");
            String sql = "delete from NhanVien  where MaNV = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, ma);
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }

        return rs;
    }

    public static List<NhanVien> TimKiem(String ma) {
        List<NhanVien> listSV = new ArrayList<>();
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "SELECT * FROM NhanVien WHERE tenNV LIKE N'%" + ma + "%'";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                NhanVien sv = new NhanVien();
                sv.setMaNV(rs.getString(1));
                sv.setHoTen(rs.getString(2));
                sv.setNgaySinh(rs.getString(3));
                sv.setEmail(rs.getString(4));
                sv.setSoDienThoai(rs.getString(5));
                sv.setGioiTinh(rs.getBoolean(6));
                sv.setChucVu(rs.getBoolean(7));
                sv.setDiaChi(rs.getString(8));
                listSV.add(sv);
            }
        } catch (Exception e) {
            System.out.println("Lỗi Kết Nối");
            e.printStackTrace();
        }
        return listSV;
    }

    public static String getMd5(String input) {
        try {
            // Static getInstance method is called with hashing MD5 
            MessageDigest md = MessageDigest.getInstance("MD5");

            // digest() method is called to calculate message digest 
            //  of an input digest() return array of byte 
            byte[] messageDigest = md.digest(input.getBytes());

            // Convert byte array into signum representation 
            BigInteger no = new BigInteger(1, messageDigest);

            // Convert message digest into hex value 
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext.toUpperCase();
        } // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static int doiMatKhau(NhanVien sv) {
        int rs = 0;
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "UPDATE NhanVien SET matKhau=? WHERE email=?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, sv.getMatKhau());
            stmt.setString(2, sv.getEmail());
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }
        return rs;
    }

    public static int updateMK(NhanVien nv) {
        int rs = 0;
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "UPDATE NhanVien SET matKhau=? WHERE maNV=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(2, nv.getMaNV());
            stmt.setString(1, nv.getMatKhau());
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }
        return rs;
    }

    public static String convertToMD5(String matKhau) {
//        String inputText = inputTextField.getText();
        String matKhauM5 = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(matKhau.getBytes());
            byte[] digest = md.digest();

            StringBuilder result = new StringBuilder();
            for (byte b : digest) {
                result.append(String.format("%02x", b));
            }
            matKhauM5 = result.toString();
//            resultTextArea.setText("MD5: " + result.toString());
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
//            resultTextArea.setText("Lỗi: Không thể tạo MD5");
        }
        return matKhauM5;
    }
}
