package controllers;

import models.Road;
import models.Downhill;
import java.util.Arrays;
import java.util.Scanner;

public class RunController {

    public static void main(String[] args) {
        RunController runController = new RunController();
        runController.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w kreatorze rowera, masz do wyboru dwa typy (Downhill) albo (Road)");
        String decision = scanner.nextLine();

        switch (decision) {
            case "Downhill" -> {
                Downhill downhill = new Downhill();
                downhill.welcome(decision);
                breakLine();
                System.out.println("Podaj producenta");
                downhill.setBrand(scanner.nextLine());
                System.out.println("Podaj typ amortyzacji");
                downhill.setSuspension(scanner.nextLine());
                System.out.println("Podaj z jakiego rocznika");
                downhill.setAge(Integer.parseInt(scanner.nextLine()));
                System.out.println("Podaj również jego kolor");
                downhill.setColour(scanner.nextLine());

                System.out.println(Arrays.toString(downhill.DownhillData()));
            }
            case "Road" -> {
                Road road = new Road();
                road.welcome(decision);
                breakLine();
                System.out.println("Podaj producenta");
                road.setBrand(scanner.nextLine());
                System.out.println("Podaj typ roweru szosowego");
                road.setType(scanner.nextLine());
                System.out.println("Podaj z jakiego rocznika");
                road.setAge(Integer.parseInt(scanner.nextLine()));
                System.out.println("Podaj również jego kolor");
                road.setColour(scanner.nextLine());

                System.out.println(Arrays.toString(road.RoadData()));
            }
            default -> {
                System.out.println("Nie wybrałeś żadnego z wymienionych typów.");
                run();
            }
        }
        breakLine();
        System.out.println("Pa pa");
    }

    private void breakLine() {
        System.out.println("-------------------------");
    }
}
