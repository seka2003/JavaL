public class Test2_13 {
    public static void main(String[] args) {

        int x = 10;
        x += 1;
        System.out.println("x#1 = " +x);
        x *= 2;
        System.out.println("x#2 = " +x);
        x -= 3;
        System.out.println("x#3 = " +x);
        x /= 4;
        System.out.println("x#4 = " +x);

        float y = 10;
        y += 1;
        System.out.println("y#1 = " +y);
        y *= 2;
        System.out.println("y#2 = " +y);
        y -= 3;
        System.out.println("y#3 = " +y);
        y /= 4;
        System.out.println("y#4 = " +y);

        long a =10;
        System.out.print("Postfix " + a + ",");
        System.out.print(a++ + ",");
        System.out.print(a + ",");
        System.out.print(a-- + ",");
        System.out.println(a);

        double b = 10;
        System.out.println("Prefix " + b +",");
        System.out.print(++b + ",");
        System.out.print(b + ",");
        System.out.print(--b + ",");
        System.out.println(b);

        int c = 20-(15/(3*5));
        System.out.println("C  =" + c);
    }
}
