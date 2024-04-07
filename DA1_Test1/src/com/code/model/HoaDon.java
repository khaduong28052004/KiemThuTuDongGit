
package com.code.model;

public class HoaDon {
    private int id;
    private String maHD;
    private String maSP;
    private String maKH;
    private String maNV;
    private String ngayNhap;
    private float tongtien;
    private String hinhThucTT;
    private int tongSoLuong;
    private boolean TrangThaiTT;
    private int soLuong;
   private int maMau;
   private int maSize;
   private float gia;
   private float giamGia;

    public HoaDon() {
    }

    public HoaDon(int id, String maHD, String maSP, String maKH, String maNV, String ngayNhap, float tongtien, String hinhThucTT, int tongSoLuong, boolean TrangThaiTT, int soLuong, int maMau, int maSize, float gia, float giamGia) {
        this.id = id;
        this.maHD = maHD;
        this.maSP = maSP;
        this.maKH = maKH;
        this.maNV = maNV;
        this.ngayNhap = ngayNhap;
        this.tongtien = tongtien;
        this.hinhThucTT = hinhThucTT;
        this.tongSoLuong = tongSoLuong;
        this.TrangThaiTT = TrangThaiTT;
        this.soLuong = soLuong;
        this.maMau = maMau;
        this.maSize = maSize;
        this.gia = gia;
        this.giamGia = giamGia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public float getTongtien() {
        return tongtien;
    }

    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }

    public String getHinhThucTT() {
        return hinhThucTT;
    }

    public void setHinhThucTT(String hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }

    public int getTongSoLuong() {
        return tongSoLuong;
    }

    public void setTongSoLuong(int tongSoLuong) {
        this.tongSoLuong = tongSoLuong;
    }

    public boolean isTrangThaiTT() {
        return TrangThaiTT;
    }

    public void setTrangThaiTT(boolean TrangThaiTT) {
        this.TrangThaiTT = TrangThaiTT;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getMaMau() {
        return maMau;
    }

    public void setMaMau(int maMau) {
        this.maMau = maMau;
    }

    public int getMaSize() {
        return maSize;
    }

    public void setMaSize(int maSize) {
        this.maSize = maSize;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public float getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(float giamGia) {
        this.giamGia = giamGia;
    }

  
}
