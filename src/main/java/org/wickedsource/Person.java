package org.wickedsource;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Person implements Serializable {
	
	@NotNull
	@Pattern(regexp="^[a-zA-Zäöüß]+$")
	private String name;
	
	@NotNull
	@Pattern(regexp="^[0-9]{4}-[0-9]+$")
	private String phone;
	
	@NotNull
	@Min(18)
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
