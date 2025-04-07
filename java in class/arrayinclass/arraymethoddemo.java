// public class arraymethoddemo {
//     int[] getmarks()
//     {
//         int ar[] = new int[2];
//         ar[0] = 5;
//         ar[1] = 4;
//         return ar;
//     }
//     public static void main(String[] args) {
//         arraymethoddemo a1 = new arraymethoddemo();
//         int a[] = a1.getmarks();
//         for(int i=0;i<a.length;i++)
//         {
//             System.out.println(a[i] + " ");
//         }
//         System.out.println();
//     }
// }

import java.util.*;
public class arraymethoddemo
{
    float[] getSemDetail(int totalsem)
    {
        Scanner sc = new Scanner(System.in);
        float ar[] = new float[totalsem];
        for(int i=0;i<totalsem;i++)
        {
            ar[i] = sc.nextFloat();
        }
        return ar;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        arraymethoddemo a1 = new arraymethoddemo();
        float a[] = a1.getSemDetail(3);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}