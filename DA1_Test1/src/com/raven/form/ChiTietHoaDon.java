/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.raven.form;

import com.code.dao.HoaDonDao;
import com.code.dao.MauDao;
import com.code.dao.SanPhamChiTietDao;
import com.code.dao.SanPhamDao;
import com.code.dao.SizeDao;
import com.code.form2.Jdialog__Bill_BanHang;
import com.code.model.HoaDon;
import com.code.model.LoaiSanPham;
import com.code.model.Mau;
import com.code.model.SanPham;
import com.code.model.SanPhamChiTiet;
import com.code.model.Size;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.edusys.utils.format;

/**
 *
 * @author Computer
 */
public class ChiTietHoaDon extends javax.swing.JDialog {

    /**
     * Creates new form ChiTietHoaDon
     */
    public ChiTietHoaDon(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadCboLoaiSP();
        setLocationRelativeTo(null);
        loadToTableHDCT(maHD);
        maLoai = listLoai.get(0).getMaLoai();
        loadTablSP();
        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        cboMau = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        cboSize = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lblGia = new javax.swing.JLabel();
        spnSL = new javax.swing.JSpinner();
        jLabel31 = new javax.swing.JLabel();
        lblTenSP = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        lblThanhTien = new javax.swing.JLabel();
        txtGiamGia = new javax.swing.JTextField();
        lblMaHDCT = new javax.swing.JLabel();
        lblSoLuong = new javax.swing.JLabel();
        lblMaHD = new javax.swing.JLabel();
        lblMaSP = new javax.swing.JLabel();
        lblGiamGia = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        lblSLKho = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblCTHD = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSachSP = new javax.swing.JTable();
        cboLoaiSP = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText("Mã hóa đơn:");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel26.setText("Mã sản phẩm");

        txtMaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSPActionPerformed(evt);
            }
        });
        txtMaSP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaSPKeyReleased(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel28.setText("Màu");

        cboMau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMauActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel29.setText("Size");

        cboSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSizeActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel30.setText("Số Lượng");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel32.setText("Giá");

        lblGia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblGia.setText("  ");

        spnSL.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                spnSLAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        spnSL.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnSLStateChanged(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel31.setText("Tên SP");

        lblTenSP.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        btnThem.setBackground(new java.awt.Color(153, 153, 255));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel63.setText("Giảm giá");

        jLabel64.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel64.setText("Thành tiền");

        lblThanhTien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtGiamGia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGiamGiaKeyReleased(evt);
            }
        });

        lblMaHDCT.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        lblSoLuong.setText(" ");

        lblMaHD.setText(" ");

        lblMaSP.setText(" ");

        lblGiamGia.setText(" ");

        btnXoa.setBackground(new java.awt.Color(153, 153, 255));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(153, 153, 255));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnMoi.setBackground(new java.awt.Color(153, 153, 255));
        btnMoi.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnMoi.setForeground(new java.awt.Color(255, 255, 255));
        btnMoi.setText("Làm mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel33.setText("SL Kho");

        lblSLKho.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSLKho.setText("  ");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMaSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel15Layout.createSequentialGroup()
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cboMau, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel15Layout.createSequentialGroup()
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cboSize, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel15Layout.createSequentialGroup()
                                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMaSP, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                        .addComponent(lblMaHDCT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel15Layout.createSequentialGroup()
                                    .addComponent(jLabel31)
                                    .addGap(65, 65, 65)
                                    .addComponent(lblTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel15Layout.createSequentialGroup()
                                    .addComponent(jLabel63)
                                    .addGap(28, 28, 28)
                                    .addComponent(txtGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel15Layout.createSequentialGroup()
                                    .addComponent(jLabel30)
                                    .addGap(18, 18, 18)
                                    .addComponent(spnSL, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblGiamGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel64)
                                .addGap(18, 18, 18)
                                .addComponent(lblThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel32))
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSLKho, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblGia, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMaHD))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSoLuong))
                    .addComponent(lblMaHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaSP)
                            .addComponent(lblGiamGia)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel63)
                            .addComponent(txtGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel33)
                        .addComponent(lblSLKho)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboMau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem)
                            .addComponent(btnSua)
                            .addComponent(btnXoa)
                            .addComponent(btnMoi))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        tblCTHD.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCTHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCTHDMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(tblCTHD);

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Thanh Toán");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 1102, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tblDanhSachSP.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDanhSachSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhSachSP);

        cboLoaiSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboLoaiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLoaiSPActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Loại SP");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Tên SP");

        txtTenSP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTenSPKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(cboLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboLoaiSP)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSPActionPerformed

    private void txtMaSPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaSPKeyReleased
        maSP = txtMaSP.getText().trim();
        setFormHDCT();
    }//GEN-LAST:event_txtMaSPKeyReleased

    private void cboMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMauActionPerformed

        try {
            maMau = listMau.get(cboMau.getSelectedIndex()).getMaMau();
            System.out.println("mamau: " + maMau + "Tên Màu" + listMau.get(cboMau.getSelectedIndex()).getTenMau());
            setCboSize();
            maSize = listSize.get(0).getMaSize();
            setSL();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cboMauActionPerformed

    private void cboSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSizeActionPerformed
        try {
            maSize = listSize.get(cboSize.getSelectedIndex()).getMaSize();
            setSL();
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }//GEN-LAST:event_cboSizeActionPerformed

    private void spnSLStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnSLStateChanged

        setThanhTien();
    }//GEN-LAST:event_spnSLStateChanged

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        insert();
        loadToTableHDCT(maHD);
    }//GEN-LAST:event_btnThemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        InBill2 bill = new InBill2(null, true);
        bill.loadToTable(maHD);
        bill.setVisible(true);
