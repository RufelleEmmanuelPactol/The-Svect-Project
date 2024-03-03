package com.svect.simple;

/**
 * A LeastValueStore is a data structure that stores the k-least values in a set of values.
 * This is useful for finding the k-nearest neighbors in a VectorSpace.
 */
public class LeastValueStore {
    private final Pair<Double, SVector>[] maxHeap;
    private int size;



    public LeastValueStore(int k) {
        if (k <= 0) {
            throw new IllegalArgumentException("k should be greater than zero");
        }
        this.maxHeap =new Pair[k];
        this.size = 0;
    }

    public void add(double value, SVector context) {
        if (size < maxHeap.length) {
            maxHeap[size] = new Pair<>(value, context);
            heapifyUp(size);
            size++;
        } else {
            if (value < maxHeap[0].first()) {
                maxHeap[0] = new Pair<>(value, context);
                heapifyDown(0);
            }
        }
    }

    // Modified to return an array of SVector objects
    public Pair<Double, SVector>[] getLeastValues() {
        return maxHeap;
    }
    public int size() {
        return size;
    }

    private void heapifyUp(int index) {
        int parent = (index - 1) / 2;
        while (index > 0 && maxHeap[index].first() > maxHeap[parent].first()) {
            swap(index, parent);
            index = parent;
            parent = (index - 1) / 2;
        }
    }

    private void heapifyDown(int index) {
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        int largest = index;

        if (leftChild < size && maxHeap[leftChild].first() > maxHeap[largest].first()) {
            largest = leftChild;
        }

        if (rightChild < size && maxHeap[rightChild].first() > maxHeap[largest].first()) {
            largest = rightChild;
        }

        if (largest != index) {
            swap(index, largest);
            heapifyDown(largest);
        }
    }

    private void swap(int i, int j) {
        var temp = maxHeap[i];
        maxHeap[i] = maxHeap[j];
        maxHeap[j] = temp;
    }
}

