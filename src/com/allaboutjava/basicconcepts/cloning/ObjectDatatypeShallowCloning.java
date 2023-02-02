package com.allaboutjava.basicconcepts.cloning;

public class ObjectDatatypeShallowCloning {

  static class Address {

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
    public Object clone() throws CloneNotSupportedException {
      return super.clone();
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
    clonedTourise.getAddress().setState("Kerala");
    System.out.println("Original tourist object - " + tourist.toString());
    System.out.println("Cloned tourist object - " + clonedTourise.toString());
  }

}
