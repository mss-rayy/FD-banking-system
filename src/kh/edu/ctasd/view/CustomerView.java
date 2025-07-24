package kh.edu.ctasd.view;

import kh.edu.ctasd.controller.CustomerController;

import java.util.Scanner;

public class CustomerView {

    public static void customerFeature(){
//        1. get customer
        System.out.print("1. View customer");

        System.out.print("Enter option");
        int option = new Scanner(System.in).nextInt();

        switch(option){
            case 1: {
                System.out.println("View Customer");

                CustomerController controller = new CustomerController();

                System.out.println("before");

                controller.getCustomers();

                break;
            }
            default: {
                System.out.println("Invalid option");
            }
        }
    }
}
