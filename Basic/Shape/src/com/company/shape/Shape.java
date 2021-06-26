package com.company.shape;

import java.text.DecimalFormat;

public abstract class Shape {

    DecimalFormat numberFormat = new DecimalFormat("#.00");

    public Shape() {
    }

    public abstract void getArea();

    public abstract void getParams();

}
