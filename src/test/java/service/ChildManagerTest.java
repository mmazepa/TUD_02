package service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/beans.xml" })
public class ChildManagerTest {

	@Autowired
	private ChildManager cm;

	@Test
	public void childSayHelloTest() {
    System.out.println("");
    System.out.println("   [CHILD_SAY_HELLO_TEST]");
    System.out.println("   -------------------------------------");
		assertEquals("I'm Brajan!", cm.sayName());
    System.out.println("   [CHILD]: " + cm.sayName());
    assertEquals("I'm Male!", cm.sayGender());
    System.out.println("   [CHILD]: " + cm.sayGender());
    assertEquals("I was born in 1990!", cm.sayYob());
    System.out.println("   [CHILD]: " + cm.sayYob());
    assertEquals("I'm son!", cm.sayInfo());
    System.out.println("   [CHILD]: " + cm.sayInfo());
    System.out.println("   -------------------------------------");
	}

}
