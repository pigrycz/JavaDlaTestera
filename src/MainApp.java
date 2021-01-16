import model.computer.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainApp {

    public static void main(String[] args) {

        List<Computer> computers = new ArrayList<>();
        computers.add(new Laptop("MB PRO 1", "PRO 1", new Hdd("Apple", 500), new Ram("Brand", 128), 100));
        computers.add(new Laptop("MB PRO 2", "PRO 2", new Hdd("Apple", 500), new Ram("Brand", 128), 100));
        computers.add(new Laptop("MB PRO 3", "PRO 3", new Hdd("Apple", 256), new Ram("Brand", 128), 100));
        computers.add(new Laptop("MB PRO 4", "PRO 4", new Hdd("Apple", 500), new Ram("Brand", 128), 100));
        computers.add(new PC("PC 1", "BBB", new Hdd("Dell", 500), new Ram("Brand", 128)));
        computers.add(new PC("PC 2", "AAA", new Hdd("Dell", 256), new Ram("Brand", 256)));
        computers.add(new PC("PC 3", "BBB", new Hdd("Dell", 500), new Ram("Brand", 128)));

        // Zadanie 1.
        long count = computers.stream()
                .filter(computer -> computer.getRam().getSize() > 128)
                .count();

        System.out.println(count);

        // Zadanie 2.
        List<String> typyKompów = computers.stream()
                .map(computer -> computer.getType())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(typyKompów);

        // Zadanie 3.
        Optional<Computer> maxRam = computers.stream()
                .max(Comparator.comparingInt((computer -> computer.getRam().getSize())));

        maxRam.ifPresentOrElse(computer -> System.out.println(computer), () -> System.out.println("Nie ma komputerów na liście"));

        // Zadanie 4.
        List<Computer> lessThan500Hdd = computers.stream()
                .filter(computer -> computer.getHdd().getSize() < 500)
                .collect(Collectors.toList());

        System.out.println(lessThan500Hdd);

        // Zadanie 5.
        List<Computer> sorted = computers.stream()
                .sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType))
                .collect(Collectors.toList());

        System.out.println(sorted);

        // Zadanie 6.
        // get()
        System.out.println(maxRam.get());

        // isPresent()
        if (maxRam.isPresent()){
            System.out.println(maxRam.get());
        } else {
            System.out.println("Nie ma takich komputerów");
        }

        // isEmpty()
        if (maxRam.isEmpty()){
            System.out.println("Dodaj jakiś komputer");
        } else {
            System.out.println(maxRam.get());
        }

        // orElse()
        computers.get(0).switchOn();

        Boolean aBoolean = computers.stream()
                .map(Computer::getState)
                .filter(state -> state.equals(true))
                .findFirst()
                .orElse(false);

        System.out.println(aBoolean);

        // orElseGet()
        Computer computer1 = computers.stream()
                .filter(computer -> computer.getState() == true)
                .findFirst()
                .orElseGet(() -> new Laptop("WłączonyLaptop", "Lapek", new Hdd("Brand", 122), new Ram("RAM", 32), 100));

        if (computer1.getState() == false) {
            computer1.switchOn();
        }

        System.out.println(computer1);

        // orElseThrow()
        computers.stream()
                .filter(computer -> computer.getState() == true)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("at least one computer should be running"));

        //ifPresent()
        computers.stream()
                .filter(computer -> computer.getType() == "AAA")
                .findFirst()
                .ifPresent(computer -> System.out.println(computer));

        // ifPresentOrElse()
        computers.stream()
                .filter(computer -> computer.getType() == "CCC")
                .findFirst()
                .ifPresentOrElse(computer -> System.out.println(computer), () -> System.out.println("Nie ma komputerów o wybranym typie"));
    }
}