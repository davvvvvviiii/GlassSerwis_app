package pl.Lenovo;

import java.util.List;

public class Machine {

    private String name;
    private List<Elements> elements;

    public Machine(String name, List<Elements> elements) {
        this.name = name;
        this.elements = elements;
    }
    public Machine(){
    }

    @Override
    public String toString() {
        StringBuilder elementsNames = new StringBuilder();
        for (Elements element : elements) {
            elementsNames.append(element.getName()).append(", ");
        }

        if (elementsNames.length() > 0) {
            elementsNames.setLength(elementsNames.length() - 2);
        }
        return "Machine{" +
                "name='" + name + '\'' +
                ", elements=" + elementsNames +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Elements> getElements() {
        return elements;
    }

    public void setElements(List<Elements> elements) {
        this.elements = elements;
    }
}
