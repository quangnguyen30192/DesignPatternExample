/**
 * 
 */
package com.quangbnn.pattern.structural.facade;

import com.quangbnn.pattern.structural.facade.ReportGeneratorFacade.DBTypes;
import com.quangbnn.pattern.structural.facade.ReportGeneratorFacade.ReportTypes;

/**
 * @author QuangNguyen
 *
 */
public final class FacadePatternTest {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		// Generate the report by casual way
		AbstractDatabase databaseFactory = DatabaseFactory.getDatabaseInstance(DBTypes.MYSQL);
		databaseFactory.generateHTMLReport("Employee");
		databaseFactory.generatePDFReport("Employee");
		databaseFactory = DatabaseFactory.getDatabaseInstance(DBTypes.ORACLE);
		databaseFactory.generateHTMLReport("Employee");
		databaseFactory.generatePDFReport("Employee");
		// Generate the report by facade pattern
		ReportGeneratorFacade.generateReport(	DBTypes.MYSQL,
												ReportTypes.HTML,
												"Employee");
		ReportGeneratorFacade.generateReport(	DBTypes.MYSQL,
												ReportTypes.PDF,
												"Employee");
		ReportGeneratorFacade.generateReport(	DBTypes.ORACLE,
												ReportTypes.HTML,
												"Employee");
		ReportGeneratorFacade.generateReport(	DBTypes.ORACLE,
												ReportTypes.PDF,
												"Employee");
	}
	
	private FacadePatternTest() {
		
	}
}
