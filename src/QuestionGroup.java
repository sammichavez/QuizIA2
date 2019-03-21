public class QuestionGroup {
    Question[] easy = new Question[10];
    Question[] medium = new Question[10];
    Question[] hard = new Question[10];
    int gameLength = 10;

    public void createQuestion() {
        easy[0] = new Question("what is X in the equation, x + 1 = 9 ? \n1(8)\n2(6)\n3(5)" , 8, 1);
        easy[1] = new Question("What is X in the equation, 17x - 12 = 114 + 3x ? ", 9, 1);
        easy[2] = new Question(" What is X in the equation, 9x + 4 = - 5e + 14 + 13x ? \n1(7),\n2(11),\n3(10)", 10, 1 );
        easy[3] = new Question(" What is X in the equation, 4x + 5 = 1 + 5x ? \n1(4)\n2(2)\n3(5)", 4 , 1);
        easy[4] = new Question(" What is X in the equation, -7 + 4x + 10 = 15 - 2x ? \n1(2)\n2(4)\n3(8)", 2 , 1);
        easy[5] = new Question(" What is X in the equation, 7x -15 = 5x -3 ? \n1(5)\n2(13)\n3(6)" , 6, 1);
        easy[6] = new Question(" What is X in the equation, 12 = x/89 ? \n1(1068)\n2(1168)\n3(7.41)" , 1068, 1);
        easy[7] = new Question(" Evaluate the expression for X = -2 when the equation is, -18 - 4x ? \n1(-10)\n2(10)\n3(15)" , -10, 1);
        easy[8] = new Question("Evaluate the expression for X = 2 when the equation is, -x = ? \n1(-2)\n2(3)\n3(5)", -2, 1);
        easy[9] = new Question("Evaluate the expression for X = -6 when the equation is, x - 8 ? \n1(-14)\n2(14)\n3(2)" , -14 , 1);
        medium[0] = new Question(" What is cos π/3 ?");
//        medium[0] = new Question("");
//        medium[0] = new Question("");
//        medium[0] = new Question("");
//        medium[0] = new Question("");
//        medium[0] = new Question("");
//        medium[0] = new Question("");
//        medium[0] = new Question("");
//        medium[0] = new Question("");
//        medium[0] = new Question("");
//        hard[0] = new Question("");
//        hard[0] = new Question("");
//        hard[0] = new Question("");
//        hard[0] = new Question("");
//        hard[0] = new Question("");
//        hard[0] = new Question("");
//        hard[0] = new Question("");
//        hard[0] = new Question("");
//        hard[0] = new Question("");
//        hard[0] = new Question("");
//        hard[0] = new Question("");
    }

    public QuestionGroup() {

        createQuestion();
    }

    public Question determineQuestion() {
        return easy [0];
    }
}
