package TestLocation;

import org.testng.Assert;
import org.testng.annotations.Test;

import mainfunctions.retryanalyzer;

public class rerun {

	@Test(retryAnalyzer = retryanalyzer.class)  //this for without "IAnnotationTransformer"
    public void test1() {
        Assert.assertEquals(true, false);
    }
 
   @Test
    public void test2() {
        Assert.assertEquals(true, false);
    }
}
