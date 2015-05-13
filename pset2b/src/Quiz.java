/**
 * Created by Brett on 5/8/2015.
 */
public class Quiz
{
    public static void main(String[] args)
    {
        // build all the questions and answers
        QuestionFITB first = new QuestionFITB();
        first.setQuestion("Who was Frodo's best friend?");
        first.setAnswer("Samwise");

        QuestionMultChoice second = new QuestionMultChoice();
        second.setQuestion("Gandalf is a?");
        second.addMultChoice("Elf", false);
        second.addMultChoice("Wizard", true);
        second.addMultChoice("Dwarf", false);
        second.addMultChoice("Orc", false);

        QuestionFITB third = new QuestionFITB();
        third.setQuestion("How many Elven rings exist?");
        third.setAnswer("3");

        QuestionMultChoice fourth = new QuestionMultChoice();
        fourth.setQuestion("Which two hobbits were related? (Format answer 1,3)");
        fourth.addMultChoice("Pippin", false);
        fourth.addMultChoice("Frodo", true);
        fourth.addMultChoice("Merry", false);
        fourth.addMultChoice("Samwise", false);
        fourth.addMultChoice("Bilbo", true);

        // add all the questions to an array and then give the questions to the user
        QuestionList q = new QuestionList();
        q.addQuestion(first);
        q.addQuestion(second);
        q.addQuestion(third);
        q.addQuestion(fourth);
        q.giveQuestions();
    }
}
