interface PrintAble{
    int x = 10;
    void print();
}

interface Employee{
    void work();
    double getSalary();
}

class SDE implements Employee{
    private double salary;

    SDE(double salary){
        this.salary = salary;
    }

    public void work(){
        System.out.println("SDE is codinf");
    }

    public double getSalary(){
        return salary;
    }
}


class myClass implements PrintAble{
    public void print(){
        System.out.println("Myclass");
    }
}

class Test{
    public static void main(String[] args) {
        myClass m1 = new myClass();
        m1.print();
    }
}

