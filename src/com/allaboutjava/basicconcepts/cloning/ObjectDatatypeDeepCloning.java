package com.allaboutjava.basicconcepts.cloning;

import java.util.Objects;

public class ObjectDatatypeDeepCloning {

  static class Address implements Cloneable {

    int laneNumber;
    String area;
    String state;
    String country;

    public Address(int laneNumber, String area, String state, String country) {
      this.laneNumber = laneNumber;
      this.area = area;
      this.state = state;
      this.country = country;
    }

    public int getLaneNumber() {
      return laneNumber;
    }

    public void setLaneNumber(int laneNumber) {
      this.laneNumber = laneNumber;
    }

    public String getArea() {
      return area;
    }

    public void setArea(String area) {
      this.area = area;
    }

    public String getState() {
      return state;
    }

    public void setState(String state) {
      this.state = state;
    }

    public String getCountry() {
      return country;
    }

    public void setCountry(String country) {
      this.country = country;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Address address = (Address) o;
      return laneNumber == address.laneNumber && Objects.equals(area, address.area)
          && Objects.equals(state, address.state) && Objects.equals(country,
          address.country);
    }

    @Override
    public int hashCode() {
      return Objects.hash(laneNumber, area, state, country);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
      return super.clone();
    }

    @Override
    public String toString() {
      return "Address{" +
          "laneNumber=" + laneNumber +
          ", area='" + area + '\'' +
          ", state='" + state + '\'' +
          ", country='" + country + '\'' +
          '}';
    }
  }

  static class Tourist implements Cloneable {

    int age;
    String name;
    Address address;

    public Tourist(int age, String name,
        Address address) {
      this.age = age;
      this.name = name;
      this.address = address;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public Address getAddress() {
      return address;
    }

    public void setAddress(Address address) {
      this.address = address;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Tourist tourist = (Tourist) o;
      return age == tourist.age && name.equals(tourist.name) && address.equals(tourist.address);
    }

    @Override
    public int hashCode() {
      return Objects.hash(age, name, address);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
      Tourist tourist = (Tourist) super.clone();
      Address temp = tourist.getAddress();
      tourist.setAddress(
          new Address(temp.getLaneNumber(), temp.getArea(), temp.getState(), temp.getCountry()));
      return tourist;
    }

    @Override
    public String toString() {
      return "Tourist{" +
          "age=" + age +
          ", name='" + name + '\'' +
          ", address=" + address +
          '}';
    }
  }

  public static void main(String[] args) throws CloneNotSupportedException {
    Tourist tourist = new Tourist(33, "Sadiq", new Address(1, "Vijinpura", "Karnataka", "India"));
    Tourist clonedTourise = (Tourist) tourist.clone();
    clonedTourise.setAge(34);
    clonedTourise.setName("Sarine");
    clonedTourise.getAddress().setArea("Ernakulam");
    clonedTourise.getAddress().setState("Kerala");
    System.out.println("Original tourist object - " + tourist.toString());
    System.out.println("Cloned tourist object - " + clonedTourise.toString());
  }

}
