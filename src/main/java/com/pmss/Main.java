package com.pmss;

import com.pmss.dao.UserDao;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final UserDao userDao = new UserDao();

    static void main(String[] args) {

        System.out.println("================================");
        System.out.println(" PHARMACY MEDICINE SALES SYSTEM ");
        System.out.println("================================");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.print("Select an Option: ");
        String choice = sc.nextLine();

        switch (choice) {
            case "1":
                break;
            case "2":
                System.out.print("Enter new Username: ");
                String user = sc.nextLine();
                System.out.print("Enter Password: ");
                String pass = sc.nextLine();

                System.out.print("select Role [1] Admin [2] Pharmacist [3] Cashier : ");
                int roleChoice = sc.nextInt();
                String role;
                switch (roleChoice) {
                    case 1:
                        role = "ADMIN";
                        break;
                    case 2:
                        role = "PHARMACIST";
                        break;
                    case 3:
                        role = "CASHIER";
                        break;
                    default:
                        role = null;
                }

                if (role != null) {
                    userDao.registerUser(user, pass, role);
                } else {
                    System.out.println("Invalid Role Selection!");
                }
                break;
        }

    }
}