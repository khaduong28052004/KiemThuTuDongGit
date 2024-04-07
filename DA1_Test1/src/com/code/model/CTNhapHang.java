/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code.model;

/**
 *
 * @author phuck
 */
public class CTNhapHang {
    Integer maCTNH;
    String maNhap;
    String maSP;
    Integer soLuong;
    Float donGia;
    Integer maMau;
    Integer maSize;
    String tenMau;
    String tenSize;
    public CTNhapHang() {
    }

    public CTNhapHang(Integer maCTNH, String maNhap, String maSP, Integer soLuong, Float donGia, Integer maMau, Integer maSize, String tenMau,
            String tenSize) {
        this.maCTNH = maCTNH;
        this.maNhap = maNhap;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.maMau = maMau;
        this.maSize = maSize;
        this.tenMau = tenMau;
        this.tenSize = tenSize;
    }

    public Integer getMaCTNH() {
        return maCTNH;
    }

    public void setMaCTNH(Integer maCTNH) {
        this.maCTNH = maCTNH;
    }

    public String getMaNhap() {
        return maNhap;
    }

    public void setMaNhap(String maNhap) {
        this.maNhap = maNhap;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Float getDonGia() {
        return donGia;
    }

    public void setDonGia(Float donGia) {
        this.donGia = donGia;
    }

    public Integer getMaMau() {
        return maMau;
    }

    public void setMaMau(Integer maMau) {
        this.maMau = maMau;
    }

    public Integer getMaSize() {
        return maSize;
    }

    public void setMaSize(Integer maSize) {
        this.maSize = maSize;
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

}
