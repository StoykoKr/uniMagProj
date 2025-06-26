package city.proj.entity;

import java.io.Serializable;

public class SkillSheet implements Serializable {

	private int strength;
	private int agility;
	private int mind;
	private int intelligence;
	private int perception;
	private int charisma;
	private int stamina;
	private int endurance;

	private int id;

	public SkillSheet(int id, int strength, int agility, int mind, int intelligence, int perception, int charisma,
			int stamina, int endurance) {
		super();
		this.id = id;
		this.strength = strength;
		this.agility = agility;
		this.mind = mind;
		this.intelligence = intelligence;
		this.perception = perception;
		this.charisma = charisma;
		this.stamina = stamina;
		this.endurance = endurance;
	}

	public SkillSheet() {
		this.id = 1;
		this.strength = 1;
		this.agility = 1;
		this.mind = 1;
		this.intelligence = 1;
		this.perception = 1;
		this.charisma = 1;
		this.stamina = 1;
		this.endurance = 1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getMind() {
		return mind;
	}

	public void setMind(int mind) {
		this.mind = mind;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getPerception() {
		return perception;
	}

	public void setPerception(int perception) {
		this.perception = perception;
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	public int getEndurance() {
		return endurance;
	}

	public void setEndurance(int endurance) {
		this.endurance = endurance;
	}
	public boolean satisfies(SkillSheet required) {
	    return this.strength     >= required.strength
	        && this.agility      >= required.agility
	        && this.mind         >= required.mind
	        && this.intelligence >= required.intelligence
	        && this.perception   >= required.perception
	        && this.charisma     >= required.charisma
	        && this.stamina      >= required.stamina
	        && this.endurance    >= required.endurance;
	}
	@Override
	public String toString() {

		return "Strength = " + getStrength() + " Stamina = " + getStamina() + " Perception = " + getPerception()
				+ " Agility = " + getAgility() + " Charisma = " + getCharisma() + " Endurance = " + getEndurance()
				+ " Mind = " + getMind() + " Intelligence = " + getIntelligence();
	}
}
