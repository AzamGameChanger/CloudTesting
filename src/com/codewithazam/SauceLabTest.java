package com.codewithazam;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SauceLabTest {
    public static final String USERNAME = "oauth-ibragimov.azamkhuja.2020-cca33";
    public static final String ACCESS_KEY = "82f134cf-fdeb-46c4-9c03-4f021e101f85";
    public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

    public static void main(String[] args) throws MalformedURLException {
        MutableCapabilities sauceOptions = new MutableCapabilities();

        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setExperimentalOption("w3c", true);
        browserOptions.setCapability("platformName", "macOS 11");
        browserOptions.setCapability("browserVersion", "89.0");
        browserOptions.setCapability("sauce:options", sauceOptions);

        WebDriver driver = new RemoteWebDriver(new URL(URL), browserOptions);
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
    }
}
