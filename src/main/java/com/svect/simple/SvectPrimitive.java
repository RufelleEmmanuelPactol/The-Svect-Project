package com.svect.simple;

/**
 * Represents a primitive data type, usually `String` or `Integer`.
 * This is used as storage services for metadata.
 * @param <T> the class of the encapsulated data. Usually `String` or `Integer`.
 */
public abstract class SvectPrimitive<T> implements Comparable<T> {
    private T data;

}
