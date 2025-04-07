import java.util.Arrays;
public class jackarray
{
public static void main(String[] args) {
   int ar[][] = new int[5][2];
   int ar1[][] = {{1,2,3},{4,5,6}};
   for(int i=0;i<ar1.length;i++)
   {
    for(int j=0;j<ar1[i].length;j++)
    {
        System.out.println(" " + ar1[i][j]);
    }
    System.out.println();
   }
   for(int i[]:ar1)
   {
    System.out.println(Arrays.toString(i));
   }
   int arr[][] = new int[3][];
   arr[0] = new int[1];
   arr[1] = new int[2];
   arr[2] = new int[3];

   int a[]={7,8,9};
   int arr3[][] = {a,{2,3},{5,6}};
   int arr4[][] = {arr[0],arr[1]};
System.out.println(ar1.length);
}
}