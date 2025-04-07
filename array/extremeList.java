public class extremeList {

    public static void oddList(int arr[])
    {
        int start = 0;
        int end = arr.length-1;

        while (start <=end) {
            if(start == end)
            {
                System.out.print(arr[start]);
            }
            else
            {
                System.out.print(arr[start] + " ");
                System.out.print(arr[end] + " ");
            }
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
       int arr[] = {1,23,4,5,6,7,8,9,10};
       oddList(arr);
    }
}
