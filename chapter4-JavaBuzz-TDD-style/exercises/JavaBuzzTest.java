import static org.junit.Assert.*;
import org.junit.Test;

public class JavaBuzzTest {

  @Test
  public void returnsJavaFor3() {
    assertEquals("Java", JavaBuzz.Buzz(3));
  }

  @Test
  public void returnsBuzzFor5() {
    assertEquals("Buzz", JavaBuzz.Buzz(5));
  }

  @Test
  public void returnsJavaBuzzFor15() {
    assertEquals("JavaBuzz", JavaBuzz.Buzz(15));
  }

  @Test
  public void returnsJavaBuzzFor30() {
    assertEquals("JavaBuzz", JavaBuzz.Buzz(30));
  }

  @Test
  public void returns1For1() {
    assertEquals("1", JavaBuzz.Buzz(1));
  }

  @Test
  public void returns14For14() {
    assertEquals("14", JavaBuzz.Buzz(14));
  }

  @Test
  public void returns98For98() {
    assertEquals("98", JavaBuzz.Buzz(98));
  }

  @Test
  public void returnsJavaFor9() {
    assertEquals("Java", JavaBuzz.Buzz(9));
  }

  @Test
  public void returnsJavaBuzzFor45() {
    assertEquals("JavaBuzz", JavaBuzz.Buzz(45));
  }
}
