package com.svect.simple;

/**
 * A Pair is a simple data structure that holds two values.
 * @param first
 * @param second
 * @param <X>
 * @param <Y>
 */
public record Pair<X, Y> (X first, Y second) {
}
