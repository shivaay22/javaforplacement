public class revisesort {
    public static void merge(int a[],int si,int mid,int ei)
    {
        int temp[] = new int[si-ei+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i<si && j<ei)
        {
            if(a[i] < a[j])
            {
                temp[k] = a[i];
                i++;
            }
            else
            {
                temp[k] = a[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
        {
            temp[k++] = a[i++];
        }
        while(j<=ei)
        {
            temp[k++] = a[j++];
        }
    }
    public static void main(String[] args) {
        
    }
}
