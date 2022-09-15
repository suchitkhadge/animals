package com.tlglearning.animals;

public class Dog extends Wolf{

  @Override
  public void vocalize() {
    System.out.println("Bark like a dog");
  }

  @Override
  public void hunt() {
    System.out.println("Hunt for balls, bones, leaves");
  }

  public static void whoAmI(){
    System.out.println("I am a dog");
  }

  public void rollOver(){
    System.out.println(" I am rolling over..");
  }


}
