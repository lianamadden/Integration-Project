// Liana Madden
/**
 * This class is an example of a super
 * @author Liana
 *
 */
public class SuperExample extends Room1 {
  private int number = 0;

  // use of super
  /**
   * the use of the super
   */
  public void super1() {
    System.out.println(super.hearts);
  }

  /**
   * use of this
   */
  public void getter() { // getter
    // use of this
    this.number = 0;
  }

  /**
   * @param number
   * @return number
   */
  public int setter(int number) { // setter
    number = 3;
    System.out.println(number);
    return number;
  }

  /**
   * output for the constructor
   */
  public SuperExample() {
    System.out.println("This is an example of a constructor");
  }

  /**
   * @param number
   */
  public SuperExample(int number) {
    System.out.println("Constructor with parameters");
  }

}
