
    import java.util.*;
class P3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the no of rows:");
		int rows=sc.nextInt();
		
		int num=rows;   
		int num1=num;   
	      
		rows=(rows*(rows+1))/2;    
		
		int curr=0;
		int limit=1;
		for(int i=1;i<=rows;i++){
		
			System.out.print(num1 + " ");	
			curr++;
			num1=num1+limit;

			if(limit==curr){
				num1=num+1;
				num++;
				curr=0;
				limit++;
				System.out.println();
			}
		}
		

	}
}

    

