package com.sparta.mc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RaindropsTest {
  @ParameterizedTest
  @ValueSource( ints = { 3, 6, 9, 12, 18 } )
  @DisplayName( "Test for only factors of three" )
  public void factorOfThree( int three ) {
    String result = Raindrops.plingPlangPlong( three );
    assertEquals( "Pling", result );
  }

  @ParameterizedTest
  @ValueSource( ints = { 5, 10, 20, 25, 50 } )
  @DisplayName( "Test for only factors of five" )
  public void factorOfFive( int five ) {
    String result = Raindrops.plingPlangPlong( five );
    assertEquals( "Plang", result );
  }

  @ParameterizedTest
  @ValueSource( ints = { 7, 14, 28, 49, 56 } )
  @DisplayName( "Test for only factors of seven" )
  public void factorOfSeven( int seven ) {
    String result = Raindrops.plingPlangPlong( seven );
    assertEquals( "Plong", result );
  }

  @ParameterizedTest
  @ValueSource( ints = { 15, 30, 45, 60, 75 } )
  @DisplayName( "Test for factor of three and five" )
  public void factorOfThreeAndFive( int threeAndFive ) {
    String result = Raindrops.plingPlangPlong( threeAndFive );
    assertEquals( "PlingPlang", result );
  }

  @ParameterizedTest
  @ValueSource( ints = { 21, 42, 63, 84, 126 } )
  @DisplayName( "Test for factors of three and seven" )
  public void factorOfThreeAndSeven( int threeSeven ) {
    String result = Raindrops.plingPlangPlong( threeSeven );
    assertEquals( "PlingPlong", result );
  }

  @ParameterizedTest
  @ValueSource( ints = { 35, 70, 140, 280 } )
  @DisplayName( "Test for numbers that are a factor of five and seven" )
  public void factorOfFiveAndSeven( int fiveAndSeven ) {
    String result = Raindrops.plingPlangPlong( fiveAndSeven );
    assertEquals( "PlangPlong", result );
  }


  @ParameterizedTest
  @ValueSource( ints = { 105, 210, 420, 840 } )
  @DisplayName( "Test for numbers that are a factor of three, five and seven" )
  public void factorOfAllTest( int all ) {
    String result = Raindrops.plingPlangPlong( all );
    assertEquals( "PlingPlangPlong", result );
  }

  @ParameterizedTest
  @ValueSource( ints = { -3, -6, -9, -12 } )
  @DisplayName( "Test for negative numbers that are a factor of three" )
  public void negativeNumberTest( int negative ) {
    String result = Raindrops.plingPlangPlong( negative );
    assertEquals( "Pling", result );
  }

  @ParameterizedTest
  @ValueSource( ints = { -5, -10, -20, -25 } )
  @DisplayName( "Test for negative numbers that are a factor of five" )
  public void negativeNumberTestOfFive( int negative ) {
    String result = Raindrops.plingPlangPlong( negative );
    assertEquals( "Plang", result );
  }

  @ParameterizedTest
  @ValueSource( ints = { -7, -14, -28, -49, -56 } )
  @DisplayName( "Test for negative numbers that are a factor of seven" )
  public void negativeNumberTestOfSeven( int negative ) {
    String result = Raindrops.plingPlangPlong( negative );
    assertEquals( "Plong", result );
  }

  @ParameterizedTest
  @ValueSource( ints = { 300000000, 900000000, 600000000, 999999990, 1200000000 } )
  @DisplayName( "Test for large numbers" )
  public void largeNumberTest( int large ) {
    String result = Raindrops.plingPlangPlong( large );
    assertEquals( "PlingPlang", result );
  }

  @ParameterizedTest
  @ValueSource( ints = { 4, 8, 17, 23, 38 } )
  @DisplayName( "Test for numbers that are not a factor of three, five or seven" )
  public void factorOfNone( int none ) {
    String result = Raindrops.plingPlangPlong( none );
    assertEquals( String.valueOf( none ), result );
  }


}
