package by.it.academy.dragon.bean;

import java.util.Objects;

public class Treasure {

    public static final long serialVersionUID =1;
    private String treasureName;
    private String treasureMaterial;
    private double price;

    public Treasure() {
    }

    public Treasure(String treasureName, String treasureMaterial, double price) {
        this.treasureName = treasureName;
        this.treasureMaterial = treasureMaterial;
        this.price = price;
    }

    public String getTreasureName() {
        return treasureName;
    }

    public void setTreasureName(String treasureName) {
        this.treasureName = treasureName;
    }

    public String getTreasureMaterial() {
        return treasureMaterial;
    }

    public void setTreasureMaterial(String treasureMaterial) {
        this.treasureMaterial = treasureMaterial;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Treasure)) return false;
        Treasure treasure = (Treasure) o;
        return Double.compare(treasure.getPrice(), getPrice()) == 0 && Objects.equals(getTreasureName(), treasure.getTreasureName()) && Objects.equals(getTreasureMaterial(), treasure.getTreasureMaterial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTreasureName(), getTreasureMaterial(), getPrice());
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "treasureName='" + treasureName + '\'' +
                ", treasureMaterial='" + treasureMaterial + '\'' +
                ", price=" + price +
                '}';
    }
}
