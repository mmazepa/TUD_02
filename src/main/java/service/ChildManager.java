package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import domain.Child;

@Component
public class ChildManager implements ChildManagerInterface {

	@Autowired
  @Qualifier("child01")
	private Child child;

  @Override
	public String sayName() {
		return "I'm " + child.getFirstName() + "!";
	}

  @Override
  public String sayGender(){
    return "I'm " + child.getGender() + "!";
  }

  @Override
  public String sayYob() {
    return "I was born in " + child.getYob() + "!";
  }

  @Override
  public String sayInfo() {
    return child.getChildInfo();
  }

}
