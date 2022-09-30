// Julian Rowe
// CS 3560.03
// September 29, 2022

import java.util.Random;

public class MultipleChoice extends Question{
    static String studentMultipleAnswer(String[] questionArray){
        Random random = new Random();
        int amountOfCandidateAnswers = questionArray.length - 2; // first 2 in questionArray are not candidate answers
        int amountOfStudentSelectedAnswers = random.nextInt(amountOfCandidateAnswers) + 1; // randomly selects an amount of answers the student will choose based on the number of candidate answers
        String studentAnswer = "";
        for(int i = 0; i < amountOfStudentSelectedAnswers; i++){
            int randomAnswer = random.nextInt(amountOfCandidateAnswers) + 1;
            // only adds another answer if that one has not been choosen already
            if(randomAnswer == 1 && !studentAnswer.contains("A"))
                studentAnswer += "A";
            else if(randomAnswer == 2 && !studentAnswer.contains("B"))
                studentAnswer += "B";
            else if(randomAnswer == 3 && !studentAnswer.contains("C"))
                studentAnswer += "C";
            else if(randomAnswer == 4 && !studentAnswer.contains("D"))
                studentAnswer += "D";
            else if(randomAnswer == 5 && !studentAnswer.contains("E"))
                studentAnswer += "E";
            else if(randomAnswer == 6 && !studentAnswer.contains("F"))
                studentAnswer += "F";

            studentAnswer += " ";
        }
        return studentAnswer;
    }
}
