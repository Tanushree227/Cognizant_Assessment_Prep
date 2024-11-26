public class ThisKeyword {
    String name;
    int age;
    
    ThisKeyword(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String get_name()
    {
        return name;
    }

    public void change_name(String name)
    {
        this.name = name;
    }

    public void printDetails()
    {
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println();
    }

    public static void main(String[] args) {
        ThisKeyword obj1 = new ThisKeyword("Tanushree", 25);
        ThisKeyword obj2 = new ThisKeyword("Ayush", 15);
        obj1.printDetails();
        obj2.printDetails();

        obj1.change_name("Tanu Shree");
        System.out.println("Name has been changed to: " +obj1.get_name());
    }
}
