package testNgone;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_9 
{
@BeforeSuite
public void BF()
{
	System.out.println("Before_Suite");
}
@BeforeTest
public void BT()
{
	System.out.println("Before_Test");
}
@BeforeClass
public void BC()
{
	System.out.println("Before_Class");
}
@BeforeMethod
public void BM()
{
	System.out.println("Before_Method");
}
@Test
public void T()
{
	System.out.println("Test");
}
@AfterMethod
public void AM()
{
	System.out.println("After_Method");
}
@AfterClass
public void AC()
{
	System.out.println("After_Class");
}
@AfterTest
public void AT()
{
	System.out.println("After_Test");
}
@AfterSuite
public void AS()
{
	System.out.println("After_Suite");
}
}
