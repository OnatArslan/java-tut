package oop;

import java.util.Base64;

public class Main {
    public static void main(String[] args) {


        Car firstCar = new Car("Mercedes");
//        System.out.println(firstCar.getBrand());

//        Account firstAccount = new Account(29112001, 2458.90, "Onat Arslan", "onat@gmail.com", "05376645482");
        /* This will call empty object with default data */
        Account firstAccount = new Account();

        firstAccount.withdraw(1000);
        System.out.println(firstAccount);
//        System.out.println(firstAccount);
    }
}
