package com.codegym;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;

public class CollectionUtilsAdapter implements CollectionOperations {
    private CollectionUtils collectionUtils;

    public CollectionUtilsAdapter() {
        this.collectionUtils = new CollectionUtils();
    }

    @Override
    public int findMax(Set<Integer> integerSet) {
        List<Integer> integerList = new ArrayList<>(integerSet);
        return collectionUtils.findMax(integerList);
    }
}