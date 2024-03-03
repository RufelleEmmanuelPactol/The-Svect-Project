package com.svect.storage.abstracts;

import com.svect.algorithms.knn.Index;
import com.svect.algorithms.metric.DistanceMetric;
import com.svect.simple.SVector;

import java.util.ArrayList;

/**
 * An abstract class representing the interfaces of a vector space.
 * A vector space is equivalent to a database in RDBMS.
 * An instance of this vector does not guarantee that the encompassing vectors
 * included in this vector space are fully loaded.
 */
public abstract class VectorSpace {
    private ArrayList<Long> ids;
    private String name;
    private DistanceMetric defaultDistanceMetric;
    private Index index;



    /**
     * Conducts a k-nearest search of the vector space.
     * @param queryingVector the querying vector
     * @param distanceMetric the distance metric to use, can be `Euclidean`, `Cosine`, or `Manhattan`
     * @param k the number of vectors to load
     * @return an array of similar vectors
     */
    public abstract SVector[] kNearestSearch(SVector queryingVector, DistanceMetric distanceMetric, int k);


    protected VectorSpace(String name, DistanceMetric defaultMetric, Index indexBy) {
        this.name = name;
        this.defaultDistanceMetric = defaultMetric;
        this.index = indexBy;
        this.ids = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
