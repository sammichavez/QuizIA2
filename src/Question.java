public class Question {
    String text;
    int answer;
    boolean answeredCorrectly;
    int difficulty;

    public Question(String text, int answer, int difficulty) {
        this.text = text;
        this.answer = answer;
        this.difficulty = difficulty;
    }
}
