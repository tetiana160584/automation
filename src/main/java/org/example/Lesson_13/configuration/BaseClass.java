package org.example.Lesson_13.configuration;

import org.openqa.selenium.WebDriver;

public class BaseClass {
    public static WebDriver driver= DriverFactory.greateDriver(WEBDRIVERS.CHROMECLEAN);


    }

