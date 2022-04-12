package LinkedList;

import java.util.Scanner;
class  Node
{
    int rollno;
    Node next;
}
public class SinglyLinkedList
{
    Node START;
    SinglyLinkedList()
    {
        START=null;
    }
    void insert()
    {
        System.out.println("Enter ur rollnumber");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        Node nn = new Node();
        nn.rollno = data;
        nn.next = null;

        if(START==null)
        {
            START=nn;
        }
        else
        {
            Node current = START;
            while(current.next!=null)
            {
                current = current.next;
            }
            current.next=nn;
        }
        System.out.println("data inserted....");
    }

    void delete(){
//        System.out.println("delete fn is working");
        if(START==null)
        {
            System.out.println("List empty");
        }
        else
        {
            System.out.println("deleted...."+START.rollno);
            if(START.next==null)
            {
                START=null;
            }
            else
            {
                START= START.next;
            }
        }
    }
    void deleteAll()
    {
        if(START==null)
        {
            System.out.println("List empty");
        }
        else
        {
            System.out.println("All element deleted");
            START=null;
        }
    }
    void traverse()
    {
        if(START==null)
        {
            System.out.println("List empty");
        }
        else
        {
            System.out.println("----list element----");
            Node current;
            for(current=START;current !=null;current=current.next)
            {
                System.out.println(" "+current.rollno);
            }

        }
    }
    public static void main(String[]args)
    {
        SinglyLinkedList obj= new SinglyLinkedList();
        while(true)
        {
            System.out.println("\npress 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for traverse");
            System.out.println("press 4 for Exit");
            System.out.println("press 5 for deleteAll");

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
                case 5:
                    obj.deleteAll();
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}


