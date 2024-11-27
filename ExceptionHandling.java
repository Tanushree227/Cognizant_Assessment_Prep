class ExceptionHandling
{
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("Result: " + c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception=> " +e.getMessage());
        }
        finally
        {
            System.out.println("This is the finally block");
        }
    }
}