package com.code.dao;

import com.code.db.DBHelper;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ThongKeDao {
    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            Connection con = DBHelper.getDBConnection();
            ResultSet rs = con.prepareStatement(sql).executeQuery();
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.close();
            con.close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
