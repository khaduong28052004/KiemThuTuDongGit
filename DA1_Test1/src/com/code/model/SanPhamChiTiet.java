/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code.model;

/**
 *
 * @author phuck
 */
public class SanPhamChiTiet {
    int maSPCT;
    String maSP;
    int maMau;
    int maSize;
    Float donGia;
    Integer soLuong;
    String tenMau;
    String tenSize;

    public SanPhamChiTiet() {
    }

    public SanPhamChiTiet(int maSPCT, String maSP, int maMau, int maSize, Float donGia, Integer soLuong, String tenMau, String tenSize) {
        this.maSPCT = maSPCT;
        this.maSP = maSP;
        this.maMau = maMau;
        this.maSize = maSize;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.tenMau = tenMau;
        this.tenSize = tenSize;
    }

    public int getMaSPCT() {
        return maSPCT;
    }

    public void setMaSPCT(int maSPCT) {
        this.maSPCT = maSPCT;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
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

    public Float getDonGia() {
        return donGia;
    }

    public void setDonGia(Float donGia) {
        this.donGia = donGia;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public String getTenMau() {
        return tenMau;
    }

    public void setTenMau(String tenMau) {
        this.tenMau = tenMau;
    }

    public String getTenSize() {
        return tenSize;
    }

    public void setTenSize(String tenSize) {
        this.tenSize = tenSize;
    }
        public float giamGia() {
        if (donGia > 200000) {
            return 2;
        } else if (donGia > 500000) {
            return 3;
        } else if (donGia > 1000000) {
            return 4;
        } else if (donGia > 1500000) {
            return 5;
        }
        return 0;
    }
    
}
