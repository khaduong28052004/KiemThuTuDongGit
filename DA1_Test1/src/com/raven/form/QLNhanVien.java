package com.raven.form;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import com.code.model.NhanVien;
import com.code.db.DBHelper;
import com.code.dao.NhanVienDao;
import com.edusys.utils.XImage;
import java.awt.Image;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.*;

public class QLNhanVien extends javax.swing.JPanel {

    private List<NhanVien> list = new ArrayList<>();
    private List<String> listUrl = new ArrayList();
    String urlImage;
    String nameImage = "";
    String addFile = "D:\\finalTest.txt";
    private int currentIndex = 0;

    public QLNhanVien() {
        initComponents();
        loadTable();
        colorBorder();
        rdoNam.setSelected(true);
        rdoQL.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSanhNV = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jpnHinh = new javax.swing.JPanel();
        jlbHinhAnh = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JPasswordField();
        rdoNu = new javax.swing.JRadioButton();
        rdoNam = new javax.swing.JRadioButton();
        rdoNV = new javax.swing.JRadioButton();
        rdoQL = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlbMaNV = new javax.swing.JLabel();
        jlbTenNV = new javax.swing.JLabel();
        jlbEmail = new javax.swing.JLabel();
        jlbSDT = new javax.swing.JLabel();
        jlbNgaySinh = new javax.swing.JLabel();
        jlbMatKhau = new javax.swing.JLabel();
        jlbGioiTinh = new javax.swing.JLabel();
        jlbChucVu = new javax.swing.JLabel();
        jlbDiaChi = new javax.swing.JLabel();
        jlbHinh = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSapXep = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        txtTimKiemNhanVien = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDanhSanhNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDanhSanhNV.setOpaque(false);
        tblDanhSanhNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSanhNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhSanhNV);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 690, 680));

        jPanel3.setOpaque(false);

        jpnHinh.setBackground(new java.awt.Color(255, 255, 255));

        jlbHinhAnh.setBackground(new java.awt.Color(255, 255, 255));
        jlbHinhAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbHinhAnhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnHinhLayout = new javax.swing.GroupLayout(jpnHinh);
        jpnHinh.setLayout(jpnHinhLayout);
        jpnHinhLayout.setHorizontalGroup(
            jpnHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHinhLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHinhAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnHinhLayout.setVerticalGroup(
            jpnHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHinhLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHinhAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtTenNV.setBorder(null);
        txtTenNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenNVActionPerformed(evt);
            }
        });

        txtMaNV.setBorder(null);
        txtMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNVActionPerformed(evt);
            }
        });

        txtEmail.setBackground(new Color(0,0,0,0));
        txtEmail.setBorder(null);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtSDT.setBackground(new Color(0,0,0,0));
        txtSDT.setBorder(null);
        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        txtNgaySinh.setBackground(new Color(0,0,0,0));
        txtNgaySinh.setBorder(null);
        txtNgaySinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgaySinhActionPerformed(evt);
            }
        });

        txtMatKhau.setBackground(new Color(0,0,0,0));
        txtMatKhau.setBorder(null);
        txtMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatKhauActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam ");
        rdoNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNamActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdoNV);
        rdoNV.setText("Nhân Viên ");

        buttonGroup2.add(rdoQL);
        rdoQL.setText("Quản Lý");
        rdoQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoQLActionPerformed(evt);
            }
        });

        txtDiaChi.setColumns(20);
        txtDiaChi.setRows(5);
        txtDiaChi.setBorder(null);
        jScrollPane2.setViewportView(txtDiaChi);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Địa Chỉ:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Chức Vụ:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Giới Tính:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Mật Khẩu:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Ngày Sinh:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Số Điện Thoại:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Email:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Tên Nhân Viên:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Mã Nhân Viên:");

        jlbMaNV.setText("jLabel1");

        jlbTenNV.setText("jLabel5");

        jlbEmail.setText("jLabel6");

        jlbSDT.setText("jLabel8");

        jlbNgaySinh.setText("jLabel10");

        jlbMatKhau.setText("jLabel13");

        jlbGioiTinh.setText("jLabel15");

        jlbChucVu.setText("jLabel17");

        jlbDiaChi.setText("jLabel18");

        jlbHinh.setText("jLabel1");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Hình Nhân Viên: ");

        btnSapXep.setBackground(new java.awt.Color(153, 153, 255));
        btnSapXep.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnSapXep.setForeground(new java.awt.Color(255, 255, 255));
        btnSapXep.setText("Làm Mới ");
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(153, 153, 255));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xóa ");
        btnXoa.setMaximumSize(new java.awt.Dimension(100, 29));
        btnXoa.setMinimumSize(new java.awt.Dimension(100, 29));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(153, 153, 255));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa ");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(153, 153, 255));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm ");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jlbEmail)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtEmail)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jlbSDT)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtSDT)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMatKhau)
                            .addComponent(txtNgaySinh)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbMatKhau)
                                    .addComponent(jlbNgaySinh))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenNV)
                            .addComponent(txtMaNV)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbHinh)
                                    .addComponent(jlbTenNV)
                                    .addComponent(jlbMaNV))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jlbDiaChi)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdoQL)
                                    .addComponent(rdoNam)
                                    .addComponent(jlbGioiTinh)
                                    .addComponent(jlbChucVu))
                                .addGap(77, 77, 77)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdoNu)
                                    .addComponent(rdoNV)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(jpnHinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpnHinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jlbHinh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(7, 7, 7)
                .addComponent(jlbMaNV)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(7, 7, 7)
                .addComponent(jlbTenNV)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbEmail)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbSDT)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbNgaySinh)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbMatKhau)
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoNam)
                            .addComponent(rdoNu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbGioiTinh)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoQL)
                            .addComponent(rdoNV))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbChucVu)))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbDiaChi)
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSapXep)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua)
                    .addComponent(btnThem))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 540, 760));

        txtTimKiemNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemNhanVienActionPerformed(evt);
            }
        });
        add(txtTimKiemNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 560, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Tìm Kiếm Nhân Viên:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNVActionPerformed

    private void txtTenNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenNVActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNgaySinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaySinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaySinhActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void rdoNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNamActionPerformed

    private void rdoQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoQLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoQLActionPerformed

    private void txtMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhauActionPerformed

    private void tblDanhSanhNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSanhNVMouseClicked
        fillToForm(tblDanhSanhNV.getSelectedRow());        // TODO add your handling code here:
    }//GEN-LAST:event_tblDanhSanhNVMouseClicked

    private void jlbHinhAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbHinhAnhMouseClicked
        choAnh();        // TODO add your handling code here:
    }//GEN-LAST:event_jlbHinhAnhMouseClicked

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        lamMoiNV();        // TODO add your handling code here:
    }//GEN-LAST:event_btnSapXepActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        deleteSinhVien();
        lamMoiNV();// TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (checkRong()) {
            if (checkMaKoTT()) {
                if (checkEmail()) {
                    if (checkSDT()) {
                        if (checkNgay()) {
                            updateSinhVien();
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (checkRong()) {
            if (checkMaTT()) {
                if (checkEmail()) {
                    if (checkSDT()) {
                        if (checkNgay()) {
                            insertNhanVien();
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtTimKiemNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemNhanVienActionPerformed
        timKiemSinhVien();        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemNhanVienActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlbChucVu;
    private javax.swing.JLabel jlbDiaChi;
    private javax.swing.JLabel jlbEmail;
    private javax.swing.JLabel jlbGioiTinh;
    private javax.swing.JLabel jlbHinh;
    private javax.swing.JLabel jlbHinhAnh;
    private javax.swing.JLabel jlbMaNV;
    private javax.swing.JLabel jlbMatKhau;
    private javax.swing.JLabel jlbNgaySinh;
    private javax.swing.JLabel jlbSDT;
    private javax.swing.JLabel jlbTenNV;
    private javax.swing.JPanel jpnHinh;
    private javax.swing.JRadioButton rdoNV;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JRadioButton rdoQL;
    private javax.swing.JTable tblDanhSanhNV;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTimKiemNhanVien;
    // End of variables declaration//GEN-END:variables
   public void loadTable() {
        String coulum[] = {"Mã Nhân Viên", "Tên Nhân Viên", "Ngày Sinh", "Email", "Chức Vụ", "Số Điện Thoại", "Giới Tính", "Địa Chỉ"};
        DefaultTableModel model = new DefaultTableModel(coulum, 0);
        list = NhanVienDao.getAllNhanVien();
        for (NhanVien sv : list) {
            model.addRow(new Object[]{
                sv.getMaNV(),
                sv.getHoTen(),
                sv.getNgaySinh(),
                sv.getEmail(),
                sv.getChucVu() ? "Quản Lý" : "Nhân Viên",
                sv.getSoDienThoai(),
                sv.getGioiTinh() ? "Nam" : "Nữ",
                sv.getDiaChi()

            });
            tblDanhSanhNV.setModel(model);
        }
    }

    public void colorBorder() {
        jlbMaNV.setForeground(new Color(0, 0, 0, 0));
        jlbTenNV.setForeground(new Color(0, 0, 0, 0));
        jlbEmail.setForeground(new Color(0, 0, 0, 0));
        jlbSDT.setForeground(new Color(0, 0, 0, 0));
        jlbNgaySinh.setForeground(new Color(0, 0, 0, 0));
        jlbMatKhau.setForeground(new Color(0, 0, 0, 0));
        jlbGioiTinh.setForeground(new Color(0, 0, 0, 0));
        jlbChucVu.setForeground(new Color(0, 0, 0, 0));
        jlbDiaChi.setForeground(new Color(0, 0, 0, 0));
        jlbHinh.setForeground(new Color(0, 0, 0, 0));

        txtMaNV.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        txtTenNV.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        txtEmail.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        txtSDT.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        txtNgaySinh.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        txtMatKhau.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        txtDiaChi.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        jpnHinh.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        txtTimKiemNhanVien.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }

    public void lamMoiNV() {
        txtMaNV.setText("");
        txtTenNV.setText("");
        txtNgaySinh.setText("");
        txtSDT.setText("");
        txtEmail.setText("");
        txtMatKhau.setText("");
        jlbHinhAnh.setText("");
        txtDiaChi.setText("");
        jlbHinhAnh.setIcon(null);
        colorBorder();
    }
    

    public NhanVien formToSV() {
        NhanVien sv = new NhanVien();
        sv.setMaNV(txtMaNV.getText());
        sv.setHoTen(txtTenNV.getText());
        sv.setNgaySinh(txtNgaySinh.getText());
        sv.setEmail(txtEmail.getText());
        sv.setSoDienThoai(txtSDT.getText());
        sv.setGioiTinh(rdoNam.isSelected());
        sv.setChucVu(rdoQL.isSelected());
        sv.setDiaChi(txtDiaChi.getText());
        sv.setMatKhau(NhanVienDao.getMd5(txtMatKhau.getText()));
        sv.setHinhAnh(jlbHinhAnh.getToolTipText());
        return sv;
    }

    public void fillToForm(int index) {
        try {
            NhanVien sv = list.get(index);
            txtMaNV.setText(sv.getMaNV());
            txtTenNV.setText(sv.getHoTen());
            txtEmail.setText(sv.getEmail());
            txtNgaySinh.setText(sv.getNgaySinh());
            txtSDT.setText(sv.getSoDienThoai());
            txtMatKhau.setText(sv.getMatKhau());
            if (sv.getGioiTinh()) {
                rdoNam.setSelected(true);
            } else {
                rdoNu.setSelected(true);
            }
            txtDiaChi.setText(sv.getDiaChi());
            if (sv.getChucVu()) {
                rdoQL.setSelected(true);
            } else {
                rdoNV.setSelected(true);
            }
            txtDiaChi.setText(sv.getDiaChi());
            if (sv.getHinhAnh() != null) {
                jlbHinhAnh.setToolTipText(sv.getHinhAnh());
                ImageIcon icon = XImage.read(sv.getHinhAnh());
                Image img = icon.getImage();
                Image sizeIcon = img.getScaledInstance(jlbHinhAnh.getWidth(), jlbHinhAnh.getHeight(), 0);
                ImageIcon newIcon = new ImageIcon(sizeIcon);
                jlbHinhAnh.setIcon(newIcon);
            } else {
                jlbHinhAnh.setIcon(null);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }

    }

    public void insertNhanVien() {
        NhanVien sv = formToSV();
        int rs = NhanVienDao.insertNhanVien(sv);
        if (rs > 0) {
            JOptionPane.showMessageDialog(this, "Thêm Thành Công");
            loadTable();
        } else {
            JOptionPane.showMessageDialog(this, "Thêm Thất Bại");
        }
    }

    public void updateSinhVien() {
        NhanVien sv = formToSV();
        int rs = NhanVienDao.updateNhanVien(sv);
        if (rs > 0) {
            JOptionPane.showMessageDialog(this, "Cập Nhật Thành Công");
            loadTable();
        } else {
            JOptionPane.showMessageDialog(this, "Cập Nhật Thất Bại");
        }
    }

    public void deleteSinhVien() {
        int ma = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa Sinh Viên này không?");
        if (ma == 0) {
            int rs = NhanVienDao.deleteNhanVien(txtMaNV.getText());
            if (rs > 0) {
                JOptionPane.showMessageDialog(this, "Xoá Thành Công");
                loadTable();
            } else {
                JOptionPane.showMessageDialog(this, "xóa Thất Bại");
            }
        } else {
            return;
        }
    }

    public void timKiemSinhVien() {

        String coulum[] = {"Mã Nhân Viên", "Tên Nhân Viên", "Ngày Sinh", "Email", "Chức Vụ", "Số Điện Thoại", "Giới Tính", "Địa Chỉ"};
        DefaultTableModel model = new DefaultTableModel(coulum, 0);
        list = NhanVienDao.TimKiem(txtTimKiemNhanVien.getText());
        for (NhanVien sv : list) {
            model.addRow(new Object[]{
                sv.getMaNV(),
                sv.getHoTen(),
                sv.getNgaySinh(),
                sv.getEmail(),
                sv.getChucVu() ? "Quản Lý" : "Nhân Viên",
                sv.getSoDienThoai(),
                sv.getGioiTinh() ? "Nam" : "Nữ",
                sv.getDiaChi()

            });

        }
        tblDanhSanhNV.setModel(model);
    }

    void choAnh() {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            ImageIcon icon = XImage.read(file.getName());
            XImage.save(file);
            Image img = icon.getImage();
            Image sizeIcon = img.getScaledInstance(jlbHinhAnh.getWidth(), jlbHinhAnh.getHeight(), 0);
            ImageIcon newIcon = new ImageIcon(sizeIcon);
            jlbHinhAnh.setIcon(newIcon);
            jlbHinhAnh.setToolTipText(file.getName());
        }
    }

    public boolean checkRong() {
        if (txtMaNV.getText().isBlank()) {
            jlbMaNV.setText("Mã Nhân Viên Không Được Để Trống!!");
            jlbMaNV.setForeground(Color.red);
            return false;
        }else{
            jlbMaNV.setForeground(new Color(0, 0, 0, 0));
        }
        if (txtTenNV.getText().isBlank()) {
            jlbTenNV.setText("Tên Nhân Viên Không Được Để Trống!!");
            jlbTenNV.setForeground(Color.red);
            return false;
        }else{
            jlbTenNV.setForeground(new Color(0, 0, 0, 0));
        }
        if (txtEmail.getText().isBlank()) {
            jlbEmail.setText("Email Nhân Viên Không Được Để Trống!!");
            jlbEmail.setForeground(Color.red);
            return false;
        }else{
            jlbEmail.setForeground(new Color(0, 0, 0, 0));
        }
        if (txtSDT.getText().isBlank()) {
            jlbSDT.setText("Số Điện Thoại Không Được Để Trống!!");
            jlbSDT.setForeground(Color.red);
            return false;
        }else{
            jlbSDT.setForeground(new Color(0, 0, 0, 0));
        }
        if (txtNgaySinh.getText().isBlank()) {
            jlbNgaySinh.setText("Ngày Sinh Không Được Để Trống!!");
            jlbNgaySinh.setForeground(Color.red);
            return false;
        }else{
            jlbNgaySinh.setForeground(new Color(0, 0, 0, 0));
        }
        if (txtMatKhau.getText().isBlank()) {
            jlbMatKhau.setText("Mật Khẩu Không Được Để Trống!!");
            jlbMatKhau.setForeground(Color.red);
            return false;
        }else{
            jlbMatKhau.setForeground(new Color(0, 0, 0, 0));
        }
        if (txtDiaChi.getText().isBlank()) {
            jlbDiaChi.setText("Địa Chỉ Không Được Để Trống!!");
            jlbDiaChi.setForeground(Color.red);
            return false;
        }else{
            jlbDiaChi.setForeground(new Color(0, 0, 0, 0));
        }
        return true;
    }

    public boolean checkMaTT() {
        list = NhanVienDao.getAllNhanVien();
        for (NhanVien nhanVien : list) {
            if (txtMaNV.getText().equals(nhanVien.getMaNV())) {

                jlbMaNV.setText("Mã Nhân Viên Không Tồn Tại!!");
                jlbMaNV.setForeground(Color.RED);
                return false;
            }
        }

        jlbMaNV.setForeground(new Color(0, 0, 0, 0));
        return true;
    }

    public boolean checkMaKoTT() {
        list = NhanVienDao.getAllNhanVien();
        for (NhanVien nhanVien : list) {
            if (txtMaNV.getText().equals(nhanVien.getMaNV())) {

                jlbMaNV.setForeground(new Color(0, 0, 0, 0));
                return true;
            }
        }

        jlbMaNV.setText("Mã Nhân Viên Không Tồn Tại!!");
        jlbMaNV.setForeground(Color.RED);
        return false;
    }

    public boolean checkEmail() {
        String Remail = "^[a-zA-Z0-9]+@[a-z]+(\\.[a-z]+)+";
        if (txtEmail.getText().matches(Remail)) {

            jlbEmail.setForeground(new Color(0, 0, 0, 0));
            return true;
        } else {

            jlbEmail.setText("Email Không Đúng Định Dạng!!");
            jlbEmail.setForeground(Color.RED);
            return false;
        }
    }

    public boolean checkSDT() {
        String Resdt = "^(08|05|03|07|09|\\+849|\\+848|\\+847|\\+845|\\+843)[0-9]{8}";
        if (txtSDT.getText().matches(Resdt)) {

            jlbSDT.setForeground(new Color(0, 0, 0, 0));
            return true;
        } else {

            jlbSDT.setText("Số Điện Thoại Không Đúng Định Dạng!!");
            jlbSDT.setForeground(Color.RED);
            return false;
        }
    }

    public boolean checkNgay() {
        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
        try {
            formater.parse(txtNgaySinh.getText().trim());
        } catch (Exception e) {

            jlbNgaySinh.setText("Ngày Sinh Không Đúng Định Dạng!!");
            jlbNgaySinh.setForeground(Color.red);
            return false;
        }

        jlbNgaySinh.setForeground(new Color(0, 0, 0, 0));
        return true;
    }
}
