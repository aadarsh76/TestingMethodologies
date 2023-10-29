package com.AutomationBot;
import org.apache.commons.cli.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationBotCLI {

    public static void main(String[] args) {
        Options options = new Options();
        options.addOption("h", "help", false, "Show help");
        options.addOption("u", "url", true, "URL of the website to automate");
        options.addOption("s", "search", true, "Text to enter in the search field");

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        WebDriver driver = null;

        try {
            CommandLine cmd = parser.parse(options, args);

            if (cmd.hasOption("h")) {
                formatter.printHelp("AutomationBotCLI", options);
            } else {
                String url = cmd.getOptionValue("u");
                String searchText = cmd.getOptionValue("s");

                // Set the path to your WebDriver executable
//                System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

                // Initialize the WebDriver (in this case, Chrome)
                driver = new ChromeDriver();

                // Navigate to the specified URL
                driver.get(url);

                // Find the search input field by its CSS selector
                WebElement element = driver.findElement(By.cssSelector("input[name='q']"));

                // Type the provided text into the search input
                element.sendKeys(searchText);

                // Simulate a button click (you should locate the button element)
                WebElement searchButton = driver.findElement(By.cssSelector("input[type='submit']"));
                searchButton.click();

                // Wait for a few seconds (you can use WebDriverWait for better waiting strategies)
                Thread.sleep(3000);
            }
        } catch (ParseException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}

