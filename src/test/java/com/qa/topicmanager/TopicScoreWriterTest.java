package com.qa.topicmanager;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class TopicScoreWriterTest {

//    @Disabled
//    @Test
//    public void verify_topic_score_details_written_out_once_v1()
//    {
//        // arrange
//        String physics = "Physics";
//        ArrayList<TopicTopScore> topTopScores = new ArrayList<>();
//        topTopScores.add( new TopicTopScore(physics, 89));
//
//        TopicScoreWriter cut = new TopicScoreWriter();
//
//        // act
//        cut.writeScores( topTopScores );
//
//        // assert
//    }

    @Test
    public void verify_topic_score_details_written_out_once_v2()
    {
        // arrange
        String physics = "Physics";
        String art = "Art";
        String compSci = "Comp Sci";
        String expectedResult = "Physics, 89";
        ArrayList<TopicTopScore> topTopScores = new ArrayList<>();
        topTopScores.add( new TopicTopScore(physics, 89));

        String fileToWrite = "testfile.txt";
        IFileWriter fileWriter = mock(IFileWriter.class);

        TopicScoreWriter cut = new TopicScoreWriter( fileWriter );

        // act
        cut.writeScores( topTopScores );

        // assert
        verify( fileWriter, times(1)).writeLine(expectedResult);
    }

    @Test
    public void verify_topic_score_details_not_written()
    {
//        empty array so no scores should be written
        // arrange
        ArrayList<TopicTopScore> topTopScores = new ArrayList<>();

        IFileWriter fileWriter = mock(IFileWriter.class);

        TopicScoreWriter cut = new TopicScoreWriter( fileWriter );

        // act
        cut.writeScores( topTopScores );

        // assert
        verify( fileWriter, times(0)).writeLine(any());
    }

    @Test
    public void verify_topic_score_details_written_out_multiple_times()
    {
        // arrange
        String physics = "Physics";
        String art = "Art";
        String compSci = "Comp Sci";
        String physicsResult = "Physics, 89";
        String artsResult = "Art, 87";
        String comSciResult = "Comp Sci, 97";
        ArrayList<TopicTopScore> topTopScores = new ArrayList<>();
        topTopScores.add( new TopicTopScore(physics, 89));
        topTopScores.add( new TopicTopScore(art, 87));
        topTopScores.add( new TopicTopScore(compSci, 97));

        String fileToWrite = "testfile.txt";
        IFileWriter fileWriter = mock(IFileWriter.class);

        TopicScoreWriter cut = new TopicScoreWriter( fileWriter );

        // act
        cut.writeScores( topTopScores );

        // assert
        verify( fileWriter, times(1)).writeLine(physicsResult);
        verify( fileWriter, times(1)).writeLine(artsResult);
        verify( fileWriter, times(1)).writeLine(comSciResult);
    }
}