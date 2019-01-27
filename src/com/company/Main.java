package com.company;

public class Main {

    static Solver solver;

    public static void main(String[] args) {
        solver = new Solver();

        solver.readWorldStateFromFile("/Users/lukas/projects/XCode/Hashcode2017Qualifier/Scenarios/me_at_the_zoo.in");
    }
}