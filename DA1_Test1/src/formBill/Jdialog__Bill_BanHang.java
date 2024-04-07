//IN CHƯA LÀM NHA CỨU CỨU
package com.code.form2;

import com.code.dao.NhaCungCapDao;
import com.raven.main.Main;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.code.model.NhaCungCap;
import com.code.model.NhapHang;
import com.code.model.CTNhapHang;
import com.code.dao.NhaCungCapDao;
import com.code.dao.NhapHangDao;
import com.code.dao.CTNhapHangDao;
import com.code.dao.HoaDonChiTietDao;
import com.code.dao.HoaDonDao;
import com.code.dao.KhachHangDao;
import com.code.dao.SanPhamDao;
import com.code.model.HoaDon;
import com.code.model.HoaDonChiTiet;
import com.code.model.KhachHang;
import com.code.model.SanPham;
import com.raven.form.ChiTietHoaDon;
import java.io.FileOutputStream;
import java.io.StringReader;
import java.text.DecimalFormat;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Jdialog__Bill_BanHang extends javax.swing.JDialog implements Printable {
    
    List<HoaDonChiTiet> listcthd = new ArrayList<>();
    List<NhapHang> listNhap = new ArrayList<>();
    String maNhap = "";
    
    public Jdialog__Bill_BanHang(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        FillHoaDon();
    }
    
    public void showBill() {
        setLocationRelativeTo(null);
        setVisible(true);
        clear();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblNgayTao = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblTenKhachHang = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblSDT = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblTongSL = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnIn = new javax.swing.JButton();
        lblMaNhap = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bill");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("The Rubik Shop");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Điạ chỉ: -- Số 32, Trần Hoàng Na, Phường An Khánh, quận");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ninh Kiều, Tp.Cần Thơ.");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("HÓA ĐƠN BÁN HÀNG");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Mã Hóa Đơn:");

        lblNgayTao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNgayTao.setText("Ngày 07 tháng 10 năm 2023");

        jLabel8.setText("Tên Khách Hàng:");

        lblTenKhachHang.setText("Nhà Cung Cấp 1");

        jLabel10.setText("Số Điện Thoại");

        lblSDT.setText("ncc1@gmail.com");

        tblList.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblList);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblTongSL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTongSL.setText("0");

        lblTongTien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTongTien.setText("0");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Tổng Số Lượng:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Tổng Tiền:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblTongSL, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTongSL)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblTongTien))
                .addGap(0, 50, Short.MAX_VALUE))
        );

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("The Rubik Shop xin chân thành cảm ơn và hẹn gặp lại quý khách");

        btnIn.setBackground(new java.awt.Color(153, 153, 255));
        btnIn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnIn.setForeground(new java.awt.Color(255, 255, 255));
        btnIn.setText("IN");
        btnIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInActionPerformed(evt);
            }
        });

        lblMaNhap.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMaNhap.setText("123");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTenKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblMaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnIn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblMaNhap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNgayTao)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblTenKhachHang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblSDT))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(btnIn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInActionPerformed
        PrinterJob pj = PrinterJob.getPrinterJob();
        pj.setPrintable(this, getPageFormat(pj));
        boolean ok = pj.printDialog();
        if (ok) {
            try {
                pj.print();
            } catch (PrinterException ex) {
            }
        }
        this.setVisible(false);
    }//GEN-LAST:event_btnInActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        FillHoaDon();
        fillCTHD();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
 /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Jdialog__Bill_BanHang dialog = new Jdialog__Bill_BanHang(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnIn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMaNhap;
    private javax.swing.JLabel lblNgayTao;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JLabel lblTenKhachHang;
    private javax.swing.JLabel lblTongSL;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JTable tblList;
    // End of variables declaration//GEN-END:variables

    String[] colums = {"Tên Sản Phẩm", "Màu", "Size", "Giá", "Số Lượng","Giảm Giá" ,"Thành Tiền"};
    DefaultTableModel model = new DefaultTableModel(colums, 0);

//    private void showMessage(String message) {
//        Message obj = new Message(Main.getFrames()[0], true);
//        obj.showMessage(message);
//    }
//    private boolean showConfirm(String Confirm) {
//        Confirm obj = new Confirm(Main.getFrames()[0], true);
//        obj.showConfirm(Confirm);
//
//        if (obj.ExitOK()) {
//            return true;
//        } else {
//            return false;
//        }
//    }
    void clear() {
        model.setRowCount(0);
        lblMaNhap.setText(null);
        lblNgayTao.setText(null);
        lblTenKhachHang.setText(null);
        lblSDT.setText(null);
        lblTongSL.setText(null);
        lblTongTien.setText(null);
    }
    
    public void setMaNhap(String txt1) {
        maNhap = txt1;
    }
    
    void FillHoaDon() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0");
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        HoaDonDao hddao = new HoaDonDao();
        List<HoaDon> danhSachHoaDon = hddao.getAllByID(maNhap);
        for (HoaDon nhapHang : danhSachHoaDon) {
            lblMaNhap.setText(maNhap);
            
            SimpleDateFormat oldDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat dateFormat = new SimpleDateFormat("'Ngày' dd 'tháng' MM 'năm' yyyy");
            try {
                System.out.println("Ngày Nhập" + nhapHang.getNgayNhap());
                Date ngayTao = oldDateFormat.parse(nhapHang.getNgayNhap());
                String formattedDate = dateFormat.format(ngayTao);
                lblNgayTao.setText(formattedDate);
            } catch (Exception e) {
                e.printStackTrace();
            }
            KhachHangDao khdao = new KhachHangDao();
            List<KhachHang> danhSachNhaCC = khdao.getAllTheoMa(maNhap);
            for (KhachHang nhaCungCap : danhSachNhaCC) {
                lblTenKhachHang.setText(nhaCungCap.getTENKH());
                lblSDT.setText(nhaCungCap.getSODT());
            }
            
            lblTongSL.setText("" + nhapHang.getTongSoLuong());
            lblTongTien.setText("" + nhapHang.getTongtien());
        }
    }
    
    void fillCTHD() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0");
        HoaDonChiTietDao cthdDao = new HoaDonChiTietDao();
        listcthd = cthdDao.getSelectAll(maNhap);
