package domain;

public class Parent extends Person {

  private Person child = new Person();

  public Parent() {

  }

  public void setChild(Person child) {
    this.child = child;
  }

  public Person getChild() {
    return child;
  }

}
