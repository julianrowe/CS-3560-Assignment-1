// Julian Rowe
// CS 3560.03
// September 29, 2022

public abstract class Question {
    private String question;
    private String[] candidateAnswers;

    public String getQuestion(){
        return this.question;
    }

    public void setQuestion(String question){
        this.question = question;
    }

    public String[] getCandidateAnswers(){
        return this.candidateAnswers;
    }

    public void setCandidateAnswers(String[] candidateAnswers){
        this.candidateAnswers = candidateAnswers;
    }
}