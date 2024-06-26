/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.code.form2;

import com.code.db.*;
import com.code.dao.NhanVienDao;
import com.code.model.NhanVien;
import com.edusys.utils.Auth;
import com.edusys.utils.XImage;
import com.raven.component.Header;
import com.raven.main.Main;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author phuck
 */
public class DangNhap extends javax.swing.JDialog {

	/**
	 * Creates new form DangNhap
	 */
	NhanVienDao dao = new NhanVienDao();

	public DangNhap(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
		setLocationRelativeTo(this);
		jpnKetNoiSQL.setVisible(false);
		jlbTaiKhoan.setForeground(new Color(0, 0, 0, 0));
		jlbMatKhau.setForeground(new Color(0, 0, 0, 0));
		try {
			String ipAddress = InetAddress.getLocalHost().getHostAddress();
			txtIP.setText(ipAddress);
			Auth.maychu = ipAddress;
			connectSQL();
		} catch (UnknownHostException e) {
			e.printStackTrace();
			txtIP.setText("Không thể lấy địa chỉ IP");
		}
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jpanelDangNhap2 = new com.code.db.JpanelDangNhap();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		txtUserName = new javax.swing.JTextField();
		btnDangNhap = new javax.swing.JButton();
		btnThoat = new javax.swing.JButton();
		jlbTaiKhoan = new javax.swing.JLabel();
		jlbMatKhau = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jpnKetNoiSQL = new javax.swing.JPanel();
		txtDatabase = new javax.swing.JTextField();
		txtIP = new javax.swing.JTextField();
		btnKetNoi = new javax.swing.JButton();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jCheckBox1 = new javax.swing.JCheckBox();
		txtPassword = new javax.swing.JPasswordField();
		jLabel1 = new javax.swing.JLabel();
		jpanelDangNhap1 = new com.code.db.JpanelDangNhap();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}
		});
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LogoUser.png"))); // NOI18N
		jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel2MouseClicked(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
		jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel3.setText("Đăng Nhập");

		txtUserName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
		txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent evt) {
				txtUserNameKeyReleased(evt);
			}
		});

		btnDangNhap.setBackground(new java.awt.Color(204, 51, 255));
		btnDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		btnDangNhap.setForeground(new java.awt.Color(255, 255, 255));
		btnDangNhap.setText("Đăng Nhập");
		btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnDangNhapActionPerformed(evt);
			}
		});

		btnThoat.setBackground(new java.awt.Color(204, 51, 255));
		btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		btnThoat.setForeground(new java.awt.Color(255, 255, 255));
		btnThoat.setText("Thoát");
		btnThoat.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnThoatActionPerformed(evt);
			}
		});

		jlbTaiKhoan.setForeground(new java.awt.Color(255, 0, 0));
		jlbTaiKhoan.setText("Tài Khoản Không Đúng!!");

		jlbMatKhau.setForeground(new java.awt.Color(255, 0, 0));
		jlbMatKhau.setText("Mật Khẩu Không Đúng!!");

		jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		jLabel6.setText("Tài Khoản:");

		jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		jLabel7.setText("Mật Khẩu:");

		jpnKetNoiSQL.setBackground(new java.awt.Color(255, 255, 255));

		txtDatabase.setText("QLThoiTrang ");
		txtDatabase.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

		txtIP.setBackground(new Color(0, 0, 0, 0));
		txtIP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

		btnKetNoi.setBackground(new java.awt.Color(204, 51, 255));
		btnKetNoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		btnKetNoi.setForeground(new java.awt.Color(255, 255, 255));
		btnKetNoi.setText("Kết Nối");
		btnKetNoi.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnKetNoiActionPerformed(evt);
			}
		});

		jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		jLabel8.setText("IP:");

		jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		jLabel9.setText("Database:");

		javax.swing.GroupLayout jpnKetNoiSQLLayout = new javax.swing.GroupLayout(jpnKetNoiSQL);
		jpnKetNoiSQL.setLayout(jpnKetNoiSQLLayout);
		jpnKetNoiSQLLayout
				.setHorizontalGroup(jpnKetNoiSQLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								jpnKetNoiSQLLayout.createSequentialGroup().addContainerGap()
										.addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, 207,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(17, 17, 17)
										.addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 69,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(txtDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 215,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(btnKetNoi).addGap(15, 15, 15)));
		jpnKetNoiSQLLayout.setVerticalGroup(jpnKetNoiSQLLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnKetNoiSQLLayout.createSequentialGroup()
						.addContainerGap(24, Short.MAX_VALUE)
						.addGroup(jpnKetNoiSQLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtDatabase, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnKetNoi).addComponent(jLabel9).addComponent(jLabel8))
						.addGap(33, 33, 33)));

		jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		jLabel4.setForeground(new java.awt.Color(102, 102, 255));
		jLabel4.setText("Quên Mật Khẩu?");
		jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel4MouseClicked(evt);
			}
		});

		jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
		jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		jCheckBox1.setForeground(new java.awt.Color(255, 102, 102));
		jCheckBox1.setText("Lưu Mật Khẩu");
		jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox1ActionPerformed(evt);
			}
		});

		txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

		javax.swing.GroupLayout jpanelDangNhap2Layout = new javax.swing.GroupLayout(jpanelDangNhap2);
		jpanelDangNhap2.setLayout(jpanelDangNhap2Layout);
		jpanelDangNhap2Layout.setHorizontalGroup(jpanelDangNhap2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jpanelDangNhap2Layout.createSequentialGroup().addGap(82, 82, 82).addComponent(jLabel2)
						.addGap(47, 47, 47)
						.addGroup(jpanelDangNhap2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jpanelDangNhap2Layout.createSequentialGroup()
										.addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 137,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 137,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jpanelDangNhap2Layout.createSequentialGroup().addGroup(jpanelDangNhap2Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelDangNhap2Layout
												.createSequentialGroup()
												.addGroup(jpanelDangNhap2Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel6).addComponent(jLabel7))
												.addGap(24, 24, 24)
												.addGroup(jpanelDangNhap2Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(jpanelDangNhap2Layout.createSequentialGroup()
																.addComponent(jLabel4,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 101,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(50, 50, 50).addComponent(jCheckBox1,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 109,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE,
																269, Short.MAX_VALUE)
														.addComponent(jlbTaiKhoan).addComponent(jlbMatKhau)
														.addComponent(txtPassword))))
										.addGap(0, 0, Short.MAX_VALUE)))
						.addGap(64, 64, 64))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jpanelDangNhap2Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jpnKetNoiSQL, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(53, 53, 53)));
		jpanelDangNhap2Layout.setVerticalGroup(jpanelDangNhap2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jpanelDangNhap2Layout.createSequentialGroup().addGap(91, 91, 91)
						.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(14, 14, 14)
						.addGroup(jpanelDangNhap2Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 213,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(jpanelDangNhap2Layout.createSequentialGroup().addGap(26, 26, 26)
										.addGroup(jpanelDangNhap2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel6))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jlbTaiKhoan).addGap(27, 27, 27)
										.addGroup(jpanelDangNhap2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel7).addComponent(txtPassword,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jlbMatKhau)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(jpanelDangNhap2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel4).addComponent(jCheckBox1))
										.addGap(24, 24, 24)
										.addGroup(jpanelDangNhap2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(btnDangNhap).addComponent(btnThoat))))
						.addGap(18, 18, 18)
						.addComponent(jpnKetNoiSQL, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 61, Short.MAX_VALUE)));

		getContentPane().add(jpanelDangNhap2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 770, 530));

		jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hinhNen.jpg"))); // NOI18N
		getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1050, 640));

		javax.swing.GroupLayout jpanelDangNhap1Layout = new javax.swing.GroupLayout(jpanelDangNhap1);
		jpanelDangNhap1.setLayout(jpanelDangNhap1Layout);
		jpanelDangNhap1Layout.setHorizontalGroup(jpanelDangNhap1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 100, Short.MAX_VALUE));
		jpanelDangNhap1Layout.setVerticalGroup(jpanelDangNhap1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 100, Short.MAX_VALUE));

		getContentPane().add(jpanelDangNhap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, -1, -1));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnThoatActionPerformed
		System.exit(0); // TODO add your handling code here:
	}// GEN-LAST:event_btnThoatActionPerformed

	private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel2MouseClicked
		openJpn(); // TODO add your handling code here:
	}// GEN-LAST:event_jLabel2MouseClicked

	private void btnKetNoiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnKetNoiActionPerformed
		if (DBHelper.kt) {
			connectSQL();
			JOptionPane.showMessageDialog(this, "Kết nối thành công");
		} else {
			JOptionPane.showMessageDialog(this, "Kết nối thất bại");
		}

