/*
 * 
 */
package com.quangbnn.pattern.structural.facade;

/**
 * The Class ReportGeneratorFacade.
 */
public final class ReportGeneratorFacade {

	/**
	 * Instantiates a new report generator facade.
	 */
	private ReportGeneratorFacade() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Generate report.
	 *
	 * @param dbType
	 *            the db type
	 * @param reportType
	 *            the report type
	 * @param table
	 *            the table
	 */
	public static void generateReport(	final DBTypes dbType,
										final ReportTypes reportType,
										final String table) {
		switch (dbType) {
			case MYSQL:
				final MySQLHelper mySQLHelper = new MySQLHelper();
				switch (reportType) {
					case HTML:
						mySQLHelper.generateHTMLReport(table);
						break;
					case PDF:
						mySQLHelper.generatePDFReport(table);
						break;
					default:
						break;
				}
				break;
			case ORACLE:
				final OracleHelper oracleHelper = new OracleHelper();
				switch (reportType) {
					case HTML:
						oracleHelper.generateHTMLReport(table);
						break;
					case PDF:
						oracleHelper.generatePDFReport(table);
						break;
					default:
						break;
				}
				break;
			default:
				break;
		}
	}

	/**
	 * The Enum DBTypes.
	 */
	public static enum DBTypes {
		/** The mysql. */
		MYSQL,
		/** The oracle. */
		ORACLE
	}

	/**
	 * The Enum ReportTypes.
	 */
	public static enum ReportTypes {
		/** The html. */
		HTML,
		/** The pdf. */
		PDF
	}
}