package org.shall.AC2019;

class Thing {
    int a;
    long b;
    float c;
    double d;
    String e;
    Object f;
}

public class Chap01 {
   public static void main(String[] args) {

       int[] myArray = {1, 2, 3};
       myArray[1] = 12;
       System.out.println(myArray[2]);

       int z = 98;
       Thing thingB = new Thing();
       thingB.a = 1;
       methodA(z, thingB);

       System.out.println("ThingB.a is " + thingB.a);
       System.out.println("Z is " + z);
   }



    static void methodA(int int1, Thing thing1) {
        thing1.a = 2;

        int number = 1;
        Thing thingA = new Thing();
        thingA.a = 15;

        methodB(thingA);

        int1 = 72;
        System.out.println(int1);
        System.out.println(thingA.e);

        System.out.println("Hello, world!");
    }

    static void methodB(Thing myThing) {

    }


}
