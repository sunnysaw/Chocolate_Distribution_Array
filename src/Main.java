/*
Question : Given an array of N integers where each value represents the number of chocolates in a packet. Each packet
           have a variable number of chocolates. There are m students, the task is to distribute chocolate packets
           such that
           1 : Each student gets one packet.
           2 : The difference between the number of chocolates in the packet with maximum chocolates and the packet
               with minimum chocolates given to the students is minimum.
________________________________________________________________________________________________________________________
I/P = {7,3,2,4,9,12,56}, Student = 3
O/P = Minimum difference is 2
 */
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start,SecondStart,SizeOfArray,student,SwapValue;
        System.out.println("Enter the number of chocolates that are inside box : ");
        SizeOfArray = input.nextInt();
        System.out.println("Enter the chocolate that are in packet :");
        int[] array = new int[SizeOfArray];
        for (start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        // Let's first sort the array so that we can operate it easily :
        System.out.println("Printing the answer :");
        for (start = 0; start < array.length - 1 - start; start++) {
            for (SecondStart = 0; SecondStart < array.length - 1 - start; SecondStart++) {
                if (array[SecondStart] > array[SecondStart + 1]) {
                    SwapValue = array[SecondStart];
                    array[SecondStart] = array[SecondStart + 1];
                    array[SecondStart + 1] = SwapValue;
                }
            }
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

