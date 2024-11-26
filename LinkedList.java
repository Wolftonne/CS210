class LinkedList
{
    private Link first;

    public LinkedList()
    {
        first = null;
    }

    public boolean isEmpty()
    {
        return (first == null);
    }

    public void insertHead(int number)
    {
        Link newLink = new Link(number);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteHead()
    {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void display()
    {
        Link current = first;
        while(current!=null)
        {
            current.displayLink();
            current = current.next;            
        }
    }

    public Link delete(int key)
    {
        Link current = first;
        Link previous = first;
        while(current.data!=key)
        {
            if(current.next==null)
            {
                return null;
            }
            else
            {
                previous = current;
                current = current.next;
            }
        }
        if(current==first)
        {
            first = first.next;
        }
        else
        {
            previous.next = current.next;
        }
        return current;
    }
}
