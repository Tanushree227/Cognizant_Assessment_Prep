class Helper
{
    static int add(int a, int b)
    {
        return a+b;
    }
    static double add(double a, double b, double c)
        {
            return a+b+c;
    }
}

public class MethodOverloading
{
    public static void main(String[] args) {
        System.out.println(Helper.add(3, 5));
        System.out.println(Helper.add(3.4, 5.6, 7.8));
    }
}