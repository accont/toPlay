package test;
class Tree
{
    static
    {
        System.out.println("静态块。"); // 1  -2
        staticColor = "Red ";
    }

    public static String staticColor = getStaticColor();

    public String instanceColor = getInstanceColor();


    {
        System.out.println("实例块。"); // 2
        instanceColor = "Brown";
    }

    public Tree()
    {
        System.out.println("构造方法"); // 3
    }

    public static String getStaticColor()
    {
        System.out.println("静态方法。"); // 4  -1
        return "Green -1";
    }

    public String getInstanceColor()
    {
        System.out.println("实例方法。"); // 5  -3
        return "Yellow -3";
    }
}


public class AboutCount
{
    public static void main(String[] args)
    {
        System.out.println(Tree.staticColor); // 6
        Tree tree = new Tree();
        System.out.println(tree.instanceColor); // 7
    }
}