package com.go2it.edu.lecture5;

public class Shoes {
    private int size;
    private String material;
    private String brand;
    private Double price;

    public Shoes(){  //default construction

    }

    public Shoes(int size, String material, Double price){
        this.size = size;
        this.material = material;
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public String getBrand() {
        return brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}