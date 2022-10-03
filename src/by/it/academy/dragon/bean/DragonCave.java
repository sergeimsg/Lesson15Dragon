package by.it.academy.dragon.bean;

import java.util.List;
import java.util.Objects;

public class DragonCave {

    public static final long serialVersionUID = 1;

    private List<Treasure> dragonTreasure;

    public DragonCave() {
    }

    public DragonCave(List<Treasure> treasures) {

        this.dragonTreasure = treasures;
    }

    public List<Treasure> getDragonTreasure() {

        return dragonTreasure;
    }

    public void setDragonTreasure(List<Treasure> dragonTreasure) {
        this.dragonTreasure = dragonTreasure;
    }

    public void addTreasure(Treasure treasure) {

        dragonTreasure.add(treasure);

    }

    public void deleteTreasure(Treasure treasure) {

        dragonTreasure.remove(treasure);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DragonCave)) return false;
        DragonCave that = (DragonCave) o;
        return Objects.equals(getDragonTreasure(), that.getDragonTreasure());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDragonTreasure());
    }

    @Override
    public String toString() {
        return "DragonCave{" +
                "dragonTreasure=" + dragonTreasure +
                '}';
    }
}
