public class Example1{
    public static void main(String[] args){
		int denominator, numerator, ratio;

        numerator = 5;
        denominator = 0;

        try{
            ratio = numerator / denominator;
            System.out.println("The answer: " + ratio);
        } 
        catch (ArithmeticException e){
            System.out.println("Divided by 0");
            e.printStackTrace();
        }

        System.out.println("Done.");
    }
}
