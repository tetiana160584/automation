package org.example.Lesson_13;

import org.example.Lesson_13.configuration.BaseClass;
import org.example.Lesson_13.configuration.WEBDRIVERS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class  RegistrationForm extends BaseClass {
    static private final String hillelURL="https://kharkiv.ithillel.ua/",
    title="Комп'ютерна школа Hillel у Харкові: Курси IT-технологій";
    public static void main(String[] args) {
     driver.get(hillelURL);
    if (!driver.getTitle().equals(title)){
        System.out.println("Title not equals");
    }
    WebElement buttonConsultation = driver.findElement(By.xpath("//*[@id=\"btn-consultation-hero\"]"));
    buttonConsultation.click();

    WebElement fieldName= driver.findElement(By.id("input-name-consultation"));
         fieldName.sendKeys("Tetiana");

    WebElement fieldEmail= driver.findElement(By.id("input-email-consultation"));
         fieldEmail.sendKeys("tetiana.kostyhina@gmail.com");

    WebElement telephone= driver.findElement((By.id("input-tel-consultation")));
         telephone.sendKeys("970201317");

   WebElement messenger=driver.findElement(By.xpath("//button[contains(@class,\"socials-input-triggers_btn btn-icon-only\")and contains(@data-name,\"tg\")]"));
//        WebDriverWait wait= new WebDriverWait(driver, Duration.ofMillis(10));
//        WebElement messengerTelegram = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("\"//*[@id=\\\"field-messenger-consultation\\\"]/div/div/div/div[2]/button[1]/svg/g/path[2]\"")));
       messenger.click();

   WebElement fieldMessenger=driver.findElement(By.name("tg"));
         fieldMessenger.sendKeys("https://t.me/tetiana");

   WebElement courseSelection=driver.findElement(By.className("listbox-btn_content"));
         courseSelection.click();

   WebElement qaSelection=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div[1]/form/div[1]/div[5]/div/div/div/div/ul/li[18]/span"));
        qaSelection.click();


    }
}
