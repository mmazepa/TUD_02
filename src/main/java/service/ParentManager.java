package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import domain.Parent;

@Component
public class ParentManager implements ParentManagerInterface {

	@Autowired
  @Qualifier("parent01")
	private Parent daddy;

  @Override
	public String sayName() {
		return "I'm " + daddy.getFirstName() + "!";
	}

  @Override
  public String sayYob() {
    return "I was born in " + daddy.getYob() + "!";
  }

  @Override
  public String sayInfo() {
    return daddy.getParentInfo();
  }

}
