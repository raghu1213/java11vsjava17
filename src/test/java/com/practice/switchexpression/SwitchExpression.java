package com.practice.switchexpression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwitchExpression {

  static int oldStyle(String stringNumber) {
    int number;
   switch (stringNumber) {
      case "one":
        number = 1;
        break;
      case "two":
        number = 2;
        break;
      case "three":
        number = 3;
        break;
      default:
        number = 0;
    }
    return number;
  }

  /**
   * Switch expression. No need to use break statement
   * Return values can be directly used
   * @param stringNumber
   * @return
   */
  static int newStyle(String stringNumber){
    return switch (stringNumber){
      case "one" -> 1;
      case "two" -> 2;
      case "three" ->3;
      default -> 0;
    };
  }

  @Test
  void match(){
    assertEquals(oldStyle("one"),newStyle("one"));
    assertEquals(oldStyle("two"),newStyle("two"));
    assertEquals(oldStyle("three"),newStyle("three"));
    assertEquals(oldStyle(""),newStyle(""));
  }


}
