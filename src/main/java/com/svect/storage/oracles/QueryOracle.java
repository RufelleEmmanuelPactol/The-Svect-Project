package com.svect.storage.oracles;

import com.svect.simple.SVector;
import com.svect.storage.abstracts.VectorSpace;

/**
 * The QueryOracle is a design pattern that serves as a proxy
 * between storage devices and vector spaces. Instead of interacting with
 * the file system and the `RAM-as-a-cache` methodology, the QueryOracle
 * abstracts the functionality away into a general interface.
 
 * The QueryOracle provides an interface to load both concrete and abstract
 * vector spaces. Moreover, it also provides an interface to query by vector ID
 * for FSS, and other file system vectors.
 */
public abstract class QueryOracle {


    /**
     * Loads a vector into memory. Can be from IO or can be directly from
     * memory.
     */
    public abstract SVector queryByVectorID(long vectorID);

    /**
     * Loads a vector (or a representation thereof) to memory. Using `speedy`,
     * it loads the entire vector. However, using other storage engines may 
     * only load a representation of the vector.
     */
    public abstract VectorSpace loadVectorSpace(String vectorSpaceName);
    
    
    

}
