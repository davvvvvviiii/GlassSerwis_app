package pl.Lenovo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Machine machine = new Machine();
        Elements element = new Elements("koło","355",4, Collections.emptyList() ,false);

        machine.setName("wiertarka");
        List<Elements> elementsList = new ArrayList<>();
        elementsList.add(element);
        machine.setElements(elementsList);


        System.out.println(machine);
        System.out.println(element);
    }
}