public class student {
    void detail(String name,String sem,String course)
    {
        System.out.println(name+" "+sem+" "+course);
    }
    void detail(String name,String sem,String course,String course2)
    {
        System.out.println(name+" "+sem+" "+course+" "+course2);
    }
    void detail(String name,String sem)
    {
        System.out.println(name+" "+sem);
    }
    public static void main(String[] args) {
        student s1 = new student();
        s1.detail(null, null, null);
        System.out.println(s1);
    }
}
