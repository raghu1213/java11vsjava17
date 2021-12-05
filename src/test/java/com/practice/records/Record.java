package com.practice.records;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Record {
  /**
   * Old style class creation where all the members are hand crafted
   */
  public class OldStylePerson {
    private final int age;
    private final String name;

    public OldStylePerson(int age, String name) {
      this.age = age;
      this.name = name;
    }

    public int getAge() {
      return age;
    }

    public String getName() {
      return name;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      OldStylePerson that = (OldStylePerson) o;
      return age == that.age && name.equals(that.name);
    }

    @Override
    public int hashCode() {
      return Objects.hash(age, name);
    }

    @Override
    public String toString() {
      return "OldStylePerson{" +
        "age=" + age +
        ", name='" + name + '\'' +
        '}';
    }
  }

  /**
   * New class using record keyword
   */
  public record NewStylePerson(int age, String name) {
  }


  @Test
  void testEquals() {
    var newStyle = new NewStylePerson(1, "A");
    assertEquals(newStyle, newStyle);

  }

  @Test
  void printString() {
    var newStyle = new NewStylePerson(1, "A");
    System.out.println(newStyle);

  }

  /**
   * Some customization
   */
  public record NewStylePersonCustomized(int age, String name) {
    /**
     * overloading constructor
     *
     * @param age
     */
    public NewStylePersonCustomized(int age) {
      this(age, "default");
    }

    /**
     * validation for existing constructor
     *
     * @param age
     * @param name
     */
    public NewStylePersonCustomized {
      if (age < 1) throw new IllegalArgumentException();
    }
  }

}
