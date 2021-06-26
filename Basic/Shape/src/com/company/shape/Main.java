package com.company.shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean play = true;
        int num;

        while (play) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("要計算何種形狀的面積(請輸入編號)：");
            System.out.println("(1) 三角形 (2) 矩形 (3) 圓形 (4)離開");
            num = scanner.nextInt();
            switch (num) {
                case 1:
                    Triangle t = new Triangle();
                    t.getParams();
                    t.getArea();
                    break;
                case 2:
                    Rectangle r = new Rectangle();
                    r.getParams();
                    r.getArea();
                    break;
                case 3:
                    Circle c = new Circle();
                    c.getParams();
                    c.getArea();
                    break;
                case 4:
                    System.out.println("SEE YOU NEXT TIME~");
                    play = false;
                    break;
                default:
                    System.out.println("請輸入正確的參數");
            }

        }

    }
}
