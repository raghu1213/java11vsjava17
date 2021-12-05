package com.practice.textblock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TextBlock {


  public static String oldStyle() {
    String text = "{\n" +
      "  \"name\": \"John Doe\",\n" +
      "  \"age\": 45,\n" +
      "  \"address\": \"Doe Street, 23, Java Town\"\n" +
      "}";
    return text;
  }

  /**
   * Text blocks starts and ends with three quotes
   *
   * @return
   */
  public static String newStyle() {
    String text = """
            {
              "name": "John Doe",
              "age": 45,
              "address": "Doe Street, 23, Java Town"
            }
          """;
    return text;
  }





  @Test
  void oldAndNewAreEqual() {
    assertEquals(oldStyle(), newStyle());
  }

}
