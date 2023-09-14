package org.example;

public class Point {

    protected double xPos = 0;
    protected double yPos = 0;

    public Point(){
        setX(0);
        setY(0);
    }
    public Point(double x, double y) {
        setX(x);
        setY(y);
    }
    public void setX(double x) {
        xPos = x;
    }
    public void setY(double y) {
        yPos = y;
    }
    public void setPoint(double x, double y) {
        setX(x);
        setY(y);
    }
    public double getX(){
        return xPos;
    }
    public double getY(){
        return yPos;
    }
    public void shiftX(double n) {
        xPos += n;
    }
    public void shiftY(double n) {
        yPos += n;
    }
    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.getX()-getX(),2) + Math.pow(p.getY()-getY(),2));
    }
    public void rotate(double r) {
        xPos = xPos * Math.cos(r);
        yPos = yPos * Math.cos(r);
    }
    public String toString() {
        return "{x=" + xPos + ", y=" + yPos + "}";
    }
}
