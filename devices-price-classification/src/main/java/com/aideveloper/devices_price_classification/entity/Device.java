package com.aideveloper.devices_price_classification.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Device specifications
    private int batteryPower;
    private boolean hasBluetooth;
    private double clockSpeed;
    private boolean hasDualSim;
    private double frontCamera;
    private boolean has4G;
    private int internalMemory;
    private double mobileDepth;
    private double mobileWeight;
    private int numberOfCores;
    private double primaryCamera;
    private int pixelResolutionHeight;
    private int pixelResolutionWidth;
    private int ram;
    private double screenHeight;
    private double screenWidth;
    private int talkTime;
    private boolean has3G;
    private boolean hasTouchScreen;
    private boolean hasWifi;

    // Target variable
    private int priceRange;

    // Constructors
    public Device() {
    }

    public Device(int batteryPower, boolean hasBluetooth, double clockSpeed, boolean hasDualSim, double frontCamera, boolean has4G, int internalMemory, double mobileDepth, double mobileWeight, int numberOfCores, double primaryCamera, int pixelResolutionHeight, int pixelResolutionWidth, int ram, double screenHeight, double screenWidth, int talkTime, boolean has3G, boolean hasTouchScreen, boolean hasWifi, int priceRange) {
        this.batteryPower = batteryPower;
        this.hasBluetooth = hasBluetooth;
        this.clockSpeed = clockSpeed;
        this.hasDualSim = hasDualSim;
        this.frontCamera = frontCamera;
        this.has4G = has4G;
        this.internalMemory = internalMemory;
        this.mobileDepth = mobileDepth;
        this.mobileWeight = mobileWeight;
        this.numberOfCores = numberOfCores;
        this.primaryCamera = primaryCamera;
        this.pixelResolutionHeight = pixelResolutionHeight;
        this.pixelResolutionWidth = pixelResolutionWidth;
        this.ram = ram;
        this.screenHeight = screenHeight;
        this.screenWidth = screenWidth;
        this.talkTime = talkTime;
        this.has3G = has3G;
        this.hasTouchScreen = hasTouchScreen;
        this.hasWifi = hasWifi;
        // this.priceRange = priceRange;
    }
    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(double clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public boolean isHasDualSim() {
        return hasDualSim;
    }

    public void setHasDualSim(boolean hasDualSim) {
        this.hasDualSim = hasDualSim;
    }

    public double getFrontCamera() {
        return frontCamera;
    }

    public void setFrontCamera(double frontCamera) {
        this.frontCamera = frontCamera;
    }

    public boolean isHas4G() {
        return has4G;
    }

    public void setHas4G(boolean has4G) {
        this.has4G = has4G;
    }

    public int getInternalMemory() {
        return internalMemory;
    }

    public void setInternalMemory(int internalMemory) {
        this.internalMemory = internalMemory;
    }

    public double getMobileDepth() {
        return mobileDepth;
    }

    public void setMobileDepth(double mobileDepth) {
        this.mobileDepth = mobileDepth;
    }

    public double getMobileWeight() {
        return mobileWeight;
    }

    public void setMobileWeight(double mobileWeight) {
        this.mobileWeight = mobileWeight;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public double getPrimaryCamera() {
        return primaryCamera;
    }

    public void setPrimaryCamera(double primaryCamera) {
        this.primaryCamera = primaryCamera;
    }

    public int getPixelResolutionHeight() {
        return pixelResolutionHeight;
    }

    public void setPixelResolutionHeight(int pixelResolutionHeight) {
        this.pixelResolutionHeight = pixelResolutionHeight;
    }

    public int getPixelResolutionWidth() {
        return pixelResolutionWidth;
    }

    public void setPixelResolutionWidth(int pixelResolutionWidth) {
        this.pixelResolutionWidth = pixelResolutionWidth;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(double screenHeight) {
        this.screenHeight = screenHeight;
    }

    public double getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(double screenWidth) {
        this.screenWidth = screenWidth;
    }

    public int getTalkTime() {
        return talkTime;
    }

    public void setTalkTime(int talkTime) {
        this.talkTime = talkTime;
    }

    public boolean isHas3G() {
        return has3G;
    }

    public void setHas3G(boolean has3G) {
        this.has3G = has3G;
    }

    public boolean isHasTouchScreen() {
        return hasTouchScreen;
    }

    public void setHasTouchScreen(boolean hasTouchScreen) {
        this.hasTouchScreen = hasTouchScreen;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public int getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(int priceRange) {
        this.priceRange = priceRange;
    }

    // toString method
    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", batteryPower=" + batteryPower +
                ", hasBluetooth=" + hasBluetooth +
                ", clockSpeed=" + clockSpeed +
                ", hasDualSim=" + hasDualSim +
                ", frontCamera=" + frontCamera +
                ", has4G=" + has4G +
                ", internalMemory=" + internalMemory +
                ", mobileDepth=" + mobileDepth +
                ", mobileWeight=" + mobileWeight +
                ", numberOfCores=" + numberOfCores +
                ", primaryCamera=" + primaryCamera +
                ", pixelResolutionHeight=" + pixelResolutionHeight +
                ", pixelResolutionWidth=" + pixelResolutionWidth +
                ", ram=" + ram +
                ", screenHeight=" + screenHeight +
                ", screenWidth=" + screenWidth +
                ", talkTime=" + talkTime +
                ", has3G=" + has3G +
                ", hasTouchScreen=" + hasTouchScreen +
                ", hasWifi=" + hasWifi +
                ", priceRange=" + priceRange +
                '}';
    }
}
