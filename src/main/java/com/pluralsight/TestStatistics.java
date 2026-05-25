package com.pluralsight;

import java.util.Arrays;
import java.io.*;

public class TestStatistics {

    //add main
    public static void main(String[] args) {

        //create an array of 10 test scores
        int[] testScores = {12, 78, 56, 50, 90, 71, 84, 110, 2, 38};

        //initial scores
        int sum = 0;
        int highScore = testScores[0];
        int lowScore = testScores[0];

        //add the logic in for loop
        for (int testScore : testScores) {
            sum += testScore;

            //print out the high score
            if (testScore > highScore) {
            highScore = testScore;
               // System.out.println("The Highscore is " + highScore);
            }

            //print out the low score
            if (testScore < highScore) {
                lowScore = testScore;
               // System.out.println("The Lowscore is " + lowScore);
            }

        }
        //average
        double average = (double) sum /testScores.length;

        //print out the median
        Arrays.sort(testScores);
        double median = (testScores[4] + testScores[5]) / 2.0;

        System.out.println("The average is " + average);
        System.out.println("The highest score is " + highScore);
        System.out.println("The lowest score is "+ lowScore);
        System.out.println("The median is "+ median);

    }
}
