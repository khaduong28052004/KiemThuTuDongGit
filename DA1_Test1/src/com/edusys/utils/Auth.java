package com.edusys.utils;

//import quanlydaotao.dao.NhanVienDao;
import com.code.model.NhanVien;

public class Auth {

    public static String database = null;
    public static String maychu = null;
    public static NhanVien user = null;
    public static boolean chucvu = false;

    public static void clear() {
        Auth.user = null;
    }

    public static boolean isLogin() {
        return Auth.user != null;
    }

    public static boolean isManager() {
        return user.getChucVu();
    }
}
