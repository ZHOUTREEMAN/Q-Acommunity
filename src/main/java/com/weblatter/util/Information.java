package com.weblatter.util;

public class Information<T> {
    String tip;
    T mainData;

    public Information(String t, T data){
        this.tip = t;
        this.mainData = data;
    }

    public String getTip() {
        return tip;
    }

    public T getMainData() {
        return mainData;
    }

    public void setMainData(T mainData) {
        this.mainData = mainData;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
