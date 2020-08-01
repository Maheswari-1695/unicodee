package com.dataDriven;

import java.io.FileInputStream;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel {
	String[][]data=null;
	WebDriver driver;
	
	public String [][]loginData() throws BiffException, IOException{
	data=getExcelData();
	return data;
}
	private String[][] getExcelData() throws BiffException, IOException {
	FileInputStream excel=new FileInputStream("C:\\Users\\mahi\\Desktop\\data driven.xls");
	Workbook workbook=Workbook.getWorkbook(excel);
	Sheet sheet=workbook.getSheet(0);
	int rowCount=sheet.getRows();
	int coulCount=sheet.getColumns();
	String testData[][]=new String[rowCount-1][coulCount];
	for(int i=1;i<rowCount;i++)
	{
		for (int j=0;j<coulCount;j++)
			testData[i-1][j]=sheet.getCell(j,i).getContents();
	}

	return testData;
	}

	}
