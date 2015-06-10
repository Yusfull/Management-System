package com.java.web.reports;

import java.sql.Connection;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ReportManager implements Report {

	@Autowired
	Connection connection;

	@Override
	public void printAudit() {
		String sourceFileName = "C://Users/Eusuph/Documents/yusuf work/Management-System/src/main/resources/Audit_Report.jrxml";
		try {
			JasperReport jr = JasperCompileManager
					.compileReport(sourceFileName);
			JasperPrint jp = JasperFillManager.fillReport(jr, null, connection);
			JasperViewer.viewReport(jp, false);
		} catch (JRException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void printAverageMarks() {
		String sourceFileName = "C://Users/Eusuph/Documents/yusuf work/Management-System/src/main/resources/Progress_Report.jrxml";
		try {
			JasperReport jr = JasperCompileManager
					.compileReport(sourceFileName);
			JasperPrint jp = JasperFillManager.fillReport(jr, null, connection);
			JasperViewer.viewReport(jp, false);
		} catch (JRException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void printToAchievers() {
		String sourceFileName = "C://Users/Eusuph/Documents/yusuf work/Management-System/src/main/resources/TopArchiever.jrxml";
		try {
			JasperReport jr = JasperCompileManager
					.compileReport(sourceFileName);
			JasperPrint jp = JasperFillManager.fillReport(jr, null, connection);
			JasperViewer.viewReport(jp, false);
		} catch (JRException e) {
			e.printStackTrace();
		}

	}

}
