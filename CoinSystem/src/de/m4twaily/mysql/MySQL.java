package de.m4twaily.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import de.m4twaily.cs.Main;

public class MySQL {

	/**
	 * DO NOT use this class
	 **/

	public static String host = Main.main.getConfig().getString("MySQL.host");
	public static String port = Main.main.getConfig().getString("MySQL.port");
	public static String database = Main.main.getConfig().getString("MySQL.database");
	public static String username = Main.main.getConfig().getString("MySQL.username");
	public static String password = Main.main.getConfig().getString("MySQL.password");
	public static Connection con;

	public static void connect() {
		if (!isConnected()) {
			try {
				con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database, username,
						password);

				System.out.println(" ");
				System.out.println("MySQL connectet");
				System.out.println("CS");
				System.out.println(" ");

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void disconnect() {
		if (isConnected()) {
			try {
				con.close();

				System.out.println(" ");
				System.out.println("MySQL disconnectet");
				System.out.println(" ");

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static boolean isConnected() {
		return (con == null ? false : true);
	}

	public static ResultSet getResult(String qry) {
		try {
			PreparedStatement ps = con.prepareStatement(qry);

			return ps.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	public static Connection getConnection() {
		return con;

	}
}
