package com.loop;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Durations;
import io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction;

import org.apache.poi.ss.usermodel.Cell;

public class PremireLeageExcelPractice{

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.premierleague.com/tables");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//*[@style='background-color:#37003c;'])[1]")).click();
         //This code is for scroll down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)","");
		//one webElement for capture all team names
		List<WebElement>teams=driver.findElements(By.xpath("//table/tbody/tr/td[3]/a/span[2]"));
		//write all team name inside excel sheet
		HSSFWorkbook wb=new HSSFWorkbook();//create a new workbook object
		HSSFSheet sheet=wb.createSheet("teamnames");//create a new sheet inside the a workBook
		for(int i=0;i<teams.size();i++) {
			System.out.println(teams.get(i).getText().trim());
			Row row=sheet.createRow(i);
			Cell cell=row.createCell(0);
			FileOutputStream fso=new FileOutputStream("AllTeamNames.xls");
			cell.setCellValue(teams.get(i).getText().trim());
			wb.write(fso);
		}
		
	}

}
