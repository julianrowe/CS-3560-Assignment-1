// Julian Rowe
// CS 3560.03
// September 29, 2022

import java.util.Random;

public class SingleChoice extends Question{
    static String studentSingleAnswer(String[] questionArray){
        Random random = new Random();
        int amountOfCandidateAnswers = questionArray.length - 2; // first 2 in questionArray are not candidate answers
        int randomAnswer = random.nextInt(amountOfCandidateAnswers) + 1; // randomly selects an answer based on the number of candidate answers
        String studentAnswer = "";
        // if there aren't enough candidate answers, the later choices will not be choosen
        switch(randomAnswer){
            case 1:
                studentAnswer = "A";
                break;
            case 2:
                studentAnswer = "B";
                break;
            case 3:
                studentAnswer = "C";
                break;
            case 4:
                studentAnswer = "D";
                break;
            case 5:
                studentAnswer = "E";
                break;
            case 6:
                studentAnswer = "F";
                break;
        }
        return studentAnswer;
    }
}
