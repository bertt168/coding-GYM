package com.company.shape;

import java.util.Scanner;

public class Rectangle extends Shape {
    private Double length;
    private Double width;
    private String result;
    public Rectangle() {
    }

    @Override
    public void getArea() {
        Double area = length * width;
        this.result = numberFormat.format(area);
        System.out.println("面積 : " + result);
    }

    @Override
    public void getParams() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("請輸入長：");
            this.length = input.nextDouble();
            System.out.println("請輸入寬：");
            this.width = input.nextDouble();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
