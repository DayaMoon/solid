package edu.endava.lambda;

import java.math.BigDecimal;


public class Developer
{
	Integer age;
	String name;
	BigDecimal salary;

	public Developer()
	{
	}

	/**
	 * @param age
	 * @param name
	 * @param salary
	 */
	public Developer(String name, BigDecimal salary,  Integer age)
	{
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	public Integer getAge()
	{
		return age;
	}

	public void setAge(Integer age)
	{
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public BigDecimal getSalary()
	{
		return salary;
	}

	public void setSalary(BigDecimal salary)
	{
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		return "Developer [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
}
