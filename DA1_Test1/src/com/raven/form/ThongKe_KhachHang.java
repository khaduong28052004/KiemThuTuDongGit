package com.raven.form;

import com.code.dao.KhachHangDao;
import javax.swing.table.DefaultTableModel;
import com.code.model.KhachHang;
import com.edusys.utils.MsgBox;
import com.edusys.utils.XImage;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ThongKe_KhachHang extends javax.swing.JPanel {

    List<KhachHang> list = new ArrayList<>();
    KhachHangDao dao = new KhachHangDao();
    int indexRow = -1;
    int page = 0;

    public ThongKe_KhachHang() {
        initComponents();
        loadtableKH();
    }

    public void loadtableKH() {
        list = dao.getSelectAll();
        String row[] = {"Mã KH", "Tên KH", "Giới Tính", "Ngày sinh", "Email", "Số ĐT", "Địa chỉ"};
        DefaultTableModel model = new DefaultTableModel(row, 0);
        for (int i = 0; i < 100; i++) {
            try {
                int index = page * 100 + i;
                KhachHang kh = list.get(index);
                model.addRow(new Object[]{kh.getMaKH(), kh.getTENKH(), kh.isGioiTinh() ? "Nam" : "Nữ", kh.getNgaySinh(), kh.getEMAIL(), kh.getSODT(), kh.getDIACHI()});
            } catch (Exception e) {

            }
        }
        tblKhachHang.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        txtDenNgay = new javax.swing.JTextField();
        txtTuNgay = new javax.swing.JTextField();
        btnSapXep = new javax.swing.JButton();
        btnLoc = new javax.swing.JButton();
        txtSP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblKhachHang);

        btnSapXep.setBackground(new java.awt.Color(0, 204, 204));
        btnSapXep.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSapXep.setForeground(new java.awt.Color(255, 255, 255));
        btnSapXep.setText("Sắp Xếp");
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        btnLoc.setBackground(new java.awt.Color(0, 204, 204));
        btnLoc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLoc.setForeground(new java.awt.Color(255, 255, 255));
        btnLoc.setText("Lọc");
        btnLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Lọc theo tên sản phẩm");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Từ Ngày");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Đến Ngày");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnSapXep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtSP, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLoc))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLoc)
                        .addComponent(btnSapXep)
                        .addComponent(txtSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocActionPerformed
        find();
    }//GEN-LAST:event_btnLocActionPerformed

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        SapXep();
    }//GEN-LAST:event_btnSapXepActionPerformed
    void SapXep() {
        String ngayTu = txtTuNgay.getText();
        String ngayDen = txtDenNgay.getText();

        // Parse the input dates
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date tuNgay = null;
        Date denNgay = null;
        try {
            tuNgay = sdf.parse(ngayTu);
            denNgay = sdf.parse(ngayDen);
        } catch (ParseException e) {
            MsgBox.alert(this, "Định dạng ngày không hợp lệ!");
            return;
        }

        findTableByDate(tuNgay, denNgay);
    }

    void findTableByDate(Date tuNgay, Date denNgay) {
        boolean test = false;
        DefaultTableModel model = (DefaultTableModel) tblKhachHang.getModel();
        model.setRowCount(0);
        try {
            List<KhachHang> list = dao.getAllByDate(tuNgay, denNgay);
            for (KhachHang kh : list) {
                model.addRow(new Object[]{
                    kh.getMaKH(), kh.getTENKH(), kh.isGioiTinh() ? "Nam" : "Nữ", kh.getNgaySinh(), kh.getEMAIL(), kh.getSODT(), kh.getDIACHI()
                });
                test = true;
            }
            if (test) {
                MsgBox.alert(this, "Đã tìm thấy Khách Hàng Rồi Nè");
            } else {
                MsgBox.alert(this, "Không tìm thấy Khách Hàng");
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }

    void find() {
        findTableID(txtSP.getText());
    }

    void findTableID(String id) {
        boolean test = false;
        DefaultTableModel model = (DefaultTableModel) tblKhachHang.getModel();
        model.setRowCount(0);
        try {
            List<KhachHang> list = dao.getAllByID(id);
            for (KhachHang kh : list) {
                model.addRow(new Object[]{
                    kh.getMaKH(), kh.getTENKH(), kh.isGioiTinh() ? "Nam" : "Nữ", kh.getNgaySinh(), kh.getEMAIL(), kh.getSODT(), kh.getDIACHI()
                });
                test = true;
            }
            if (test) {
                MsgBox.alert(this, "Đã Tìm thấy Khách Hàng");
            } else {
                MsgBox.alert(this, "Không Tìm thấy Khách Hàng");
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnSapXep;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTextField txtDenNgay;
    private javax.swing.JTextField txtSP;
    private javax.swing.JTextField txtTuNgay;
    // End of variables declaration//GEN-END:variables
}