//Jdialog__Bill_BanHang bn = new Jdialog__Bill_BanHang(null, true);
//        bn.setMaNhap(maHD);
//        bn.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void spnSLAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_spnSLAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_spnSLAncestorAdded

    private void txtGiamGiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGiamGiaKeyReleased
        try {
            Float.parseFloat(txtGiamGia.getText());
            setThanhTien();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtGiamGiaKeyReleased

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        xoaHDCT();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        updateHDCT();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        clearform();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void cboLoaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLoaiSPActionPerformed
        maLoai = listLoai.get(cboLoaiSP.getSelectedIndex()).getMaLoai();
        loadTablSP();
    }//GEN-LAST:event_cboLoaiSPActionPerformed

    private void txtTenSPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenSPKeyReleased
        loadTablSP();
    }//GEN-LAST:event_txtTenSPKeyReleased

    private void tblDanhSachSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachSPMouseClicked
        clearform();
        maSP = String.valueOf(tblDanhSachSP.getValueAt(tblDanhSachSP.getSelectedRow(), 0));
        setFormHDCT();
        txtMaSP.setText(maSP);
//System.out.println(maSP);
    }//GEN-LAST:event_tblDanhSachSPMouseClicked
    int id = 0;
    private void tblCTHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCTHDMouseClicked
        HoaDon cthd = list.get(tblCTHD.getSelectedRow());
        setFillToForm(cthd);
