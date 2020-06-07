package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       System.out.println("Enter first coordinates");
        Scanner in = new Scanner(System.in);
        int xcord1 = in.nextInt();
        int ycord1 = in.nextInt();
        int zcord1 = in.nextInt();
        Point3d firstpoint = new Point3d(xcord1,ycord1,zcord1);
        System.out.println("Enter second coordinates");
        int xcord2 = in.nextInt();
        int ycord2 = in.nextInt();
        int zcord2 = in.nextInt();
        Point3d secondPoint = new Point3d(xcord2,ycord2,zcord2);
        System.out.println("Enter third coordinates");
        int xcord3 = in.nextInt();
        int ycord3 = in.nextInt();
        int zcord3 = in.nextInt();
        Point3d thirdPoint = new Point3d(xcord3,ycord3,zcord3);
        System.out.println("S = "+ computeArea(firstpoint,secondPoint,thirdPoint));

    }
    public static double computeArea (Object o, Object j, Object p){
        Point3d firstpoint = (Point3d) o;
        Point3d secondPoint = (Point3d) j;
        Point3d thirdPoint = (Point3d) p;
        double stor1 = firstpoint.distanceTo(secondPoint);
        double stor2 = secondPoint.distanceTo(thirdPoint);
        double stor3 = thirdPoint.distanceTo(firstpoint);
        System.out.println(stor1);
        System.out.println(stor2);
        System.out.println(stor3);
        double polyper = ((double)stor1 + (double)stor2 + (double)stor3)/2;
        System.out.println(polyper);
        double Geron = (double)Math.sqrt(polyper*(polyper-stor1)*(polyper-stor2)*(polyper-stor3));
        return Geron;
    }


}
