package org.LearnPrototype;
import org.apache.commons.lang3.SerializationUtils;
//In Shallow copy, a copy of the original object is stored and only the reference address is
//        finally copied. In Deep copy, the copy of the original object and the repetitive copies both are stored.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
    Person alvin =  new Person(new String[]{"Alvin", "tk","test"},new Address("streetName",38));

//    shallow copy
    Person jane = alvin;

//    DeepCopying

        Person calvin = (Person) alvin.clone();
        calvin.names[0] = "Calvin";
        calvin.address.houseNumber = 1234;
        calvin.address.streetName = "Wolf";
        System.out.println("Alvin " + alvin.toString());
        System.out.println("jane shallowCopy" + jane.toString());
        System.out.println("Calvin DeepCopy" + calvin.toString());

//        constructorCopy
        Person john = new Person(alvin);

        john.names[0] = "john";
        john.address.houseNumber = 563;
        john.address.streetName = "canary Wolf";

        System.out.println("Deep copying through constuctor " + john.toString());


//        CopyingThroughSerialization

        Employee alvinJavaDev = new Employee(50000,"Mid level dev");

        Employee calvinJavaDev =  SerializationUtils.roundTrip(alvinJavaDev);

        calvinJavaDev.position = "juniorDev";
        calvinJavaDev.salary = 40000;

        System.out.println("alvin serilization  " + alvinJavaDev);
        System.out.println("calvin serilazation" + calvinJavaDev);

    }
}