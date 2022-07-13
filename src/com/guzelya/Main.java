package com.guzelya;

public class Main {

    public static void main(String[] args) {
        Mother mother = new Mother(36, HairColor.BLACK, "Chuy 1");
        System.out.println(mother.getInfo());
        System.out.println(mother.cook());
        System.out.println(mother.cook("chicken"));

        System.out.println();

        School school = new School("isk", 9);
        Daughter daughter = new Daughter(15, HairColor.BROWN, "Chuy 2", school );
        System.out.println(daughter.getInfo());
        System.out.println(daughter.cook());
        System.out.println(daughter.cook("rice with meat"));

        System.out.println();

        School school1 = new School("agahan", 8);
        Daughter daughter1 = new Daughter(14, HairColor.WHITE, "Chuy 3", school1);
        System.out.println(daughter1.getInfo());
        System.out.println(daughter1.cook());
        System.out.println(daughter1.cook("pie"));
    }
}
