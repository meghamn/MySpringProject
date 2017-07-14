package com.src.Service.impl;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.src.Service.DBlibrary;

public class DBlibraryImpl implements DBlibrary
{
	Statement stmt;

	
	public void createQuery(String str, Connection conn) throws SQLException {
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(str);
			System.out.println("Create Operation Successful!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			conn.close();
		}
		
	}

	public void insertQuery(String str, Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(str);
			System.out.println("Insert Operation Successfull!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			conn.close();
		}
		
	}

	public void deleteQuery(String str, Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void dropTable(String str, Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		
	}

/*
	@Override
	public void createQuery(String str,Connection conn){
		
	}
	@Override
	public void insertQuery(String str,Connection conn) throws SQLException{
		
		
	}
	@Override
	public void deleteQuery(String str,Connection conn) throws SQLException {
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(str);
			System.out.println("Delete Operation Successfull!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			conn.close();
		}
		
	}
	@Override
	public void dropTable(String str,Connection conn) throws SQLException {
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(str);
			System.out.println("Drop  Operation Successfull!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			conn.close();
		}
		
	}
*/	
}
