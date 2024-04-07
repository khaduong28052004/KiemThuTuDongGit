package Test.khadvpc05684;

import org.testng.annotations.Test;

import com.code.form2.Chao;
import com.code.form2.DangNhap;
import com.raven.main.Main;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import javax.swing.JTextField;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class KhachHangTest {
	Chao chao = new Chao(null, true);
	public DangNhap dangNhap = new DangNhap(null, true);
	public Main main = new Main();

//1
	@BeforeSuite
	public void beforeSuite() {
		dangNhap.txtUserName.setText("NV001");
		dangNhap.txtPassword.setText("123");

	}

//2
	@BeforeTest
	public void beforeTest() throws InterruptedException {
//		dangNhap.setVisible(true);
//		TimeUnit.SECONDS.sleep(5);
//		chao.setVisible(true);
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(10000);
					dangNhap.DangNhap();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		dangNhap.setVisible(true);
		TimeUnit.SECONDS.sleep(3);
	}

//3
	@BeforeClass
	public void beforeClass() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);

	}

//4
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		main.setVisible(true);
		TimeUnit.SECONDS.sleep(10);
	}

	@Test
	public void Test() {

	}

}
