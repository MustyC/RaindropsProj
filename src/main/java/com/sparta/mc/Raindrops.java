package com.sparta.mc;

public class Raindrops {
  public static String plingPlangPlong( int n ) {

    String result = "";

// Checks to see if n is not a factor of 3, 5 or 7, then returns the value of n as a string
    if ( n % 3 != 0 && n % 5 != 0 && n % 7 != 0 ) {
      return String.valueOf( n );
    }
// Checks to see if n is a factor of the provided number,
// if so, appends the correct string onto the already existing string
    if ( n % 3 == 0 ) {
      result += "Pling";
    }
    if ( n % 5 == 0 ) {
      result += "Plang";
    }
    if ( n % 7 == 0 ) {
      result += "Plong";
    }
    return result;
  }
}

