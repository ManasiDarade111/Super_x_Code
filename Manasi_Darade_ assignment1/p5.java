//Prime number in Range 
import java.util.*;
class Demo{

	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start : ");
		int s = sc.nextInt();
		System.out.println("Enter Last : ");
		int l = sc.nextInt();
		for(int i = s;i <= l;i++){
		 
			int count = 0;
			for(int j = 1;j <= i;j++){
			
				if(i%j == 0){
				
					count++;
				}
			}

			if(count == 2){
			
				System.out.println(i);
			}
		}
	}
}
