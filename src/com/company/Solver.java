package com.company;

import java.util.List;

public class Solver {
    private List<Video> videos; //this should be a list of videos from the videos class
    Node baseNode;

    int currentHighScore = 0;

    Solver() {
        baseNode = new Node(this);
    }

    public void readWorldStateFromFile(String path) {
        //this has to read the file into variables in this class and into a worldstate!
    }

    public List<Video> getVideos() {
        return videos;
    }

    connectionScore(int videoID, int cacheID, int dcSpeed, int cache2endpointSpeed)
    {

    }
}
