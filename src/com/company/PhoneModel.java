package com.company;

public  abstract class PhoneModel {

   abstract void switchOff();

   abstract void switchOn();

   abstract void messageTone();

   public String makeCall(int dialNumber){

       return dialNumber + "\n Calling";
   }

   public void makeCall(){
      System.out.println("No number given");
   }

}
