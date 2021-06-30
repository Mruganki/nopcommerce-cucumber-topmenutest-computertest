package com.nopcommerce.demo.page;

//import com.nopcommerce.demo.homepage.TopMenu;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;


public class Computer extends Utility {

    private static final Logger log = LogManager.getLogger(Computer.class.getName());//pagefactory model on the top of each class


  HomePage homepage = new HomePage();
   // SoftAssert softassert = new SoftAssert();


    /*By clickonDesktop = By.xpath("//ul[@class = 'sublist']//child::li//child::a[text() = 'Desktops ']");
    By selectZtoA = By.id("products-orderby");
    By desktoplist = By.xpath("//div[@class='item-grid']//div/div/div[2]//child::h2");*/

    @FindBy (xpath = "//ul[@class = 'sublist']//child::li//child::a[text() = 'Desktops ']")
    WebElement  clickonDesktop;

    @FindBy(id = "products-orderby")
    WebElement selectZtoA;

    @FindBy(xpath = "//div[@class='item-grid']//div/div/div[2]//child::h2")
    WebElement desktoplist;

    @FindBy(xpath = "//h2[@class='product-title']")
    List<WebElement> productsList;

    public void clickOnComputersTab(){

        homepage.selectMenu("Computers");
        log.info("click on Computer "+homepage.toString());


    }
    public void clickOndesktopTab () throws InterruptedException {


        Thread.sleep(2000);
        clickOnElement(clickonDesktop);
        log.info("click on Desktop "+clickonDesktop.toString());
    }

//    public void sortByDescendingOrder(String sortby) {
//
//        Reporter.log("click on dropdown Z to A" + selectZtoA.toString() + "<br>");
//        // Select Sort By position "Name: Z to A"
//        selectByVisibleTextFromDropDown(selectZtoA, sortby);
//        log.info("click on dropdown Z to A " + selectZtoA.toString());
//        Reporter.log("Get reverse order text" + desktoplist.toString() + "<br>");
     // SoftAssert softassert = new SoftAssert();
//        log.info("Get reverse order text " + desktoplist.toString());
//

public void sortbyDesendingorder(){
     //desktoplist of products in its originalorder
        List<WebElement> deskTopList = driver.findElements(By.xpath("//div[@class='item-grid']//div/div/div[2]//child::h2"));


    List<String> productName = new ArrayList<>();

    for (WebElement deskTop : deskTopList) {
        productName.add(deskTop.getText());
    }

    List<String> tempList = new ArrayList<>();
    tempList.addAll(productName);

    Collections.sort(tempList,Collections.reverseOrder());
    Collections.sort(productName,Collections.reverseOrder());
    System.out.println(productName);
    System.out.println(tempList);
    Assert.assertEquals(productName, tempList);
  //Softassert.assertTrue(true);
       // softassert.assertAll();
}

    public void selectPositionFromDropdown(int value) {

        selectByIndexFromDropDown(selectZtoA, value);
        log.info("Select position from drop down :" + selectZtoA.toString());
    }

//    public List getListOfProducts() {
//
//        log.info("Get list of products : " + productsList.toString());
//        return getListOfElements(productsList);
//
//    }


}



