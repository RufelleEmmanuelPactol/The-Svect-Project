package com.svect.algorithms.metric;

import com.svect.simple.SVector;

/**
 * The EuclideanDistance class is a DistanceMetric that calculates the Euclidean distance between two vectors.
 * The Euclidean distance is the straight-line distance between two points in a Euclidean space.
 */
public class EuclideanDistance extends DistanceMetric{

    @Override
    public float distance(SVector x1, SVector x2) {
        if (x1.size() != x2.size()) {
            throw new IllegalArgumentException("Vectors must have the same size");
        }

        double sumSquaredDifferences = 0.0;

        for (int i = 0; i < x1.size(); i++) {
            double difference = x1.get(i) - x2.get(i);
            sumSquaredDifferences += difference * difference;
        }

        return (float) Math.sqrt(sumSquaredDifferences);
    }
}
