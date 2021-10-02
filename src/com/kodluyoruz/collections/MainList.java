package com.kodluyoruz.collections;

import com.kodluyoruz.generics.model.Circle;
import com.kodluyoruz.generics.model.GeometricObject;
import com.kodluyoruz.generics.model.Rectangle;

import java.util.*;

public class MainList {
    public static void main(String[] args) {
        String[] nameArray = new String[3];


        List<String> names = new ArrayList<>();
        System.out.println(names.isEmpty());
        names.add("ali");
        names.add("ahmet");
        printList(names);
        System.out.println("---");
        names.remove("ali");
        printList(names);

        System.out.println("---");

        names = new LinkedList<>();
        names.add("ali");
        names.add("ahmet");
        printList(names);

        System.out.println("---");

        names = new Vector<>();
        names.add("ali");
        names.add("ahmet");
        printList(names);

        Circle circle = new Circle(2);

        List<GeometricObject> geometricObjectList = new LinkedList<>();
        geometricObjectList.add(circle);
        geometricObjectList.add(new Rectangle(2, 2));

        printGeo(geometricObjectList);

        geometricObjectList.remove(circle);
        System.out.println("---");
        printGeo(geometricObjectList);
        System.out.println("List size: " + geometricObjectList.size());

        printGeoArray(geometricObjectList.toArray(new GeometricObject[0]));

        System.out.println("---");

        names = Arrays.asList("ali", "ahmet");
        printList(names);
//        names.add("mert");
//        printList(names);


    }


    private static void printGeoArray(GeometricObject[] arr) {
        for (GeometricObject geo :
                arr) {
            System.out.println(geo);
        }
    }

    private static void printGeo(List<GeometricObject> geometricObjectList) {
        for (GeometricObject geo :
                geometricObjectList) {
            System.out.println(geo);
        }
    }

    private static void printList(List<String> names) {
        for (String name :
                names) {
            System.out.println(name);
        }
    }
}
