package southercross.commonLibrary;

import southercross.browserLibrary.BrowserFunctions;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WebElementFunctions extends BrowserFunctions {

    public static void takesScreenshot(WebDriver driver) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot)driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(setFilePath()+ new SimpleDateFormat("HHmmss").format(new Date()) +".png");
        FileUtils.copyFile(srcFile,destFile);

    }

    private static String setFilePath(){
        String path = "target/";
        String screenshotsFolder = path +"screenshots/";
        String todayFolder = screenshotsFolder + new SimpleDateFormat("yyyy/MM/dd").format(new Date()) +"/";
        File file = new File(todayFolder);
        if (!file.exists()) {
            file.mkdir();
            return todayFolder;
        }
        return todayFolder;
    }

}
