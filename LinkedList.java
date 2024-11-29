class LinkedList
{
    Link head; //head of the list

    public LinkedList()
    {
        head = null;
    }

    //add link, ordering alpghabetically by 'name'
    public void addLink(String name, int age, String degree, int yearOfStudy)
    {
        Link newLink = new Link(name, age, degree, yearOfStudy);
        //if empty, add to first pos of the link
        if(head == null || head.name.compareTo(name) > 0)
        {
            newLink.next = head;
            head = newLink;
            return;
        }

        Link current = head;
        //compares the 'name' of each link. if 'current.next.name.compareTo(name) < 0' is  true, it means the current links 'name' is lexicographically smaller than the new links name.
        while(current.next!= null && current.next.name.compareTo(name) < 0)
        {
            current = current.next;
        }

        newLink.next = current.next;
        current.next = newLink;
    }



    public void printList()
    {
        Link current = head;
        if(current == null)
        {
            System.out.println("List is empty");
            return;
        }

        while(current!= null)
        {            
            System.out.println(current);
            current=current.next;
        }
    }

    public void removeByAttribute(String attribute, String value)
    {
        Link current = head;
        Link previous = null;

        while(current != null)
        {
            if(attribute.equals("name") && current.name.equals(value) ||
               attribute.equals("degree") && current.degree.equals(value) ||
               attribute.equals("age") && Integer.toString(current.age).equals(value) ||
               attribute.equals("yearOfStudy") && Integer.toString(current.yearOfStudy).equals(value))
               {
                if(previous==null)
                {
                    head = current.next;
                }
                else
                {
                    previous.next = current.next;
                }
                System.out.println("Removed: " + current);
                return;
               }
               previous=current;
               current=current.next;
        }
        System.out.println("Item with " + attribute + " = " + value + " not found");
    }


    public void printByAttribute(String attribute, String value)
    {
        Link current = head;
        boolean found = false;

        while(current!=null)
        {
            if(attribute.equals("name") && current.name.equals(value) ||
               attribute.equals("degree") && current.degree.equals(value) ||
               attribute.equals("age") && Integer.toString(current.age).equals(value) ||
               Integer.toString(current.yearOfStudy).equals(value))
               {
                System.out.println(current);
                found = true;
               }
               current = current.next;
        }
        if(!found)
        {
            System.out.println("No person found with " + attribute + " = " + value + ".");
        }
    }
}
