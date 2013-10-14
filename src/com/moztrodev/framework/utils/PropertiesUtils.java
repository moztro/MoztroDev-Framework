/**
 * 
 */
package com.moztrodev.framework.utils;

import java.io.IOException;
import java.util.Properties;

import javax.activation.DataSource;

/**
 * @author DANIEL
 *
 */
public class PropertiesUtils {
	private static String url;
	private static String user;
	private static String pass;
	private static String filePathConnectionDB = "/connectionDB.properties";
	
	public PropertiesUtils(){
		loadProperties();
	}
	
	private static Properties loadProperties(){
		Properties props = new Properties();
		try {
			props.load(DataSource.class.getResourceAsStream(filePathConnectionDB));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}
	
	public static Properties readProperties(){
		Properties properties = loadProperties();
		setUrl(properties.getProperty("url"));
		setUser(properties.getProperty("user"));
		setPass(properties.getProperty("pass"));
		return properties;
	}
	
	public static void setFilePathConnectionDB(String path){
		filePathConnectionDB = path;
	}

	public static String getFilePathConnectionDB(){
		return filePathConnectionDB;
	}
	
	public String getUrl() {
		return url;
	}

	public static void setUrl(String _url) {
		url = _url;
	}

	public String getUser() {
		return user;
	}

	public static void setUser(String _user) {
		user = _user;
	}

	public String getPass() {
		return pass;
	}

	public static void setPass(String _pass) {
		pass = _pass;
	}
	
}
