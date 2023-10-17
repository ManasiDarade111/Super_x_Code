public class P2 {
        public static void main(String[] args) {
            int num=1;
            int k=0;
    
            for(int i=1;i<=4;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(k+" ");
                    num=num+2;
                    k=k+num;
                }
                System.out.println();
            }
        }
    }
    

