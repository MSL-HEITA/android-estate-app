package com.example.comoestate.Domain;

import java.io.Serializable;

public class Item_Domain implements Serializable {

    private String title;
    private String address;
    private String description;
    private int bed;
    private int bath;
    private int price;
    private String pic;
    private boolean Wifi;

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }


    public int getBed() {
        return bed;
    }

    public int getBath() {
        return bath;
    }

    public int getPrice() {
        return price;
    }

    public String getPic() {
        return pic;
    }

    public boolean isWifi() {
        return Wifi;
    }

    public Item_Domain(String title, String address, String description, int bed, int bath, int price, String pic, boolean wifi) {
        this.title = title;
        this.address = address;
        this.description = description;
        this.bed = bed;
        this.bath = bath;
        this.price = price;
        this.pic = pic;
        this.Wifi = wifi;
    }
}
