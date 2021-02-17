package com.njrbjava;

public class Main {

    public static void main(String[] args) {
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());
        person1.setName("Thor");
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        System.out.println(person2.getName());
        System.out.println(person2.getEmailAddress());

        VipCustomer person3 = new VipCustomer("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());

        VipCustomer person4 = new VipCustomer("Bruce",1500.0, "thebat@wayne.com");
        System.out.println(person4.getName());
        System.out.println(person4.getEmailAddress());

        VipCustomer person5 = new VipCustomer("Tony", 1300.0);
        System.out.println(person5.getName());
        System.out.println(person5.getCreditLimit());
        System.out.println(person5.getEmailAddress());
    }
}
