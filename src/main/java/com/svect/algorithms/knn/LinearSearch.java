package com.svect.algorithms.knn;

import com.svect.algorithms.metric.DistanceMetric;
import com.svect.simple.LeastValueStore;
import com.svect.simple.Pair;
import com.svect.simple.SVector;

import java.util.ArrayList;

/**
 * A LinearSearch is a SearchAlgorithm that searches for nearest neighbors by comparing the querying vector to every vector in the VectorSpace.
 * It is the simplest and slowest search algorithm, but it is guaranteed to find the correct answer.
 * In this Database Engine, a LinearSearch is parallel to a full table scan in a traditional database.
 * Time complexity: O(n)
 */
public class LinearSearch extends Index {

    @Override
    public Pair<Double, SVector>[] kNearestNeighbors(ArrayList<SVector> vectors, DistanceMetric distanceMetric, SVector queryingVector, int k) {
        var lvs = new LeastValueStore(k);
        for (SVector vector : vectors) {
            lvs.add(distanceMetric.distance(vector, queryingVector), vector);
        }
        return lvs.getLeastValues();
    }
}
