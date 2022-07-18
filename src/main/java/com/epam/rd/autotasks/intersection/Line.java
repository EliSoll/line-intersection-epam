package com.epam.rd.autotasks.intersection;

public class Line {

     final int k, b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;

    }

    public Point intersection(Line other) {
        if (k - other.k == 0) {
            return null;
        }
        int x = (other.b - b) / (k - other.k);
        int y = k * x + this.b;

        return new Point(x, y);
    }
}
