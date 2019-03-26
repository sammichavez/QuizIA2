public class QuestionGroup {
    public Question[] easy = new Question[10];
    public Question[] medium = new Question[10];
    public Question[] hard = new Question[10];
    int gameLength = 10;


    public QuestionGroup() {
        createEasy();
        createMedium();
        createHard();
        determineQuestion();
    }

    void createEasy() {
        easy[0] = new Question(" what is X in the equation, x + 1 = 9 ? \n1(8)\n2(6)\n3(5) ", 1, 1);
        easy[1] = new Question(" What is X in the equation, 17x - 12 = 114 + 3x ? \n1(9)\n2(3)\n3(6) ", 1, 1);
        easy[2] = new Question(" What is X in the equation, 9x + 4 = - 5e + 14 + 13x ? \n1(7),\n2(11),\n3(10) ", 3, 1);
        easy[3] = new Question(" What is X in the equation, 4x + 5 = 1 + 5x ? \n1(4)\n2(2)\n3(5) ", 1, 1);
        easy[4] = new Question(" What is X in the equation, -7 + 4x + 10 = 15 - 2x ? \n1(2)\n2(4)\n3(8) ", 1, 1);
        easy[5] = new Question(" What is X in the equation, 7x -15 = 5x -3 ? \n1(5)\n2(13)\n3(6) ", 3, 1);
        easy[6] = new Question(" What is X in the equation, 12 = x/89 ? \n1(1068)\n2(1168)\n3(7.41) ", 1, 1);
        easy[7] = new Question(" Evaluate the expression for X = -2 when the equation is, -18 - 4x ? \n1(-10)\n2(10)\n3(15) ", 1, 1);
        easy[8] = new Question(" Evaluate the expression for X = 2 when the equation is, -x = ? \n1(-2)\n2(3)\n3(5) ", 1, 1);
        easy[9] = new Question(" Evaluate the expression for X = -6 when the equation is, x - 8 ? \n1(-14)\n2(14)\n3(2) ", 1, 1);
    }

    void createMedium() {
        medium[0] = new Question(" What is cos π/3 ? \n1(1/2)\n2(1)\n3(0) ", 1, 2);
        medium[1] = new Question("What is sin π/6 ? \n1(√3/2)\n2(1/2)\n3(0) ", 2, 2);
        medium[2] = new Question(" What is sin π ? \n1(0)\n2(1)\n3(-1) ", 1, 2);
        medium[3] = new Question(" What is cos π ? \n1(0)\n2(2)\n3(1) ", 3, 2);
        medium[4] = new Question(" What is cos 5π/3 ? \n1(1/2)\n2(2/1)\n3(2) ", 1, 2);
        medium[5] = new Question("What is sin 11π/6 ? \n1(-1/2)\n2(1/2)\n3(0)", 1, 2);
        medium[6] = new Question("what is sin 2π ? \n1(0)\n2(1)\n3(3) ", 1, 2);
        medium[7] = new Question("what is cos 4π/3 ? \n1(-1)\n2(-1/2)\n3(0)", 2, 2);
        medium[8] = new Question("what is sin π/2 ? \n1(2)\n2(0)\n3(1)", 3, 2);
        medium[9] = new Question("what is cos 3π/2 ? \n1(0)\n2(-2)\n3(-1)", 3, 2);
    }

    void createHard() {

        hard[0] = new Question("One day, a person went to a horse racing area. Instead of counting the number of humans and horses, " +
                "he counted 74 heads and 196 legs. " +
                "How many humans and horses were there? \n1(24 humans and 50 horses)\n2(24 horses and 50 humans)\n3(31 horses and 74 humans)",
                1, 3);
        hard[1] = new Question("What is 10*9*8*7*6*5*4*3*2*1? \n1(10! or 3628800)\n2(10^10)\n3(1000)", 1, 3);
        hard[2] = new Question(" If x*x-2x-35=0then x=? \n1(8)\n2(4)\n3(7)", 3, 3);
        hard[3] = new Question(" Given the equation , 5 (- 3 x - 2) - (x - 3) = - 4 (4 x + 5) + 13? \n1(0=0)\n2(3=34)\n3(2=40)" , 1 , 3);
        hard[4] = new Question(" Given the algebraic expression , 2 (a -3) + 4 b - 2 (a - b - 3) + 5 ? \n1(6b + 5) \n2(3b + 4)\n 3(2b + 2)" , 1 , 3);
        hard[5] = new Question(" Given the equation, 2 x - 4 y = 9 , solve for x when y is 0? \n1(9/2)\n2(6/3)\n3(4/2)" , 1 , 3);
        hard[6] = new Question("Given the line 5x - 5y = 7 , Rewrite the equation in slope intercept form y = mx + b ? \n1(y = x - 7/5)\n2(y = x + 7/5)\n3(x = y + 7/5 " , 1 , 3);
        hard[7] = new Question("The equation to solve is given by, |-2 x + 2| -3 = -3 ? \n1(2)\n2(1)\n3(3) " , 2 , 3);
        hard[8] = new Question("Are you a good person?\n1(yes)\n2(no)\n3(Dont know)" , 1 , 3);
        hard[9] = new Question(" is it realistic to own a Dino? \n1(yes)\n2(no)\n3(maybe)" , 2 , 3);
    }


    Question determineQuestion() {
        for (int i = 0; i < gameLength; i++) {
            if (easy[i].answeredCorrectly == 2) {
                return getNextOfType(2);
            }
            if (easy[i].answeredCorrectly == 1) {
                return getNextOfType(1);
            }
            if (medium[i].answeredCorrectly == 2) {
                return getNextOfType(3);
            }
            if (medium[i].answeredCorrectly == 1) {
                return getNextOfType(1);
            }
            if (hard[i].answeredCorrectly == 2) {
                return getNextOfType(3);
            }
            if (hard[i].answeredCorrectly == 1) {
                return getNextOfType(2);
            }
        }
    }

    Question getNextOfType(int type) {

        if (type == 1) {
            for (int i = 0; i < easy.length; i++) {
                if (easy[i].answeredCorrectly == 0) {
                    return easy[i];
                }
            }
        }
        if (type == 2) {
            for (int i = 0; i < medium.length; i++) {
                if (easy[i].answeredCorrectly == 0) {
                    return medium[i];
                }
            }
        }
        if (type == 3) {
            for (int i = 0; i < hard.length; i++) {
                if (easy[i].answeredCorrectly == 0) {
                    return hard[i];
                }
            }
        }
    }

    String computeResult() {
        int easyCorrect = 0;
        int mediumCorrect = 0;
        int hardCorrect = 0;
        for (int i = 0; i < easy.length; i++) {
            if (easy[i].answeredCorrectly == 2) {
                easyCorrect++;
            }
        }
        for (int i = 0; i < medium.length; i++) {
            if (medium[i].answeredCorrectly == 2) {
                mediumCorrect += 2;
            }
        }
        for (int i = 0; i < hard.length; i++) {
            if (hard[i].answeredCorrectly == 2) {
                hardCorrect += 3;
            }
        }

        return ();

    }
}

