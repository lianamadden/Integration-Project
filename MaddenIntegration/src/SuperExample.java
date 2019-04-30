// Liana Madden
public class SuperExample extends Room1 {
  private int number = 0;

  // use of super
  public void super1() {
    System.out.println(super.hearts);
  }

  public void getter() { // getter
    // use of this
    this.number = 0;
  }

  public int setter(int number) { // setter
    number = 3;
    System.out.println(number);
    return number;
  }

  public SuperExample() {
    System.out.println("This is an example of a constructor");
  }

  public SuperExample(int number) {
    System.out.println("Constructor with parameters");
  }

}
