public class Main
{
    public static void main(String[] args)
    {
        int intOperandA = 14;
        int intOperandB = 32;


        int intSum = 0;
        int intProduct = 0;
        int intDifference = 0;
        int intQuotient = 0;
        int intModulo = 0;

        double doubleOperandA = 23.23;
        double doubleOperandB = 3.14;
        double doubleSum = 0;
        double doubleProduct = 0;
        double doubleDifference = 0;
        double doubleQuotient = 0;
        double doubleModulo = 0;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum of using two ints of " + intOperandA + " and " + intOperandB + " is " + intSum);
        intProduct = intOperandA * intOperandB;
        System.out.println("The product of using two ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        intDifference = intOperandA - intOperandB;
        System.out.println("The difference of using two ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);
        intQuotient = intOperandB / intOperandA;
        System.out.println("The quotient of using two ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        intModulo = intOperandB % intOperandA;
        System.out.println("The modulo of using two ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum of using two ints of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product of using two ints of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference of using two ints of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        doubleQuotient = doubleOperandB / doubleOperandA;
        System.out.println("The Quotient of using two ints of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        doubleModulo = doubleOperandB % doubleOperandA;
        System.out.println("The modulo of using two ints of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);




    }
}
