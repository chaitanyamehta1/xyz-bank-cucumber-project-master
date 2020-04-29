package com.bank.browserselector;

import com.bank.basepage.BasePage;
import cucumber.api.java.ca.I;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by Chaitanya
 */
public class BrowserSelector extends BasePage {
    private static final Logger log = LogManager.getLogger(BrowserSelector.class.getName());

    String projectPath = System.getProperty("user.dir");

    public void selectBrowser(String browser){
        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            log.info("Launching Chrome Browser");
        }else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver" , projectPath + "/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            log.info("Launching Fire Fox Browser");
        }else if (browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver ", projectPath + "/drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            log.info("Launching IE Browser");
        }
    }



}
