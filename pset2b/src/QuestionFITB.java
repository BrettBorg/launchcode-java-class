/**
 * Created by Brett on 5/8/2015.
 */
// Fill In The Blank Object - normal type of question
public class QuestionFITB {
    private String question;
    private String answer;

    public QuestionFITB() {
       question = "";
       answer = "";
    }

    // Setters and Getters
    public void setQuestion(String questionText) {

        question = questionText;
    }

    public void setAnswer(String correctAnswer) {

        answer = correctAnswer;
    }

    public String getAnswer() {

        return this.answer;
    }

    // check if users answer is correct and ignore case
    public boolean checkAnswer(String userAnswer) {

        return userAnswer.equalsIgnoreCase(answer);
    }

    // display the question for the user
    public void display() {

        System.out.println(question);
    }
}
