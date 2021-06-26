package com.company.shape;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Triangle extends Shape {

    private Double base;
    private Double height;
    private String result;

    public Triangle() {
    }

    @Override
    public void getArea() {
        Double area = (base * height) / 2;
        this.result = numberFormat.format(area);
        System.out.println("面積 : " + result);
    }

    @Override
    public void getParams() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("請輸入底：");
            this.base = input.nextDouble();
            System.out.println("請輸入高：");
            this.height = input.nextDouble();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
