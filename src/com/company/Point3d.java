package com.company;

import java.util.Objects;

public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;
    public Point3d (double x, double y, double z){
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    public Point3d () {
        this(0,0,0);
    }
    public double getX (){
        return xCoord;
    }
    public double getY(){
        return yCoord;
    }
    public double getZ(){
        return zCoord;
    }
    public void setX (double val){
        xCoord = val;
    }
    public void setY(double val){
        yCoord = val;
    }
    public void setZ(double val){
        zCoord = val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3d point3d = (Point3d) o;
        return Double.compare(point3d.xCoord, xCoord) == 0 &&
                Double.compare(point3d.yCoord, yCoord) == 0 &&
                Double.compare(point3d.zCoord, zCoord) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCoord, yCoord, zCoord);
    }
    public double distanceTo(Object o) {
        Point3d point3d = (Point3d) o;
        double distance = Math.sqrt((point3d.xCoord - xCoord) * (point3d.xCoord - xCoord) + (point3d.yCoord - yCoord) * (point3d.yCoord - yCoord) + (point3d.zCoord - zCoord) * (point3d.zCoord - zCoord));
        return distance;
    }
}
