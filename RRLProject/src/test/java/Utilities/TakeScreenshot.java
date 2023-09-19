package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import StepDefinition.Driver;

public class TakeScreenshot extends Driver{

	public String takeScreenshot() throws IOException  {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		String path="C:\\Users\\hp\\Desktop\\ScreenshotForCucumber"+System.currentTimeMillis()+".png";
		File Target=new File(path);
		FileUtils.copyFile(source,Target);
		String TargetPath=Target.getAbsolutePath();
		return TargetPath;	
	}
}
