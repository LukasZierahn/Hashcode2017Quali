package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Solver {
    private List<Video> videos; //this should be a list of videos from the videos class
    private List<Request> requests;
    Node baseNode;

    int currentHighScore = 0;

    Solver() {
        baseNode = new Node(this);
        videos = new ArrayList<>();
    }

    public void readWorldStateFromFile(String path) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String[] firstLine = br.readLine().split(" ");

            int videoCount = Integer.decode(firstLine[0]);
            int endpointCount = Integer.decode(firstLine[1]);
            int requestCount = Integer.decode(firstLine[2]);
            int cacheCount = Integer.decode(firstLine[3]);
            Cache.size = Integer.decode(firstLine[4]);

            System.out.println("Videos: " + Integer.toString(videoCount) +
                    " \nEndpoints: " + Integer.toString(endpointCount) +
                    " \nRequests: " + Integer.toString(requestCount) +
                    " \nCaches: " + Integer.toString(cacheCount) +
                    " \nCache size: " + Integer.toString(Cache.size));

            WorldState startWS = new WorldState();

            int i = 0;
            for (String vidSize : br.readLine().split(" ")) {
                i++;
                videos.add(new Video(i, Integer.parseInt(vidSize)));
            }

            for (int j = 0; j < cacheCount; j++) {
                startWS.addToCacheList(new Cache(this, j));
            }

            for (int j = 0; j < endpointCount; j++) {
                String[] inp = br.readLine().split(" ");
                EndPoint newEndPoint = new EndPoint(Integer.parseInt(inp[0]));
                for (int k = 0; k < Integer.parseInt(inp[1]); k++) {
                    int cacheId = Integer.parseInt(br.readLine());
                    newEndPoint.addToCacheList(cacheId);
                }
            }

            for (int j = 0; j < requestCount; j++) {

            }


                br.close();
        }
        catch (Exception e) {
            System.out.println("Failed to read in: " + path);
        }

    }

    public List<Video> getVideos() {
        return videos;
    }

    connectionScore(int videoID, int cacheID, int dcSpeed, int cache2endpointSpeed)
    {

    }
}
