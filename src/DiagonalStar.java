public class DiagonalStar {
    public static void main(String[] args) {

        printSquareStar(8);

    }

    public static void printSquareStar(int number){
        if (number < 5){
            System.out.println("Invalid Value");
        } else {

            int rowCounter = 1;
            int columnCounter = 1;
            int count = number;


            while (rowCounter <= number) {
                if (rowCounter == 1 || rowCounter == number) {
                    for (int i = number; i > 0; i--) {
                        System.out.print("*");
                    }
                } else {
                    for (int j = number; j > 0; j--) {
                        if (rowCounter == columnCounter) {
                            System.out.print("*");
                        } else if (columnCounter == 1 || columnCounter == number) {
                            System.out.print("*");
                        } else if (columnCounter == count) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        columnCounter++;
                    }
                }

                System.out.println();
                rowCounter++;
                columnCounter = 1;
                count--;
            }
        }
    }
}
