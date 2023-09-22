package org.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class JVMReport {
	public static void getJvmReport(String jvmPath,String jsonPath) {
		   
		//target location
			File f = new File(jvmPath);
			
		//Add details to the report using Configuration class---import package netMasterThrough
			Configuration c = new Configuration(f,"EyeBuyDirect");
			c.addClassifications("Application", "EyeBuyDirect");
			c.addClassifications("Platform", "ChromeBrowser");
			c.addClassifications("Operating System", "Windows 10");
			c.addClassifications("Java Version", "jdk 1.8");

		//To add the JSon path into list
			List l = new ArrayList();
			l.add(jsonPath);
			
		//To generate reports by using generateReports()-m
			ReportBuilder r = new ReportBuilder(l, c);
			Reportable r1 = r.generateReports();
			
		}
}
