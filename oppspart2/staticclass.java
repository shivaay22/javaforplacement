class student
{
    String name;
    int rno;
    int id;
    int marks;
    static int num;
    student(String name,int rno,int id,int marks)
    {
        this.name = name;
        this.rno = rno;
        this.id = id;
        this.marks = marks;
        num++;
    }
}

public class staticclass {
    public static void main(String[] args) {
        // System.out.println(s.num);
        student s1 = new student("kjvhsk", 015, 054, 054);
        System.out.println(s1.num);
        student s2 = new student("kjvhsk", 015, 054, 054);
        System.out.println(s2.num);
        student s3 = new student("kjvhsk", 015, 054, 054);
        System.out.println(s3.num);
        student s4 = new student("kjvhsk", 015, 054, 054);
        System.out.println(s4.num);
    }
}

