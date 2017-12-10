package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import domain.Grandparent;

@Component
public class GrandparentManager implements GrandparentManagerInterface {

	@Autowired
  @Qualifier("grandpa01")
	private Grandparent grandparent;

  @Override
	public String sayName() {
		return "I'm " + grandparent.getFirstName() + "!";
	}

  @Override
  public String sayGender(){
    return "I'm " + grandparent.getGender() + "!";
  }

  @Override
  public String sayYob() {
    return "I was born in " + grandparent.getYob() + "!";
  }

  @Override
  public String sayInfo() {
    return grandparent.getGrandparentInfo();
  }

}
