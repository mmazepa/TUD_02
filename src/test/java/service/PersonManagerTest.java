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
    System.out.println("   [PERSON_SAY_HELLO_TEST]");
    System.out.println("   -------------------------------------");
		assertEquals("I'm Henryk!", pm.sayName());
    System.out.println("   [PERSON]: " + pm.sayName());
    assertEquals("I'm Male!", pm.sayGender());
    System.out.println("   [PERSON]: " + pm.sayGender());
    assertEquals("I was born in 1964!", pm.sayYob());
    System.out.println("   [PERSON]: " + pm.sayYob());
    System.out.println("   -------------------------------------");
	}

}
