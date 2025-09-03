import java.util.*;
public class newCrud {
    public static int[] crud(int arr[],int index,int element){

        ArrayList<Integer> newArr = new ArrayList<>();
        for(int num : arr){
            newArr.add(num);
        }

        if(index >= 0 && index <=newArr.size()){
            newArr.add(index, element);
        }

        int updateArr[] = new int[newArr.size()];
        for(int i=0;i<newArr.size();i++){
            updateArr[i] = newArr.get(i);
        }

        return updateArr;
    }

     public static int[] crud2(int arr[],int index,int element){
        
        ArrayList<Integer> newArr = new ArrayList<>();
        for(int num: arr){
            newArr.add(num);
        }

        if(index >=0 && index <= newArr.size()){
            newArr.set(index, element);
        }

        int updateArr[] = new int[newArr.size()];
        for(int i=0;i<newArr.size();i++){
            updateArr[i] = newArr.get(i);
        }

        return updateArr;
     }

     public static int[] crud2(int arr[],int index){
        
        ArrayList<Integer> newArr = new ArrayList<>();
        for(int num: arr){
            newArr.add(num);
        }

        if(index >=0 && index <= newArr.size()){
            newArr.remove(index);
        }

        int updateArr[] = new int[newArr.size()];
        for(int i=0;i<newArr.size();i++){
            updateArr[i] = newArr.get(i);
        }

        return updateArr;
     }

     public static int[] crud3(int arr[],int element){
        
        ArrayList<Integer> newArr = new ArrayList<>();
        for(int num: arr){
            newArr.add(num);
        }

        if(newArr.contains(element)){
            newArr.remove(Integer.valueOf(element));
        }
        int updateArr[] = new int[newArr.size()];
        for(int i=0;i<newArr.size();i++){
            updateArr[i] = newArr.get(i);
        }

        return updateArr;
     }

     

    public static void main(String[] args) {
        
        int arr[] = {1,4,2,5,3,6};
        int printArr[] = crud(arr, 3, 22);
        for(int i=0;i<printArr.length;i++){
            System.out.print(printArr[i] + " ");
        }
        System.out.println();
    }
}
