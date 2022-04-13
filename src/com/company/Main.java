package com.company;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Задача 1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        // Задание 2

        String fullNameForBuh = fullName.toUpperCase(Locale.ROOT);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "  + fullNameForBuh);

        // Задание 3

          String fullName3 = "Иванов Семён Семёнович";
          System.out.println("ФИО сотрудника — " + fullName3.replace('ё', 'е'));

       /* Scanner sc = new Scanner(System.in);
        String nameWithE = sc.nextLine();
        System.out.println("ФИО сотрудника — " + nameWithE.replace('ё', 'е')); */
    }
}
