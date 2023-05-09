package org.example.Lesson_13.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {
    static WebDriver greateDriver(WEBDRIVERS webdrivers){
        WebDriver driver = null;
        switch (webdrivers){
            case CHROMECLEAN -> driver=createCleanChrome();
            case EDGEDRIVER -> driver=createEdge();
        }
        return driver;
    }

    private static WebDriver createEdge() {
        return new EdgeDriver();
    }

    private static WebDriver createCleanChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        return new ChromeDriver(options);
    }

}
