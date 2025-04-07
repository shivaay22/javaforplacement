import java.util.ArrayList;

public class randomlyData {
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList<>();
        l1.add(324635);
        l1.add("khbfdkjsxb");
        l1.add(true);
        l1.add(543.6543);
        for(int i=0;i<l1.size();i++)
        {
            System.out.print(l1.get(i) + " ");
        }
        System.out.println();
        System.out.println(l1);       
    }
}
