public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLink("Ireland", "Dublin");
        linkedList.addLink("Kuwait", "Kuwait City");
        linkedList.addLink("Argentina", "Buenos Aires");
        linkedList.addLink("South Africa", "Cape Town");
        linkedList.addLink("Saint Lucia", "Castries");
        linkedList.addLink("Benin", "Porto-Novo");
        
        //creates a loop: link 6 -> link 3
        linkedList.createLoop(6, 3);

        //detects loop
        Link loopLink = linkedList.detectLoop();
        if(loopLink != null) {
            System.out.println("Loop caused by link with data " + loopLink.city);
        } else {
            System.out.println("No loop detected");
        }
        
    }
}
