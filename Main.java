// ALWAY HAVE START LIKE THIS.
// AND BE THE NAME OF THE CLASS EQUAL TO THE NAME OF FILE

public class Main {
  public static void main(String[] args) {

    // Declares like C++
    String goob = "goob";

    // println = cout
    System.out.println(goob.concat(": goobing"));

    // final = const
    final int x = 5;
    float y = 2.5f;
    // double y = 2.5d;
    int answer = (int) (x * y);
    System.out.println(answer);

    long chaos1, chaos2, chaos3;
    // Apply all chaos to 50
    chaos1 = chaos2 = chaos3 = 50;
    System.out.println(chaos1 + " " + chaos2 + " " + chaos3);

    String test = "tEsT";
    System.out.println(test);
    System.out.println(test.length());
    System.out.println(test.toLowerCase());
    System.out.println(test.toUpperCase());
    System.out.println(test.indexOf("E"));

    int Perc = (int) (Math.random() * 101); // 0 to 100
    System.out.println("You have about " + Perc + "% chance of living to your 30\'s");

    if (Perc > 70) {
      System.out.println("So yeah, your looking good");
    } else if (Perc > 50) {
      System.out.println("Not good but fine.");
    } else {
      System.out.println("My brother in christ you will die");
    }

    System.out.println((5 > 3) ? "5 > 3 is true" : "5 > 3 is false?");

    String isGay = "no"; // oddly familiar to JS

    switch (isGay) {
      case "no":
        System.out.println("good");
        break;
      case "yes":
        System.out.println(".");
        break;
      default:
        System.out.println("binary?");
        break;
    }
    int i = 0;
    while (i < 5) {
      System.out.println(i);
      i++;
    }
    do{
      System.out.println(i + " do while");
      i++;
    } while (i < 5);
    for(i = 0; i < 10; i++){
      System.out.println(i + "!");
    }

    System.out.println("===========================================");

    int[] numbers = {1 ,10, 2, 4, 5, -1};
    for(int n : numbers) {
      if (n == 4) {
        continue;
      }
      System.out.println(n);
    }

    System.out.println("unluck num: " + 4);

    int[][] map = {
      {0, 1, 2},
      {3, 4, 5},
      {6, 7, 8},
    };

    System.out.println(map[2][2]);
    method("hi");
    method("DEATH!11");
    method("JUDGEMENT");
    method("PUNISHMENT!");

    System.out.println(addNums(0.5f, 0.13f));
  }
  static void method(String quote) {
    System.out.println("WOW, the method \"method\" just got executed!!1!");
    System.out.println("Quote: " + quote);
  }
  static float addNums(float num1, float num2) {
    return num1 + num2;
  }
}