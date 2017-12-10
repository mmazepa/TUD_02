package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import domain.Child;

@Component
public class ChildManager implements ChildManagerInterface {

	@Autowired
  @Qualifier("child01")
	private Child son;

  @Override
	public String sayName() {
		return "I'm " + son.getFirstName() + "!";
	}

  @Override
  public String sayYob() {
    return "I was born in " + son.getYob() + "!";
  }

  @Override
  public String sayInfo() {
    return son.getChildInfo();
  }

}
