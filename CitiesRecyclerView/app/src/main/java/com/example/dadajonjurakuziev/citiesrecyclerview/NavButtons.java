package com.example.dadajonjurakuziev.citiesrecyclerview;

public class NavButtons {
    private int id;
    private int btn_image;
    private String btn_name;

    public NavButtons(int id, int btn_image, String btn_name) {
        this.id = id;
        this.btn_image = btn_image;
        this.btn_name = btn_name;
    }

    public int getId() {
        return id;
    }

    public int getBtn_image() {
        return btn_image;
    }

    public String getBtn_name() {
        return btn_name;
    }
}
