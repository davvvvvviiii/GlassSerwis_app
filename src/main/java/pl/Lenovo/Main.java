package pl.Lenovo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Machine> machineList = new ArrayList<>();

        Machine machine = new Machine();
        Elements element = new Elements("koło","355",4, null ,false);

        machine.setName("wiertarka");
        List<Elements> elementsList = new ArrayList<>();
        elementsList.add(element);
        machine.setElements(elementsList);
        machineList.add(machine);

        System.out.println(machine);
        System.out.println(element);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a option");
        System.out.println("1 Create a new machine");
        System.out.println("2 Create a new element");
        System.out.println("3 Show all machines");
        System.out.println("4 Show all elements");

        int option = scanner.nextInt();

        switch (option){
            case 1:
               Metods.createNewMachine(machineList);
                break;
            case 2:

            case 3:
                Metods.showAllMachines(machineList);

        }
    }
}