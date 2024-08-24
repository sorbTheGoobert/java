// you can use multiple classes

import java.util.Scanner; // This is a class of the "util" package. which is inside of "java" package.
// You can also import the whole package by
// import java.util
import mapack.mapackclass;

class Second {
  public static void main(String[] args) {

    Main obj = new Main();
    int val = obj.addNums(5, 3);
    System.out.println(val);

    String[] string = {"goob", "goober", "goobest"};
    System.out.println(obj.data);
    obj.changeData(string);
    System.out.println(obj.data);

    Scanner input = new Scanner(System.in);
    System.out.println("Give me a number");
    int x = input.nextInt();
    x = obj.addNums(x, x);
    System.out.println("This is x * 2: " + x); 

    String[] test = {"a"}; 
    mapack.mapackclass.main(test);
  }
}
