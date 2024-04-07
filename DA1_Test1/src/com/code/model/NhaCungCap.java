/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code.model;

/**
 *
 * @author phuck
 */
public class NhaCungCap {
    String maNCC;
    String tenNCC;
    String email;
    String diaChi;
    String maSoThue;

    public NhaCungCap() {
    }

    public NhaCungCap(String maNCC, String tenNCC, String email, String diaChi, String maSoThue) {
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
        this.email = email;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }
    
    
}
