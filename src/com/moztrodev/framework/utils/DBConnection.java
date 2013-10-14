/**
 * 
 */
package com.moztrodev.framework.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author DANIEL
 * Singleton class who gets a java.sql.Connection from a database
 */
public class DBConnection {
	private static DBConnection instance = null;
	private static Connection conn = null;
	
	private DBConnection(){}
	
	public static DBConnection getInstance(){
		if(instance == null)
			instance = new DBConnection();
		return instance;
	}
	
	public Connection getMySqlConnection(){
		if(conn == null)
			conn = connectToMySql();
		return conn;
	}
	
	private Connection connectToMySql(){
		PropertiesUtils props = new PropertiesUtils();
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(props.getUrl(), props.getUser(), props.getPass());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
