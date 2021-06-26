package com.company.shape;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle extends Shape {

    private Double radius;
    private String result;

    @Override
    public void getArea() {
        Double rPow = Math.pow(radius, 2);
        Double area = Math.PI * rPow;
        this.result = numberFormat.format(area);
        System.out.println("面積 : " + result);
    }

    @Override
    public void getParams() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("請輸入半徑：");
            this.radius = input.nextDouble();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
