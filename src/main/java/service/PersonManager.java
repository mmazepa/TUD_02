package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import domain.Person;

@Component
public class PersonManager {

	@Autowired
	private Person person;

	public String sayName() {
		return "I'm " + person.getFirstName() + "!";
	}

  public String sayYob() {
    return "I was born in " + person.getYob() + "!";
  }

}
