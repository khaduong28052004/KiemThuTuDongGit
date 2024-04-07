package com.raven.form;

import com.code.dao.HoaDonDao;
import com.code.dao.KhachHangDao;
import com.code.dao.NhapHangDao;
import com.code.dao.SanPhamDao;
import com.code.model.HoaDon;
import com.code.model.HoaDonChiTiet;
import com.code.model.KhachHang;
import com.code.model.NhapHang;
import com.code.model.SanPham;
import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JTable;

public class ThongKe_SanPham extends javax.swing.JPanel {

    private SanPhamDao sanPhamDao;
    private List<SanPham> list = new ArrayList<>();

    public ThongKe_SanPham() {
        initComponents();
        setOpaque(false);
        loadTableSanPham();
    }

    public void loadTableSanPham() {
        String coulum[] = {"Mã Sản Phẩm", "Tên Sản Phẩm", "Giá", "Loại",};
        DefaultTableModel model = new DefaultTableModel(coulum, 0);
        list = SanPhamDao.getAllSanPham();
        for (SanPham sv : list) {
            model.addRow(new Object[]{
                sv.getMaSP(),
                sv.getTenSP(),
                sv.getGia(),
                sv.getMaLoai()
            });
            tblSanPham.setModel(model);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblBangDiem = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtSP = new javax.swing.JTextField();
        btnLoc = new javax.swing.JButton();
        btnSapXep = new javax.swing.JButton();
        txtDenNgay = new javax.swing.JTextField();
        txtTuNgay = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        tblBangDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên SP", "Loại", "Màu", "Size", "Số lượt mua", "Thành Tiền", "Ghi Chú"
            }
        ));
        tblBangDiem.setRowHeight(25);
        jScrollPane1.setViewportView(tblBangDiem);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THỐNG KÊ SẢN PHẨM");

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên SP", "Loại", "Màu", "Size", "Thành Tiền", "Ghi Chú"
            }
        ));
        tblSanPham.setRowHeight(25);
        jScrollPane2.setViewportView(tblSanPham);

        jLabel2.setText("Lọc theo tên sản phẩm");

        btnLoc.setBackground(new java.awt.Color(40, 232, 232));
        btnLoc.setText("Lọc");
        btnLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocActionPerformed(evt);
            }
        });

        btnSapXep.setBackground(new java.awt.Color(40, 232, 232));
        btnSapXep.setText("Sắp Xếp");
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        jLabel3.setText("Từ Ngày");

        jLabel4.setText("Đến Ngày");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSapXep)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLoc))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtSP, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSapXep)
                            .addComponent(btnLoc)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocActionPerformed
        find();
    }//GEN-LAST:event_btnLocActionPerformed

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
      SapXep();  // TODO add your handling code here:
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
        DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel();
        model.setRowCount(0);
        try {
            List<HoaDonChiTiet> list = sanPhamDao.getAllByDate(tuNgay, denNgay);
            for (HoaDonChiTiet kh : list) {
                model.addRow(new Object[]{
                    kh.getTenKH(),kh.getMaKH(),kh.getTenSP(),kh.getMaSP(),kh.getSize(),kh.getSoLuong(),kh.getMau(),kh.getGia(),kh.getGiamGia(),kh.getHinhThucTT(),kh.getDiaChi()
                });
                test = true;
            }
            if (test) {
                MsgBox.alert(this, "Đã tìm thấy Sản Phẩm Rồi Nè");
            } else {
                MsgBox.alert(this, "Không tìm thấy Sản phẩm");
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
        DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel();
        model.setRowCount(0);
        try {
            List<SanPham> list = SanPhamDao.TimKiem(id);
            for (SanPham sp : list) {
                model.addRow(new Object[]{
                    sp.getMaSP(),
                    sp.getTenSP(),
                    sp.getGia(),
                    sp.getMaLoai()
                });
                test = true;
            }
            if (test) {
                MsgBox.alert(this, "Đã Tìm thấy Sản Phẩm");
            } else {
                MsgBox.alert(this, "Không Tìm thấy Sản Phẩm");
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnSapXep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblBangDiem;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtDenNgay;
    private javax.swing.JTextField txtSP;
    private javax.swing.JTextField txtTuNgay;
    // End of variables declaration//GEN-END:variables

   

}

