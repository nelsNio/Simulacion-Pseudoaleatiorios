package com.nelsNio.logic;

public class CongruenceMultiply {
    private int a;
    private int m;
    private int Xo;
    private int iteration;

    /**
     * constructor
     *
     * @param a
     * @param m
     * @param xo
     * @param iteration
     */
    public CongruenceMultiply(int a, int m, int xo, int iteration) {
        super();
        this.a = a;
        this.m = m;
        Xo = xo;
        this.iteration = iteration;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getXo() {
        return Xo;
    }

    public void setXo(int xo) {
        Xo = xo;
    }

    public int getIteration() {
        return iteration;
    }

    public void setIteration(int iteration) {
        this.iteration = iteration;
    }


}
