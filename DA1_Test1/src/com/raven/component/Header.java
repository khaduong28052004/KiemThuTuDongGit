package com.raven.component;

import com.code.form2.DangNhap;
import com.edusys.utils.Auth;
import com.edusys.utils.XImage;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class Header extends javax.swing.JPanel {

//    String a = "khalo";
    public Header() {
        initComponents();
        setHinh();
    }

    public void addMenuEvent(ActionListener event) {
        cmdMenu.addActionListener(event);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdMenu = new com.raven.swing.Button();
        lblHoTen = new javax.swing.JLabel();
        lblChucVu = new javax.swing.JLabel();
        lblHinhAnh = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        cmdMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/menu.png"))); // NOI18N

        lblHoTen.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblHoTen.setForeground(new java.awt.Color(127, 127, 127));
        lblHoTen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHoTen.setText("username");

        lblChucVu.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblChucVu.setForeground(new java.awt.Color(127, 127, 127));
        lblChucVu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblChucVu.setText("Admin");

        lblHinhAnh.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblHinhAnh.setForeground(new java.awt.Color(127, 127, 127));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                    .addComponent(lblChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHinhAnh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblChucVu)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cmdMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.Button cmdMenu;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblHinhAnh;
    private javax.swing.JLabel lblHoTen;
    // End of variables declaration//GEN-END:variables
public void setHinh() {
        try {
            if (XImage.img != null) {
                lblHinhAnh.setToolTipText(XImage.img);
                ImageIcon icon = XImage.read(XImage.img);
                Image img = icon.getImage();
                Image sizeIcon = img.getScaledInstance(30, 30, 0);
                ImageIcon newIcon = new ImageIcon(sizeIcon);
                lblHinhAnh.setIcon(newIcon);
                lblHoTen.setText(XImage.username);
                lblChucVu.setText(XImage.chucvu);
            } else {

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
