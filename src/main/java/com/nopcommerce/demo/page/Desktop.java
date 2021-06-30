package com.nopcommerce.demo.page;


import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;


public class Desktop extends Utility {

    private static final Logger log = LogManager.getLogger(Desktop.class.getName());//pagefactory model on the top of each class

    HomePage homePage = new HomePage();

//    By clickonDesktopTab = By.xpath("//ul[@class = 'sublist']//child::li//child::a[text() = 'Desktops ']");
//    By sortByAscendingOrder = By.id("products-orderby");
//    By addtoCart = By.xpath("//span[text()='$1,200.00']//parent::div/following::div[1]/button[text()='Add to cart']");


@FindBy(xpath = "//ul[@class = 'sublist']//child::li//child::a[text() = 'Desktops ']")
    WebElement clickonDesktopTab;

@FindBy(id = "products-orderby")
WebElement sortByAscendingOrder;

@FindBy(xpath = "//span[text()='$1,200.00']//parent::div/following::div[1]/button[text()='Add to cart']")
WebElement addtoCart;



    public void clickonComputer()  {

        homePage.selectMenu("Computers");
        log.info("Click On Computers"+homePage.toString());
    }

    public void clickonDesktopOption() throws InterruptedException {

        Thread.sleep(2000);
        clickOnElement(clickonDesktopTab);
        log.info("click on Desktop"+clickonDesktopTab.toString());
    }

    public void selectFromDropdownMenu(String sortby){

        selectByVisibleTextFromDropDown(sortByAscendingOrder,sortby);
        log.info("Select Assending Order from DropDown "+sortByAscendingOrder.toString());
    }

    public void clickOnAddToCartButton() throws InterruptedException{

        Thread.sleep(2000);
        clickOnElement(addtoCart);
        log.info("Click on Add to cart Button "+addtoCart.toString());
    }
}

       // Thread.sleep(2000);
        //click on desktop
        //clickOnElement(By.xpath("//ul[@class = 'sublist']//child::li//child::a[text() = 'Desktops ']"));
        // Select Sort By position "Name: A to Z"
        //selectByTextFromDropDown(By.id("products-orderby"), "Name: A to Z");

        //click on add to cart
       // Thread.sleep(2000);
       // clickOnElement(By.xpath("//span[text()='$1,200.00']//parent::div/following::div[1]/button[text()='Add to cart']"));



      /**  // desktoplist of products in its original order
        List<WebElement> deskTopList = driver.findElements(By.xpath("//div[@class='item-grid']//div/div/div[2]//child::h2"));

        List<String> productName = new ArrayList<>();

        for (WebElement deskTop : deskTopList) {
            productName.add(deskTop.getText());
        }

        List<String> tempList = new ArrayList<>();
        tempList.addAll(productName);

        Collections.sort(tempList);
        Collections.sort(productName,Collections.reverseOrder());
        System.out.println(productName);
        System.out.println(tempList);
        Assert.assertEquals(productName, tempList);



    }*/

