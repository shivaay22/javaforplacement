public class itearionmethod {
    public static int serach(int a[],int tar,int si,int ei)
    {
         si = 0;
         ei = a.length-1;
        while(si <= ei)
        {
            int mid = (si + ei) / 2;
            if(a[mid] == tar)
            {
                return mid;
            }
            if(a[si] <= a[mid])
            {
                if(a[si] <= tar && tar <= a[mid])
                {
                    ei = mid - 1;
                }
                else{
                    si = mid + 1;
                }
            }
            else
            {
                if(a[mid] <= tar && tar <= a[ei])
                {
                    si = mid + 1;
                }
                else
                {
                    ei = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
}
