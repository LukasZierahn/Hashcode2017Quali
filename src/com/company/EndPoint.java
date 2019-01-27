package com.company;

import java.util.List;

public class EndPoint {
    private int dcConnnection;
    private List<Integer> cacheIdList;

    EndPoint(int dcConnnection) {
        this.dcConnnection = dcConnnection;
    }

    public void addToCacheList(int cacheId) {
        cacheIdList.add(cacheId);
    }

}
