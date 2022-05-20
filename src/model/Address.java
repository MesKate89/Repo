package model;

public class Address {

    private String street;
    private int homeNumber;
    private boolean checkShop;

    public void setCheckShop(boolean checkShop) {
        this.checkShop = checkShop;
    }

    public boolean isCheckShop() {
        return checkShop;
    }

    public Address(int homeNumber, boolean checkShop) {
        this.homeNumber = homeNumber;
        this.checkShop = checkShop;
    }

    public Address(String street, int homeNumber) {
        this.street = street;
        this.homeNumber = homeNumber;
    }

    public String displayInfo() {
        return street + " " + homeNumber;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getStreet() {
        return street;
    }

    public int getHomeNumber() {
        return homeNumber;
    }
}
