package com.svect.storage.engines.speedy;

import com.svect.simple.SVector;
import com.svect.storage.abstracts.VectorSpace;
import com.svect.storage.oracles.QueryOracle;

public class SpeedyOracle extends QueryOracle {
    @Override
    public SVector queryByVectorID(long vectorID) {
        return null;
    }

    @Override
    public VectorSpace loadVectorSpace(String vectorSpaceName) {
        return null;
    }
}
