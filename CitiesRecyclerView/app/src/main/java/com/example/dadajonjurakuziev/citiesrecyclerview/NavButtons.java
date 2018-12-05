package com.example.dadajonjurakuziev.citiesrecyclerview;

public class NavButtons {
    private int id;
    private int btn_image;
    private String btn_name;
    private String btn_city_title;

    public NavButtons(int id, int btn_image, String btn_name, String btn_city_title) {
        this.id = id;
        this.btn_image = btn_image;
        this.btn_name = btn_name;
        this.btn_city_title = btn_city_title;
    }

    public int getId() {
        return id;
    }

    public int getBtn_image() {
        return btn_image;
    }

    public String getBtn_name() { return btn_name; }

    public String getBtn_city_title() { return btn_city_title; }
}
