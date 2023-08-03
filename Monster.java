package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{

    private String name;
    private int strength;
    private int hitPoints;


    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.strength = strength;
        this.hitPoints = hitPoints;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + strength);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
