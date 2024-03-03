package com.svect.algorithms.knn;

import com.svect.algorithms.metric.DistanceMetric;
import com.svect.simple.Pair;
import com.svect.simple.SVector;

import java.util.ArrayList;

/**
 * An Index is an algorithm that can be used to search for nearest neighbors in a VectorSpace.
 * In `speedy`, this can search through the entire vector space, but in FSS, it can use an ID
 * to iteratively load vectors.
 * In this Database Engine, a SearchAlgorithm is parallel to an index in a traditional database.
 *
 */
public abstract class Index {

    public abstract Pair<Double, SVector>[] kNearestNeighbors(ArrayList<SVector> vectors, DistanceMetric distanceMetric, SVector queryingVector, int k);

}