// TODO add your handling code here:
	}// GEN-LAST:event_btnKetNoiActionPerformed

	private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDangNhapActionPerformed
		DangNhap(); // TODO add your handling code here:
	}// GEN-LAST:event_btnDangNhapActionPerformed

	private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel4MouseClicked
		dispose();
		new QuenMatKhau1(null, true).setVisible(true); // TODO add your handling code here:
	}// GEN-LAST:event_jLabel4MouseClicked

	private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox1ActionPerformed
		luuMatKhau(); // TODO add your handling code here:
	}// GEN-LAST:event_jCheckBox1ActionPerformed

	private void txtUserNameKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtUserNameKeyReleased
		if (!showPass()) {
			txtPassword.setText("");
		} // TODO add your handling code here:
	}// GEN-LAST:event_txtUserNameKeyReleased

	private void formWindowClosing(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosing
		System.exit(0);
	}// GEN-LAST:event_formWindowClosing

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the dialog */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				DangNhap dialog = new DangNhap(new javax.swing.JFrame(), true);
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
	public javax.swing.JButton btnDangNhap;
	private javax.swing.JButton btnKetNoi;
	private javax.swing.JButton btnThoat;
	private javax.swing.JCheckBox jCheckBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JLabel jlbMatKhau;
	private javax.swing.JLabel jlbTaiKhoan;
	private com.code.db.JpanelDangNhap jpanelDangNhap1;
	private com.code.db.JpanelDangNhap jpanelDangNhap2;
	private javax.swing.JPanel jpnKetNoiSQL;
	private javax.swing.JTextField txtDatabase;
	private javax.swing.JTextField txtIP;
	public javax.swing.JPasswordField txtPassword;
	public javax.swing.JTextField txtUserName;

	// End of variables declaration//GEN-END:variables
	public void openJpn() {
		if (jpnKetNoiSQL.isVisible()) {
			jpnKetNoiSQL.setVisible(false);
		} else {
			jpnKetNoiSQL.setVisible(true);
		}
	}

	public void connectSQL() {

		Auth.maychu = txtIP.getText().trim();
		Auth.database = txtDatabase.getText().trim();
		DBHelper.getDBConnection();
	}

	public boolean DangNhap() {
		String username = txtUserName.getText().trim();
		String password = txtPassword.getText().trim();
		if (username.equals("")) {
			jlbTaiKhoan.setText("Tên Tài Khoản Đang Trống!!");
			jlbTaiKhoan.setForeground(Color.red);
		} else {
			jlbTaiKhoan.setForeground(new Color(0, 0, 0, 0));
			if (password.equals("")) {
				jlbMatKhau.setText("Mật Khẩu Đang Để Trống!!");
				jlbMatKhau.setForeground(Color.red);
			} else {
				jlbMatKhau.setForeground(new Color(0, 0, 0, 0));
				if (!checkUser()) {
					jlbTaiKhoan.setText("Tên Đăng Nhập Không Đúng!!");
					jlbTaiKhoan.setForeground(Color.red);

				} else {
					jlbTaiKhoan.setForeground(new Color(0, 0, 0, 0));
					if (!checkPass()) {
						jlbMatKhau.setText("Mật Khẩu Không Đúng!!");
						jlbMatKhau.setForeground(Color.red);
					} else {
						jlbMatKhau.setForeground(new Color(0, 0, 0, 0));
						NhanVien nv = new NhanVien();
						nv.setMaNV(txtUserName.getText().trim());
						Auth.user = nv;
//                        System.out.println("Mã NV: "+Auth.user.getMaNV());
//                        System.out.println("Hình" + XImage.img);
						dispose();
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean checkUser() {
		String username = txtUserName.getText().trim();
		String password = txtPassword.getText().trim();
		List<NhanVien> nv = dao.getAllNhanVien();
		for (NhanVien nhanVien : nv) {
			if (username.equals(nhanVien.getMaNV())) {
				XImage.maNV = nhanVien.getMaNV();
				XImage.img = nhanVien.getHinhAnh();
				XImage.username = nhanVien.getHoTen();
				if (nhanVien.getChucVu()) {
					XImage.chucvu = "Quản lý";
				} else {
					XImage.chucvu = "Nhân Viên";
				}
				return true;
			}
		}
		return false;
	}

	public boolean checkPass() {
		String username = txtUserName.getText().trim();
		String password = txtPassword.getText().trim();
		List<NhanVien> nv = dao.getAllNhanVien();
		for (NhanVien nhanVien : nv) {
			if (username.equals(nhanVien.getMaNV()) && dao.getMd5(password).equals(nhanVien.getMatKhau())) {
				XImage.maNV = nhanVien.getMaNV();
				XImage.img = nhanVien.getHinhAnh();
				XImage.username = nhanVien.getHoTen();
				if (nhanVien.getChucVu()) {
					XImage.chucvu = "Quản lý";
				} else {
					XImage.chucvu = "Nhân Viên";
				}
				Auth.chucvu = nhanVien.getChucVu();
				return true;
			}
		}
		return false;
	}

	String urlFile = "E:\\DuAn_1\\DA1_Test1\\src\\com\\code\\luuMatKhau.txt";
	List<Object[]> list = new ArrayList();

	public void luuMatKhau() {
		list.add(new Object[] { txtUserName.getText().trim(), txtPassword.getText().trim() });
		try {
			FileOutputStream fos = new FileOutputStream(urlFile);
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(list);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi không thể lưu file");
		}
	}

	public void readFile() {
		try {
			FileInputStream fis = new FileInputStream(urlFile);
			ObjectInputStream dis = new ObjectInputStream(fis);
			list = (List<Object[]>) dis.readObject();
		} catch (Exception e) {
		}
	}

	public boolean showPass() {
		readFile();
		for (Object[] objects : list) {
			if (txtUserName.getText().trim().equals(objects[0])) {
//                JOptionPane.showMessageDialog(this, objects[0]);
//            txtUsername.setText(objects[0].toString());
				txtPassword.setText(objects[1].toString());
				return true;
			}

		}
		return false;
	}

}
