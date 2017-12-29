package main;

import main.model.Tire;
import main.services.TireService;

import java.util.Scanner;

public class Application {


    public static void main(String[] args)
    {
        TireService tireService = new TireService();
        System.out.println("Welcome to the TireShop");
        Scanner scanner = new Scanner(System.in);
        int action = scanner.nextInt();
        switch (action) {
            case 0:
                System.out.println(tireService.getAllTires());
                break;
            case 1:
                System.out.println("Enter tire data:");
                System.out.println("----------:");
                System.out.println("Enter model:");
                String model = scanner.next();
                System.out.println("Enter manufacturer:");
                String manufacturer = scanner.next();
                System.out.println("Enter price:");
                double price = scanner.nextDouble();
                tireService.insertTire(new Tire(model, manufacturer, price));
        }

    }
}
