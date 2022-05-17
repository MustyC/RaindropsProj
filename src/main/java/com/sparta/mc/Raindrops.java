package com.sparta.mc;

public class Raindrops {
  public int plingPlangPlong( int n ) {

    if ( n % 3 == 0 && n % 5 == 0 ) {
      System.out.println("PlingPlang");
    } else if ( n % 3 == 0 ) {
      System.out.println("Pling");
    } else if ( n % 5 == 0 ) {
      System.out.println("Plang");
    } else if ( n % 7 == 0 ) {
      System.out.println("Plong");
    } else {
      System.out.println(n);
    }
    return n;
  }
}
