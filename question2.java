package com.mycompany.question1;

import java.util.Scanner;

// Interface
interface IConsole {
    String getConsoleType();
    String getStore();
    int getTotalSales();
}

// Abstract Class
abstract class Console implements IConsole {
    private String consoleType;
    private String storeName;
    private int totalSales;

    public Console(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return storeName;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }

    public abstract void printReport();
}

// Subclass
class ConsoleSales extends Console {

    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    @Override
    public void printReport() {
        System.out.println("\n=========================================");
        System.out.println("         CONSOLE SALES REPORT            ");
        System.out.println("=========================================");
        System.out.println("Console Device Type : " + getConsoleType());
        System.out.println("Store Name          : " + getStore());
        System.out.println("Total Sales Amount  : R" + getTotalSales());
        System.out.println("=========================================");
    }
}

// Main Public Class (Name matches question2.java)
public class question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SELECT CONSOLE DEVICE TYPE:");
        System.out.println("1. PlayStation 5");
        System.out.println("2. Xbox Series X");
        System.out.println("3. Nintendo Switch");
        System.out.print("Enter choice (1-3): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        String consoleType;
        switch (choice) {
            case 1:
                consoleType = "PlayStation 5";
                break;
            case 2:
                consoleType = "Xbox Series X";
                break;
            case 3:
                consoleType = "Nintendo Switch";
                break;
            default:
                consoleType = "Generic Console";
                break;
        }

        System.out.print("Enter store name: ");
        String storeName = scanner.nextLine();

        System.out.print("Enter total amount of sales: ");
        int totalSales = scanner.nextInt();

        // Instantiate using abstract parent class reference
        Console salesReport = new ConsoleSales(consoleType, storeName, totalSales);

        // Print report
        salesReport.printReport();

        scanner.close();
    }
}