package com.company;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private Solver solver;

    private Node previousNode;

    private int depth = -1;

    private int score = 0;

    private List<Node> outgoingNodes;

    private WorldState worldState;

    Node(Node previousNode, int video, int cache) {
        outgoingNodes = new ArrayList<>();
        depth = getDepth() + 1;
        this.previousNode = previousNode;
        solver = previousNode.getSolver();
    }

    Node(Solver solver) {
        this.solver = solver;
        outgoingNodes = new ArrayList<>();
        depth = 0;
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
