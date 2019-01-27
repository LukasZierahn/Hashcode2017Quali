package com.company;

import java.util.List;

public class Node {
    Node previousNode;
    int depth = -1;

    int score = 0;

    List<Node> outgoingNodes;
}
