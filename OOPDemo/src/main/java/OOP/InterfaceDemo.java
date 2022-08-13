package OOP;


public class InterfaceDemo
{
    public static void main(String[] args)
    {
        my_class a  =  new my_class();

        a.some_method();

        System.out.println("The Value of constant is:" + my_interface.my_int);

        a.some_default();
        my_interface.some_static();



        Normal_Member m = new Normal_Member("test",15,2010);
        m.dispMemberInfo();
    }
}


class my_class implements my_interface
{
    @Override
    public void some_method()
    {
        System.out.println("This is a method implemented in my_class");
    }
}

interface my_interface
{
        int my_int = 5;

        void some_method();

        public static void some_static()
        {
            System.out.println("This is a static method in an interface");
        }
        public default void some_default()
        {
            System.out.println("This is the default method in an interface.");
        }
}