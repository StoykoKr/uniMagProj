package city.proj.entity;

import java.io.Serializable;

public class Person implements Serializable {
private int id;
private String name;
private SkillSheet skills;
private CurrentStateSheet currentState;
private PhysicalTrait physicalTraits;
private PsychologicalTrait psychologicalTraits;


public Person(int id, String name, SkillSheet skills, CurrentStateSheet currentState, PhysicalTrait physicalTraits,
		PsychologicalTrait psychologicalTraits) {
	super();
	this.id = id;
	this.name = name;
	this.skills = skills;
	this.currentState = currentState;
	this.physicalTraits = physicalTraits;
	this.psychologicalTraits = psychologicalTraits;
}
public Person() {
	
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
public SkillSheet getSkills() {
	return skills;
}
public void setSkills(SkillSheet skills) {
	this.skills = skills;
}
public CurrentStateSheet getCurrentState() {
	return currentState;
}
public void setCurrentState(CurrentStateSheet currentState) {
	this.currentState = currentState;
}
public PhysicalTrait getPhysicalTraits() {
	return physicalTraits;
}
public void setPhysicalTraits(PhysicalTrait physicalTraits) {
	this.physicalTraits = physicalTraits;
}
public PsychologicalTrait getPsychologicalTraits() {
	return psychologicalTraits;
}
public void setPsychologicalTraits(PsychologicalTrait psychologicalTraits) {
	this.psychologicalTraits = psychologicalTraits;
}

	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return getName();
		}
}
