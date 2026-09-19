import java.util.Scanner;
 class QuizApp
{
public static void main(String args[])
{
    Scanner scanner=new Scanner(System.in);
    String[] questions={
        "What is capital of India?",
        "Who is the fathe of java programming?",
        "Which gas is most abudant in earths atmosphere?",
        "What is 10+5?"
    };
String[] options={
    "1.Delhi 2.mumbai",
    "1.james gosling 2.Dennis retchie",
    "1.oxygen 2.Nitrogen",
    "1.20 2.25"
};
int[] correctAnswers={1,1,2,2};
int[] userAnswers=new int[questions.length];
System.out.println("\n=======Welcome to Quiz=======\n");
for(int i=0;i<questions.length;i++)
{
    System.out.println("Question"+(i+1)+":"+questions[i]);
    System.out.println(options[i]);
    System.out.println("Enter your answer(1-2):");
    userAnswers[i]=scanner.nextInt();
    System.out.println();

}
    int score=0;
    System.out.println("=====quiz Results=====\n");
    for(int i=0;i<questions.length;i++)
    {
        System.out.println("Question"+(i+1)+"Your answer:"+userAnswers[i]+"=>");
        if(userAnswers[i]==correctAnswers[i])
        {
            System.out.println("CORRECT");
            score+=10;
        }
        else
        {
            System.out.println("INCORRECT");
        }
    }
    double percentage=(score*100.00)/(questions.length*10);
    System.out.println("\n Total Score:"+score+"out of"+(questions.length*10));
    System.out.println("percentage:"+percentage);
}

}