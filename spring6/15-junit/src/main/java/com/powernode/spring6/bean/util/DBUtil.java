package com.powernode.spring6.bean.util;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

// �������ݿ�Ĺ�����
public class DBUtil {
	// ע������
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ��ȡ����(����ֵ������ֵ)
	public static Connection getConnection() throws Exception {
		InputStream input = DBUtil.class.getClassLoader().getResourceAsStream("db.properties");
		Properties p = new Properties();
		p.load(input);

		String url = p.getProperty("url");
		String user = p.getProperty("user");
		String password = p.getProperty("password");
		return DriverManager.getConnection(url, user, password);
	}

	// �ͷ���Դ
	public static void closeConnection(Connection c, PreparedStatement ps, ResultSet r) {
		if (r != null) {
			try {
				r.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (c != null) {
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
