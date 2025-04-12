package pl.Lenovo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Machine> machineList = new ArrayList<>();

        Machine machine = new Machine();
        Elements element = new Elements("koło", "355", 4, null, false);

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
        System.out.println("5 Exit");

        int option = scanner.nextInt();
        boolean running = true;
        while(running) {
            switch (option) {
                case 1:
                    Methods.createNewMachine(machineList);
                    break;
                case 2:
                    Methods.createNewElement(machineList);
                case 3:
                    Methods.showAllMachines(machineList);
                case 4:

                case 5:
                    running = false;
                    break;
            }
        }
    }
}