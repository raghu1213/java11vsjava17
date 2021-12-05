package com.practice.utilities;

import com.practice.records.Record;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Utilities {

  @Test
  void stream(){
    var oldStyle = Stream.of("a", "b", "c").collect(Collectors.toList());
    var newStyle = Stream.of("a", "b", "c").toList();

  }

  @Test
  void instanceOf(){
    Object o = new Record.NewStylePerson(1,"name");
    if (o instanceof Record.NewStylePerson person){
      assertEquals(1,person.age());
      assertEquals("name",person.name());
    }

    if (o instanceof Record.NewStylePerson person && person.name().equals("name")){
      System.out.println("Nice name");
    }
  }

  @Test
  void nullPointerException(){
    HashMap<String, Record.NewStylePerson> grapes = new HashMap<>();
    grapes.put("person1", new Record.NewStylePerson( 2,"name1"));
    grapes.put("person2", new Record.NewStylePerson( 2,"name1"));
    grapes.put("grape3", null);
    var color = grapes.get("grape3").age();
  }

}
