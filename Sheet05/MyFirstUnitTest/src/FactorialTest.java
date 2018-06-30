import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {
  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void negativeFactorial() {
	  Factorial.calculateFactorial(-1);
  }
  
  @Test
  public void zeroFactorial() {
	  long res = Factorial.calculateFactorial(0);
	  Assert.assertEquals(res, 1);
  }
  
  //ToDo: Fügen Sie den dritten Test hier ein.
}
