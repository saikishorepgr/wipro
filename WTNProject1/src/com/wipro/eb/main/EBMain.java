package com.wipro.eb.main;

import com.wipro.eb.service.ConnectionService;

public class EBMain
{
    public static void main(String[] args) {
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the current month reading:");
        int currentMonthReading = scan.nextInt();
        System.out.println("Please enter the previous month reading:");
        int previousMonthReading = scan.nextInt();
        System.out.println("Please enter the connection type:");
        String connectionType = scan.next();
        ConnectionService connectionService = new ConnectionService();
        System.out.println(connectionService.generateBill(currentMonthReading,previousMonthReading,connectionType));

         */

        ConnectionService cs = new ConnectionService();

        // Domestic Testing

        System.out.println(cs.generateBill(130, 120, "Domestic"));
        //Output bust be 23.0

        System.out.println(cs.generateBill(180, 120, "Domestic"));
        //Output bust be 157.0

        System.out.println(cs.generateBill(280, 120, "Domestic"));
        //Output bust be 655.0

        System.out.println(cs.generateBill(-280, 120, "Domestic"));
        //Output bust be Incorrect Reading

        System.out.println(cs.generateBill(280, -120, "Domestic"));
        //Output bust be Incorrect Reading

        System.out.println(cs.generateBill(100, 120, "Domestic"));
        //Output bust be Incorrect Reading

        System.out.println(cs.generateBill(200, 120, "domestic"));
        //Output bust be Invalid ConnectionType

        System.out.println(cs.generateBill(200, 120, "dom"));
        //Output bust be Invalid ConnectionType


        //Commercial Testing


        System.out.println(cs.generateBill(130, 120, "Commercial"));
        //Output bust be 53.04

        System.out.println(cs.generateBill(180, 120, "Commercial"));
        //Output bust be 334.56

        System.out.println(cs.generateBill(280, 120, "Commercial"));
        //Output bust be 1119.96

        System.out.println(cs.generateBill(-280, 120, "Commercial"));
        //Output bust be Incorrect Reading

        System.out.println(cs.generateBill(280, -120, "Commercial"));
        //Output bust be Incorrect Reading

        System.out.println(cs.generateBill(100, 120, "Commercial"));
        //Output bust be Incorrect Reading

        System.out.println(cs.generateBill(200, 120, "commercial"));
        //Output bust be Invalid ConnectionType

        System.out.println(cs.generateBill(200, 120, "comm"));
        //Output bust be Invalid ConnectionType
    }
}
