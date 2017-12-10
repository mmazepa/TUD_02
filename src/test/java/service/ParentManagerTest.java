package service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/beans.xml" })
public class ParentManagerTest {

	@Autowired
	private ParentManager pm;

	@Test
	public void parentSayHelloTest() {
    System.out.println("");
    System.out.println("   [PARENT_SAY_HELLO_TEST]");
    System.out.println("   -------------------------------------");
		assertEquals("I'm Sebastian!", pm.sayName());
    System.out.println("   [SAY_HELLO_TEST]: " + pm.sayName());
    assertEquals("I was born in 1970!", pm.sayYob());
    System.out.println("   [SAY_HELLO_TEST]: " + pm.sayYob());
    assertEquals("I'm daddy!", pm.sayInfo());
    System.out.println("   [SAY_HELLO_TEST]: " + pm.sayInfo());
    System.out.println("   -------------------------------------");
	}

}
