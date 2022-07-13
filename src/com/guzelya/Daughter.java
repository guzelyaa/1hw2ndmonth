package com.guzelya;

 final public class Daughter extends Mother {
     private School school;


     public Daughter(int age, HairColor hair, String homeAddress, School school) {
         super(age, hair, homeAddress);
         this.school = school;
     }

     public School getSchool() {
         return school;
     }

     @Override
     public String cook(String dish) {
         return super.cook(dish) + " and surprise for dessert";
     }

     @Override
     public String getInfo() {
         return super.getInfo() +
                 "\nSchool name: " + school.getSchoolName()+
                 "\nGrade: " + school.getGrade();
     }
 }
