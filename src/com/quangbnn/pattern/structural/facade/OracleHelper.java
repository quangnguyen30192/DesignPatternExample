/*
 * 
 */
package com.quangbnn.pattern.structural.facade;

import java.sql.Connection;

/**
 * The Class OracleHelper.
 */
public class OracleHelper extends AbstractDatabase {

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