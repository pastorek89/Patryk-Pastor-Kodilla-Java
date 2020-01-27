package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_BIRTHDAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_BIRTHMONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_BIRTHYEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement selectBirthDay = driver.findElement(By.xpath(XPATH_BIRTHDAY));
        Select selectDayBoard = new Select(selectBirthDay);
        selectDayBoard.selectByIndex(20);

        WebElement selectBirthMonth = driver.findElement(By.xpath(XPATH_BIRTHMONTH));
        Select selectMonthBoard = new Select(selectBirthMonth);
        selectMonthBoard.selectByIndex(2);

        WebElement selectBirthYear = driver.findElement(By.xpath(XPATH_BIRTHYEAR));
        Select selectYearBoard = new Select(selectBirthYear);
        selectYearBoard.selectByIndex(32);
    }
}
