package com.example.gk_ghe_04;

import java.io.Serializable;

public class Ghe  implements Serializable {
    private String tvName;
    private int tvGia;
    private int imageview, tvSoluong;


    public Ghe(String tvName, int tvGia, int imageview, int tvSoluong) {
        this.tvName = tvName;
        this.tvGia = tvGia;
        this.imageview = imageview;
        this.tvSoluong = tvSoluong;
    }

    public String getTvName() {
        return tvName;
    }

    public void setTvName(String tvName) {
        this.tvName = tvName;
    }

    public int getTvGia() {
        return tvGia;
    }

    public void setTvGia(int tvGia) {
        this.tvGia = tvGia;
    }

    public int getImageview() {
        return imageview;
    }

    public void setImageview(int imageview) {
        this.imageview = imageview;
    }

    public int getTvSoluong() {
        return tvSoluong;
    }

    public void setTvSoluong(int tvSoluong) {
        this.tvSoluong = tvSoluong;
    }
}
