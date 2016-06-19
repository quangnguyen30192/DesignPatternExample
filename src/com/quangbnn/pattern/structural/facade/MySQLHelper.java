/*
 * 
 */
package com.quangbnn.pattern.structural.facade;

import java.sql.Connection;

/**
 * @author QuangNguyen
 *
 */
public class MySQLHelper extends AbstractDatabase {

	/**
	 * Instantiates a new my sql helper.
	 */
	public MySQLHelper() {
		// TODO Auto-generated constructor stub
	  
	}

	/* (non-Javadoc)
	 * 
	 * @see
	 * com.quangbnn.facade.AbstractDatabase#generateHTMLReport(java.lang.String) */
	@Override
	public void generateHTMLReport(final String table) {
		// get data from table and generate html report
		final Connection connection = getConnection();
		close(connection);
	}

	@Override
	public void generatePDFReport(final String table) {
		// get data from table and generate pdf report
		final Connection connection = getConnection();
		close(connection);
	}
}