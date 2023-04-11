package main;
public class Question {
    private final String question;
    private final String[] answers;
    private final int indexOfCorrectAnswer;

    public Question(String question, String[] answers, int indexOfCorrectAnswer) {
        this.question = question;
        this.answers = answers;
        this.indexOfCorrectAnswer = indexOfCorrectAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public int getIndexOfCorrectAnswer() {
        return indexOfCorrectAnswer;
    }
}
