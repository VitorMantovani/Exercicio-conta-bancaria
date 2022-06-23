package br.com.application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter account data: ");

            System.out.print("Number: ");
            int number = scanner.nextInt();

            System.out.print("Holder: ");
            String holder = scanner.next();

            System.out.print("Initial balance: ");
            double initial = scanner.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = scanner.nextDouble();

            Account account = new Account(number, holder, initial, withdrawLimit);

            System.out.print("Enter amout to withdraw: ");
            double amout = scanner.nextDouble();

            account.withdraw(amout);

        } catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
        scanner.close();
    }
}
