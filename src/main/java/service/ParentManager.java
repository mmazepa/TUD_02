package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import domain.Parent;

@Component
public class ParentManager implements ParentManagerInterface {

	@Autowired
  @Qualifier("parent01")
	private Parent parent;

  @Override
	public String sayName() {
		return "I'm " + parent.getFirstName() + "!";
	}

  @Override
  public String sayGender(){
    return "I'm " + parent.getGender() + "!";
  }

  @Override
  public String sayYob() {
    return "I was born in " + parent.getYob() + "!";
  }

  @Override
  public String sayInfo() {
    return parent.getParentInfo();
  }

}
