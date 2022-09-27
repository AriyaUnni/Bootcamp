package com.resturant;

import java.util.Scanner;

public class hotel {


        static int total=0;
        public static void main(String[] args) {

            int y;

            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("enter the choice");
                System.out.println("1.Tea 10$");
                System.out.println("2.coffee 20$");
                System.out.println("3.Cool Drinks 35$");
                System.out.println("4.Peri peri Potato) 15$");
                System.out.println("5.Deserts 25$");
                System.out.println("6.BILL");
                System.out.println("7.exit");
                y=sc.nextInt();

                switch (y) {
                    case 1:
                        System.out.println("how many quantity");
                        int m = sc.nextInt();
                        total = (10 * m) + total;
                        break;
                    case 2:
                        System.out.println("how many quantity");
                        int n = sc.nextInt();
                        total = (20 * n) + total;
                        break;
                    case 3:
                        System.out.println("how many quantity");
                        int o = sc.nextInt();
                        total = (35* o) + total;
                        break;
                    case 4:
                        System.out.println("how many quantity");
                        int l = sc.nextInt();
                        total = (15 * l) + total;
                        break;
                    case 5:
                        System.out.println("how many quantity");
                        int p = sc.nextInt();
                        total = (25 * p) + total;
                        break;
                    case 6:System.out.println("total bill="+total);
                        break;
                    case 7:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("invalid input");
                }
            }

        }
    }

