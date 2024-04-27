public class NumberToWords {
    public static void main(String[] args) {

        numberToWords(123);
        System.out.println();
        numberToWords(1010);
        System.out.println();
        numberToWords(1000);
        System.out.println();
        numberToWords(-12);

        System.out.println(reverse(-2521));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

    }

    public static void numberToWords(int number){
        int readNum = reverse(number);



        if (number == 0){
            System.out.println("Zero");
        }

        if (readNum < 0){
            System.out.println("Invalid Value");
        }

        while (readNum > 0){
            String result = switch (readNum % 10){
                case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                default -> "Invalid Value";
            };
            System.out.print(result + " ");
            readNum /= 10;
        }

        if (!(getDigitCount(number) == getDigitCount(reverse(number)))){
            for (int i = 0; i < (getDigitCount(number)-getDigitCount(reverse(number))); i++){
                System.out.print("Zero ");;
            }
        }

    }

    public static int reverse(int number){
        int reversedNumber = 0;

        if (number > 0) {

            while (number > 9) {
                reversedNumber += number % 10;
                reversedNumber *= 10;
                number /= 10;
            }
        } else {
            while (number < -9) {
                reversedNumber += number % 10;
                reversedNumber *= 10;
                number /= 10;
            }
        }

        reversedNumber += number;

        return reversedNumber;

    }

    public static int getDigitCount(int number){
        int count = 0;

        if (number < 0){
            return -1;
        }

        while (number > 9){
            number /= 10;
            count++;
        }
        count++;

        return count;
    }
}
