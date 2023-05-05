package com.qa.topicmanager;

public class Topic {

    public String getTopicName() {
        return topicName;
    }

    public int getScore() {
        return score;
    }

    private String topicName;
    int score;

    public Topic(String topicName, int score) {
        this.topicName = topicName;
        this.score = score;
    }
}
