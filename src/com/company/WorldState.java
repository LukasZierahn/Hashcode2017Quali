package com.company;

import java.util.ArrayList;
import java.util.List;

public class WorldState {
    //there have to be a copy of all caches and connections in here and a function to deep copy them into a new worldstate

    private List<Cache> cacheList;

    WorldState() {
        cacheList = new ArrayList<>();
    }

    public void addToCacheList(Cache cache) {
        cacheList.add(cache);
    }

    int getScore(int dc)
    {
        int totalScore;

        totalScore = ((1)-(1)) * 1000;

        return 0;
    }

    public WorldState putVideoInCacheAndDeepCopy(int videoId, int cacheID) {
        return this; //TODO: implement this, it has to deep copy and update which video fits where!
    }

    public List<Cache> getCacheList() {
        return cacheList;
    }
}
