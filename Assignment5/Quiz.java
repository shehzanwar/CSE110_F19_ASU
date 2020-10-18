//***********************************************************
// Name: Shehzad Anwar
// Title: Quiz.java
// Description: We have to make a quiz program.
// Time spent:  how long it took you to complete the assignment
// Date: 10/24/2019
//**********************************************************
/*
a) This program is to take user input of questions and answers that are correct and wrong and the program is supposed to be able to differentiate between whatever the user chooses later on.
b) The quiz is called Quiz, and Quiz is the public class.
c) public class Quiz at line-20, public Quiz(String a, String b, String c, String d, String e, String f) at line-29, public void setQuestion(String a) at line-38, public void setQuestion(String a)at line-42
public void setCorrectAnswer(char a) at line-50, public String getChoice(String a) at line-54, public boolean isCorrect (char a) at line-67, public String displayQuiz() at line-71
public void shuffle() at line-74.
d) The nextLine() is required because it allows the computer to read the entire line and advances past the line while next() only reads the next input until a space comes.
e) It returns an error.
 */

package Quiz;

import java.util.Random;

public class Quiz {

    private String question;
    private String choiceA;
    private String choiceB;
    private String choiceC;
    private	String choiceD;
    private String answer;

    public Quiz(String a, String b, String c, String d, String e, String f){
        question = a;
        choiceA = b;
        choiceB = c;
        choiceC = d;
        choiceD = e;
        answer = f;
    }

    public void setQuestion(String a){
        question = a;
    }

    public void set4Choices (String a, String b, String c, String d){
        choiceA = a;
        choiceB = b;
        choiceC = c;
        choiceD = d;
    }

    public void setCorrectAnswer(char a){
        answer = a;
    }

    public String getChoice(String a){
        switch(a){
            case "a":
                return choiceA;
            case "b":
                return choiceB;
            case "c":
                return choiceC;
            case "d":
                return choiceD;
        }

    public boolean isCorrect (char a) {
        return answer.equals(a);
    }

    public String displayQuiz() {}

    public void shuffle() {
        Random r = new Random();
        String[] ans = new String[4];
        int correctAns = -1;
        ans[0] = "A";
        ans[1] = "B";
        ans[2] = "C";
        ans[3] = "D";

        for(int i = 0; i < 3; i++){ //increase upper bound of i makes shuffle more random
            int ran = (int) (3*r.nextDouble()); //Part 1 of psuedo code
            String hold = ans[i];
            ans[i] = ans[ran];
            ans[ran] = hold;
        }


        for(int i = 0; i < 3; i++){ // Part 2 of Psuedo Code
            if(isCorrect(ans[i]){
                if(ans[i] == 0){
                    setCorrectAns("A");
                } else if(ans[i] == String.valueOf(1)){
                    setCorrectAns("B");
                } else if(ans[i] == String.valueOf(2)){
                    setCorrectAns("C");
                } else if(ans[i] == String.valueOf(3)){
                    setCorrectAns("D");
                }
                break;
            }
        }

        set4Choices(getChoice(ans[0]), getChoice(ans[1]), getChoice(ans[2]), getChoice(ans[3]));
        //Changes answer choices based on randomly generated String ans.
        }
    }
}


