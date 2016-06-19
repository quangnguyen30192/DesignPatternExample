/*
 * 
 */
package com.quangbnn.pattern.structural.facade;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * The Class AbstractDatabase.
 */
public abstract class AbstractDatabase {

	/**
	 * Gets the connection.
	 *
	 * @return the connection
	 */
	protected final static Connection getConnection() {
		// do st
		return null;
	}

	/**
	 * Close.
	 *
	 * @param connection
	 *            the connection
	 */
	protected final static void close(final Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// do st
			}
		}
	}

	/**
	 * Generate html report.
	 *
	 * @param table
	 *            the table
	 */
	public abstract void generateHTMLReport(String table);

	/**
	 * Generate pdf report.
	 *
	 * @param table
	 *            the table
	 */
	public abstract void generatePDFReport(String table);
}