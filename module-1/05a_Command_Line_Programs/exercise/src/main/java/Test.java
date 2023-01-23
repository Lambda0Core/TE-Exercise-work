import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        String binaryResult = "";
        int enteredNumber = 10;
        int remainder = 0;
        int binaryNumber = enteredNumber;
        while (enteredNumber > 0){
            remainder = (binaryNumber % 2);
            binaryResult += remainder;
            binaryNumber = enteredNumber / 2;


            System.out.println(remainder);

        }
    }
}
