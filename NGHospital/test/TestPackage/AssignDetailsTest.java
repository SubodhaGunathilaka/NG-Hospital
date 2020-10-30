
package TestPackage;

import org.junit.jupiter.api.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import Model.DoctorInformation;


public class AssignDetailsTest 
{
   static DoctorInformation doc;
    boolean result;
    
    @BeforeClass
    public static void createObject()
    {
        doc=new DoctorInformation("Kamla", 21,"32","MBBS","dURDANS","0132452773","WSER@GMAIL.COM","QWERW");
    }
    @Before
    public void GetValue()
    {
        result=DoctorInformation.
    }
    @Test
    public void TestAssignLayer()
    {
        Assertions.assertEquals(false,result);
    }
    @After
    public void clearAnswer()
    {
        result=false;
    }
    @AfterClass
    public static void DeleteAnswer()
    {
       doc=null;
    }

    
}
