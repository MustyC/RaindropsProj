package com.sparta.mc;

import com.sparta.mc.Raindrops;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RaindropsTest {
  Raindrops raindrops = new Raindrops();

  @Test
  @DisplayName( "Test for factor of 3" )
  public void factorOfThree() {

    String result = raindrops.plingPlangPlong( 3 );
    assertEquals( "Pling", result );
  }

  @Test
  @DisplayName( "Test for factor of 5" )
  public void factorOfFive() {
    String result = raindrops.plingPlangPlong( 5 );
    assertEquals( "Plang", result );
  }

  @Test
  @DisplayName( "Test for factor of 3 and 5" )
  public void factorOfThreeAndFive() {
    String result = raindrops.plingPlangPlong( 30 );
    assertEquals( "PlingPlang", result );
  }

  @Test
  @DisplayName( "Test for factor of 7" )
  public void factorOfSeven() {
    String result = raindrops.plingPlangPlong( 7 );
    assertEquals( "Plong", result );
  }

  @Test
  @DisplayName( "Test for number that is a factor of 5 and 7" )
  void factorOfFiveAndSeven() {
    Raindrops raindrops = new Raindrops();
    String result = raindrops.plingPlangPlong( 70 );
    assertEquals( "PlangPlong", result );
  }

  @Test
  @DisplayName( "Test for number that is not a factor of 3, 5 or 7" )
  public void factorOfNone() {
    Raindrops raindrops = new Raindrops();
    String result = raindrops.plingPlangPlong( 16 );
    assertEquals( "16", result );
  }

  @Test
  @DisplayName( "Test for negative number" )
  public void negativeNumberTest() {
    String result = raindrops.plingPlangPlong( -5 );
    assertEquals( "Plang", result );
  }

  @Test
  @DisplayName( "Test for large number" )
  public void largeNumberTest() {
    String result = raindrops.plingPlangPlong( 300000000 );
    assertEquals( "PlingPlang", result );
  }


}
