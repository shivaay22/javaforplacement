import java.util.*;
public class dulicate2 {
    public static void dulicate(int arr[])
    {
        boolean flag = false;
       int size = 0;
       int duparr[];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    flag = true;
                    size++;
                }
            }
    }
    if(size>0)
    {
        duparr = new int[size];
        size = 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    duparr[size++] = arr[i];
                    break;
                }
            }
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(duparr[i] + " ");
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String numString[] = str.split(" ");
        int num[] = new int[numString.length];
        for(int i=0;i<numString.length;i++)
        {
            num[i] = Integer.parseInt(numString[i]);
        }
        dulicate(num);
    }
}
