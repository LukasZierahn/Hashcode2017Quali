package com.company;

import java.util.List;

public class Solver {
    List<Video> videos; //this should be a list of videos from the videos class
    Node baseNode;

    int currentHighScore = 0;

    Solver() {
        baseNode.depth = 0;
        baseNode.previousNode = null;
    }

    public void readWorldStateFromFile(String path) {
        //this has to read the file into variables in this class and into a worldstate!
    }
}
