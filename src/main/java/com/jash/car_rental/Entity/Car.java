package com.jash.car_rental.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Arrays;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;

    private byte[] image;
    private String manufacturer;
    private String model;
    private int year;
    private String bodyType;
    private int mileage;
    private String licenceNumber;
    private String transmission;
    private int price;
    private int seatingCapacity;

    Car(){}

    public Car(int id, byte[] image, String manufacturer, String model, int year, String bodyType, int mileage, String licenceNumber, String transmission, int price, int seatingCapacity) {
        this.id = id;
        this.image = image;
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.bodyType = bodyType;
        this.mileage = mileage;
        this.licenceNumber = licenceNumber;
        this.transmission = transmission;
        this.price = price;
        this.seatingCapacity = seatingCapacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", image=" + Arrays.toString(image) +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", bodyType='" + bodyType + '\'' +
                ", mileage=" + mileage +
                ", licenceNumber='" + licenceNumber + '\'' +
                ", transmission='" + transmission + '\'' +
                ", price=" + price +
                ", seatingCapacity=" + seatingCapacity +
                '}';
    }
}
