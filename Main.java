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

    int Perc = (int)(Math.random() * 101); // 0 to 100
    System.out.println("You have about " + Perc + "% chance of living to your 30\'s");
    
    if (Perc > 70) {
      System.out.println("So yeah, your looking good");
    }else if(Perc > 50){
      System.out.println("Not good but fine.");
    } else {
      System.out.println("My brother in christ you will die");
    }

    System.out.println( (5 > 3) ? "5 > 3 is true" : "5 > 3 is false?" );
  }
}