public class Main{
    public static void main(String[] args) {
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7; 
        short shortVal = 7;
        long longVal = 5; 

        
        long res1 = shortVal;

        long res2 = (long) (longVal - floatVal);
        
        // only make small values larger

        System.out.println("Success");

  }
}