package com.practice.sealedclasses.classes;

public class SealedClass {
  /**
   * Base class which can only be extended by orga
   */
  public static abstract sealed class Person permits Orga, Cont {

  }

  public static non-sealed class Orga extends Person {

  }

  public static final class Cont extends Person {

  }

  public static final class Trust extends Orga {

  }

  public static class ShellTrust extends Orga {

  }


}
