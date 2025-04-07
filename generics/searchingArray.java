class genricArray
{
    <T>void search(T[] arr,T key)
    {
        boolean flag = false;
        for(T item : arr)
        {
            if(item.equals(key))
            {
                flag = true;
                System.out.println("Found element " + item);
                break;
            }
        }
        if(!flag)
        {
            System.out.println("Not found");
        }
    }
}
public class searchingArray { 
    public static void main(String[] args) {
    Integer[] intArray = {1, 2, 3, 4, 5};
    System.out.print("Integer Array: ");
    new genricArray().search(intArray, 3);
    String[] strArray = {"Apple","Banana","Guava"};
    new genricArray().search(strArray, "Banana");
}
}
