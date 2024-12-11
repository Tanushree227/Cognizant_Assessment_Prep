interface In1
{
    public static final int a = 2207;

    void display();
}

public class Interface implements In1 {
    @Override
    public void display()
    {
        System.out.println("Interface in Java");
    }

    public static void main(String[] args) {
        Interface obj = new Interface();
        obj.display();
        System.out.println(obj.a);
    }
}