public class Problem3
{
  public static void main(String[] args)
  {
    double num = 67.3424;
    int truncNum = (int) (num * 1000);
    
    System.out.println(truncNum % 10); // 867530
    // mod 10 gives last digit 
    truncNum = truncNum / 10; // printing the last digit;0
    System.out.println(truncNum % 10); // 86753

    System.out.println(truncNum % 10); // 3
    truncNum = truncNum / 10; // 8675

    System.out.println(truncNum % 10); // 5
    truncNum = truncNum / 10; // 867


    // gets me the next 3 digits
    // number is now 64342.4 
    double bigVal = val * 1000;

    // number is now 64342
    int truncVal = (int) bigVal;
    

    int lastDigit = truncVal % 10;
    System.out.println(lastDigit);
