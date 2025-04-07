public class ThreeSum {
 
    public static void sum(int arr[])
    {
        int sum = 80;
        for(int i=0;i<arr.length;i++)
        {
            int curr1 = arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                int curr2 = arr[j];
                for(int k=j+1;k<arr.length;k++)
                {
                    int curr3 = arr[k];
                    if(curr1 + curr2 + curr3 == sum)
                    {
                        System.out.print(curr1 + "," + curr2 + "," + curr3);
                    }
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        sum(arr);
    }
}

/*
 Loop Iterations Explained
Outer Loop (i = 0): Starting at index 0 (curr1 = 10)

Middle Loop (j = 1): Starting at index 1 (curr2 = 20)
Inner Loop (k = 2): Starting at index 2 (curr3 = 30)
Check: 10 + 20 + 30 = 60 (not equal to 80)
Inner Loop (k = 3): (curr3 = 40)
Check: 10 + 20 + 40 = 70 (not equal to 80)
Inner Loop (k = 4): (curr3 = 50)
Check: 10 + 20 + 50 = 80 (equal to 80)
Print: 10, 20, 50
Inner Loop (k = 5): (curr3 = 80)
Check: 10 + 20 + 80 = 110 (not equal to 80)
Middle Loop (j = 2): Starting at index 2 (curr2 = 30)
Inner Loop (k = 3): (curr3 = 40)
Check: 10 + 30 + 40 = 80 (equal to 80)
Print: 10, 30, 40
Inner Loop (k = 4): (curr3 = 50)
Check: 10 + 30 + 50 = 90 (not equal to 80)
Inner Loop (k = 5): (curr3 = 80)
Check: 10 + 30 + 80 = 120 (not equal to 80)
Middle Loop (j = 3): Starting at index 3 (curr2 = 40)
Inner Loop (k = 4): (curr3 = 50)
Check: 10 + 40 + 50 = 100 (not equal to 80)
Inner Loop (k = 5): (curr3 = 80)
Check: 10 + 40 + 80 = 130 (not equal to 80)
Middle Loop (j = 4): Starting at index 4 (curr2 = 50)
Inner Loop (k = 5): (curr3 = 80)
Check: 10 + 50 + 80 = 140 (not equal to 80)
Middle Loop (j = 5): Starting at index 5 (curr2 = 80)
No further k values available.
Outer Loop (i = 1): Starting at index 1 (curr1 = 20)

Middle Loop (j = 2): Starting at index 2 (curr2 = 30)
Inner Loop (k = 3): (curr3 = 40)
Check: 20 + 30 + 40 = 90 (not equal to 80)
Inner Loop (k = 4): (curr3 = 50)
Check: 20 + 30 + 50 = 100 (not equal to 80)
Inner Loop (k = 5): (curr3 = 80)
Check: 20 + 30 + 80 = 130 (not equal to 80)
Middle Loop (j = 3): Starting at index 3 (curr2 = 40)
Inner Loop (k = 4): (curr3 = 50)
Check: 20 + 40 + 50 = 110 (not equal to 80)
Inner Loop (k = 5): (curr3 = 80)
Check: 20 + 40 + 80 = 140 (not equal to 80)
Middle Loop (j = 4): Starting at index 4 (curr2 = 50)
Inner Loop (k = 5): (curr3 = 80)
Check: 20 + 50 + 80 = 150 (not equal to 80)
Middle Loop (j = 5): Starting at index 5 (curr2 = 80)
No further k values available.
Outer Loop (i = 2): Starting at index 2 (curr1 = 30)

Middle Loop (j = 3): Starting at index 3 (curr2 = 40)
Inner Loop (k = 4): (curr3 = 50)
Check: 30 + 40 + 50 = 120 (not equal to 80)
Inner Loop (k = 5): (curr3 = 80)
Check: 30 + 40 + 80 = 150 (not equal to 80)
Middle Loop (j = 4): Starting at index 4 (curr2 = 50)
Inner Loop (k = 5): (curr3 = 80)
Check: 30 + 50 + 80 = 160 (not equal to 80)
Middle Loop (j = 5): Starting at index 5 (curr2 = 80)
No further k values available.
Outer Loop (i = 3): Starting at index 3 (curr1 = 40)

Middle Loop (j = 4): Starting at index 4 (curr2 = 50)
Inner Loop (k = 5): (curr3 = 80)
Check: 40 + 50 + 80 = 170 (not equal to 80)
Middle Loop (j = 5): Starting at index 5 (curr2 = 80)
No further k values available.
Outer Loop (i = 4): Starting at index 4 (curr1 = 50)

Middle Loop (j = 5): Starting at index 5 (curr2 = 80)
No further k values available.
Outer Loop (i = 5): Starting at index 5 (curr1 = 80)

No further j values available.
 */