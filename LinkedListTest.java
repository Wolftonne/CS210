import java.util.Scanner;

public class LinkedListTest
{
    public static void main(String[] args) 
    {
        
        //Create linked list and add links (people)
        LinkedList linkedList = new LinkedList();
        linkedList.addLink("Bunny", 26, "CSSE", 2);
        linkedList.addLink("Larry", 18, "ARTS", 1);
        linkedList.addLink("Steve", 32, "Computational Thinking", 4);
        


        Scanner scanner = new Scanner(System.in);
        String attrib = "";
        String value = "";
        String action = "";        
        
        System.out.println("Enter name/age/degree/yearOfStudy/print/NewLink");
        attrib = scanner.next();

        if(attrib.equals("name"))
        {
            System.out.println("Enter which person");
            value = scanner.next();           
            System.out.println("print/remove");
            action = scanner.next();
            if(action.equals("print"))
            {
                linkedList.printByAttribute(attrib, value);
            } 
            else if(action.equals("remove"))
            {
                linkedList.removeByAttribute(attrib, value);
                System.out.println("New List: ");
                linkedList.printList();
            }                          
        }
        else if(attrib.equals("age"))
        {
            System.out.println("Enter what age");
            value = scanner.next();
            System.out.println("print/remove");
            action = scanner.next();
            if(action.equals("print"))
            {
                linkedList.printByAttribute(attrib, value);
            }
            else if(action.equals("remove"))
            {
                linkedList.removeByAttribute(attrib, value);
                System.out.println("New List: ");
                linkedList.printList();
            }    
        }
        else if(attrib.equals("NewLink"))
        {
            linkedList.addLink(scanner.next(), scanner.nextInt(), scanner.next(), scanner.nextInt());
            linkedList.printList();
        }
        else if(attrib.equals("degree"))
        {
            System.out.println("Enter what degree");
            value = scanner.next();
            System.out.println("print/remove");
            action = scanner.next();
            if(action.equals("print"))
            {
                linkedList.printByAttribute(attrib, value);
            }
            else if(action.equals("remove"))
            {
                linkedList.removeByAttribute(attrib, value);
                System.out.println("New List: ");
                linkedList.printList();
            }    
        }

        else if(attrib.equals("yearOfStudy"))
        {
            System.out.println("Enter what year of study");
            value = scanner.next();
            System.out.println("print/remove");
            action = scanner.next();
            if(action.equals("print"))
            {
                linkedList.printByAttribute(attrib, value);
            }
            else if(action.equals("remove"))
            {
                linkedList.removeByAttribute(attrib, value);
                System.out.println("New List: ");
                linkedList.printList();
            }    
        }       
        else if(attrib.equals("print"))
        {
            linkedList.printList();
        } 

        scanner.close();
    }
}
