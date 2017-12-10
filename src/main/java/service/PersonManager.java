package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import domain.Person;

@Component
public class PersonManager implements PersonManagerInterface {

	@Autowired
  @Qualifier("person01")
	private Person person;

  @Override
	public String sayName() {
		return "I'm " + person.getFirstName() + "!";
	}

  @Override
  public String sayGender(){
    return "I'm " + person.getGender() + "!";
  }

  @Override
  public String sayYob() {
    return "I was born in " + person.getYob() + "!";
  }

}
