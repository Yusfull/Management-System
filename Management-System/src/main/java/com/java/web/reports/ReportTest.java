package com.java.web.reports;

import java.sql.DriverManager;
import java.sql.SQLException;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class ReportTest {

	@SuppressWarnings({})
	public static void main(String[] args) throws SQLException,
			InstantiationException, IllegalAccessException,
			ClassNotFoundException {

		String sourceFileName = "C://Users/Eusuph/Documents/yusuf work/Management-System/src/main/resources/Audit_Report.jrxml";
		Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
		java.sql.Connection conn = DriverManager
				.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "yusuf",
						"Pa$$w0rd54321");
		try {
			JasperReport jr = JasperCompileManager
					.compileReport(sourceFileName);
			JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
			JasperViewer.viewReport(jp, false);
		} catch (JRException e) {
			e.printStackTrace();
		}
	}
}
