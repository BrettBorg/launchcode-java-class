import java.util.ArrayList;

/**
 * Created by Brett on 5/8/2015.
 */
// Multiple Choice object (sub class) extending the FITB object (base class)
public class QuestionMultChoice extends QuestionFITB
{
    private ArrayList<String> choices;

    public QuestionMultChoice()
    {
        // creates an array to hold all possible answers
        choices = new ArrayList<>();
    }

    // method to build array of choices and correct answer
    public void addMultChoice(String choice, boolean correct)
    {
        choices.add(choice);

        // if is executed if boolean is true, otherwise else is executed
        if (correct) {
            // get the answer in case two answers are true
            String oldAnswer = this.getAnswer();

            // if there is a previous answer number then add on this answer number to the string
            if (!oldAnswer.equals("")) {
                String choiceString = oldAnswer + "," + choices.size();
                setAnswer(choiceString);
            // there was no previous answer so just set this number as the answer
            } else {
                String choiceString = "" + choices.size();
                setAnswer(choiceString);
            }
        }
    }

    // method to display the question and then display all possible choices
    public void display()
    {
        super.display();

        for (int i = 0; i < choices.size(); i++)
        {
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + ": " + choices.get(i));
        }
    }
}

