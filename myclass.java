public class myclass {
    static int count = 0;
    final double pi = 3.14;
    public myclass(){
        count++;
    }
    public static void main(String[] args) {
        myclass obj1 = new myclass();
        myclass obj2 = new myclass();
        myclass obj3 = new myclass();

        System.out.println("count is: " + count);
        System.out.println("value of pi is: " + obj1.pi);
        System.out.println("value of pi is: " + obj2.pi);
        System.out.println("value of pi is: " + obj3.pi);
        System.out.println("yashaswi reddy");

    }
}

