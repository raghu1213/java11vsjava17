package com.practice.switchexpression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwitchWithYield {


  static int withYield(String stringNumber){
    var number = switch (stringNumber){
      case "one" -> 1;
      case "two" -> 2;
      case "three" ->3;
      case "1","2","3" ->{
        System.out.println("multiple statements");
        yield 999;
      }
      default -> 0;
    };
    return number;
  }

  static int withOutYield(String stringNumber){
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
        case "1":
        case "2":
        case "3":
          System.out.println("multiple statements");
          number =999;
          break;
        default:
          number = 0;
      }
      return number;
  }

  @Test
  void match(){
    assertEquals(withOutYield("1"),withYield("1"));
    assertEquals(withOutYield("2"),withYield("2"));
    assertEquals(withOutYield("3"),withYield("3"));
  }

}
