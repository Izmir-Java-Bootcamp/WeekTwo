package com.kodluyoruz.generics;

public class MainGenerics {
    public static void main(String[] args) {
        Object o = new String("ali");

        Object circle = new Circle(1);


        GenericClass<String> genericClass = new GenericClass<>("ali");
        System.out.println(genericClass.getItem());
        GenericClass<Integer> genericClass1 = new GenericClass<>(1);
        System.out.println(genericClass1.getItem());

        ObjectClass objectClass = new ObjectClass("ali");
        System.out.println(objectClass.getItem());
        ObjectClass objectClass1 = new ObjectClass(1);
        System.out.println(objectClass1.getItem());

    }
}
