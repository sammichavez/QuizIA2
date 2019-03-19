public class QuestionGroup {
    Question[] easy = new Question[10];
    Question[] medium = new Question[10];
    Question[] hard = new Question[10];
    int gameLength = 10;

    public void createQuestion() {

        easy[0] = new Question("what is X in the equation, x + 1 = 9 ?", 8, 1);
        easy[1] = new Question("What is X in the equation, 17x - 12 = 114 + 3x ? ", 9, 1);
        easy[2] = new Question("");
        easy[3] = new Question("");
        easy[4] = new Question("");
        easy[5] = new Question("");
        easy[6] = new Question("");
        easy[7] = new Question("");
        easy[8] = new Question("");
        easy[9] = new Question("");
        medium[0] = new Question("");
        medium[0] = new Question("");
        medium[0] = new Question("");
        medium[0] = new Question("");
        medium[0] = new Question("");
        medium[0] = new Question("");
        medium[0] = new Question("");
        medium[0] = new Question("");
        medium[0] = new Question("");
        medium[0] = new Question("");
        hard[0] = new Question("");
        hard[0] = new Question("");
        hard[0] = new Question("");
        hard[0] = new Question("");
        hard[0] = new Question("");
        hard[0] = new Question("");
        hard[0] = new Question("");
        hard[0] = new Question("");
        hard[0] = new Question("");
        hard[0] = new Question("");
        hard[0] = new Question("");
    }

    public Question() {
        createQuestion();
    }

    public Question determineQuestion() {
        return easy[0];
    }
}
