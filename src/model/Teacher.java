package model;

public class Teacher {
    private String name;
    private int age;
    private String surName;
    private Address address;
    private int amount;
    private int horses;


    public Teacher(String name, int age, String surName, Address address) {
        this.name = name;
        this.age = age;
        this.surName = surName;
        this.address = address;


    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setHorses(int horses) {
        this.horses = horses;
    }

    public int getAmount() {
        return amount * horses;
    }


    public void displayInfo() {
        System.out.println(name + " " + age + " " + surName + " " + address.displayInfo());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
