// Julian Rowe
// CS 3560.03
// September 29, 2022

// import java.util.Arrays;
import java.util.Random;

public class SimulationDriver {
    public static String[] selectRandomQuestion(){
        Random random = new Random();
        String[] question1 = {"What is 1 + 1?", "single choice", "A. 2", "B. 1", "C. 0", "D. 11"};
        String[] question2 = {"Is Java an Object-Oriented Programming Langugage?", "single choice", "A. Yes", "B. No"};
        String[] question3 = {"One byte is equal to 8 bits.", "single choice", "1. True", "2. False"};
        String[] question4 = {"What are the prime numbers that are less than 10?", "multiple-choice", "A. 2", "B. 3", "C. 4", "D. 5", "E. 7", "F. 9"};
        String[] question5 = {"Which of these are an integer?", "multiple-choice", "A. 3.14", "B. 3", "C. 0.24", "D. 8/3", "E. 1"};
        String[] question6 = {"What year was Java created?", "single choice", "A. 1991", "B. 1995", "C. 1998", "D. 2001"};
        String[] question7 = {"RAM stands for Random Access Memory.", "single choice", "1. True", "2. False"};
        String[] question8 = {"What are Cal Poly Pomona's colors?", "multiple-choice", "A. Gold", "B. Blue", "C. Green", "D. Brown"};
        String[] question9 = {"Cal Poly Pomona was established in 1927.", "single choice", "1. True", "2. False"};
        String[] question10 = {"Which of these are a programming language.", "multiple-choice", "A. C++", "B. C", "C. C--", "D. C#", "E. D"};
        String[][] questionBox = {question1, question2, question3, question4, question5, question6, question7, question8, question9, question10};
        // randomly chooses a question
        int randomQuestion = random.nextInt(questionBox.length);
        return questionBox[randomQuestion];
    }

    public static void main(String[] args){
        Random random = new Random();

        // Chooses random question
        String[] questionArray = selectRandomQuestion();

        // Prints question and candidate answers
        System.out.println(questionArray[0] + " (" + questionArray[1] + ")");
        for(int i = 2; i < questionArray.length; i++)
        {
            System.out.println(questionArray[i]);
        }
        System.out.println();

        VotingService votingServiceTest = new VotingService();

        // Sets a random amount of students from 25 to 75 and gets random answers
        int amountOfStudents = random.nextInt(75 - 25 + 1) + 25; 
        String[][] allStudentAnswers = VotingService.allStudentAnswers(amountOfStudents, questionArray); 
        // System.out.println(Arrays.deepToString(allStudentAnswers));

        votingServiceTest.printStatistics(allStudentAnswers, questionArray);
    }
}