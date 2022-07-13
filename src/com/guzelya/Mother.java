package com.guzelya;

public class Mother extends Grandma {
    private String homeAddress;

    public Mother(int age, HairColor hair, String homeAddress) {
        super(age, hair);
        this.homeAddress = homeAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    final public String cook(){
        return "Today we will have a dinner";
    }

    public String cook(String dish){
        return "Today for dinner we will have " + dish;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nHome address: " + getHomeAddress();
    }
}
