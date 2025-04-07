public class reviseloop {
    
    public static void main(String[] args) {

        int num = 153;
        int count = 0;
        int sum = 0;
        int temp = num;
        int count1 = Integer.toString(num).length();
        while(num != 0)
        {
            int ld = num % 10;
            count++;
            sum = sum + (int) Math.pow(ld, count);
            num = num / 10;
        }
        if(temp == sum)
        {
            System.out.println("ARM");
        }
        else
        {
            System.out.println("Not");
        }
        System.out.println(count);
        System.out.println(count1);
    }
}
