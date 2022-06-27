package com.amazon.pages;

import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ResultPage {

    public ResultPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='a-section aok-relative s-image-square-aspect']")
    public WebElement firstProductLink;

    @FindBy(id = "a-autoid-12-announce")
    public WebElement big;

    @FindBy(id = "a-autoid-11-announce")
    public WebElement medium;

    @FindBy(id = "a-autoid-10-announce")
    public WebElement small;

    @FindBy(xpath = "(//span[@class='selection'])[2]")
    public WebElement color;

    @FindBy(xpath = "(//span[@aria-hidden='true'])[4]")
    public WebElement price;

    @FindBy(xpath = "//div[@id='availability']/span")
    public WebElement stock;

    @FindBy(xpath = "(//span[@class='selection'])[1]")
    public WebElement size;



    public void logInformation(){

        ArrayList<WebElement> sizes = new ArrayList<>(Arrays.asList(big,medium,small));

        for (WebElement size : sizes) {
            size.click();
            System.out.println("iPhone 13  Size:"+size.getText());
            BrowserUtils.waitFor(1);
            System.out.println("Color: "+ color.getText()+"  Price: "+price.getAttribute("textContent"));
            System.out.println("Stock: "+stock.getText());
        }

    }

}
