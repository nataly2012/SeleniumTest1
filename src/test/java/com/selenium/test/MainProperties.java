package com.selenium.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collections;
import java.util.List;

public class MainProperties {

    /**
     * Search String
     */
    @FindBy(xpath= "//*[@id=\"lst-ib\"]")
    private  WebElement searchline;

    /**
     * List of links
     */
    @FindBy(css= "div.g div.rc>h3.r>a")
    private List<WebElement> links;

    @FindBy(id = "tvcap")
    private WebElement link1;

    public void searchFor(String text) {
        searchline.sendKeys(text);
        searchline.submit();
    }

    public List<WebElement> searchResult(){
        links.add(link1);
        return links;

        }

    }


