
package com.code.db;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import com.edusys.utils.Auth;

/**
 *
 * @author phuck
 */
public class DBHelper {

    public static boolean kt = false;

    public static Connection getDBConnection() {
        Connection con = null;
        try {
//            String ip = Auth.maychu;
//            String databaseName = Auth.database;
            String ip = "127.0.0.1";
            String databaseName = "QLThoiTrang";
            String username = "sa";
            String password = "123";
            String url = "jdbc:sqlserver://" + ip + ":1433;databaseName=" + databaseName;
            SQLServerDataSource ds = new SQLServerDataSource();
            ds.setURL(url);
            ds.setUser(username);
            ds.setPassword(password);
            ds.setEncrypt(true); // Kích hoạt SSL
            ds.setTrustServerCertificate(true);
            con = ds.getConnection();
            kt = true;
            System.out.println("Connect success");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

}
