package com.company;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private static final int RATING_THRESHOLD = 0;

    private Solver solver;

    private Node previousNode;

    private int depth = -1;

    private int rating = 0;
    private boolean discared = true;

    private List<Node> outgoingNodes;

    private WorldState worldState;

    Node(Node previousNode, int video, int cache) {
        outgoingNodes = new ArrayList<>();
        depth = getDepth() + 1;
        this.previousNode = previousNode;
        solver = previousNode.getSolver();

        worldState = previousNode.worldState.putVideoInCacheAndDeepCopy(video, cache);
        if (rateChanges(video, cache) > RATING_THRESHOLD) {
            discared = false;
            ComputePossibleChanges();
        }

    }

    Node(Solver solver) {
        this.solver = solver;
        outgoingNodes = new ArrayList<>();
        depth = 0;
        discared = false;
    }

    private int rateChanges(int video, int cache) {
        rating = 0; //TODO: write this so that it rates this action!
        return rating;
    }

    public void ComputePossibleChanges() {
        for (Cache cache : worldState.getCacheList()) {
            for (Video video : cache.getFittingVideos()) {
                outgoingNodes.add(new Node(this, video.getId(), cache.getId()));
            }
        }
    }

    public int getDepth() {
        return depth;
    }

    public Solver getSolver() {
        return solver;
    }
}
