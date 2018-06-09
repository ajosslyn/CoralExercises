package bootcamp;
import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;


public class Main {

        public static void main(String[] args) throws Exception {


            File f = new File("C:\\Users\\syntel\\Documents\\numbers.txt");
            Scanner scanner = new Scanner(f);
            BigInteger biggie = new BigInteger("0");

            while (scanner.hasNext())
            {
                biggie = biggie.add((new BigInteger(scanner.nextLine())));
            }

            System.out.println(biggie);
        }




    }

