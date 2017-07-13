package com.src;
import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.src.Service.DBlibrary;
import com.src.Service.DbConnection;
/**
 * @author Samith.Jagannath
 *
 */
public class MainClass {
	private static ApplicationContext ctx;
	
	static{
		 ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	public void setBean(){
		
	}
	public static void main(String args[]) throws SQLException{
		DbConnection dbConnection=(DbConnection) ctx.getBean("DbConnection");
		DBlibrary dBlibrary = (DBlibrary) ctx.getBean("DBlibrary");
		
		System.out.println(dBlibrary);
		System.out.println(dbConnection);
		
		Connection connection;
		
		String createQuery= "Create table SamithJ("+
							"emp_id integer not null,"+
							"name varchar(30));";
		String insertQuery= "insert into SamithJ values"+
							"(1,'Samith');";
		String deleteQuery= "Delete from SamithJ where emp_id = 1";
		String dropTable = 	"drop table SamithJ";
		
		dbConnection.registerConnection();
		connection = dbConnection.makeConnection();
		dBlibrary.dropTable(dropTable, connection);
		connection = dbConnection.makeConnection();
		dBlibrary.createQuery(createQuery, connection);
		connection = dbConnection.makeConnection();
		dBlibrary.insertQuery(insertQuery, connection);
		connection = dbConnection.makeConnection();
		dBlibrary.deleteQuery(deleteQuery, connection);
	
		
		
		
		
	}
}
