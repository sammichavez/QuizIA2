import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        QuestionGroup p = new QuestionGroup();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < p.gameLength; i++) {
            Question z = p.determineQuestion();
            System.out.println(z.text);

            int answer = sc.nextInt();

            if (answer == z.answer) {
                z.answeredCorectly = 2;
            } else {
                z.answeredCorrectly = 1;
            }
        }
        p.computeResult();
    }
}
