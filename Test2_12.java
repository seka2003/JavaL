public class Test2_12 {
    public static void main(String[] args) {
        double a = 5;
        float b = .5f;
        int x =6;
        long y = 5;
        System.out.println("a = " + a);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("b = " + b);

        // a หาร 3
        a= a/3;
        // x หารด้วย 2 แต่เอาแค่ทศนิยม
        x= x%2;
        // y หารด้วย 3 แต่เอาแค่จำนวนเต็ม
        y = y/3;
        // b + 0.5 = 1.0 มีทศนิยมเพราะเป็น float
        b = b+0.5f;
        System.out.println("       ");
        System.out.println("a = " + a);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("b = " + b);

        //1.666*0 = 0
        a = a*x;
        // 0 / 3 = 0
        x = x /3;
        // 1 - (1/4) = 1
        y = y - (y/4);
        // 2.0 * 1.0 = 2.0
        b = 2*b;
        System.out.println("       ");
        System.out.println("a = " + a);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("b = " + b);
    }
}
