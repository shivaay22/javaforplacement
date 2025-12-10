public class newPatterns {
    public static void print1(int n){
        
       for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
       }
    }

    public static void print2(int n) {
    for (int i = 0; i < n; i++) {
        // Print leading spaces
        for(int j = 0; j < i; j++) {
            System.out.print(" ");
        }
        // Print stars
        for(int k = n; k > i; k--) {
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void print3(int n){
    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int k=0;k<n-i+1;k++){
            System.out.print("* ");
        }
        System.out.println();
    }
}

public static void print4(int n){
    for(int i=1;i<=n;i++){
        for(int j=i;j<=n-1;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("* ");
        }
        System.out.println();
    }
}

public static void print5(int n){
    for(int i=1;i<=n;i++){
        for(int j=i;j<=n-1;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("* ");
        }
        System.out.println();
    }

    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int k=0;k<n-i+1;k++){
            System.out.print("* ");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        print5(5);
    }
}
