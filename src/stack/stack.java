package stack;
import java.util.Scanner;
 class STACKEXAMPLE
{
    int arr[];
    int top;
    STACKEXAMPLE()
    {
        arr= new int[5];
        top=-1;
    }
    void push()
    {
//        System.out.println("push func is working");
        if(top==arr.length-1)
        {
            System.out.println("Stack full/overflow");
        }
        else
        {
            System.out.println("Enter data");
            Scanner sc1 = new Scanner(System.in);
            int data = sc1.nextInt();

            top=top+1;
            arr[top]=data;
            System.out.println("data inserted....");

        }
    }
    void pop()
    {
//       System.out.println("pop func is working");
        if(top==-1)
        {
            System.out.println("stack empty/underflow");
        }
        else
        {
            System.out.println("deleted //..."+arr[top]);
            top=top-1;
        }
    }
    void view()//for traverse
    {
        if(top==-1)
        {
            System.out.println("Stack empty/underflow");

        }
        else

        {
            System.out.println("Stack elements....");
            for(int i=top;i>=0;i--)
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String args[])
    {
        STACKEXAMPLE obj = new STACKEXAMPLE();
        while(true)
        {
            System.out.println("\npress 1 for push");
            System.out.println("press 2 for pop");
            System.out.println("press 3 for view");
            System.out.println("press 4 for exit");

            System.out.println("Enter our choice");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.view();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}



