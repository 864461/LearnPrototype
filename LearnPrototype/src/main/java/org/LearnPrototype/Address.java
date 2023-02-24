package org.LearnPrototype;

public class Address implements Cloneable {

    public String streetName;
    public int houseNumber;


    public Address(String streetName, int houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

//    copying through constructor
    public Address(Address other){
        this(other.streetName, other.houseNumber);
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
//        deep copy
        return new Address(streetName,houseNumber);
    }

}
