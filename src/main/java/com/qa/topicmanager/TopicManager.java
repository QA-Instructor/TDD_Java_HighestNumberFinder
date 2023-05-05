package com.qa.topicmanager;

import com.qa.findhighestnumber.HighestNumberFinder;

import java.util.ArrayList;

public class TopicManager {

//    private final HighestNumberFinder highestNumberFinder = new HighestNumberFinder();
    private HighestNumberFinder highestNumberFinder;

    public TopicManager(HighestNumberFinder hnf) {
        this.highestNumberFinder = hnf;
    }

    public ArrayList<TopicTopScore> findTopicHighScores(ArrayList<TopicScores> array) {

        ArrayList<TopicTopScore> topScores = new ArrayList<>();
        if(array.size() == 1)
        {
            TopicScores ts = array.get(0);
            int topScore = highestNumberFinder.findHighestNumber(ts.getScores());
            topScores.add(new TopicTopScore(ts.getTopicName(), topScore));
        }
        return topScores;
    }
}
