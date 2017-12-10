package service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/beans.xml" })
public class GrandparentManagerTest {

	@Autowired
	private GrandparentManager gm;

	@Test
	public void grandparentSayHelloTest() {
    System.out.println("");
    System.out.println("   [GRANDPARENT_SAY_HELLO_TEST]");
    System.out.println("   -------------------------------------");
		assertEquals("I'm Janusz!", gm.sayName());
    System.out.println("   [GRANDPARENT]: " + gm.sayName());
    assertEquals("I'm Male!", gm.sayGender());
    System.out.println("   [GRANDPARENT]: " + gm.sayGender());
    assertEquals("I was born in 1950!", gm.sayYob());
    System.out.println("   [GRANDPARENT]: " + gm.sayYob());
    assertEquals("I'm grandpa!", gm.sayInfo());
    System.out.println("   [GRANDPARENT]: " + gm.sayInfo());
    System.out.println("   -------------------------------------");
	}

}
