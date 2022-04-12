package Queue;

import java.util.Scanner;

class SinglyQueue
{
    int ar[];
    int front,Rear;
    SinglyQueue()
    {
        ar= new int[5];
        front=-1;
        Rear=-1;
    }
    void insert()
    {
        if(Rear==ar.length-1)
        {
            System.out.println("Queue full");
        }
        else
        {
            System.out.println("Enter data");
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();

            if(front==-1)
            {
                front=0;
            }
            Rear = Rear +1;
            ar[Rear]=data;
            System.out.println("data inserted....");
        }
    }


    void delete()
    {

        if(front==-1)
        {
            System.out.println("Queue empty");
        }
        else
        {
            System.out.println("deleted ..."+ar[front]);
            if(front==Rear)
            {
                front=-1;
                Rear=-1;
            }
            else if(front<Rear)
            {
                front=front+1;
            }
        }

    }
    void traverse()
    {
        if(front==-1 || Rear==-1)
        {
            System.out.println("Singly Queue empty");
        }
        else
        {
            for(int i=front;i<Rear;i++)
            {
                System.out.print(" "+ar[i]);
            }
        }
    }
    public static void main(String args[])
    {
        SinglyQueue obj= new SinglyQueue();
        while(true)
        {
            System.out.println("\npress 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for traverse");
            System.out.println("press 4 for Exit");

            System.out.println("Enter ur choice");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.traverse();
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




