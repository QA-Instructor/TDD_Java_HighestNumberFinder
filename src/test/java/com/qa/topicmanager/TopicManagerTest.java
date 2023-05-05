package com.qa.topicmanager;

import com.qa.findhighestnumber.HighestNumberFinder;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TopicManagerTest {

//    @Test
//    public void find_highest_score_in_empty_array_return_empty_array()
//    {
//        // Arrange
//        int[] array = {};
//        TopicManager cut = new TopicManager();
//        int[] expectedResult = {};
//        // Act
//        Topic[] result = cut.findTopicHighScores(array);
//        // Assert
//        assertEquals(expectedResult, result);
//    }

    @Test
    public void find_highest_score_in_empty_array_return_empty_array()
    {
        // Arrange
        ArrayList<TopicScores> array = new ArrayList<>();
        // added to enable HNF to be passed in constructor to TopicManager
        HighestNumberFinder hnf = new HighestNumberFinder();
        TopicManager cut = new TopicManager(hnf);
        ArrayList<TopicTopScore> expectedResult = new ArrayList<>();

        // Act
        ArrayList<TopicTopScore> result = cut.findTopicHighScores( array );

        // Assert
        assertEquals( expectedResult, result );

    }

    @Test
    public void find_highest_score_with_array_of_one_return_array_of_one()
    {
        // Arrange
        int[] scores = { 56, 67, 45, 89 };
        String topicName = "Physics";
        ArrayList<TopicScores> topicScores = new ArrayList<>();
        topicScores.add(new TopicScores(topicName, scores));

        // added to enable HNF to be passed in constructor to TopicManager
        HighestNumberFinder hnf = new HighestNumberFinder();
        TopicManager cut = new TopicManager(hnf);
        ArrayList<TopicTopScore> expectedResult = new ArrayList<>();
        expectedResult.add(new TopicTopScore(topicName, 89));
        // Act
        ArrayList<TopicTopScore> result = cut.findTopicHighScores(topicScores);
        //Assert
        assertEquals(expectedResult.get(0).getTopicName(), result.get(0).getTopicName());
        assertEquals(expectedResult.get(0).getTopScore(), result.get(0).getTopScore() );
    }

    @Test
    public void find_highest_score_with_array_of_one_return_array_of_one_using_stub()
    {
        // Arrange
        int[] scores = { 56, 67, 45, 89 };
        String topicName = "Physics";
        ArrayList<TopicScores> topicScores = new ArrayList<>();
        topicScores.add(new TopicScores(topicName, scores));

        // Use a stub version of HighestNumberFinder
        com.qa.topicmanager.HighestNumberFinder hnf = new com.qa.topicmanager.HighestNumberFinder();
        TopicManager cut = new TopicManager(hnf);
        ArrayList<TopicTopScore> expectedResult = new ArrayList<>();
        expectedResult.add(new TopicTopScore(topicName, 89));
        // Act
        ArrayList<TopicTopScore> result = cut.findTopicHighScores(topicScores);

        assertEquals(expectedResult.get(0).getTopicName(), result.get(0).getTopicName());
        assertEquals(expectedResult.get(0).getTopScore(), result.get(0).getTopScore() );
    }
}