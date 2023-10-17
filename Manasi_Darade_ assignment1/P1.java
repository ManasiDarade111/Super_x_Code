import java.util.*;
    class P1{
        public static void main(String[] args){
            
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Number  of rows:");
            int rows=sc.nextInt();	
            int num=1;
            int minus=1;
            for(int i=1;i<=16;i++){
			System.out.print(num + " ");
			num++;

			if(i%4==0){
				System.out.println();
				num=num-minus;
				minus++;
			}
		}


	}
}


