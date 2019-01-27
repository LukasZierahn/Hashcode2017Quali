package com.company;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private Node previousNode;


    private int depth = -1;

    private int score = 0;

    private List<Node> outgoingNodes;

    private WorldState worldState;

    Node(Node previousNode) {
        outgoingNodes = new ArrayList<Node>();
        depth = getDepth() + 1;
    }

    Node() {
        outgoingNodes = new ArrayList<Node>();
        depth = 0;
    }

    public int getDepth() {
        return depth;
    }

}
