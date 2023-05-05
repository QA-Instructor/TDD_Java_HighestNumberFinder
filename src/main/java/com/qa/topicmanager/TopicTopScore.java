package com.qa.topicmanager;

public class TopicTopScore {

    private String topicName;

    public String getTopicName() {
        return topicName;
    }

    public int getTopScore() {
        return topScore;
    }

    private int topScore;


    public TopicTopScore(String topicName, int topScore) {
        this.topicName = topicName;
        this.topScore = topScore;
    }

//    required for value comparison between mocked list and the expected list

    public boolean equals(Object anObject)
    {
        TopicTopScore rh = (TopicTopScore)anObject;

        return (topicName.equalsIgnoreCase(rh.topicName) && (topScore==rh.topScore));
    }

}
