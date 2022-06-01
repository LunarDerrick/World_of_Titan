package world_of_titan;

public class Allies<E> {

    private String name;
    private Integer height, weight, strength, agility, intelligence, coordination, leadership;

    public Allies(String name, Integer height, Integer weight, Integer strength, Integer agility, Integer intelligence, Integer coordination, Integer leadership) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.coordination = coordination;
        this.leadership = leadership;
    }

    @Override
    public String toString() {
        return "Name: " + name
                + "\nHeight: " + height + "cm"
                + "\nWeight: " + weight + "kg"
                + "\nStrength: " + strength
                + "\nAgility: " + agility
                + "\nIntelligence: " + intelligence
                + "\nCoordination: " + coordination
                + "\nLeadership: " + leadership + "\n";
    }

    public String getName() {
        return name;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getStrength() {
        return strength;
    }

    public Integer getAgility() {
        return agility;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public Integer getCoordination() {
        return coordination;
    }

    public Integer getLeadership() {
        return leadership;
    }
}
