package com.code.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.code.db.DBHelper;
import com.code.model.NhaCungCap;

public class NhaCungCapDao {

    public static List<NhaCungCap> getAllNhaCungCap() {
        List<NhaCungCap> list = new ArrayList<>();
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "SELECT * FROM NhaCungCap";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                NhaCungCap sv = new NhaCungCap();
                sv.setMaNCC(rs.getString(1));
                sv.setTenNCC(rs.getString(2));
                sv.setEmail(rs.getString(3));
                sv.setDiaChi(rs.getString(4));
                sv.setMaSoThue(rs.getString(5));

                list.add(sv);
            }
        } catch (Exception e) {
            System.out.println("Lỗi Kết Nối");
            e.printStackTrace();
        }
        return list;
    }

    public static int insertNhaCungCap(NhaCungCap nv) {
        int rs = 0;
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "INSERT INTO NhaCungCap VALUES (?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nv.getMaNCC());
            stmt.setString(2, nv.getTenNCC());
            stmt.setString(3, nv.getEmail());
            stmt.setString(4, nv.getDiaChi());
            stmt.setString(5, nv.getMaSoThue());

            rs = stmt.executeUpdate();
            System.out.print(rs);
        } catch (Exception e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }
        return rs;
    }

    public static int updateNhaCungCap(NhaCungCap nv) {
        int rs = 0;
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "UPDATE NhaCungCap SET tenNCC=?, email=?, diaChi=?, maSoThue=? WHERE maNCC=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(5, nv.getMaNCC());
            stmt.setString(1, nv.getTenNCC());
            stmt.setString(2, nv.getEmail());
            stmt.setString(3, nv.getDiaChi());
            stmt.setString(4, nv.getMaSoThue());
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }
        return rs;
    }

    public static int deleteNhaCungCap(String ma) {
        int rs = 0;
        try {
            Connection con = DBHelper.getDBConnection();
            System.out.println("ket noi thanh cong");
            String sql = "delete from NhaCungCap  where maNCC = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, ma);
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }

        return rs;
    }

    public static List<NhaCungCap> TimKiem(String ma) {
        List<NhaCungCap> listSV = new ArrayList<>();
        try {
            Connection con = DBHelper.getDBConnection();
            String sql = "SELECT  * From NhaCungCap where tenNCC like '%";
            sql += ma + "%'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
               NhaCungCap sv = new NhaCungCap();
                sv.setMaNCC(rs.getString(1));
                sv.setTenNCC(rs.getString(2));
                sv.setEmail(rs.getString(3));
                sv.setDiaChi(rs.getString(4));
                sv.setMaSoThue(rs.getString(5));
                listSV.add(sv);
            }
        } catch (Exception e) {
            System.out.println("Lỗi Kết Nối");
            e.printStackTrace();
        }
        return listSV;
    }

}
