package Lab1;

import java.util.Scanner;

public class Analyzer{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Data dataSet = new Data();
        
        System.out.println("Введите числа (введите 'Q' для выхода):");

        while(true){
            System.out.print("Enter number (Q to quit): ");
            String input = scan.next();

            if (input.equalsIgnoreCase("Q")){
                break;
            }

            try{
                double value = Double.parseDouble(input);
                dataSet.add(value);
            }
            catch (NumberFormatException e) {
                System.out.println("Ошибка:Введен неправильный формат, Пожалуйста, введите число или 'Q'.");
            }
        }

        System.out.println("Average = " + dataSet.getAverage());
        System.out.println("Maximum = " + dataSet.getMaximum());
        
        scan.close();
    }
}