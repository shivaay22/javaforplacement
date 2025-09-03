import java.util.*;

public class implement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int n = 5;
        for(int i=0;i<n;i++)
        {
            set.add(sc.nextInt());
        }
        // System.out.println(set);

        for(Integer num: set)
        {
            System.out.print(num+ " ");
        }
        System.out.println();
        
    }    
}
