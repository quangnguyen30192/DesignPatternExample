/*
 * 
 */
package com.quangbnn.pattern.structural.facade;

import com.quangbnn.pattern.structural.facade.ReportGeneratorFacade.DBTypes;

/**
 * A factory for creating Database objects.
 */
public final class DatabaseFactory {

  /**
   * Instantiates a new database factory.
   */
  private DatabaseFactory() {
    // TODO Auto-generated constructor stub
  }

  /**
   * Gets the database instance.
   *
   * @param dbType
   *          the db type
   * @return the database instance
   */
  public static AbstractDatabase getDatabaseInstance(final DBTypes dbType) {
    AbstractDatabase abstractDatabase = null;
    switch (dbType) {
      case MYSQL:
        abstractDatabase = new MySQLHelper();
        break;
      case ORACLE:
        abstractDatabase = new OracleHelper();
        break;
      default:
        break;
    }
    return abstractDatabase;
  }
}