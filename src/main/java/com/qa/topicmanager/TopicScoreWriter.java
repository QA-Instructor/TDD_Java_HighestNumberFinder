package com.qa.topicmanager;

import java.util.ArrayList;

public class TopicScoreWriter {

    private IFileWriter fileWriter;

    public TopicScoreWriter(IFileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeScores(ArrayList<TopicTopScore> topTopScores) {
//        version 1
//        fileWriter.writeLine("Physics, 89");


//        version 2
//        if( topTopScores.size() > 0 )
//        {
//            TopicTopScore tts = topTopScores.get(0);
//            String dataToWrite = tts.getTopicName() + ", " + tts.getTopScore();
//            fileWriter.writeLine(dataToWrite);
//        }

//        version 3
        for(TopicTopScore tts : topTopScores)
        {
            String dataToWrite = tts.getTopicName() + ", " + tts.getTopScore();
            fileWriter.writeLine(dataToWrite);
        }
    }
}
