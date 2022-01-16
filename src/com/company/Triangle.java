package com.company;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    private String typeOfTriangle;

    public Triangle (Point a, Point b, Point c, String typeOfTriangle) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.typeOfTriangle = typeOfTriangle;
    }
    public Point getA () {
        return a;
    }
    public void setA (Point a) {
        this.a = a;
    }
    public Point getB () {
        return b;
    }
    public void setB (Point b) {
        this.b = b;
    }
    public Point getC () {
        return c;
    }
    public void setC (Point c) {
        this.c = c;
    }
    public String getTypeOfTriangle () {
        return typeOfTriangle;
    }
    public void setTypeOfTriangle (String typeOfTriangle) {
        this.typeOfTriangle = typeOfTriangle;
    }
    public String toString () {
        return "Triangle {" + "Ax: "+ a.getX() + " Ay: " + a.getY() + ", Bx: " + b.getX() + " By: " + b.getY() + ", Cx: " + c.getX() + " Cy: " + c.getY() + " "
                + typeOfTriangle + "]";
    }
}
