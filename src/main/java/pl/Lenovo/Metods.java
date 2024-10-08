package pl.Lenovo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Metods {
    public static void createNewMachine(List<Machine> machineList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the new machine:");

        String baseName = scanner.nextLine();
        String newMachineName = baseName;

        int counter = 1;
        while (machineExists(newMachineName, machineList)) {
            newMachineName = baseName + counter;
            counter++;
        }

        Machine newMachine = new Machine();
        newMachine.setName(newMachineName);

        machineList.add(newMachine);
        System.out.println("Created a new machine: " + newMachineName);
    }
    public static boolean machineExists(String name, List<Machine> machineList) {
        for (Machine machine : machineList) {
            if (machine.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    public static void showAllMachines(List<Machine> machineList) {
        System.out.println("Machines:");
        for (Machine machine : machineList) {
            System.out.println("1 "+machine.getName());
        }
    }

    public static void createNewElement(List<Machine> machineList){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Material: ");
        String Material = scanner.nextLine();
        System.out.println("Quantity ");
        int quantity = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Choose a technology: ");
        List<Technology> technologies = getAvailableTechnologies();
        for (int i = 0; i < technologies.size(); i++){
            System.out.println((i+1)+" " + technologies.get(i).getClass().getSimpleName());
        }
        List<Technology> selectedTechnologies = new ArrayList<>();
        System.out.println("Enter the technology numbers separated by a comma");
        String[] chosenTechnologyIndices = scanner.nextLine().split(",");

        for (String index : chosenTechnologyIndices) {
            int technologyIndex = Integer.parseInt(index.trim()) - 1;
            if (technologyIndex >= 0 && technologyIndex < technologies.size()) {
                selectedTechnologies.add(technologies.get(technologyIndex));
            }
        }

        Elements elements = new Elements(name, Material, quantity, selectedTechnologies, false);

        System.out.println("Choose a machine:");
        showAllMachines(machineList);

        int machineNumber = scanner.nextInt();
        for (int i = 0; i<machineList.size(); i++){
            if (i==machineNumber){
                Machine machine = machineList.get(i);
                machine.setElements((List<Elements>) elements);
                System.out.println(machine.toString());
            }
        }
    }
    public static List<Technology> getAvailableTechnologies() {
        List<Technology> technologies = new ArrayList<>();
        technologies.add(new Cutting(false));
        technologies.add(new Milling(false));
        return technologies;
    }
}
