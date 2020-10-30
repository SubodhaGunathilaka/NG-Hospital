
package TestPackage;

import org.junit.jupiter.api.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.BeforeClass;
import Model.mailClass;
public class MailTest 
{
    static mailClass mail;
  int value;
 
  @BeforeClass
  public static void createObject()
  {
      mail=new mailClass("This is a test mail");
  }
  @Before
  public void GetEach() throws Exception
  {
      value = mailClass.sendMail("maduwanthi9889@gmail.com");
  }
  @Test
  public void TestClassMail()
  {
      int expected=1;
      Assertions.assertEquals(expected,value);
  }
  @After
  public void ClearAnswer()
  {
      value=0;
  }
  @AfterClass
  public static void DeleteObject()
  {
      mail=null;
  }
       
    

}
