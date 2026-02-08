/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("images/beach.jpg");
    //.explore will work on download/VS Code. Not currently set up to use on Codespaces
    //beach.explore();  
    beach.zeroBlue();
    //beach.explore();
    //write is set up by default to work on Codespaces
    beach.write("images/oldBeach.jpg");
  }
  
  public static void testKeepOnlyBlue(){
    Picture beach = new Picture("images/beach.jpg");
    beach.zeroGreen();
    beach.zeroRed();
    beach.write("images/oldBeach.jpg");
  }

  public static void testKeepOnlyRed(){
    Picture beach = new Picture("images/beach.jpg");
    beach.zeroBlue();
    beach.zeroGreen();
    beach.write("images/oldBeach2.jpg");
  }

  public static void testKeepOnlyGreen(){
    Picture beach = new Picture("images/beach.jpg");
    beach.zeroBlue();
    beach.zeroRed();
    beach.write("images/oldBeach3.jpg");
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    testKeepOnlyBlue();
    testKeepOnlyRed();
    testKeepOnlyGreen();
    //testNegate();
  
  }
}