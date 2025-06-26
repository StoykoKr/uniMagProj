package city.proj.entity;

import java.io.Serializable;
import java.util.EnumSet;
import java.util.Set;

import city.proj.helpers.Trait;

public class PsychologicalTrait implements Serializable{
private int id;

private Set<Trait> traits = EnumSet.noneOf(Trait.class);

public Set<Trait> getTraits() {
	return traits;
}

public void setTraits(Set<Trait> traits) {
	this.traits = traits;
}

public void addTrait(Trait trait) {
    traits.add(trait);
}

public boolean hasTrait(Trait trait) {
    return traits.contains(trait);
}

public void removeTrait(Trait trait) {
    traits.remove(trait);
}


public PsychologicalTrait() {
	
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

}
