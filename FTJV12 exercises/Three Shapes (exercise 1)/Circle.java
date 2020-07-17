/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author nande
 */
public class Circle {
    private int r;
    private double pi;

    public Circle() {
    }

    public Circle(int r, double pi) {
        this.r = r;
        this.pi = pi;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }
    
    
    
    public double getArea(){
        double A = this.pi * (this.r *2);
        return A;
    }
}
