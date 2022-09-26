package com.emp;

import java.util.ArrayList;
import java.util.Scanner;

public class employee {


        public static void main(String[] args) {
            int choice;
            String empName;
            ArrayList<String> empList = new ArrayList<String>();


            while (true) {
                System.out.println("Select an option");
                System.out.println("1.Add employees");
                System.out.println("2.view all employees");
                System.out.println("3.Exit");

                Scanner sc = new Scanner(System.in);
                choice = sc.nextInt();

                switch (choice)
                {
                    case 1:
                        System.out.println("enter the name of an employee ");
                        empName = sc.next();
                        empList.add(empName);
                        break;
                    case 2:
                        System.out.println(empList);
                        break;
                    case 3:
                        System.out.println("Delete student selected");
                        break;
                    case 4:
                        System.out.println("View all student selected");
                        break;
                    case 5:
                        System.exit(0);


                }
            }
        }
    }




