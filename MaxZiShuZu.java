import java.util.Scanner;
/*
 * Date:29/3/2018
 * author:joe
 */
public class MaxShuZu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         int k,MaxSum=0;
         int[] arr=new int[n];
         for(int i=0;i<arr.length;i++)
         {
        	 k=in.nextInt();
        	 arr[i]=k;
         }
         for(int i=0;i<arr.length;i++)
         {
        	 int Sum=0;//当前数列
        	 for(int j=i;j<arr.length;j++)
        	 {
        		 Sum+=arr[j];
        		 if(Sum>MaxSum)
        		 {
        			 MaxSum=Sum;
        		 }
        	 }
         }
         if(MaxSum<0)
         {
        	 System.out.println(0);
         }
         else
         {
        	 System.out.println(MaxSum);
         }
         in.close();
	}
}