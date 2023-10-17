/*
 1
 1  2
 2  3  4
 4   5   6  7 
  
 */

 class PatternExample {
    public static void main(String[] args) {
        int rows = 4;
        int currentNumber = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber + " ");
                currentNumber++;
            }
            System.out.println();
        }
    }
}
