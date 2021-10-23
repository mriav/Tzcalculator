import java.io.IOException;
import java.util.Scanner;
import java.util.Set;


public class Calculator {

    public static int index;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner( System.in );

        System.out.println("Привет я Калькулятор! Умею + складывать, - отнимать, * умножать и / делить, арабские и римские числа от 1 до 10.");

        String s = sc.nextLine();
        String[] num = s.split( " " );

        if (num.length != 3) {
            throw new IOException();
        }

        if (Character.isDigit( num[0].charAt( index ) ) && Character.isDigit( num[2].charAt( index ) )) {

            String strcislom1 = num[0];

            if (strcislom1.equals( "0" )) {
                throw new IOException();
            }

            int cislo1 = Integer.parseInt( strcislom1 );
            String operator = num[1];

            if (!Set.of("+", "-", "*", "/").contains(operator)) {
                throw new IOException();
            }
            String strcislom2 = num[2];

                if (strcislom2.equals( "0" )) {
                    throw new IOException();
                }

                int cislo2 = Integer.parseInt( strcislom2 );

                if (cislo1 > 10 && cislo2 > 10) {
                    throw new IOException();
                }

                if (operator.equals( "+" )) {
                    System.out.print( cislo1 + cislo2 );
                }

                if (operator.equals( "-" )) {
                    System.out.print( cislo1 - cislo2 );
                }

                if (operator.equals( "*" )) {
                    System.out.print( cislo1 * cislo2 );
                }

                if (operator.equals( "/" )) {
                    System.out.print( cislo1 / cislo2 );
                }


        } else {

            RomanNumerals rim = RomanNumerals.valueOf( num[0] );
            int arab = rim.ordinal();

            String operation = num[1];
            if (!Set.of("+", "-", "*", "/").contains(operation)) {
                throw new IOException();
            }

            RomanNumerals rim2 = RomanNumerals.valueOf( num[2] );
            int arab2 = rim2.ordinal();

            if (arab > 10 && arab2 > 10) {
                throw new IOException();
            }

            if (operation.equals( "+" )) {
                int rez1 = arab + arab2;
                System.out.print( RomanNumerals.values()[rez1] );
            }

            if (operation.equals( "-" )) {
                int rez2 = arab - arab2;
                System.out.print( RomanNumerals.values()[rez2] );
            }

            if (operation.equals( "*" )) {
                int rez3 = arab * arab2;
                System.out.print( RomanNumerals.values()[rez3] );
            }

            if (operation.equals( "/" )) {
                int rez4 = arab / arab2;
                System.out.print( RomanNumerals.values()[rez4] );
            }
        }
    }
}



























