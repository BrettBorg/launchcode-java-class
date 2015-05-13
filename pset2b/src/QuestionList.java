import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Brett on 5/8/2015.
 */
// create object to hold list of questions and answers
public class QuestionList
{
    private ArrayList<QuestionFITB> questions;

    public QuestionList()
    {

        questions = new ArrayList<QuestionFITB>();
    }

    // method build the array of questions and answers
    public void addQuestion(QuestionFITB q)
    {

        questions.add(q);
    }

    // method that will give the questions, ask for answer and check the answer until no more questions
    public void giveQuestions()
    {
        Scanner in = new Scanner(System.in);

        for (QuestionFITB q : questions)
        {
            q.display();
            System.out.println("Your answer: ");
            String userAnswer = in.nextLine();
            System.out.println(q.checkAnswer(userAnswer));
        }
    }
}

