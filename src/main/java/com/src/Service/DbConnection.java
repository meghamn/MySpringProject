package com.src.Service;
import java.sql.Connection;
/**
 * @author Samith.Jagannath
 *
 */
public interface DbConnection {

	public void registerConnection();
	public Connection makeConnection();
	
}
