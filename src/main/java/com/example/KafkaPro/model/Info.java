package com.example.KafkaPro.model;

public class Info {
    private String stop_id;
    private String stop_name;
    private String station_name;
    private String station_descriptive_name;
    private String station_id;
    private String order_;
    private String red;
    private String blue;
    private String green;
    public String direction_id;

    public String getDirection_id() {
        return direction_id;
    }

    public void setDirection_id(String direction_id) {
        this.direction_id = direction_id;
    }


    public Info(){

    }
    public Info(String stop_id, String stop_name, String station_name, String station_descriptive_name, String station_id, String order_, String red, String blue, String green) {
        this.stop_id = stop_id;
        this.stop_name = stop_name;
        this.station_name = station_name;
        this.station_descriptive_name = station_descriptive_name;
        this.station_id = station_id;
        this.order_ = order_;
        this.red = red;
        this.blue = blue;
        this.green = green;
    }
    public String getStop_id() {
        return stop_id;
    }
    public void setStop_id(String stop_id) {
        this.stop_id = stop_id;
    }
    public String getStop_name() {
        return stop_name;
    }
    public void setStop_name(String stop_name) {
        this.stop_name = stop_name;
    }
    public String getStation_name() {
        return station_name;
    }
    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }
    public String getStation_descriptive_name() {
        return station_descriptive_name;
    }
    public void setStation_descriptive_name(String station_descriptive_name) {
        this.station_descriptive_name = station_descriptive_name;
    }
    public String getStation_id() {
        return station_id;
    }
    public void setStation_id(String station_id) {
        this.station_id = station_id;
    }
    public String getOrder_() {
        return order_;
    }
    public void setOrder_(String order_) {
        this.order_ = order_;
    }
    public String getRed() {
        return red;
    }
    public void setRed(String red) {
        this.red = red;
    }
    public String getBlue() {
        return blue;
    }
    public void setBlue(String blue) {
        this.blue = blue;
    }
    public String getGreen() {
        return green;
    }
    public void setGreen(String green) {
        this.green = green;
    }
}
