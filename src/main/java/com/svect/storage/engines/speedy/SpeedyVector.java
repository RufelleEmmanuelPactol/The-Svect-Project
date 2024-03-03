package com.svect.storage.engines.speedy;

import com.svect.algorithms.knn.Index;
import com.svect.algorithms.metric.DistanceMetric;
import com.svect.simple.SVector;
import com.svect.storage.abstracts.VectorSpace;

public class SpeedyVector extends VectorSpace {


    protected SpeedyVector(String name, DistanceMetric defaultDistanceMetric, Index indexBy) {
        super(name, defaultDistanceMetric, indexBy);
    }

    @Override
    public SVector[] kNearestSearch(SVector queryingVector, DistanceMetric distanceMetric, int k) {
        return new SVector[0];
    }


}
