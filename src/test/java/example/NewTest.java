package example;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void pass() {
	  
	System.out.println("alok pass");
	Assert.assertEquals(true, true);
  }
  
  @Test
  public void fail() {
	  
	System.out.println("alok fail");
	Assert.assertEquals(true, false);
  }
}
