package com.sparta.mc;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RaindropsTest {
  @ParameterizedTest
  @ValueSource( ints = { 3, 6, 9, 12, 18 } )
  @DisplayName( "Test for only factors of 3" )
  void factorOfThree( int three ) {

    String result = Raindrops.plingPlangPlong( three );
    assertEquals( "Pling", result );
  }

  @ParameterizedTest
  @ValueSource( ints = { 5, 10, 20, 25, 50 } )
  @DisplayName( "Test for only factors of 5" )
  void factorOfFive( int five ) {
    String result = Raindrops.plingPlangPlong( five );
    assertEquals( "Plang", result );
  }

  @ParameterizedTest
  @ValueSource( ints = { 15, 30, 45, 60, 75 } )
  @DisplayName( "Test for factor of 3 and 5" )
  public void factorOfThreeAndFive( int threeAndFive ) {
    String result = Raindrops.plingPlangPlong( threeAndFive );
    assertEquals( "PlingPlang", result );
  }

  @ParameterizedTest
  @ValueSource( ints = { 7, 14, 28, 49, 56 } )
  @DisplayName( "Test for only factors of 7" )
  void factorOfSeven( int seven ) {
    String result = Raindrops.plingPlangPlong( seven );
    assertEquals( "Plong", result );
  }

  @ParameterizedTest
  @ValueSource( ints = { 35, 70, 140, 280 } )
  @DisplayName( "Test for numbers that are a factor of 5 and 7" )
  void factorOfFiveAndSeven( int fiveAndSeven ) {
    String result = Raindrops.plingPlangPlong( fiveAndSeven );
    assertEquals( "PlangPlong", result );
  }

  @Disabled
  @ParameterizedTest
  @ValueSource( ints = { 4, 8, 17, 23, 38 } )
  @DisplayName( "Test for numbers that are not a factor of 3, 5 or 7" )
  void factorOfNone( int none ) {
    String result = Raindrops.plingPlangPlong( none );
    assertEquals( "4", result );
  }

  @ParameterizedTest
  @ValueSource( ints = { -3, -6, -9, -12 } )
  @DisplayName( "Test for negative numbers that are a factor of three" )
  void negativeNumberTest( int negative ) {
    String result = Raindrops.plingPlangPlong( negative );
    assertEquals( "Pling", result );
  }
  @ParameterizedTest
  @ValueSource( ints = { -5, -10, -20, -25 } )
  @DisplayName( "Test for negative numbers that are a factor of five" )
  void negativeNumberTestOfFive( int negative ) {
    String result = Raindrops.plingPlangPlong( negative );
    assertEquals( "Plang", result );
  }

  @Test
  @DisplayName( "Test for large number" )
  void largeNumberTest() {
    String result = Raindrops.plingPlangPlong( 30000000 );
    assertEquals( "PlingPlang", result );
  }


}
