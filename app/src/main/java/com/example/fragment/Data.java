package com.example.fragment;

public class Data {
    private String imageResource;
    private String name;
    private String address;


    public Data(String imageResource, String name, String address) {
        this.imageResource = imageResource;
        this.name = name;
        this.address = address;
    }

    public String getImageResource() {
        return imageResource;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
