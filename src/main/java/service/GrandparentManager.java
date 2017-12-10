package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import domain.Grandparent;

@Component
public class GrandparentManager implements GrandparentManagerInterface {

	@Autowired
  @Qualifier("grandpa01")
	private Grandparent grandpa;

  @Override
	public String sayName() {
		return "I'm " + grandpa.getFirstName() + "!";
	}

  @Override
  public String sayYob() {
    return "I was born in " + grandpa.getYob() + "!";
  }

  @Override
  public String sayInfo() {
    return grandpa.getGrandparentInfo();
  }

}
