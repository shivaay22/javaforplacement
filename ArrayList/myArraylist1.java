import java.util.ArrayList;
public class myArraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        System.out.println(l1.get(2));
        for(int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }
        System.out.println(l1);
        //adding element some index
        l1.add(1, 100);
        // modifying element at index i
        l1.set(3, 30);
        // removing an elment at index i
        l1.remove(4);
        //removing an element e
        l1.remove(Integer.valueOf(100));
        //checking if element exist or not 
        boolean ans = l1.contains(Integer.valueOf(60));
    }
}
