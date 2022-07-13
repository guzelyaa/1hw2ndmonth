package com.guzelya;

public class Grandma {
    private int age;
    private HairColor hair;

    public Grandma(int age, HairColor hair) {
        this.age = age;
        this.hair = hair;
    }

    public int getAge() {
        return age;
    }

    public HairColor getHair() {
        return hair;
    }

    public String getInfo(){
        return  "Age: " + getAge() +
                "\nHair color: " + getHair();
    }
}
