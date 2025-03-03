package LabTuan2.Excercise.Bai3;

import java.util.Scanner;

public class SinhVien {
    private int Id;
    private String name;
    private float LT;
    private float TH;

    public SinhVien() {
        Id = 0;
        name = "";
        LT = 0;
        TH = 0;
    }

    public SinhVien(int Id, String name, float LT, float TH) {
        this.Id = Id;
        this.name = name;
        this.LT = LT;
        this.TH = TH;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLT() {
        return LT;
    }

    public void setLT(float LT) {
        this.LT = LT;
    }

    public float getTH() {
        return TH;
    }

    public void setTH(float TH) {
        this.TH = TH;
    }

    private float getAverage() {
        return (float) (LT*0.3 + TH*0.7);
    }



    @Override
    public String toString() {
        return "SinhVien{" +
                "TH=" + TH +
                ", LT=" + LT +
                ", name='" + name + '\'' +
                ", Id=" + Id +
                '}';
    }
}
