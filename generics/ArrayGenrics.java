class genricArray
{
    <T>void print(T[] arr) {
        for (T item : arr) {
           System.out.println(item + " ");
        }
        System.out.println();
    }
}
public class ArrayGenrics { 
    public static void main(String[] args) {
    Integer[] intArray = {1, 2, 3, 4, 5};
    System.out.print("Integer Array: ");
    new genricArray().print(intArray);
    String[] stringArray = {"apple", "banana", "orange"};
    System.out.print("String Array: ");
    new genricArray().print(stringArray);
}
}

