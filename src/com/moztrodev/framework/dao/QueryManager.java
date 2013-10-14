/**
 * 
 */
package com.moztrodev.framework.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.moztrodev.framework.utils.DBConnection;

/**
 * @author DANIEL
 *
 */
public abstract class QueryManager<T1, T2> {
	/**
	 * Gets a java.sql.Connection object and calls processStatements passing
	 * through the java.sql.Connection and T1 as params. Also closes the
	 * java.sql.Connection once processStatements has finished.
	 * @param object Represents the param(s) that can be used on the
	 * processQuery implementation
	 * @return A java.lang.Object that represents processStatements result
	 */
	public T2 execute(T1 object){
		T2 result = null;
		Connection conn = DBConnection.getInstance().getMySqlConnection();
		
		if(conn != null){
			try{
				processStatements(conn, object);
			}catch(SQLException e){
				e.printStackTrace();
				try{
					if(!conn.getAutoCommit())
						conn.rollback();
				}catch(SQLException e2){
					e2.printStackTrace();
				}
			}finally{
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}		
		return result;
	}
	
	/**
	 * This method should be implemented by every concrete sub-class from 
	 * com.moztrodev.framework.dao.QueryManager and it must contain the 
	 * code  that represents the particular job-to-execute(statements) of 
	 * that implementation
	 * @param conn
	 * @param object
	 * @return
	 * @throws SQLException
	 */
	public abstract T2 processStatements(Connection conn, T1 object) throws SQLException;
}
