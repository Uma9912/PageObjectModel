package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pom.irctc.pages.HomePage;
import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers {
	
	public static RemoteWebDriver driver;
	
	public static Properties prop;
	
	public void loadObject() {
		
		 prop = new Properties();
		
		try {
			prop.load(new FileInputStream("./src/test/java/Object.properties"));
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void unloadObjects() {
		prop=null;
	}
	
	
	@Override
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/Firefoxdriver.exe");
				driver = new FirefoxDriver();
			}else if(browser.equalsIgnoreCase("internetexplorer")) {
				System.setProperty("webdriver.internetexplorer.driver", "./drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			
			
			driver.manage().window().maximize();
			
			driver.get(url);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//System.out.println("The browser "+browser+" is launched with the given url "+url+" successfully");

			reportStep("The browser "+browser+" is launched with the given url "+url+" successfully", "pass");
			
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser "+browser+" is not launched with the given url "+url+" due to session not created errror");
			reportStep("The browser "+browser+" is not launched with the given url "+url+" due to session not created errror", "fail");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not launched with the given url "+url+" as it doesn't contain http/https");
			reportStep("The browser "+browser+" is not launched with the given url "+url+" as it doesn't contain http/https","fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not launcehd due to unknown error");
			reportStep("The browser "+browser+" is not launcehd due to unknown error", "fail");
		}
		
	}	

	@Override
	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			
			//System.out.println("The element with id "+idValue+" is entered with data "+data);
			reportStep("The element with id "+idValue+" is entered with data "+data, "pass");


		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element wtih id "+idValue+" is not found in the DOM");
			reportStep("The element wtih id "+idValue+" is not found in the DOM", "fail");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not visible in the application");
			reportStep("The element with id "+idValue+" is not visible in the application", "fail");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element wtih id "+idValue+" is not interactable in the application");
			reportStep("The element wtih id "+idValue+" is not interactable in the application", "fail");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not stable in the application");
			reportStep("The element with id "+idValue+" is not stable in the application", "fail");

		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not entered with data "+data+" due to unexpected alert opened");
			reportStep("The element with id "+idValue+" is not entered with data "+data+" due to unexpected alert opened", "fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not entered with data"+data+" due to unknown error");
			reportStep("The element with id "+idValue+" is not entered with data"+data+" due to unknown error", "fail");

		}
	}	

	@Override
	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			
			//System.out.println("The element with name "+nameValue+" is entered with data "+data);
			reportStep("The element with name "+nameValue+" is entered with data "+data, "pass");

			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element wtih name "+nameValue+" is not found in the DOM");
			reportStep("The element wtih name "+nameValue+" is not found in the DOM", "fail");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not visible in the application");
			reportStep("The element with name "+nameValue+" is not visible in the application", "fail");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element wtih name "+nameValue+" is not interactable in the application");
			reportStep("The element wtih name "+nameValue+" is not interactable in the application", "fail");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not stable in the application");
			reportStep("The element with name "+nameValue+" is not stable in the application", "fail");

		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not entered with data "+data+" due to unexpected alert opened");
			reportStep("The element with name "+nameValue+" is not entered with data "+data+" due to unexpected alert opened", "fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not entered with data"+data+" due to unknown error");
			reportStep("The element with name "+nameValue+" is not entered with data"+data+" due to unknown error", "fail");
	    }
	}
	@Override
	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
	  
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			
			//System.out.println("The element with xpath "+xpathValue+" is entered with data "+data);
			reportStep("The element with xpath "+xpathValue+" is entered with data "+data, "pass");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element wtih xpath "+xpathValue+" is not found in the DOM");
			reportStep("The element wtih xpath "+xpathValue+" is not found in the DOM", "fail",false);

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not visible in the application");
			reportStep("The element with xpath "+xpathValue+" is not visible in the application", "fail",false);

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element wtih xpath "+xpathValue+" is not interactable in the application");
			reportStep("The element wtih xpath "+xpathValue+" is not interactable in the application", "fail",false);

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not stable in the application");
			reportStep("The element with xpath "+xpathValue+" is not stable in the application", "fail",false);

		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not entered with data "+data+" due to unexpected alert opened");
			reportStep("The element with xpath "+xpathValue+" is not entered with data "+data+" due to unexpected alert opened", "fail",false);

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not entered with data"+data+" due to unknown error");
			reportStep("The element with xpath "+xpathValue+" is not entered with data"+data+" due to unknown error", "fail",false);

		
	    }
	}

	@Override
	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
	try {
		String Title =driver.getTitle();
		if(Title.equals(title)){
			//System.out.println("The title of the browser "+Title+" is matched with expected title "+title);
			reportStep("The title of the browser "+Title+" is matched with expected title "+title, "pass");

		}else {
			//System.out.println("The title of the browser "+Title+" is not matched with expected title "+title);
			reportStep("The title of the browser "+Title+" is not matched with expected title "+title, "fail");

		}
	 }catch (NoSuchWindowException e) {
		// TODO Auto-generated catch block
		//System.err.println("The title of the browser is not verified with "+title+" due to window page not found");
		reportStep("The title of the browser is not verified with "+title+" due to window page not found", "fail");

	 }catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The title of the browser is not verified with "+title+" due to unknown error");
		reportStep("The title of the browser is not verified with "+title+" due to unknown error", "fail");

	 }
} 

	@Override
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String Text = driver.findElementById(id).getText();
			if(text.equals(Text)) {
			//System.out.println("The element with id "+id+" is holding the text "+Text+" is matched with expected text "+text);	
			reportStep("The element with id "+id+" is holding the text "+Text+" is matched with expected text "+text, "pass");

			}else {
			//System.out.println("The element with id "+id+" is holding the text "+Text+" is not matched with expected text "+text);	
			reportStep("The element with id "+id+" is holding the text "+Text+" is not matched with expected text "+text, "fail");

			}
		} catch (StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with "+id+" is not stable in the application");	
			reportStep("The element with "+id+" is not stable in the application", "fail");

		}catch (NoSuchElementException e) {
				// TODO: handle exception
			//System.err.println("The element wtih "+id+" is not found in the DOM");
			reportStep("The element wtih "+id+" is not found in the DOM", "fail");

 		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with  "+id+" is not visible in the application");
			reportStep("The element with  "+id+" is not visible in the application", "fail");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element wtih "+id+" is not interactable in the application");
			reportStep("The element wtih "+id+" is not interactable in the application", "fail");

		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not verified with Text "+text+" due to unexpected alert opened");
			reportStep("The element with id "+id+" is not verified with Text "+text+" due to unexpected alert opened", "fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not verified with Text "+text+" due to unknown error");
			reportStep("The element with id "+id+" is not verified with Text "+text+" due to unknown error", "fail");

			}
		}
	

	@Override
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String Text = driver.findElementByXPath(xpath).getText();
			if(text.equals(Text)) {
			//System.out.println("The element with xpath "+xpath+" is holding the text "+Text+" is matched with expected text "+text);	
			reportStep("The element with xpath "+xpath+" is holding the text "+Text+" is matched with expected text "+text, "pass");
			}else {
			//System.out.println("The element with xpath "+xpath+" is holding the text "+Text+" is not matched with expected text "+text);	
			reportStep("The element with xpath "+xpath+" is holding the text "+Text+" is not matched with expected text "+text, "fail");

			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element wtih "+xpath+" is not found in the DOM");
			reportStep("The element wtih "+xpath+" is not found in the DOM", "fail");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with  "+xpath+" is not visible in the application");
			reportStep("The element with  "+xpath+" is not visible in the application", "fail");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element wtih  "+xpath+" is not interactable in the application");
			reportStep("The element wtih  "+xpath+" is not interactable in the application", "fail");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with "+xpath+" is not stable in the application");
			reportStep("The element with "+xpath+" is not stable in the application", "fail");

		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not verified with Text "+text+" due to unexpected alert opened");
			reportStep("The element with xpath "+xpath+" is not verified with Text "+text+" due to unexpected alert opened", "fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not verified with Text "+text+" due to unknown error");
			reportStep("The element with xpath "+xpath+" is not verified with Text "+text+" due to unknown error", "fail");

		}
	}

	@Override
	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String Text = driver.findElementByXPath(xpath).getText();
			if(text.contains(Text)) {
			//System.out.println("The element with xpath "+xpath+" is holding the text "+Text+" is matched with expected text "+text);	
			reportStep("The element with xpath "+xpath+" is holding the text "+Text+" is matched with expected text "+text, "pass");

			}else {
			//System.out.println("The element with xpath "+xpath+" is holding the text "+Text+" is not matched with expected text "+text);
			reportStep("The element with xpath "+xpath+" is holding the text "+Text+" is not matched with expected text "+text, "pass");

			}

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		    //System.out.println("The element wtih "+xpath+" is not found in the DOM");
		    reportStep("The element wtih "+xpath+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with  "+xpath+" is not visible in the application");   
			reportStep("The element with  "+xpath+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element wtih  "+xpath+" is not interactable in the application");	
			reportStep("The element wtih  "+xpath+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with"+xpath+" is not stable in the application");
			reportStep("The element with"+xpath+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not verified with Text "+text+" due to unexpected alert opened");
		 reportStep("The element with xpath "+xpath+" is not verified with Text "+text+" due to unexpected alert opened", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not verified with Text "+text+" due to unknown error");
		    reportStep("The element with xpath "+xpath+" is not verified with Text "+text+" due to unknown error", "fail");
		
		}
	    
	}
  
	@Override
	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			
			//System.out.println("The element with id "+id+" is clicked successfully ");
			reportStep("The element with id "+id+" is clicked successfully ", "pass");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element wtih "+id+" is not clickable at that point");
			reportStep("The element wtih "+id+" is not clickable at that point", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with  "+id+" is not visible in the application");   
			reportStep("The element with  "+id+" is not visible in the application", "fail");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element wtih "+id+" is not interactable in the application");
			reportStep("The element wtih "+id+" is not interactable in the application", "fail");

		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element wtih "+id+" is not found in the DOM");	
			reportStep("The element wtih "+id+" is not found in the DOM", "fail");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with "+id+" is not stable in the application");
			reportStep("The element with "+id+" is not stable in the application", "fail");

		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+"  due to unexpected alert opened");
			reportStep("The element with id "+id+"  due to unexpected alert opened", "fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with "+id+" its due to unknown error");
			reportStep("The element with "+id+" its due to unknown error", "fail");

		}
	}

	@Override
	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			
			//System.out.println("The element with classname "+classVal+" is clicked successfully");
			reportStep("The element with classname "+classVal+" is clicked successfully", "pass");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element wtih classname "+classVal+" is not clickable at that point");
			reportStep("The element wtih classname "+classVal+" is not clickable at that point", "fail");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with "+classVal+" is not visible in the application");  
			reportStep("The element with "+classVal+" is not visible in the application", "fail");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element wtih "+classVal+" is not interactable in the application"); 
			reportStep("The element wtih "+classVal+" is not interactable in the application", "fail");

		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element wtih "+classVal+" is not found in the DOM");
			reportStep("The element wtih "+classVal+" is not found in the DOM", "fail");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with "+classVal+" is not stable in the application");
			reportStep("The element with "+classVal+" is not stable in the application", "fail");

		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with  "+classVal+"  due to unexpected alert opened");
			reportStep("The element with  "+classVal+"  due to unexpected alert opened", "fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with "+classVal+" its due to unknown error");
			reportStep("The element with "+classVal+" its due to unknown error", "fail");

		
		}
    }
	@Override
	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			
			//System.out.println("The element with name "+name+" is clicked successfully");
			reportStep("The element with name "+name+" is clicked successfully", "pass");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element wtih "+name+" is not clickable at that point");
			reportStep("The element wtih "+name+" is not clickable at that point", "fail");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with "+name+" is not visible in the application");  
			reportStep("The element with "+name+" is not visible in the application", "fail");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element wtih "+name+" is not interactable in the application");
			reportStep("The element wtih "+name+" is not interactable in the application", "fail");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with "+name+" is not stable in the application");
			reportStep("The element with "+name+" is not stable in the application", "fail");

		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element wtih "+name+" is not found in the DOM");	
			reportStep("The element wtih "+name+" is not found in the DOM", "fail");

		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with  "+name+"  due to unexpected alert opened");
			reportStep("The element with  "+name+"  due to unexpected alert opened", "fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with "+name+" its due to unknown error");
			reportStep("The element with "+name+" its due to unknown error", "fail");

	
		}
	}

	@Override
	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with linktext "+name+" is clicked successfully");
			reportStep("The element with linktext "+name+" is clicked successfully", "pass");

		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element wtih linktext "+name+" is not clickable at that point");
			reportStep("The element wtih linktext "+name+" is not clickable at that point", "fail");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not visible in the application");  
			reportStep("The element with linktext "+name+" is not visible in the application", "fail");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element wtih linktext "+name+" is not interactable in the application");
			reportStep("The element wtih linktext "+name+" is not interactable in the application", "fail");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not stable in the application");	
			reportStep("The element with linktext "+name+" is not stable in the application", "fail");

		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element wtih linktext "+name+" is not found in the DOM");
			reportStep("The element wtih linktext "+name+" is not found in the DOM", "fail");

		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with "+name+"  due to unexpected alert opened");
			reportStep("The element with "+name+"  due to unexpected alert opened", "fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" its due to unknown error");
			reportStep("The element with linktext "+name+" its due to unknown error", "fail");

		}
	}

	@Override
	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			
			//System.out.println("The element with linktext "+name+" is  clicked successfully");
			reportStep("The element with linktext "+name+" is  clicked successfully", "pass");


		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element wtih linktext "+name+" is not clickable at that point");
			reportStep("The element wtih linktext "+name+" is not clickable at that point", "fail");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not stable in the application");	
			reportStep("The element with linktext "+name+" is not stable in the application", "fail");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not visible in the application"); 
			reportStep("The element with linktext "+name+" is not visible in the application", "fail");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element wtih linktext "+name+" is not interactable in the application");
			reportStep("The element wtih linktext "+name+" is not interactable in the application", "fail");

		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element wtih linktext "+name+" is not found in the DOM");
			reportStep("The element wtih linktext "+name+" is not found in the DOM", "fail");

		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with "+name+"  due to unexpected alert opened");
			reportStep("The element with "+name+"  due to unexpected alert opened", "fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" its due to unknown error");
			reportStep("The element with linktext "+name+" its due to unknown error", "fail");

		}
	}

	@Override
	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			
			//System.out.println("The element with xpath "+xpathVal+" is clicked  successfully");
            reportStep("The element with xpath "+xpathVal+" is clicked  successfully", "pass");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element wtih xpath "+xpathVal+" is not clickable at that point");
			reportStep("The element wtih xpath "+xpathVal+" is not clickable at that point", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xapth "+xpathVal+" is not visible in the application");
			reportStep("The element with xapth "+xpathVal+" is not visible in the application", "fail");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element wtih xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element wtih xpath "+xpathVal+" is not interactable in the application", "fail");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "fail");

		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element wtih xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element wtih xpath "+xpathVal+" is not found in the DOM", "fail");

		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element wtih xpath "+xpathVal+" its due to unexpected alert opened");
			reportStep("The element wtih xpath "+xpathVal+" its due to unexpected alert opened", "fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" its due to unknown error");
			reportStep("The element with xpath "+xpathVal+" its due to unknown error", "fail");

	
		}
	}

	@Override
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is clicked successfully");
			reportStep("The element with xpath "+xpathVal+" is clicked successfully", "pass",false);

		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element wtih xpath "+xpathVal+" is not clickable at that point");
			reportStep("The element wtih xpath "+xpathVal+" is not clickable at that point", "fail",false);

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application"); 
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "fail",false);

		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element wtih xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element wtih xpath "+xpathVal+" is not found in the DOM", "fail",false);

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element wtih xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element wtih xpath "+xpathVal+" is not interactable in the application", "fail",false);

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");	
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "fail",false);

		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+"  due to unexpected alert opened");
			reportStep("The element with xpath "+xpathVal+"  due to unexpected alert opened", "fail",false);

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" its due to unknown error");
			reportStep("The element with xpath "+xpathVal+" its due to unknown error", "fail",false);

		}
	}

	@Override
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String text=null;
		try {
		 text = driver.findElementById(idVal).getText();
		//System.out.println("The element with id "+idVal+" its text of the element successfully");
		reportStep("The element with id "+idVal+" its text of the element successfully", "pass");
		
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The element wtih id  "+idVal+" is not found in the DOM");	
		reportStep("The element wtih id  "+idVal+" is not found in the DOM", "fail");

	}catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The element with id  "+idVal+" is not visible in the application");  
		reportStep("The element with id  "+idVal+" is not visible in the application", "fail");

	}catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The element with id "+idVal+" is not stable in the application");
		reportStep("The element with id "+idVal+" is not stable in the application", "fail");

	}catch (ElementNotInteractableException e) {
		// TODO: handle exception
		//System.err.println("The element wtih id "+idVal+" is not interactable in the application");
		reportStep("The element wtih id "+idVal+" is not interactable in the application", "fail");

	}catch (UnhandledAlertException e) {
		// TODO: handle exception
		//System.err.println("The element wtih id "+idVal+" its due to unexpected alert opened");
		reportStep("The element wtih id "+idVal+" its due to unexpected alert opened", "fail");

	}catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The element wtih id "+idVal+" its due to unknown error");
		reportStep("The element wtih id "+idVal+" its due to unknown error", "fail");

	
	}
	return text;
}
	@Override
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub	
		String text=null;
		try {
			text = driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The element with xpath "+xpathVal+" its text of the element successfully");
			reportStep("The element with xpath "+xpathVal+" its text of the element successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element wtih xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element wtih xpath "+xpathVal+" is not found in the DOM", "fail");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "fail");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element wtih xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element wtih xpath "+xpathVal+" is not interactable in the application", "fail");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "fail");

		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element wtih xpath "+xpathVal+" its due to unexpected alert opened");
			reportStep("The element wtih xpath "+xpathVal+" its due to unexpected alert opened", "fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element wtih xpath "+xpathVal+" its due to unknown error");
			reportStep("The element wtih xpath "+xpathVal+" its due to unknown error", "fail");

		
		}
		return text;

	}

	@Override
	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		 try {
			WebElement visibletext = driver.findElementById(id);
			 Select sel = new Select(visibletext);
				
			 sel.selectByVisibleText(value);
			 //System.out.println("The element with id "+id+" is select the visible text opition "+value+" successfully");		 
		     reportStep("The element with id "+id+" is select the visible text opition "+value+" successfully", "pass");
		 } catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element wtih "+id+" is not found in the DOM");
			reportStep("The element wtih "+id+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with "+id+" is not visible in the application");
			reportStep("The element with "+id+" is not visible in the application", "fail");

		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with "+id+" is not selectable in tne application ");
			reportStep("The element with "+id+" is not selectable in tne application ", "fail");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element wtih  "+id+" is not interactable in the application");
			reportStep("The element wtih  "+id+" is not interactable in the application", "fail");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with "+id+" is not stable in the application");	
			reportStep("The element with "+id+" is not stable in the application", "fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with "+id+" is not select the text opition "+value+" due to unknown error");
			reportStep("The element with "+id+" is not select the text opition "+value+" due to unknown error", "fail");

		}	
	}
  
	@Override
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		 try {
			WebElement index = driver.findElementById(id);
			 Select sel1 = new Select(index);	
			 sel1.selectByIndex(value);
			 //System.out.println("The element with id "+id+" is select the index "+value+" successfully");
			 reportStep("The element with id "+id+" is select the index "+value+" successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element wtih "+id+" is not found in the DOM");
			reportStep("The element wtih "+id+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with "+id+" is not visible in the application"); 
			reportStep("The element with "+id+" is not visible in the application", "fail");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element wtih "+id+" is not interactable in the application");
			reportStep("The element wtih "+id+" is not interactable in the application", "fail");

		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with "+id+" is not selectable in tne application ");
			reportStep("The element with "+id+" is not selectable in tne application ", "fail");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with "+id+" is not stable in the application");	
			reportStep("The element with "+id+" is not stable in the application", "fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with "+id+" is not select the "+value+" due to unknown error");
			reportStep("The element with "+id+" is not select the "+value+" due to unknown error", "fail");

		} 
	}

	@Override
	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
		 Set<String> windowHandle  = driver.getWindowHandles();			
		   for(String parentwindow: windowHandle) {
			   System.out.println(parentwindow);
			driver.switchTo().window(parentwindow);
			 break;
		   }
			//System.out.println("This method is switching to the parent window");
			reportStep("This method is switching to the parent window", "pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("This window is not switched due to its window cannot be found");
			reportStep("This window is not switched due to its window cannot be found", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("This window is not switched due to unknown error");
			reportStep("This window is not switched due to unknown error", "fail");

	
		}
	}

	@Override
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
	try { 
		Set<String> newWindow = driver.getWindowHandles();
					
		   for(String lastwindow : newWindow) {
			   System.out.println(lastwindow);
			driver.switchTo().window(lastwindow);
		   }
			//System.out.println("This method is switching to the last window");
			reportStep("This method is switching to the last window", "pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("This window is not switched due to its window cannot be found");
			reportStep("This window is not switched due to its window cannot be found", "fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("This window is not switched due to unknown error");
			reportStep("This window is not switched due to unknown error", "fail");	
			}
		}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("The accept method is clicked on the Ok button of the alert box");
			reportStep("The accept method is clicked on the Ok button of the alert box", "pass",false);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The alert is not clicked on the Ok button due to its alert is not present");
			reportStep("The alert is not clicked on the Ok button due to its alert is not present", "fail");

		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The alert is not clicked on the Ok buttondue to unexpected alert opened");
			reportStep("The alert is not clicked on the Ok buttondue to unexpected alert opened", "fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert message box Ok button is not clicked due to unknown error");
			reportStep("The alert message box Ok button is not clicked due to unknown error", "fail");

		}
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("The dismiss method is clicked on the Cancel button of the alert box");
			reportStep("The dismiss method is clicked on the Cancel button of the alert box", "pass",false);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The alert is not clicked on the Cancel button due to alert is not present");
			reportStep("The alert is not clicked on the Cancel button due to alert is not present", "fail",false);
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The alert is not clicked on the Cancel buttondue to unexpected alert opened");	
			reportStep("The alert is not clicked on the Cancel buttondue to unexpected alert opened", "fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert message box Cancel button is not clicked due to unknown error");
			reportStep("The alert message box Cancel button is not clicked due to unknown error", "fail");

		}
	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
	      String alertText = null;
		try {
			 alertText = driver.switchTo().alert().getText();
			//System.out.println("The get alert text method is captured the message from the alert box");
			reportStep("The get alert text method is captured the message from the alert box", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The get alert text is not fetched due to no alert found");
			reportStep("The get alert text is not fetched due to no alert found", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The get alert text is not fetched due to unexpected alert opened");	
			reportStep("The get alert text is not fetched due to unexpected alert opened", "fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The get alert text is not fetched due to unknown error");
			reportStep("The get alert text is not fetched due to unknown error", "fail");

		}
		return alertText ;
		
	}

	@Override
	public long takeSnap() {
		// TODO Auto-generated method stub
		
		long number = 0;
		try {
			
			number = (long) (Math.floor(Math.random()*100000000)+100000);
			
			File tmp = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./reports/screenshots/"+number+".png");
			FileUtils.copyFile(tmp, dest);

			//System.out.println("It takes a screenshot successfully");
			//reportStep("It takes a screenshot successfully", "pass",true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//System.err.println("The screenshot is not captured due to IO error occurs during copying");
			reportStep("The screenshot is not captured due to IO error occurs during copying", "fail", false);

		}catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The screenshot is not captured due to no alert found");	
			reportStep("The screenshot is not captured due to no alert found", "fail", false);

		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The screenshot is not captured due to unexpected alert opened");
			reportStep("The screenshot is not captured due to unexpected alert opened", "fail", false);

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The screenshot is not captured its due to unknown error");
			reportStep("The screenshot is not captured its due to unknown error", "fail", false);

	
		}
		
		return number;
	}
	
	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("Closing browser windows successfully");
			reportStep("Closing browser windows successfully", "pass");

		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser is not closed its due to unknown error");
			reportStep("The browser is not closed its due to unknown error", "fail");

		}
	}
	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("Closing all browsers windows successfully");
			reportStep("Closing all browsers windows successfully", "pass", false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browsers is not closed its due to unknown error");
			reportStep("The browsers is not closed its due to unknown error", "fail");

		}
	}
	
	@Override
	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
			//System.out.println("This statement will pauses the execution of the current thread for a specified amount of milliseconds "+time+" successfully");
		    reportStep("This statement will pauses the execution of the current thread for a specified amount of milliseconds "+time+" successfully", "pass");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The interrupted status of the current thread is cleared when this exception is thrown");
		    reportStep("The interrupted status of the current thread is cleared when this exception is thrown", "fail");

		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//System.err.println("The value of milliseconds of "+time+" is negative due to error");
			reportStep("The value of milliseconds of "+time+" is negative due to error","fail");
		}
	}

	@Override
	public void selectindexByxpath(String xpath,int value) {
		// TODO Auto-generated method stub
		
	    try {
			WebElement index =  driver.findElementByXPath(xpath);
			 Select sel1 = new Select(index);	
			 sel1.selectByIndex(value);
			// System.out.println("The element with id "+xpath+" is select the index "+value+" successfully");		 
             reportStep("The element with id "+xpath+" is select the index "+value+" successfully", "pass");
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element wtih "+xpath+" is not found in the DOM");
            reportStep("The element wtih "+xpath+" is not found in the DOM", "fail");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with "+xpath+" is not visible in the application"); 
            reportStep("The element with "+xpath+" is not visible in the application", "fail");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element wtih "+xpath+" is not interactable in the application");
            reportStep("The element wtih "+xpath+" is not interactable in the application", "fail");

		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with "+xpath+" is not selectable in tne application ");
            reportStep("The element with "+xpath+" is not selectable in tne application ", "fail");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with "+xpath+" is not stable in the application");	
            reportStep("The element with "+xpath+" is not stable in the application", "fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with "+xpath+" is not select the "+value+" due to unknown error");
            reportStep("The element with "+xpath+" is not select the "+value+" due to unknown error", "fail");

		}
  }
	
	@Override
	public void selectVisibileTextByxpath(String xpath,String value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement visible =  driver.findElementByXPath(xpath);
			 Select sel1 = new Select(visible);	
			 sel1.selectByVisibleText(value);

			 //System.out.println("The element with id "+xpath+" is select the index "+value+" successfully");		 
				reportStep("The element with id "+xpath+" is select the VisibileText "+value+" successfully", "pass");

		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element wtih "+xpath+" is not found in the DOM");
			reportStep("The element wtih "+xpath+" is not found in the DOM", "fail",false);

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with "+xpath+" is not visible in the application"); 
			reportStep("The element with "+xpath+" is not visible in the application", "fail",false);

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element wtih "+xpath+" is not interactable in the application");
			reportStep("The element wtih "+xpath+" is not interactable in the application", "fail",false);

		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with "+xpath+" is not selectable in tne application ");
			reportStep("The element with "+xpath+" is not selectable in tne application ", "fail",false);

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with "+xpath+" is not stable in the application");	
			reportStep("The element with "+xpath+" is not stable in the application", "fail",false);

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with "+xpath+" is not select the "+value+" due to unknown error");
			reportStep("The element with "+xpath+" is not select the "+value+" due to unknown error", "fail",false);
		}
	}

	@Override
	public void switchToframe(String name) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().frame(name);
			//System.out.println("This method is switching to frame "+name+" successfully");
			reportStep("This method is switching to frame "+name+" successfully", "pass");
			
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			//System.err.println("This frame is not switched due to its frame "+name+" cannot be found");
			reportStep("This frame is not switched due to its frame "+name+" cannot be found", "fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("This frame is not switched due to unknown error");
			reportStep("This frame is not switched due to unknown error", "fail");

		}
	}

	@Override
	public void sendkeysAlert(String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().alert().sendKeys(data);
			//System.out.println("The "+data+" entered to alert box successfully");
			reportStep("The "+data+" entered to alert box successfully", "pass",false);
		}catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The sendkeysAlert is not entered with "+data+" due to alert is not present");
			reportStep("The sendkeysAlert is not entered with "+data+" due to alert is not present", "fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The sendkeysAlert is not entered with "+data+" due to unknown error");
			reportStep("The sendkeysAlert is not entered with "+data+" due to unknown error", "fail");

		}
	}

	@Override
	public void selectvalueByname(String name, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement visible =  driver.findElementByName(name);
			 Select sel1 = new Select(visible);	
			 sel1.selectByValue(value);
			// System.out.println("The element with name "+name+" is select the index "+value+" successfully");		 
              reportStep("The element with name "+name+" is select the index "+value+" successfully", "pass");
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element wtih "+name+" is not found in the DOM");
            reportStep("The element wtih "+name+" is not found in the DOM", "fail");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with "+name+" is not visible in the application"); 
            reportStep("The element with "+name+" is not visible in the application", "fail");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element wtih "+name+" is not interactable in the application");
            reportStep("The element wtih "+name+" is not interactable in the application", "fail");

		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with "+name+" is not selectable in tne application ");
            reportStep("The element with "+name+" is not selectable in tne application ", "fail");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with "+name+" is not stable in the application");
            reportStep("The element with "+name+" is not stable in the application", "fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with "+name+" is not select the "+value+" due to unknown error");
            reportStep("The element with "+name+" is not select the "+value+" due to unknown error", "fail");
		}
		
	}

	@Override
	public void enterByXpath(String xpathValue, Keys pageDown) {
		// TODO Auto-generated method stub
		
		 try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
			
			//System.out.println("The element with xpath "+xpathValue+" is entered with "+Keys.PAGE_DOWN);
            reportStep("The element with xpath "+xpathValue+" is entered with "+Keys.PAGE_DOWN, "pass");
		}  catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element wtih xpath "+xpathValue+" is not found in the DOM");
            reportStep("The element wtih xpath "+xpathValue+" is not found in the DOM", "fail");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not visible in the application");
            reportStep("The element with xpath "+xpathValue+" is not visible in the application", "fail");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element wtih xpath "+xpathValue+" is not interactable in the application");
            reportStep("The element wtih xpath "+xpathValue+" is not interactable in the application", "fail");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not stable in the application");
            reportStep("The element with xpath "+xpathValue+" is not stable in the application", "fail");

		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not entered with "+Keys.PAGE_DOWN+" due to unexpected alert opened");
            reportStep("The element with xpath "+xpathValue+" is not entered with "+Keys.PAGE_DOWN+" due to unexpected alert opened", "fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not entered with "+Keys.PAGE_DOWN+" due to unknown error");
            reportStep("The element with xpath "+xpathValue+" is not entered with "+Keys.PAGE_DOWN+" due to unknown error", "fail");

		
		}

	}

	@Override
	public void verifyTextByName(String name, String text) {
		// TODO Auto-generated method stub
		
		try {
			String Text = driver.findElementByName(name).getText();
			if(text.equals(Text)) {
			//System.out.println("The element with name "+name+" is holding the text "+Text+" is matched with expected text "+text);	
			reportStep("The element with name "+name+" is holding the text "+Text+" is matched with expected text "+text, "pass");
			}else {
			//System.out.println("The element with name "+name+" is holding the text "+Text+" is not matched with expected text "+text);	
			reportStep("The element with name "+name+" is holding the text "+Text+" is not matched with expected text "+text, "fail");

			}
		} catch (StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with "+name+" is not stable in the application");	
			reportStep("The element with "+name+" is not stable in the application", "fail");
		}catch (NoSuchElementException e) {
				// TODO: handle exception
			//System.err.println("The element wtih "+name+" is not found in the DOM");
			reportStep("The element wtih "+name+" is not found in the DOM", "fail");

 		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with  "+name+" is not visible in the application");
			reportStep("The element with  "+name+" is not visible in the application", "fail");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element wtih "+name+" is not interactable in the application");
			reportStep("The element wtih "+name+" is not interactable in the application", "fail");

		}catch (UnhandledAlertException e) {
			// TODO: handle exception
		//System.err.println("The element with name "+name+" is not verified with Text "+text+" due to unexpected alert opened");
			reportStep("The element with name "+name+" is not verified with Text "+text+" due to unexpected alert opened", "fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not verified with Text "+text+" due to unknown error");
			reportStep("The element with name "+name+" is not verified with Text "+text+" due to unknown error", "fail");

		
			}
		}

	@Override
	public void switchTodefaultContent() {
		// TODO Auto-generated method stub
		
		 try {
			driver.switchTo().defaultContent();
		
			//System.out.println("This defaultContent method switched back to the web page successfully");
			reportStep("This defaultContent method switched back to the web page successfully","pass");
		}  catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			//System.err.println("The driver focused on the first frame is not switched due to its frame cannot be found");
			reportStep("The driver focused on the first frame is not switched due to its frame cannot be found","fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The driver focused on the top window and first frame is not switched due to unknown error");
			reportStep("The driver focused on the top window and first frame is not switched due to unknown error","fail");

		}
	}
	
	
	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
		
		try {
			driver.navigate().refresh();
			
			//System.out.println("refresh the page successfully");
			reportStep("refresh the page successfully", "pass",false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Refresh the current page due to unknown error");
			reportStep("The Refresh the current page due to unknown error", "fail");

		}
	}

	@Override
	public String getAlertTextNoSnap() {
		// TODO Auto-generated method stub
		   String alertText = null;
			try {
				 alertText = driver.switchTo().alert().getText();
				//System.out.println("The get alert text method is captured the message from the alert box successfully");
				reportStep("The get alert text method is captured the message from the alert box successfully", "pass",false);
			} catch (NoAlertPresentException e) {
				// TODO Auto-generated catch block
				//System.err.println("The get alert text is not fetched due to no alert found");
				reportStep("The get alert text is not fetched due to no alert found", "fail");
			}catch (UnhandledAlertException e) {
				// TODO: handle exception
				//System.err.println("The get alert text is not fetched due to unexpected alert opened");
				reportStep("The get alert text is not fetched due to unexpected alert opened", "fail");

			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The get alert text is not fetched due to unknown error");
				reportStep("The get alert text is not fetched due to unknown error", "fail");

			}
			return alertText ;
			
		}

	@Override
	public void mouseHoverByXPath(String xpath) {
		// TODO Auto-generated method stub
		try {
			WebElement b =  driver.findElementByXPath(xpath);
			Actions builder = new Actions(driver);
			builder.moveToElement(b).perform();
			WebElement a =  driver.findElementByXPath(xpath);
			builder.moveToElement(a).perform();
			builder.click().build().perform();

			//System.out.println("xpath "+xpath+" is clicked successfully");
			reportStep("xpath "+xpath+" is clicked successfully", "pass");

	}catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("xpath "+xpath+" its due to unknown error");
		reportStep("xpath "+xpath+" its due to unknown error", "fail");

	}
	}

	@Override
	public void switchToframeUsingId(String xpath) {
		// TODO Auto-generated method stub
		try {
        WebElement myNewFrame =  driver.findElementByXPath(xpath);
		driver.switchTo().frame(myNewFrame);
		//System.out.println("This method is switching to frame "+xpath+" successfully");
		reportStep("This method is switching to frame "+xpath+" successfully", "pass");
	}catch (NoSuchFrameException e) {
		// TODO Auto-generated catch block
		//System.err.println("This frame is not switched due to its frame "+xpath+" cannot be found");
		reportStep("This frame is not switched due to its frame "+xpath+" cannot be found", "fail");

	}catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("This frame is not switched due to unknown error");
		reportStep("This frame is not switched due to unknown error", "fail");

	}

	}

	@Override
	public void explicitWait(String xpath,long time) {
		// TODO Auto-generated method stub
		try {
			WebElement b =  driver.findElementByXPath(xpath);
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.elementToBeClickable(b)).click();
			//System.out.println("This statement will pauses the execution of the current thread for a specified amount of milliseconds "+time+" successfully");
		    reportStep("This statement will pauses the execution of the current thread for a specified amount of milliseconds "+time+" successfully", "pass");
		} catch (InvalidArgumentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The value of milliseconds of "+time+" is negative due to error");
			reportStep("The value of milliseconds of "+time+" is negative due to error","fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The value of milliseconds of "+time+ due to unknown error");
			reportStep("The value of milliseconds of "+time+" due to unknown error", "fail");
		}
	}
	
	
	}
	
		
