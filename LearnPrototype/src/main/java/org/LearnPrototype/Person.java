package org.LearnPrototype;

import java.util.Arrays;

public class Person implements Cloneable {

    public String[] names;
    public Address address;


    public Person(String[] names, Address address) {
        this.names = names;
        this.address = address;
    }

    public Person(Person otherPerson){
//        constructorCopying
        this(otherPerson.names,new Address(otherPerson.address));
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", address=" + address +
                '}';
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
//        through  clone method
//        return new Person(names.clone(),(Address)address.clone());
//        through constructor
        return new Person(names.clone(), new Address(address));
    }

}
