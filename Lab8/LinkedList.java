class LinkedList
{
    Link head; //head of the list, starting point

    public LinkedList()
    {
        head = null;
    }

    //add link, ordering alpghabetically by 'name'
    public void addLink(String country, String city)
    {
        Link newLink = new Link(country, city);
        //if empty, add to first pos of the link
        if(head == null) 
        {            
            head = newLink;        
        } else { //otherwise, go to end of list
            Link current = head;
            while(current.next!=null) { //move until the last link
                current = current.next;
            }
            current.next = newLink; //adds the link at the end
        }       
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

    //creates a loop in the list by connecting one link to another
    public void createLoop(int fromIndex, int toIndex) { // from index and to index tell it at what position to cause the loop
        Link fromLink = getLinkAt(fromIndex); //finds the from link
        Link toLink = getLinkAt(toIndex); //finds the to link
        if(fromLink != null && toLink != null) {
            fromLink.next = toLink;  //creates a loop by pointing 'from link' to  'to link'
        }
    }

    //method to retrieve a link at a specific index, used in the method above
    private Link getLinkAt(int index) {
        Link current = head; //starts from the head
        int count = 1; // keeps track of the position
        while (current != null && count < index) { //traverses until the desired pos
            current = current.next;
            count++;
        }
        return current; //returns the link at the given index
    }
    
    //method to detect and return the starting link of a loop 
    public Link detectLoop() {
        Link slow = head; // slow pointer, moves one step at a time
        Link fast = head; // fast pointer moves two steps at a time

        //step 1, detects if a loope exists using two pointer technique
        while(fast != null && fast.next != null) {
            slow = slow.next; //moves slow one step
            fast = fast.next.next; //moves fast two steps
            
            if(slow == fast) {
                //detects loop, then finds the start
                slow = head; //reset slow pointer back to the head
                while(slow != fast) { //moves both pointers one step
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // starting link of the loop
            }
        }
        return null; // if no loop is found
    }
}
