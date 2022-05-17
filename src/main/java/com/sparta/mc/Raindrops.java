package com.sparta.mc;

public class Raindrops {
  public String plingPlangPlong( int n ) {

    String result = "";

    if ( n % 3 != 0 && n % 5 != 0 && n % 7 != 0) {
      return String.valueOf( n );
    } else{
      if(n % 3 == 0 && n % 5 == 0){
        result = "PlingPlang";
      } if(n % 3 == 0){
        result = "Pling";
      } if(n % 5 == 0){
        result = "Plang";
      } if(n % 7 == 0){
        result = "Plong";
      }
      return result;
    }

  }
}
