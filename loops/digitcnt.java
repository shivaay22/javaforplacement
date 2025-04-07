public class digitcnt {
    
    public static void cntDigit(int num)
    {
        int cnt = 0;
        while(num != 0)
        {
            int ld = num % 10;
           cnt++;
           num = num / 10;
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        cntDigit(782);
    }
}
