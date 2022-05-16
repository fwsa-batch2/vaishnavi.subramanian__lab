package com.works;

public class wrapper {
    public static void main(String[] args) {
        // ------------Integer------------
        // autoboxing
        int a = 22;
        Integer objA = Integer.valueOf(a);
        Integer objB = a;
        System.out.println("Changing primitive to object : " + objA);
        System.out.println("Changing primitive to object : " + objB);

        // unboxing
        Integer objC=10;
        int integer1 = objC.intValue();
        int integer= objB;
        System.out.println("Changing object to primitive : " + integer1);
        System.out.println("Changing object to primitive : " + integer);

        // ------------Float------------
        float number7 = 12.23F;
        Float obj = Float.valueOf(number7);
        Float obj2 = number7;
        System.out.println("Changing primitive to object : " + obj);
        System.out.println("Changing primitive to object : " + obj2);

        Float object = 435.344F;
        float number1 = object.floatValue();
        float number2 = object;
        System.out.println("Changing object to primitive : " + number1);
        System.out.println("Changing object to primitive : " + number2);

        // ------------Boolean------------
        boolean myBoolean = true;
        Boolean objBool1 = Boolean.valueOf(myBoolean);
        Boolean objBool2 = myBoolean;
        System.out.println("Changing primitive to object : " + objBool1);
        System.out.println("Changing primitive to object : " + objBool2);

        Boolean objbool = false;
        boolean value1 = objbool.booleanValue();
        boolean value2 = objbool;
        System.out.println("Changing object to primitive : " + value1);
        System.out.println("Changing object to primitive : " + value2);

        // ------------Character------------
        char mychar = 'M';
        Character charObj1 = Character.valueOf(mychar);
        Character charObj2 = mychar;
        System.out.println("Changing primitive to object : " + charObj1);
        System.out.println("Changing primitive to object : " + charObj2);

        Character objectCharact = 'F';
        char character1 = objectCharact.charValue();
        char character2 = objectCharact;
        System.out.println("Changing object to primitive : " + character1);
        System.out.println("Changing object to primitive : " + character2);

        // ------------toString------------
        Integer number = 100;
        String myString = number.toString();
        System.out.println("Length of number is " + myString.length());

    }
}