//        SanPhamDao spdao = new SanPhamDao();
//        List<ChiTietHoaDon> listSP = new ArrayList<>();
        for (HoaDonChiTiet cthd : listcthd) {
//             listSP = SanPhamDao.getAllExceptByID(cthd.getMaSP());
            model.addRow(new Object[]{cthd.getTenSP(), cthd.getMau(), cthd.getSize(), cthd.getGia(), cthd.getSoLuong(), cthd.getGiamGia(), (cthd.getSoLuong() * cthd.getGia()) * (1 - (cthd.getGiamGia() / 100))});
            
        }
        tblList.setModel(model);
    }
    
    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) {
        Float totalAmount = 0.0F;
        Float change = 0.0F;
        int result = NO_SUCH_PAGE;
        if (pageIndex == 0) {
            Graphics2D g2d = (Graphics2D) graphics;
            double width = pageFormat.getImageableWidth();
            g2d.translate((int) pageFormat.getImageableX(), (int) pageFormat.getImageableY());
            
            FontMetrics metrics = g2d.getFontMetrics(new Font("Segoe UI", Font.BOLD, 7));
            try {
                int y = 10;
                int yShift = 15; // KHOẢNG CÁCH DÒNG
                int headerRectHeight = 15;
                g2d.translate((int) pageFormat.getImageableX(), (int) pageFormat.getImageableY());
                double wh = pageFormat.getImageableWidth();
                double ht = pageFormat.getImageableHeight();
                g2d.drawImage(null, 0, 0, (int) wh, (int) ht, null);
                
                g2d.setFont(new Font("Courier New", Font.PLAIN, 9));
                y += yShift + 30;
                g2d.drawString("                          The Rubik Shop ", 20, y);
                y += yShift;
                g2d.drawString("      Điạ chỉ: -- Số 32, Trần Hoàng Na, Phường An Khánh, quận ", 20, y);
                y += yShift;
                g2d.drawString("                      Ninh Kiều, Tp.Cần Thơ. ", 20, y);
                y += yShift;
                y += yShift;
                g2d.drawString("                         HÓA ĐƠN BÁN HÀNG ", 20, y);
                y += yShift;
                g2d.drawString("                             Mã Hóa Đơn:  " + lblMaNhap.getText(), 10, y);
                y += yShift;
                g2d.drawString("                        " + lblNgayTao.getText(), 10, y);
                y += yShift;
                y += yShift;
                g2d.drawString(" Tên Khách Hàng:  " + lblTenKhachHang.getText(), 20, y);
                y += yShift;
                g2d.drawString(" Số Điện Thoại:   " + lblSDT.getText(), 20, y);
                y += yShift;
                g2d.drawString("----------------------------------------------------------------------------------------------", 20, y);
                y += headerRectHeight;
                g2d.drawString(" Tên Sản Phẩm    Màu    Size    Giá     Số Lượng   Giảm Giá    Thành Tiền  ", 20, y);
                y += yShift;
                g2d.drawString("----------------------------------------------------------------------------------------------", 20, y);
                y += headerRectHeight;
                List<SanPham> listSP = new ArrayList<>();
                for (HoaDonChiTiet cthd : listcthd) {
                    
//                    listSP = SanPhamDao.getAllExceptByID(cthd.getMaSP());
                    String maSP = cthd.getTenSP();
                    String tenMau = cthd.getMau();
                    String tenSize = cthd.getSize();
                    String donGia = String.valueOf(cthd.getGia());
                    String soLuong = String.valueOf(cthd.getSoLuong());
                    String giamGia = String.valueOf(cthd.getGiamGia());
                    String thanhTien = String.valueOf((cthd.getSoLuong() * listSP.get(0).getGia()) * (1 - (cthd.getGiamGia() / 100)));

                    // Sử dụng String.format() để định dạng đều các cột
                    String formattedString = String.format("%-10s %-10s %-10s %-10s %-10s %-10s %-10s", maSP, tenMau, tenSize, donGia, soLuong, giamGia,thanhTien);
                    
                    g2d.drawString(formattedString, 20, y);
                    y += yShift;
                }
                y += yShift;
                g2d.drawString("                                                Tổng số lượng :  " + lblTongSL.getText() + "   ", 10, y);
                y += yShift;
                
                g2d.drawString("                                                Tổng tiền :  " + lblTongTien.getText(), 10, y);
                y += yShift;
                y += yShift;
                
                g2d.drawString("               The Rubik shop xin cảm ơn và hẹn gặp lại quý khách    ", 10, y);
                y += yShift;
                y += yShift;
                
            } catch (Exception e) {
            }
            result = PAGE_EXISTS;
        }
        return result;
    }

    // xét khổ giấy dài rộng
    public PageFormat getPageFormat(PrinterJob pj) {
        
        PageFormat pf = pj.defaultPage();
        Paper paper = pf.getPaper();
        
        double width = pf.getImageableWidth();
        double height = pf.getImageableHeight();
        paper.setSize(width, height);
        paper.setImageableArea(0, 10, width, height - cm_to_pp(58));
        pf.setOrientation(PageFormat.PORTRAIT);
        pf.setPaper(paper);
        return pf;
    }
    //chuyển đổi đơn vị

    protected static double cm_to_pp(double cm) {
        return toPPI(cm * 0.393600787);
    }
    
    protected static double toPPI(double inch) {
        return inch * 58d;
    }
    
}
