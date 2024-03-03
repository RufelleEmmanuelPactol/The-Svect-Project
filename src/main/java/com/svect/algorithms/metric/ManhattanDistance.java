package com.svect.algorithms.metric;

import com.svect.simple.SVector;

/**
 * The ManhattanDistance class is a DistanceMetric that calculates the Manhattan distance between two vectors.
 * The Manhattan distance is the sum of the absolute differences between the components of two vectors.
 * The Manhattan distance is also known as the L1 distance.
 * Compared to the Euclidean distance, the Manhattan distance is less sensitive to outliers.
 * The Manhattan distance is also faster to compute than the Euclidean distance.
 */
public class ManhattanDistance extends DistanceMetric {

    @Override
    public float distance(SVector x1, SVector x2) {
        if (x1.size() != x2.size()) {
            throw new IllegalArgumentException("Vectors must have the same size");
        }

        double sumAbsoluteDifferences = 0.0;

        for (int i = 0; i < x1.size(); i++) {
            sumAbsoluteDifferences += Math.abs(x1.get(i) - x2.get(i));
        }

        return (float) sumAbsoluteDifferences;
    }
}
