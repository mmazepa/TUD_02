package service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/beans.xml" })
public class PersonManagerTest {

	@Autowired
	private PersonManager pm;

	@Test
	public void personSayHelloTest() {
    System.out.println("");
    System.out.println("   " + pm.colorizeText("[PERSON_SAY_HELLO_TEST]", "white", true));
    System.out.println("   " + pm.colorizeText("------------------------------------------", "red", false));

    // PERSON_01
    System.out.println("   " + pm.colorizeText("[PERSON_01]:", "blue", true));
    assertEquals("I'm Henryk!", pm.sayName("person01"));
    assertEquals("I'm Male!", pm.sayGender("person01"));
    assertEquals("I was born in 1894!", pm.sayYob("person01"));
    assertEquals("I don't have a parent!", pm.sayParent("person01"));
    assertEquals("My child name is Franciszek!", pm.sayChild("person01"));
    pm.displayPersonInfo("person01");

    // PERSON_02
    System.out.println("   " + pm.colorizeText("[PERSON_02]:", "blue", true));
    assertEquals("I'm Franciszek!", pm.sayName("person02"));
    assertEquals("I'm Male!", pm.sayGender("person02"));
    assertEquals("I was born in 1924!", pm.sayYob("person02"));
    assertEquals("My parent name is Henryk!", pm.sayParent("person02"));
    assertEquals("My child name is Michał!", pm.sayChild("person02"));
    pm.displayPersonInfo("person02");

    // PERSON_03
    System.out.println("   " + pm.colorizeText("[PERSON_03]:", "blue", true));
    assertEquals("I'm Michał!", pm.sayName("person03"));
    assertEquals("I'm Male!", pm.sayGender("person03"));
    assertEquals("I was born in 1954!", pm.sayYob("person03"));
    assertEquals("My parent name is Franciszek!", pm.sayParent("person03"));
    assertEquals("My child name is Karolina!", pm.sayChild("person03"));
    pm.displayPersonInfo("person03");

    // PERSON_04
    System.out.println("   " + pm.colorizeText("[PERSON_04]:", "blue", true));
    assertEquals("I'm Karolina!", pm.sayName("person04"));
    assertEquals("I'm Female!", pm.sayGender("person04"));
    assertEquals("I was born in 1984!", pm.sayYob("person04"));
    assertEquals("My parent name is Michał!", pm.sayParent("person04"));
    assertEquals("My child name is Zofia!", pm.sayChild("person04"));
    pm.displayPersonInfo("person04");

    // PERSON_05
    System.out.println("   " + pm.colorizeText("[PERSON_05]:", "blue", true));
    assertEquals("I'm Zofia!", pm.sayName("person05"));
    assertEquals("I'm Female!", pm.sayGender("person05"));
    assertEquals("I was born in 2014!", pm.sayYob("person05"));
    assertEquals("My parent name is Karolina!", pm.sayParent("person05"));
    assertEquals("I don't have a child!", pm.sayChild("person05"));
    pm.displayPersonInfo("person05");
	}

}
