package Wrappers;

import java.util.Scanner;

public class PentagonArea {
    public static void main(String[] args) {
        System.out.println("Enter the length from the center of Pentagon to a Vertex: -> ");
        Scanner in = new Scanner(System.in);
        Double r = Double.valueOf(in.nextDouble());
        Double s = (2*r)*(Math.sin(Math.PI/5));
        Double area = (5*Math.pow(s, 2))/(4*Math.tan(Math.PI/5));
        System.out.printf("The area of the Pentagon is " + "%.2f", + area);
    }
}
