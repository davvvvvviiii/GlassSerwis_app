package pl.Lenovo;

import java.util.List;

public class Elements {
    private String name;
    private String material;
    private int quantity;
    private List<Technology> technology;
    private boolean ready = false;

    public Elements(String name, String material, int quantity, List<Technology> technology, boolean ready) {
        this.name = name;
        this.material = material;
        this.quantity = quantity;
        this.technology = technology;
        this.ready = ready;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<Technology> getTechnology() {
        return technology;
    }

    @Override
    public String toString() {
        return "Element{" +
                "name='" + name + '\'' +
                ", material='" + material + '\'' +
                ", quantity=" + quantity +
                ", technology=" + technology +
                ", ready=" + isReady() +
                '}';
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }
}
