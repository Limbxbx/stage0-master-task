package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        String quadrant = "";
        if (x > 0 && y > 0) {
            quadrant = "First";
        } else if (x < 0 && y > 0) {
            quadrant = "Second";
        } else if (x < 0 && y < 0) {
            quadrant = "Third";
        } else if (x > 0 && y < 0) {
            quadrant = "Fourth";
        } else {
            quadrant = "Zero";
        }
        System.out.println(quadrant);
    }

}

