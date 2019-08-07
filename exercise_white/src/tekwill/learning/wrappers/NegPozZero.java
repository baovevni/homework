package tekwill.learning.wrappers;

import java.util.Scanner;

public class NegPozZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter five numbers >");
        Integer a = in.nextInt();
        Integer b = in.nextInt();
        Integer c = in.nextInt();
        Integer d = in.nextInt();
        Integer e = in.nextInt();

        Integer countOfNegativeNumbers = 0;
        Integer countOfPositiveNumbers = 0;
        Integer countOfZeros = 0;

        if(a>0){
            countOfPositiveNumbers++;
        }else if(a<0){
            countOfNegativeNumbers++;
        }else{
            countOfZeros++;

        } if(b>0){
            countOfPositiveNumbers++;
        }else if(b<0){
            countOfNegativeNumbers++;
        }else{
            countOfZeros++;

        } if(c>0){
            countOfPositiveNumbers++;
        }else if(c<0){
            countOfNegativeNumbers++;
        }else{
            countOfZeros++;
        }
        if(d>0){
            countOfPositiveNumbers++;
        }else if(d<0){
            countOfNegativeNumbers++;
        }else{
            countOfZeros++;
        }
         if(e>0){
            countOfPositiveNumbers++;
        }else if(e<0){
            countOfNegativeNumbers++;
        }else{
            countOfZeros++;
        }

        System.out.println(countOfNegativeNumbers);
        System.out.println(countOfPositiveNumbers);
        System.out.println(countOfZeros);
    }
}
