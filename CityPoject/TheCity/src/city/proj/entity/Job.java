package city.proj.entity;

import java.io.Serializable;

public class Job implements Serializable{

	private int id;
	private String name;
	private float salary;
	private SkillSheet minimumSkills;
	
	
	public Job(int id, String name, float salary, SkillSheet minimumSkills) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.minimumSkills = minimumSkills;
	}
	public Job() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public SkillSheet getMinimumSkills() {
		return minimumSkills;
	}
	public void setMinimumSkills(SkillSheet minimumSkills) {
		this.minimumSkills = minimumSkills;
	} 
	
}
