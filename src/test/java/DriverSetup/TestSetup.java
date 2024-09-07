package DriverSetup;
 
import java.io.IOException;
 
import Pages.PageObjectManager;
 
public class TestSetup {
	public BaseClass baseClass;
	public PageObjectManager pageObj;
	public TestSetup() throws IOException
	{
		baseClass = new BaseClass();
		pageObj = new PageObjectManager(baseClass.WebDriverManager());
	}
 
}