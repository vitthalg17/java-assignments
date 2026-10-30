package com.vitthal.registration;

import java.util.Scanner;
import java.util.Set;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public class RegistrationApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hackathon Registration");
        System.out.println("-------------------------");

        System.out.print("Enter Name:");
        String name = sc.nextLine();

        System.out.print("Enter Email:");
        String email = sc.nextLine();

        System.out.print("Enter Age:");
        int age = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Enter Phone:");
        String phone = sc.nextLine();

        Participant p = new Participant(name, email, age, phone);

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Participant>> errors = validator.validate(p);

        System.out.println("-------------------------");
        if (errors.isEmpty()) {
            System.out.println("Registration successful, welcome " + p.getName() + "!");
        }
        else {
            System.out.println("Registration failed:");
            for (ConstraintViolation<Participant> e : errors) {
                System.out.println("  " + e.getPropertyPath() + " : " + e.getMessage());
            }
        }

        factory.close();
        sc.close();
    }
}
