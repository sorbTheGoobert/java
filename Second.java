// you can use multiple classes

import java.util.Scanner; // This is a class of the "util" package. which is inside of "java" package.
// You can also import the whole package by
// import java.util
import mapack.mapackclass;
import java.util.ArrayList; // Import the Better Arrays*tm 
import java.util.LinkedList; // Import the Weird Arrays*tm 
import java.util.Collections;  // Import the sorter class
import java.util.HashMap; // Import hash maps, also known as objects that dont come from classes
import java.util.HashSet; // Import ANOTHER array stuff. (java must be lackin on array maybe?)

enum Rank {
  D,
  C,
  B,
  A,
  S,
  P
}

class Second {
  public static void main(String[] args) {

    Main obj = new Main();
    int val = obj.addNums(5, 3);
    System.out.println(val);

    String[] string = { "goob", "goober", "goobest" };
    System.out.println(obj.data);
    obj.changeData(string);
    System.out.println(obj.data);

    Scanner input = new Scanner(System.in);
    System.out.println("Give me a number");
    int x = input.nextInt();
    x = obj.addNums(x, x);
    System.out.println("This is x * 2: " + x);

    String[] test = { "a" };
    mapack.mapackclass.main(test);

    Rank WaitOfTheWorld = Rank.P;

    switch (WaitOfTheWorld) {
      case D:
        System.out.println("*laughs in sisyphus");
        break;
      case C:
        System.out.println("*laughs in sisyphus");
        break;
      case B:
        System.out.println("*insults you in sisyphus");
        break;
      case A:
        System.out.println("*nothing in sisyphus");
        break;
      case S:
        System.out.println("*panic in sisyphus");
        break;
      case P:
        System.out.println("*cries in sisyphus");
        break;
      default:
        System.err.println("no");
        break;
    }

    ArrayList<String> betterArraytm = new ArrayList<String>(); // pretty much a better array

    betterArraytm.add("null");
    betterArraytm.add(0, "not existing"); // 0 is index
    betterArraytm.add("unreal");

    System.out.println(betterArraytm);
    System.out.println(betterArraytm.get(2));
    betterArraytm.set(2, "hate");
    System.out.println(betterArraytm.get(2));

    System.out.println(betterArraytm);
    Collections.sort(betterArraytm);
    System.out.println(betterArraytm);

    System.out.println(betterArraytm.size()); // pretty much length

    betterArraytm.clear();
    System.out.println(betterArraytm);

    LinkedList<Integer> weirdArraytm = new LinkedList<Integer>(); // pretty much a better array

    weirdArraytm.add(2);
    weirdArraytm.add(4);
    weirdArraytm.add(3);
    weirdArraytm.add(1);
    weirdArraytm.add(5);

    System.out.println(weirdArraytm);
    weirdArraytm.removeLast();
    weirdArraytm.removeFirst();
    System.out.println(weirdArraytm);
    weirdArraytm.addFirst(2);
    weirdArraytm.addLast(5);
    System.out.println(weirdArraytm);
    Collections.sort(weirdArraytm);
    System.out.println(weirdArraytm);
    Collections.sort(weirdArraytm, Collections.reverseOrder());
    System.out.println(weirdArraytm);

    HashMap<String, Boolean> goob = new HashMap<String, Boolean>();

    // add values
    goob.put("yes?", true);
    goob.put("male?", true);
    goob.put("gamera?", true);
    goob.put("no lefe?", true);
    goob.put("parents?", false);

    System.out.println(goob);

    goob.remove("parents?");
    System.out.println(goob);

    System.out.println(goob.keySet());
    System.out.println(goob.values());

    goob.clear();
    System.out.println(goob);

    HashSet<String> dude = new HashSet<String>();
    dude.add("why?");
    dude.add("what?");
    dude.add("dude");
    dude.add("HUH??");
    dude.add("STOP");
    System.out.println(dude);
    System.out.println(dude.contains("STOP"));
    dude.remove("dude");
    System.out.println(dude);
    System.out.println(dude.size());
    dude.clear();
    System.out.println(dude);
  }
}