//        slHienTai=
        id = cthd.getId();
        btnSua.setEnabled(true);
        btnXoa.setEnabled(true);
        btnThem.setEnabled(false);
    }//GEN-LAST:event_tblCTHDMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChiTietHoaDon dialog = new ChiTietHoaDon(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboLoaiSP;
    private javax.swing.JComboBox<String> cboMau;
    private javax.swing.JComboBox<String> cboSize;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JLabel lblGia;
    private javax.swing.JLabel lblGiamGia;
    private javax.swing.JLabel lblMaHD;
    private javax.swing.JLabel lblMaHDCT;
    private javax.swing.JLabel lblMaSP;
    private javax.swing.JLabel lblSLKho;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTenSP;
    private javax.swing.JLabel lblThanhTien;
    private javax.swing.JSpinner spnSL;
    private javax.swing.JTable tblCTHD;
    private javax.swing.JTable tblDanhSachSP;
    private javax.swing.JTextField txtGiamGia;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables
    HoaDonDao dao = new HoaDonDao();
    List<HoaDon> list = new ArrayList();
    SanPhamDao daoSP = new SanPhamDao();
    List<SanPham> listSP = new ArrayList<>();
    MauDao daoMau = new MauDao();
    List<Mau> listMau = new ArrayList<>();
    SizeDao daoSize = new SizeDao();
    List<Size> listSize = new ArrayList<>();
    String maHD = "";
    String maSP;
    SanPhamChiTietDao daoSPCT = new SanPhamChiTietDao();
    List<SanPhamChiTiet> listSPCT = daoSPCT.getAllSPById(maSP);
    int maMau;
    int maSize;
    float giamGia;
    int soLuong = 0;
    float thanhTien;
    int slKho = 0;
    int slHienTai = 0;

    public void setFormHDCT() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        listSPCT = daoSPCT.getAllSPById(maSP);
        model.removeAllElements();
        listMau.removeAll(listMau);
        for (SanPhamChiTiet sp : listSPCT) {
            if (maSP.equals(sp.getMaSP())) {
                lblTenSP.setText(listSP.get(0).getTenSP());
                listSP = daoSP.getAllExceptByID(sp.getMaSP());
                Mau mau = daoMau.getAllExceptByID(sp.getMaMau()).get(0);
                listMau.add(mau);
                model.addElement(mau.getTenMau());
                lblGia.setText(format.formatPrice(String.valueOf(listSP.get(0).getGia())));
                cboMau.setModel(model);
                maMau = listMau.get(0).getMaMau();
                setCboSize();
                maSize = listSize.get(0).getMaSize();
            }

        }
        setSL();
    }

    public void setFillToForm(HoaDon hd) {
        txtMaSP.setText(hd.getMaSP());
        maSP = hd.getMaSP();
        lblTenSP.setText(daoSP.getAllExceptByID(hd.getMaSP()).get(0).getTenSP());
        cboMau.removeAllItems();
        cboSize.removeAllItems();
        cboMau.addItem(daoMau.getAllExceptByID(hd.getMaMau()).get(0).getTenMau());
        cboSize.addItem(daoSize.getAllExceptByID(hd.getMaSize()).get(0).getTenSize());
        maMau = hd.getMaMau();
        maSize = hd.getMaSize();
        setSL();
        spnSL.setValue(hd.getSoLuong());
        txtGiamGia.setText(hd.getGiamGia() + "");
        lblGia.setText(format.formatPrice(hd.getGia() + ""));
        setThanhTien();
        slHienTai = hd.getSoLuong();

    }

    public void setCboSize() {
        listSPCT = daoSPCT.size(maSP, maMau);
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.removeAllElements();
        listSize.removeAll(listSize);
        for (SanPhamChiTiet spct : listSPCT) {
            Size size = daoSize.getAllExceptByID(spct.getMaSize()).get(0);
            listSize.add(size);
            model.addElement(size.getTenSize());
        }
        cboSize.setModel(model);
    }

    public void setSL() {
        try {
            SanPhamChiTiet spct = daoSPCT.getAllSLKho(maSP, maMau, maSize).get(0);
            lblSLKho.setText(spct.getSoLuong() + "");
            slKho = spct.getSoLuong();
        } catch (Exception e) {
        }

    }

    public void loadTablSP() {
        String coulum[] = {"Mã SP", "Tên SP", "Giá"};
        DefaultTableModel model = new DefaultTableModel(coulum, 0);

        listSP = daoSP.getAllSPByMaLoai(maLoai, txtTenSP.getText().trim());
        for (SanPham sv : listSP) {
            model.addRow(new Object[]{
                sv.getMaSP(),
                sv.getTenSP(),
                sv.getGia()
            });
        }
        tblDanhSachSP.setModel(model);
    }
    int tongSL = 0;
    float tongTien = 0;

    public HoaDon getFormHDCT() {
        tongSL = 0;
        tongTien = 0;
        soLuong = (int) spnSL.getValue();
        list = dao.getAllSelectHDCT(maHD);
        HoaDon hd = new HoaDon();
        hd.setMaHD(lblMaHDCT.getText().trim());
        hd.setMaSP(txtMaSP.getText().trim());
        hd.setSoLuong((int) spnSL.getValue());
        hd.setGiamGia(Float.parseFloat(txtGiamGia.getText()));
        hd.setGia(Float.parseFloat(lblGia.getText().replace(".", "")));
        hd.setMaMau(maMau);
        hd.setMaSize(maSize);
        for (int i = 0; i < tblCTHD.getRowCount(); i++) {
            try {
//                if (tblCTHD.getRowCount() >= 0) {
                String sl = String.valueOf(tblCTHD.getValueAt(i, 5));
                tongSL += Integer.parseInt(sl);
                String tt = String.valueOf(tblCTHD.getValueAt(i, 7)).replace(".", "");
                tongTien += Float.parseFloat(tt);
//                }
            } catch (Exception e) {
            }
        }
        tongSL += soLuong;
        tongTien += Float.parseFloat(lblThanhTien.getText().replace(".", ""));
        hd.setTongSoLuong(tongSL);
        hd.setTongtien(format.round(tongTien));
        return hd;
    }

    public void insert() {
        if (checkForm()) {
            dao.insetHDCYT(getFormHDCT());
            dao.updateSL(getFormHDCT());
            daoSPCT.updateSL(slKho - soLuong, maSP, maMau, maSize);
            clearform();
            new QLHD().loadToTableHoaDon();
            SanPhamChiTiet spc = daoSPCT.getList(maSP, maMau, maSize);
            soLuong = (int) spnSL.getValue();
            daoSPCT.updateSL(spc.getSoLuong() - soLuong, maSP, maMau, maSize);
            loadToTableHDCT(maHD);
        }
    }

    public boolean checkSL() {
        if ((int) spnSL.getValue() <= 0) {
            JOptionPane.showMessageDialog(this, "Số lượng không được nhỏ hơn 0");
        }
        return true;
    }

    public void loadToTableHDCT(String ma) {
        System.out.println(ma);
        String row[] = {"Mã HD", "Tên SP", "Màu", "Size", "Giá", "Số lượng", "Giảm giá", "Thành tiền", "Hình thức thanh toán"};
        DefaultTableModel model = new DefaultTableModel(row, 0);
        list = dao.getAllSelectHDCT(ma);
        lblMaHDCT.setText(ma);
        maHD = ma;
        for (HoaDon hd : list) {
            listSP = daoSP.getAllExceptByID(hd.getMaSP());
            listMau = daoMau.getAllExceptByID(hd.getMaMau());
            listSize = daoSize.getAllExceptByID(hd.getMaSize());
            model.addRow(new Object[]{
                hd.getMaHD(),
                listSP.get(0).getTenSP(),
                listMau.get(0).getTenMau(),
                listSize.get(0).getTenSize(),
                format.formatPrice(listSP.get(0).getGia() + ""),
                hd.getSoLuong(),
                hd.getGiamGia(),
                format.formatPrice(String.valueOf((hd.getSoLuong() * listSP.get(0).getGia()) * (1 - (hd.getGiamGia() / 100)))),
                hd.getHinhThucTT()
            });
        }
        tblCTHD.setModel(model);
    }

    public void setThanhTien() {
        try {
            soLuong = (int) spnSL.getValue();
            if (txtGiamGia.getText().trim().equals("")) {
                giamGia = 1;
            } else {
                giamGia = 1 - (Float.parseFloat(txtGiamGia.getText()) / 100);
//                
                thanhTien = Float.parseFloat(lblGia.getText().replace(".", "")) * soLuong * giamGia;
                lblThanhTien.setText(format.formatPrice(String.valueOf(format.round(thanhTien))));

            }

        } catch (Exception e) {
        }
    }

    public void clearform() {
        txtMaSP.setText("");
        lblTenSP.setText("");
        cboMau.removeAllItems();
        cboSize.removeAllItems();
        spnSL.setValue(0);
        lblSLKho.setText("0");
        txtGiamGia.setText("");
        lblThanhTien.setText("0");
        lblGia.setText("0");
        tongSL = 0;
        tongTien = 0;
        soLuong = 0;
        thanhTien = 0;
        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
        btnThem.setEnabled(true);
    }

    public boolean checkForm() {
        if (lblMaHDCT.getText() == null) {
            lblMaHD.setText("Vui lòng chọn hóa đơn trước khi thêm SP");
            lblMaHD.setForeground(Color.red);
            return false;
        } else if (txtMaSP.getText().trim().equals("")) {
            lblMaHD.setForeground(new Color(0, 0, 0, 0));
            lblMaSP.setText("Vui lòng nhập sản phẩm trước khi thêm số lượng");
            lblMaSP.setForeground(Color.red);
            return false;
        } else if (soLuong <= 0) {
            System.out.println("SL" + soLuong);
            lblMaSP.setForeground(new Color(0, 0, 0, 0));
            lblSoLuong.setText("Số lượng không được nhỏ hơn hoặc bằng 0");
            lblSoLuong.setForeground(Color.red);
            return false;
        } else if (soLuong > slKho) {
            lblSoLuong.setText("Không đủ sản phẩm");
            lblSoLuong.setForeground(Color.red);
            return false;
        } else {
            lblSoLuong.setForeground(new Color(0, 0, 0, 0));
            try {
                giamGia = Float.parseFloat(txtGiamGia.getText().trim());
                if (giamGia < 0 || giamGia > 100) {
                    lblGiamGia.setText("Giảm giá không được nhỏ hơn 0 hoặc lớn hơn 100 ");
                    lblGiamGia.setForeground(Color.red);
                    return false;
                } else {
                    lblGiamGia.setForeground(new Color(0, 0, 0, 0));
                }
            } catch (Exception e) {
                lblGiamGia.setText("Giảm giá không được nhập chữ hoặc để trống");
                lblGiamGia.setForeground(Color.red);
                return false;
            }

        }

        return true;
    }
    List<LoaiSanPham> listLoai = new ArrayList<>();
    String maLoai = "";

    public void loadCboLoaiSP() {
        listLoai = daoSP.getAllLoaiSP();
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.removeAllElements();
        for (LoaiSanPham itemp : listLoai) {
            model.addElement(itemp.getTenLoai());
        }
        cboLoaiSP.setModel(model);
    }

    public void updateHDCT() {
        if (checkForm()) {
            dao.updateHDCT(soLuong, giamGia, id);
            loadToTableHDCT(maHD);
            int sl = 0;
            float tongTien = 0;
            for (int i = 0; i < tblCTHD.getRowCount(); i++) {
                sl += Integer.parseInt(tblCTHD.getValueAt(i, 5).toString());
                String tien = String.valueOf(tblCTHD.getValueAt(i, 7)).replace(".", "");
                tongTien += Float.parseFloat(tien);
            }
            HoaDon hd = new HoaDon();
            hd.setTongSoLuong(sl);
            hd.setMaHD(maHD);
            hd.setTongtien(tongTien);
            dao.updateSL(hd);
            int updateSLKho = 0;
            if (soLuong >= slHienTai) {
                updateSLKho = soLuong - slHienTai;
                daoSPCT.updateSL(slKho - updateSLKho, maSP, maMau, maSize);
                slHienTai = 0;
            } else {
                updateSLKho = slHienTai - soLuong;
                daoSPCT.updateSL(slKho + updateSLKho, maSP, maMau, maSize);
                slHienTai = 0;
            }
            JOptionPane.showMessageDialog(this, "Sửa thành công");
            clearform();
        }
    }

    public void xoaHDCT() {
        dao.deleteHDCT(id);
        loadToTableHDCT(maHD);
        int sl = 0;
        for (int i = 0; i < tblCTHD.getRowCount(); i++) {
            sl += Integer.parseInt(tblCTHD.getValueAt(i, 5).toString());
            String tien = String.valueOf(tblCTHD.getValueAt(i, 7)).replace(".", "");
            tongTien += Float.parseFloat(tien);
        }
        HoaDon hd = new HoaDon();
        hd.setTongSoLuong(sl);
        hd.setMaHD(maHD);
        hd.setTongtien(tongTien);
        dao.updateSL(hd);
        dao.updateSL(hd);
        daoSPCT.updateSL(slHienTai+slKho, maSP, maMau, maSize);
        JOptionPane.showMessageDialog(this, "Xóa Thành Công");
        clearform();
    }
}
