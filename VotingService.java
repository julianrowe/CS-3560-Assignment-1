// Julian Rowe
// CS 3560.03
// September 29, 2022

import java.util.Random;

public class VotingService {
    public static int reanswers = 0;

    static String[][] allStudentAnswers(int amountOfStudents, String[] questionArray){
        Random random = new Random();
        String questionType = questionArray[1];

        String[][] allStudentAnswers = new String[amountOfStudents][2];
        for(int i = 0; i < amountOfStudents; i++){
            allStudentAnswers[i][0] = Student.generateUniqueID();

            // selects answers based on question type
            if(questionType == "multiple-choice"){
                allStudentAnswers[i][1] = MultipleChoice.studentMultipleAnswer(questionArray);
            }
            else{
                allStudentAnswers[i][1] = SingleChoice.studentSingleAnswer(questionArray);
            }
            // System.out.printf("%s answered: %s\n", allStudentAnswers[i][0], allStudentAnswers[i][1]);

            int rerollChance = random.nextInt(5 + 1); // 1 in 5 chance of rerolling, only the last submission will be counted
            if(i > 10 && rerollChance == 1)
            {
                int studentToReroll = random.nextInt(i + 1); // randomly selects someone who already answered
                if(questionType == "multiple-choice"){
                    allStudentAnswers[studentToReroll][1] = MultipleChoice.studentMultipleAnswer(questionArray);
                }
                else{
                    allStudentAnswers[studentToReroll][1] = SingleChoice.studentSingleAnswer(questionArray);
                }
                // System.out.printf("%s reanswered: %s\n", allStudentAnswers[studentToReroll][0], allStudentAnswers[studentToReroll][1]);
                reanswers++;
            }
        }
        return allStudentAnswers;
    }

    public void printStatistics(String[][] allStudentAnswers, String[] questionArray){
        System.out.println("Statistics:");
        int[] answerStats = new int[questionArray.length - 2];
        for(int i = 0; i < allStudentAnswers.length; i++){
            if(allStudentAnswers[i][1].contains("A"))
                answerStats[0]++;
            if(allStudentAnswers[i][1].contains("B"))
                answerStats[1]++;
            if(allStudentAnswers[i][1].contains("C"))
                answerStats[2]++;
            if(allStudentAnswers[i][1].contains("D")) 
                answerStats[3]++;
            if(allStudentAnswers[i][1].contains("E")) 
                answerStats[4]++;
            if(allStudentAnswers[i][1].contains("F")) 
                answerStats[5]++;
        }
        for(int i = 0; i < questionArray.length - 2; i++)
        {
            System.out.printf("%s: %d\n", questionArray[2+i], answerStats[i]);
        }
        System.out.println("Amount of students: " + allStudentAnswers.length);
        System.out.println("Amount of reanswers: " + reanswers);
        // float percentCorrect = ((float)answerStats[0] / (float)allStudentAnswers.length) * 100;
        // System.out.printf("Percent Correct: %.2f%%", percentCorrect);
    }
}