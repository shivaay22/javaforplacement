import java.util.Scanner;
public class arraystack {
    public static class arrayInplement
    {
        int arr[];
        int idx;
        arrayInplement(int size)
        {
            arr = new int[size];
            idx = 0;
        }
        void push(int x)
        {
            if(isFull())
            {
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        int peek()
        {
            if(idx == 0)
            {
                System.out.println("Stack is empty!");
                return -1;
            }
            return arr[idx-1];
        }
        int pop()
        {
          if(idx==0)
          {
            System.out.println("Stack is empty!");
            return -1;
          }
          int top = arr[idx-1];
          arr[idx-1] = 0;
          idx--;
          return top;  
        }
        void display()
        {
            for(int i=0;i<=idx-1;i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        int size()
        {
            return idx;
        }
        boolean isEmpty()
        {
            if(idx==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        boolean isFull()
        {
            if(idx==arr.length)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        arrayInplement st = new arrayInplement(size);
        int n = sc.nextInt();
        int m = n/2 + 1;
        for(int i=0;i<n-2;i++)
        {
            if(i!=m)
            {
                int x = sc.nextInt();
                st.push(x);
            }
        }
        st.display();
        System.out.println(st.isFull());
    }
}
