package com.mycompany.question1;

public class Question1 {

    public static void main(String[] args) {
        // 1D Array for City Names
        String[] cities = {"Cape Town", "Port Elizabeth (PE)", "Pretoria"};

        // 1D Array for Console Categories
        String[] consoles = {"PS5", "Xbox", "Nintendo Switch"};

        // 2D Array for Sales Data
        int[][] salesData = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // PE
            {1500, 3000, 1200}  // Pretoria
        };

        // Display Header Report
        System.out.println("=========================================================================");
        System.out.println("                   NUMBER 1 ELECTRONICS FRANCHISE                        ");
        System.out.println("                       YEARLY SALES REPORT                               ");
        System.out.println("=========================================================================");
        System.out.printf("%-20s %-12s %-12s %-18s %-12s%n", "City", consoles[0], consoles[1], consoles[2], "Total Sales");
        System.out.println("-------------------------------------------------------------------------");

        int topCityIndex = 0;
        int maxSalesTotal = 0;

        // Loop through cities (rows)
        for (int i = 0; i < cities.length; i++) {
            int cityTotalSales = 0;

            // Loop through consoles (columns) to compute row total
            for (int j = 0; j < salesData[i].length; j++) {
                cityTotalSales += salesData[i][j];
            }

            // Display row details
            System.out.printf("%-20s %-12d %-12d %-18d %-12d%n",
                    cities[i],
                    salesData[i][0],
                    salesData[i][1],
                    salesData[i][2],
                    cityTotalSales);

            // Determine city with highest sales
            if (cityTotalSales > maxSalesTotal) {
                maxSalesTotal = cityTotalSales;
                topCityIndex = i;
            }
        }

        // Summary Highlights
        System.out.println("=========================================================================");
        System.out.println("SUMMARY HIGHLIGHTS");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Top Performing City  : " + cities[topCityIndex]);
        System.out.println("Highest Console Sales: " + maxSalesTotal + " units");
        System.out.println("=========================================================================");
    }
}