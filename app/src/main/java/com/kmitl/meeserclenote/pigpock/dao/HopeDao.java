package com.kmitl.meeserclenote.pigpock.dao;

/**
 * Created by Phuwarin on 4/8/2017.
 */

public class HopeDao {
    private String hopeName;
    private double hopeCurrent;
    private double hopeTarget;

    public HopeDao() {
    }

    public HopeDao(String hopeName, double hopeCurrent, double hopeTarget) {
        this.hopeName = hopeName;
        this.hopeCurrent = hopeCurrent;
        this.hopeTarget = hopeTarget;
    }

    public String getHopeName() {
        return hopeName;
    }

    public void setHopeName(String hopeName) {
        this.hopeName = hopeName;
    }

    public double getHopeCurrent() {
        return hopeCurrent;
    }

    public void setHopeCurrent(double hopeCurrent) {
        this.hopeCurrent = hopeCurrent;
    }

    public double getHopeTarget() {
        return hopeTarget;
    }

    public void setHopeTarget(double hopeTarget) {
        this.hopeTarget = hopeTarget;
    }
}
