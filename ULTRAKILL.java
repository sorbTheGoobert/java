class Game {
  protected String Genre;
  protected String Subgenre;
  protected String Name;
  protected String Platform;
  protected String Difficulty;
  protected String Author;
  protected String Review;
  public void init(String G, String SG, String N, String P, String D, String A, String R) {
    this.Genre = G;
    this.Subgenre = SG;
    this.Name = N;
    this.Platform = P;
    this.Difficulty = D;
    this.Author = A;
    this.Review = R;
  }
  public void write() {
    System.out.println("This game is " + this.Name +  " and is made by " + this.Author + " and has a review of " + this.Review + ". This game is included in the " + this.Genre + " and " + this.Subgenre + ". " + this.Name + "is " + this.Difficulty + " and is played on " + this.Platform + "." );
  }
}

class ULTRAKILL extends Game {
  public static void main(String[] arg){
    ULTRAKILL megadeath = new ULTRAKILL();
    megadeath.init("Shooter", "Arena, Voilent", "ULTRAKILL", "PC", "pretty difficult", "Hakita", "1 / 10" /*mid game lol*/);
    megadeath.write();
  }
}
