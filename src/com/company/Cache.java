package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    private List<Video> fittingVideos;
    private int size;
    private int id;

    Cache() {
        fittingVideos = new ArrayList<>();
    }

    public List<Video> getFittingVideos() {
        return fittingVideos;
    }

    public int getId() {
        return id;
    }
}
