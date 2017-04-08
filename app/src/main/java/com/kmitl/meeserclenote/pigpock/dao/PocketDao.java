package com.kmitl.meeserclenote.pigpock.dao;

/**
 * Created by Phuwarin on 4/8/2017.
 */

public class PocketDao {
    private String pocketNumber;
    private String pocketName;
    private double pocketPercentage;
    private int pocketAmount;

    public PocketDao() {
    }

    public PocketDao(String pocketNumber, String pocketName, double pocketPercentage, int pocketAmount) {
        this.pocketNumber = pocketNumber;
        this.pocketName = pocketName;
        this.pocketPercentage = pocketPercentage;
        this.pocketAmount = pocketAmount;
    }

    public String getPocketNumber() {
        return pocketNumber;
    }

    public void setPocketNumber(String pocketNumber) {
        this.pocketNumber = pocketNumber;
    }

    public String getPocketName() {
        return pocketName;
    }

    public void setPocketName(String pocketName) {
        this.pocketName = pocketName;
    }

    public double getPocketPercentage() {
        return pocketPercentage;
    }

    public void setPocketPercentage(double pocketPercentage) {
        this.pocketPercentage = pocketPercentage;
    }

    public int getPocketAmount() {
        return pocketAmount;
    }

    public void setPocketAmount(int pocketAmount) {
        this.pocketAmount = pocketAmount;
    }
}
