/*
 1   2   3   4  
 2   3   4   5
 3   4   5   6
 4   5   6   7 
 */

 class Pattern{

    public static  void main(String args[]){
      
 
        int rows = 4;
        int cols = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < i + cols; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}



