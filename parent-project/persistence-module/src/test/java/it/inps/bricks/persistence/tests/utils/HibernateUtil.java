package it.inps.bricks.persistence.tests.utils;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory SESSION_FACTORY;
	
	private HibernateUtil(){}
	
	static final SessionFactory getSessionFactory(){
		if (SESSION_FACTORY == null){
			synchronized (HibernateUtil.class){
				if (SESSION_FACTORY == null){
					Configuration configuration = new Configuration().configure();
		        	SESSION_FACTORY = configuration.buildSessionFactory();
				}
			}
		}
		return SESSION_FACTORY;   		
	}
	
	/**
	 * Calls a generic sql native statement with no arguments.
	 *
	 * @param connection the connection
	 * @param callableStatement the callable statement
	 * @throws SQLException the SQL exception
	 */
	public static final void callStored(Connection connection, String callableStatement) throws SQLException{
		
		CallableStatement statement =null;
        try {
			statement = connection.prepareCall(callableStatement);
			  statement.executeUpdate();
		} finally {
			if (statement != null){
				statement.close();
			}
		}

	}

}
