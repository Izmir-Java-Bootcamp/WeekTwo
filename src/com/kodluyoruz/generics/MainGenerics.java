package com.kodluyoruz.generics;

import com.kodluyoruz.generics.model.Circle;
import com.kodluyoruz.generics.model.Rectangle;

public class MainGenerics {
    public static void main(String[] args) {
        Object o = new String("ali");



        GenericClass<String> genericClass = new GenericClass<>("ali");
        System.out.println(genericClass.getItem());
        GenericClass<Integer> genericClass1 = new GenericClass<>(1);
        System.out.println(genericClass1.getItem());

        ObjectClass objectClass = new ObjectClass("ali");
        System.out.println(objectClass.getItem());
        ObjectClass objectClass1 = new ObjectClass(1);
        System.out.println(objectClass1.getItem());

        System.out.println("----");

        Circle circle = new Circle(1);
        GeometricGeneric<Circle> geometricGeneric= new GeometricGeneric<>(circle);
        System.out.println(geometricGeneric.getGeometricObject().findPerimeter());
        System.out.println(geometricGeneric.findPerimeter());



    }
}
