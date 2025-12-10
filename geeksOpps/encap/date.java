// package geeksOpps.encap;

class Student{

    private int[] marks;

    public Student(int marks[]){
        this.marks = marks;
    }

    public int getTotal(){
        int sum = 0;
        for(int m : marks){
            sum += m;
        }
        return sum;
    }

    public void displayMarks(){
         System.out.print("Marks: ");
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println();
    }
}

class dummy{
    public char[] val;
    // int n;

    public void set(char val[]){
       this.val = val;
    }

    public String get() {
        return new String(val);
    }
}

public class date {

    public static void main(String[] args) {
        int[] arr = {85, 90, 95, 88};  // int array

        Student s1 = new Student(arr);

        s1.displayMarks();                     // Prints marks
        System.out.println("Total = " + s1.getTotal());  // 

        dummy d1 = new dummy();

        char ch[] = {'2','0','2','5','-','1','2','-','0','9'};
        d1.set(ch);
        System.out.println(d1.get());

        
    }

    
}
