import com.sparta.mc.Raindrops;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RaindropsTest {

  @Test
  public void factorOfThree() {
    Raindrops raindrops = new Raindrops();
    String result = raindrops.plingPlangPlong( 3 );
    assertEquals( "Pling", result );
  }

  @Test
  public void factorOfFive() {
    Raindrops raindrops = new Raindrops();
    String result = raindrops.plingPlangPlong( 5 );
    assertEquals( "Plang", result );
  }

  @Test
  public void factorOfThreeAndFive() {
    Raindrops raindrops = new Raindrops();
    String result = raindrops.plingPlangPlong( 30 );
    assertEquals( "PlingPlang", result );
  }

  @Test
  public void factorOfSeven() {
    Raindrops raindrops = new Raindrops();
    String result = raindrops.plingPlangPlong( 7 );
    assertEquals( "Plong", result );
  }

  @Test
  public void factorOfNone() {
    Raindrops raindrops = new Raindrops();
    String result = raindrops.plingPlangPlong( 16 );
    assertEquals( "16", result );
  }


}
