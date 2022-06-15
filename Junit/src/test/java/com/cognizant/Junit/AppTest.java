package com.cognizant.Junit;
import org.junit.Test;
//import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest 
    extends TestCase
{
    
  @Test
   public void test() {
	 App app=new App();
	 int a=app.add(3, 7);
	 int e=10;
	 assertEquals(a,e);
 }
}
