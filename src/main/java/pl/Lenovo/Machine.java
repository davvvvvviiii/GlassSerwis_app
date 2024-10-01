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
        StringBuilder elementsStr = new StringBuilder();
        for (Elements element : elements) {
            elementsStr.append(element.toString()).append("\n");
        }
        return "Machine{" +
                "name='" + name + '\'' +
                ", elements=" + elementsStr +
                '}';
    }
//        return "Machine{" +
//                "name='" + name + '\'' +
//                ", elements=" + elements +
//                '}';
//    }

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
