package com.qa.topicmanager;

public class TopicScores {

    public String getTopicName() {
        return topicName;
    }

    public int[] getScores() {
        return scores;
    }

    private String topicName;
    private int[] scores;

    public TopicScores(String topicName, int[] scores) {
        this.topicName = topicName;
        this.scores = scores;
    }
}
