import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;
import java.util.*;
    public class StringExercise {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Need to change string cases around? Enter some text and see it switch");
            String userInput2=  scanner.next();
            String switchCase =StringUtils.swapCase(userInput2);
            System.out.println(switchCase);

            System.out.println("Lets turn words upside down ! enter something ");
            String userInput3= scanner.next();
            String reverseString=StringUtils.reverse(userInput3);
            System.out.println(reverseString);
        }

            public void isANumber() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter your input here:");
                String userInput= scanner.next();

                boolean isNumber = StringUtils.isNumeric(userInput);
                if (isNumber) {
                    System.out.println("You entered a number");
                } else {
                    System.out.println("You entered a String");
                }
            }
    }

