package testNgone;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Three_test_one_BM_AM 
{
@Test
public void test_1()
{
	System.out.println("Test one");
}
@Test
public void test_2()
{
	System.out.println("Test two");
}
@Test
public void test_3()
{
	System.out.println("Test three");
}
@BeforeMethod
public void Bm()
{
	System.out.println("This is BM");
}
@AfterMethod
public void Am()
{
	System.out.println("This is AM");
}
}
