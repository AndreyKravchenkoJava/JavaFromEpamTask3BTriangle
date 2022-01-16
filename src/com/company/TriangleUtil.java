package com.company;

import java.lang.invoke.CallSite;
import java.time.temporal.Temporal;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class TriangleUtil {
    public TriangleUtil () {

    }
    public static double getSquare (Triangle triangle) {
        double square = ((triangle.getA().getX() - triangle.getC().getX()) * (triangle.getB().getY() - triangle.getC().getY()) - (triangle.getB().getX() - triangle.getC().getX())
        * (triangle.getA().getY() - triangle.getC().getY())) / 2;
        return square;
    }
    public static double getPerimetr (Triangle triangle) {
        double ab = Math.sqrt(Math.pow((triangle.getB().getX() - triangle.getA().getX()), 2) +
                Math.pow((triangle.getB().getY() - triangle.getA().getY()), 2));
        double bc = Math.sqrt(Math.pow((triangle.getC().getX() - triangle.getB().getX()), 2) +
                Math.pow((triangle.getC().getY() - triangle.getB().getY()), 2));
        double ca = Math.sqrt(Math.pow((triangle.getC().getX() - triangle.getA().getX()), 2) +
                Math.pow((triangle.getC().getY() - triangle.getA().getY()), 2));
        double perimetr = ab + bc + ca;
        return perimetr;
    }
    public static int getQuantityEquilateral (List<Triangle> triangles) {
        int equilateral = 0;
        for (Triangle triangle : triangles) {
            if (Objects.equals(triangle.getTypeOfTriangle(), "равносторонний")) {
                equilateral++;
            }
        }
        return equilateral;
    }
    public static int getQuantityRectangular (List<Triangle> triangles) {
        int rectangular = 0;
        for (Triangle triangle : triangles) {
            if (Objects.equals(triangle.getTypeOfTriangle(), "прямоугольный")) {
                rectangular++;
            }
        }
        return rectangular;
    }
    public static int getQuantityIsosceles (List<Triangle> triangles) {
        int isosceles = 0;
        for (Triangle triangle : triangles) {
            if (Objects.equals(triangle.getTypeOfTriangle(), "равнобедренный")) {
                isosceles++;
            }
        }
        return isosceles;
    }
    public static int getQuantityArbitrary (List<Triangle> triangles) {
        int arbitrary = 0;
        for (Triangle triangle : triangles) {
            if (Objects.equals(triangle.getTypeOfTriangle(), "произвольный")) {
                arbitrary++;
            }
        }
        return arbitrary;
    }
    public static List<Triangle> findEquilateral (List<Triangle> triangles) {
        List<Triangle> result = new ArrayList<>();
        for (Triangle triangle : triangles) {
            if (Objects.equals(triangle.getTypeOfTriangle(), "равносторонний")) {
                result.add(triangle);
            }
        }
        return result;
    }
    public static List<Triangle> findRectangular (List<Triangle> triangles) {
        List<Triangle> result = new ArrayList<>();
        for (Triangle triangle : triangles) {
            if (Objects.equals(triangle.getTypeOfTriangle(), "прямоугольный")) {
                result.add(triangle);
            }
        }
        return result;
    }
    public static List<Triangle> findIsosceles (List<Triangle> triangles) {
        List<Triangle> result = new ArrayList<>();
        for (Triangle triangle : triangles) {
            if (Objects.equals(triangle.getTypeOfTriangle(), "равнобедренный")) {
                result.add(triangle);
            }
        }
        return result;
    }
    public static List<Triangle> findArbitrary (List<Triangle> triangles) {
        List<Triangle> result = new ArrayList<>();
        for (Triangle triangle : triangles) {
            if (Objects.equals(triangle.getTypeOfTriangle(), "произвольный")) {
                result.add(triangle);
            }
        }
        return result;
    }
    public static List<Triangle> findTrianglWithMaxSquare (List<Triangle> triangles) {
        List<Triangle> result = new ArrayList<>();
        double max = 0;
        for (int i = 0; i < triangles.size(); i++) {
            if (getSquare(triangles.get(i)) > max) {
                max = getSquare(triangles.get(i));
            }
        }
        for (int i = 0; i < triangles.size(); i++) {
            if (getSquare(triangles.get(i)) == max) {
                result.add(triangles.get(i));
            }
        }
        return result;
    }
    public static List<Triangle> findTriangWithMinSquare (List<Triangle> triangles) {
        List<Triangle> result = new ArrayList<>();
        double min = 2000000;
        for (int i = 0; i < triangles.size(); i++) {
            if (getSquare(triangles.get(i)) < min) {
                result.add(triangles.get(i));
            }
        }
        for (int i = 0; i < triangles.size(); i++) {
            if (getSquare(triangles.get(i)) == min) {
                result.add(triangles.get(i));
            }
        }
        return result;
    }
}
