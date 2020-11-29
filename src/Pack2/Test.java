package Pack2;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        Ball b1 = new Ball(10.0D, 10.0D);
        System.out.println(b1);
        b1.move(19.0D, 4.0D);
        System.out.println(b1);
        System.out.println("(--_--)");
        Ball b2 = new Ball(0.0D, 0.0D);
        System.out.println(b2);
        b2.move(-5.0D, 11.0D);
        System.out.println(b2);
        System.out.println("(ᗒᗣᗕ)՞");
        Ball b3 = new Ball(-6.0D, -66.0D);
        System.out.println(b3);
        b3.move(13.0D, 88.0D);
        System.out.println(b3);
        System.out.println("( ~*-*)~");
        Author a1 = new Author("Misha", "Misha@gmail.com", 'm');
        System.out.println(a1.toString());
        Author a2 = new Author("Mariska", "Sestra_Marisa@husein.com", 'f');
        System.out.println(a2.toString());
    }
}
