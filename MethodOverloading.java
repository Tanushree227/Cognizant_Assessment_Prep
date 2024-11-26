class Helper
{
    static int add(int a, int b)
    {
        return a+b;
    }
    static float add(float a, float b)
    {
        return a+b;
    }

    static double add(double a, double b)
    {
        return a+b;
    }
}

public class MethodOverloading
{
    public static void main(String[] args) {
        System.out.println(Helper.add(3, 5));
        System.out.println(Helper.add(3.4, 5.6));
        System.out.println(Helper.add(8.909, 6.789));
    }
}