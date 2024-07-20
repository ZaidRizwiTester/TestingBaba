package testingBaba;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SinglePageAutomation {
	
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver(); //yha methodoverriding ho rha h.webdriver yha interface h,child ka object bna k parent ko de dya,agr koi puche interface ka object kaise bna rhe ho to answer h yha interface ka object bn hi nhi rha yha chrome driver ka object bn rha h jo ki class h.

driver.get("https://testingbaba.com/old");
driver.manage().window().maximize();
driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/button")).click()	; 
driver.findElement(By.xpath("/html/body/div[2]/header/nav[2]/div/ul/li[5]/a")).click();
driver.findElement(By.xpath("//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")).click();
driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div[2]/div/div/a[1]")).click();
driver.findElement(By.xpath("//*[@id=\"fullname1\"]")).sendKeys("zaid");
driver.findElement(By.xpath("//*[@id=\"fullemail1\"]")).sendKeys("zaid@gmail.com");
driver.findElement(By.xpath("//*[@id=\"fulladdresh1\"]")).sendKeys("noida sector 63");
driver.findElement(By.xpath("//*[@id=\"paddresh1\"]")).sendKeys("new delhi metro plaza");
driver.findElement(By.xpath("//*[@id=\"tab_1\"]/div/div[1]/form/input[3]")).click();
List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"tab_1\"]/div/div[2]/label"));
for(int i=1; i<list.size();i++)
{
	String val=list.get(i).getText();   //console pr print krne k liye ye sab kya 26 line se.
	System.out.println(val);
	i++;
}


}
}
