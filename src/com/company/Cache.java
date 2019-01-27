package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    private Solver solver;
    private List<Video> fittingVideos;
    private List<Video> videos;
    private int sizeLeft;
    public static int size = 0;
    private int id;

    Cache(Solver solver, int id) {
        this.id = id;
        this.solver = solver;
        fittingVideos = new ArrayList<>();
        videos = new ArrayList<>();

        this.sizeLeft = size;
    }

    Cache(Cache parent, Video video) {
        this.solver = parent.solver;
        this.sizeLeft = parent.sizeLeft - video.getSize();

        videos.add(video);
        ComputeFittingVideos(fittingVideos);
    }

    public void ComputeFittingVideos(List<Video> inputList) {
        List<Video> bufferList = new ArrayList<>();

        for (Video video : inputList) {
            if (video.getSize() <= sizeLeft) {
                bufferList.add(video);
            }
        }

        bufferList.removeAll(videos);
        fittingVideos = bufferList;
    }

    public List<Video> getFittingVideos() {
        return fittingVideos;
    }

    public int getId() {
        return id;
    }
}
