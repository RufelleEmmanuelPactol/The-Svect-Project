package com.svect.algorithms.metric;

import com.svect.simple.SVector;

public class CosineDistance extends DistanceMetric {

    @Override
    public float distance(SVector x1, SVector x2) {
        if (x1.size() != x2.size()) {
            throw new IllegalArgumentException("Vectors must have the same size");
        }

        double dotProduct = 0.0;
        double magnitudeX1 = 0.0;
        double magnitudeX2 = 0.0;

        for (int i = 0; i < x1.size(); i++) {
            dotProduct += x1.get(i) * x2.get(i);
            magnitudeX1 += x1.get(i) * x1.get(i);
            magnitudeX2 += x2.get(i) * x2.get(i);
        }

        double magnitudeProduct = Math.sqrt(magnitudeX1) * Math.sqrt(magnitudeX2);

        // Handle divide by zero
        if (magnitudeProduct == 0.0) {
            return 0.0f; // or throw an exception, depending on your use case
        }

        return (float) (1.0 - dotProduct / magnitudeProduct);
    }
}
