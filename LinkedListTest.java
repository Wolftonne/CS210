import java.util.Scanner;

public class LinkedListTest
{
    public static void main(String[] args) 
    {
        
        //Create linked list and add links (people)
        LinkedList linkedList = new LinkedList();
        linkedList.addLink("James", 26, "CSSE", 2);
        linkedList.addLink("Larry", 18, "ARTS", 1);
        linkedList.addLink("Steve", 32, "Computational Thinking", 4);


        /* 
        //Print out the entire list
        System.out.println("List of people: ");
        linkedList.printList();

        //Example 1: Print person with specific name "bunny"
        System.out.println("\nSearching for person with name = Bunny:");
        linkedList.printByAttribute("name", "Bunny");

        //Example 2: Remome person with age 26
        System.out.println("\nRemoving person with age =  26:");
        linkedList.removeByAttribute("age", "26");

        //Print list after removal
        System.out.println("\nList after removal:");
        linkedList.printList();

        //Example 3: Try to print person with degree "ARTS"
        System.out.println("\nSearching for person with degree = ARTS: ");
        linkedList.printByAttribute("degree", "ARTS");
        */




        Scanner scanner = new Scanner(System.in);
        String attrib = "";
        String person = "";
        while(!attrib.equals("print"))
        {
            System.out.println("Enter name/age/degree/yearOfStudy");
            attrib = scanner.next();
            System.out.println("Enter which person");
            person = scanner.next();

            if(attrib.equals("name"))
            {
                if(person.equals("Bunny") || person.equals("Larry") || person.equals("Steve"))
                {
                    linkedList.printByAttribute(attrib, person);
                }                
            }
        } 
    }
}
