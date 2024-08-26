
// Lets make a calculator

import java.util.Scanner;

public class Main {
  public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    String operation = input.nextLine();
    
    System.out.println(divide(operation));
  }

  static String divide(String operation) {
    String num1Str = "";
    String num2Str = "";
    double num1 = 0;
    double num2 = 0;
    double answerVal = 0;
    char operator = '+';
    boolean num1StrDone = false;
    String answer = "";
    for (int i = 0; i < operation.length(); i++) {

      if (!num1StrDone) {

        if (!(operation.charAt(i) >= 48 && operation.charAt(i) <= 57) && operation.charAt(i) != 46) {

          operator = operation.charAt(i);
          num1StrDone = true;
          num1 = Double.parseDouble(num1Str);
          continue;

        }

        num1Str += Character.toString(operation.charAt(i));

      } else {

        num2Str += Character.toString(operation.charAt(i));

      }

    }

    num2 = Double.parseDouble(num2Str);
    switch (operator) {
      case '+':
        answerVal = num1 + num2;
        break;
      case '-':
        answerVal = num1 - num2;
        break;
      case '*':
        answerVal = num1 * num2;
        break;
      case '/':
        answerVal = num1 / num2;
        break;
      case '%':
        answerVal = num1 % num2;
        break;
      default:
        System.err.println("NOT CORRECT OPERATOR");
        break;
    }
    answer = num1 + " " + operator + " " + num2 + " " + " = " + answerVal;

    return answer;
  }
}