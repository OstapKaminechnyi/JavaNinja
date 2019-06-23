package com.company;

import java.util.LinkedList;
import java.util.List;

public class Point3D {
    private double x;
    private double y;
    private double z;

    private double distanceTo(double x, double y, double z){
        double distance;
        distance = x + y + z;
        return distance;
    }

    @Override
    public String toString() {
        return "(" +
                 x +
                ", " + y +
                "," + z +
                ')';
    }
    private Point3D moveTo(Point3D point){
        //  change the coordinates of point to the given;
        return point;
    }

    class PointsSet extends Point3D{
        private List<Double> points = new LinkedList<>();

        private void addPoint(double addPoint){
            points.add(addPoint);
        }

        private double distance(double distance){
            distance = x + y + z;
            return distance;
        }
        private void move(){
            // move all points from container, which are inside the ball of radius 5 and center in origin, to the first point in container.
        }
    }
}
