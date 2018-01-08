package service;

interface PersonManagerInterface {

  // Method for Testing
  public String sayName(String qualifier);
  public String sayGender(String qualifier);
  public String sayYob(String qualifier);
  public String sayFamily(String qualifier);

  // Helpfull methods
  public String hasChild(String childName);
  public String colorizeText(String textToColorize, String colorName, Boolean isBold);
  public void displayPersonInfo(String qualifier);

}
