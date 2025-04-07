public class usingArray {
    
    public static class makeQueue
    {
        int front = -1;
        int rear = -1;
        int size = 0;
        int arr[] = new int[5];

        public void add(int val)
        {
            if(front == arr.length)
            {
                System.out.print("Queu is full");
                return;
            }
            if(front==-1)
            {
                front = rear = 0;
                arr[0] = val;
            }
            else
            {
                arr[rear+1] = val;
                rear++;
            }
            size++;
        }

        public int remove()
        {
            if(size == 0)
            {
                System.out.print("Queue is empty");
                return -1;
            }
            front++;
            size--;
            return arr[front - 1];
        }

        public void remove2()
        {
            if(size == 0)
            {
                System.out.print("Queue is empty");
            }
            front++;
            size--;
        }

        public int peek()
        {
            return arr[front];
        }

        public boolean isEmpty()
        {
            if(size == 0) return true;
            return false;

        }

        public void display()
        {
             if(size == 0)
             {
                System.out.println("Nothing");
             }
             else
             {
                for(int i=front;i<=rear;i++)
                {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
             }
        }
    }
    public static void main(String[] args) {
        
        makeQueue q1 = new makeQueue();
        q1.display();
        q1.add(1);
        q1.display();
        q1.add(5);
        q1.display(); 
        q1.add(25);
        q1.add(36);
        q1.remove();
        q1.display();
        q1.remove2();
        q1.display();

    }
}
