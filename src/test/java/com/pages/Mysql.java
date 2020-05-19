package com.pages;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysql {


		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			String dburl = "jdbc:mysql://127.0.0.1:3306/Aghama";
			String username = "root";
			String password = "Weddington@1s";
			String query = "Select * from Employee";
			Connection con = null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dburl, username, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				String id = rs.getString("Emid");
				String name = rs.getString("first_name");
				String last = rs.getString("last_name");
				System.out.println(id);
				System.out.println(name);
				System.out.println(last);
			}
			rs.close();
			stmt.close();
			con.close();
		}
	}


