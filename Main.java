/**
 * A function type method called countOnes that will count the number of 1s that appear inside of an integer parameter called number. 
 * @author Ahmad Zeshan
 */
public class Main {

	public static int countOnes(int userInt) {
    //initialize and declare count as 0 to track no of ones
    int count = 0;
    // repeats code while the number is greater than 0
    while(userInt > 0 || userInt < 0){
      // initialies and declares lastdigit as a int and this stores the remainder of the user input
      int lastDigit = (userInt % 10);
      // this checks if that digit is equal to 1
      if (lastDigit == 1 || lastDigit == -1) {
        // if it is equal to 1 then add 1 to count 
        count++;
      }
      // removes the last digit of the user input to move on to the next number 
      userInt = userInt/10;
    }

    //when done with the code it will return the count value
    return count;
  }
	/**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
		//declares answer as an integer and stores the answer to countOnes(````) on it
		int answer = countOnes(348324);
		//outputs the answer to the screen 
    System.out.println(answer);
	}	
}
