package com.code.model;

public class KhachHang {

    private String MaKH;
    private String TENKH;
    private String SODT;
    private String EMAIL;
    private String DIACHI;
    private boolean gioiTinh;
    private String ngaySinh;

    public KhachHang() {
    }

    public KhachHang(String MaKH, String TENKH, String SODT, String EMAIL, String DIACHI, boolean gioiTinh, String ngaySinh) {
        this.MaKH = MaKH;
        this.TENKH = TENKH;
        this.SODT = SODT;
        this.EMAIL = EMAIL;
        this.DIACHI = DIACHI;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTENKH() {
        return TENKH;
    }

    public void setTENKH(String TENKH) {
        this.TENKH = TENKH;
    }

    public String getSODT() {
        return SODT;
    }

    public void setSODT(String SODT) {
        this.SODT = SODT;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }



    
}
