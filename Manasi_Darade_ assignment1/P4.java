/*
              1
            2 4
           3 6 9
      4 8 12 16*/

class P4{

	public static void main(String[]args){
	
		int x = 1;
		int N = 4;
		for(int i = 1;i <= N;i++){
		         
			for(int j = 1;j <= N - i;j++){
			
				System.out.print(" " + " ");
			}

			int num = i;
			for(int j = 1;j <= i;j++){
			
				System.out.print(num + " ");
				num = num + i;
			}
			
			System.out.println();
		}
	}
}
