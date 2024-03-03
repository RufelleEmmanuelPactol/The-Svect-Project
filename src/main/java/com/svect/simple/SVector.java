package com.svect.simple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * The SVector class represents a vector that holds a fixed-size vector.
 */
public class SVector implements Iterable<Float> {
    private long serialID;

    private double[] data;
    private int currentSize;

    @SuppressWarnings("rawtypes")
    private HashMap<String, SvectPrimitive> metadata;

    public SVector(int size) {
        data = new double[size];
    }

    public SVector(double[] data) {
        this.data = data;
        this.currentSize = data.length;
    }



    public double get(int index) {
        return data[index];
    }

    public void set(int index, double value) {
        data[index] = value;
    }

    public int size() {
        return data.length;
    }

    public void append(double f) {
        data[currentSize++] = f;
    }

    @Override
    public Iterator<Float> iterator() {
        return new Iterator<Float>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < currentSize;
            }

            @Override
            public Float next() {
                return (float) data[currentIndex++];
            }
        };
    }

    @Override
    public void forEach(Consumer<? super Float> action) {
        for (double value : data) {
            action.accept((float) value);
        }
    }

    @Override
    public String toString() {
        return "SVect(" + Arrays.toString(data) + ")";
    }





}
