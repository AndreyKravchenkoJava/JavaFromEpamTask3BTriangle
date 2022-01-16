package com.company;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

            List<Triangle> triangles = new ArrayList<>();
            triangles.add(new Triangle(new Point(250, 90), new Point(180, 90), new Point(215, 30), "равносторонний"));
            triangles.add(new Triangle(new Point(150, 80), new Point(220, 70), new Point(110, 80), "равносторонний"));
            triangles.add(new Triangle(new Point(240, 300), new Point(330, 150), new Point(245, 75), "равносторонний"));
            triangles.add(new Triangle(new Point(110, 80), new Point(60, 80), new Point(220, 30), "равнобедренный"));
            triangles.add(new Triangle(new Point(300, 150), new Point(180, 90), new Point(215, 30), "равнобедренный"));
            triangles.add(new Triangle(new Point(190, 220), new Point(170, 100), new Point(260, 50), "равнобедренный"));
            triangles.add(new Triangle(new Point(230, 20), new Point(200, 60), new Point(265, 95), "прямоугольный"));
            triangles.add(new Triangle(new Point(160, 30), new Point(20, 70), new Point(60, 90), "прямоугольный"));
            triangles.add(new Triangle(new Point(220, 270), new Point(340, 70), new Point(350, 50), "произвольный"));
            triangles.add(new Triangle(new Point(250, 40), new Point(180, 40), new Point(215, 40), "произвольный"));

        int equilateral = TriangleUtil.getQuantityEquilateral(triangles);
        System.out.println("равносторонних треугольников: " + equilateral);

        int isosceles = TriangleUtil.getQuantityIsosceles(triangles);
        System.out.println("Равнобедренных треугольников: " + isosceles);

        int rectangular = TriangleUtil.getQuantityRectangular(triangles);
        System.out.println("Прямоугольных треугольников: " + rectangular);

        int arbitrary = TriangleUtil.getQuantityArbitrary(triangles);
        System.out.println("Произвольных треугольников: " + arbitrary);

        List<Triangle> equil = TriangleUtil.findEquilateral(triangles);
        List<Triangle> equilMax = TriangleUtil.findTrianglWithMaxSquare(equil);
        double equilMaxS = TriangleUtil.getSquare(equilMax.get(0));
        System.out.println("Максимальная площадь у равносторонних треугольников: ");
        System.out.format("%-10.2f", equilMaxS);
        System.out.println("в треугольнике: " + equilMax);
        List<Triangle> equilMin = TriangleUtil.findTriangWithMinSquare(equil);
        double equilMinS = TriangleUtil.getSquare(equilMin.get(0));
        System.out.println("Минимальная площадь у равносторонних треугольников: ");
        System.out.format("%-10.2f", equilMinS);
        System.out.println("в треугольнике: " + equilMax);

        List<Triangle> isos = TriangleUtil.findIsosceles(triangles);
        List<Triangle> isosMax = TriangleUtil.findTrianglWithMaxSquare(isos);
        double isosMaxS = TriangleUtil.getSquare(isosMax.get(0));
        System.out.println("Максимальная площадь у равнобедренных треугольников: :");
        System.out.format("%-10.2f", isosMaxS);
        System.out.println("в треугольнике: " + isosMax);
        List<Triangle> isosMin = TriangleUtil.findTriangWithMinSquare(isos);
        double isosMinS = TriangleUtil.getSquare(isosMin.get(0));
        System.out.println("Мигимальная площадь у равнобедренных треугольников: ");
        System.out.format("%-10.2f", isosMinS);
        System.out.println("в треугольнике: " + isosMin);
    }
}
