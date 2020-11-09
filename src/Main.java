public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Node first = new Node(4);
        Node second = new Node(12);
        Node third = new Node(35);
        Node fourth = new Node(40);
        LinkedList myList = new LinkedList();
        myList.insertEnd(first);
        myList.insertEnd(second);
        myList.insertEnd(third);
        myList.insertEnd(fourth);
        myList.insertEnd(new Node(400));
        System.out.println("my new list is :");
        System.out.println(myList);
        System.out.println("head of this list is " + myList.head.data);
    }
}

class Node{
    int data;
    Node next;

    Node(int newNode){
        data = newNode;
    }
}

class LinkedList{
    Node head;

    LinkedList(){
        this.head = null;
    }

    public void insertEnd(Node newNode){
        if(this.head == null) {
            head = newNode;
            newNode.next = null;
        }
        else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode.next = null;
        }
    }

    public String toString(){
        Node currentNode = head;
        String stringList = "";
        while(currentNode!= null){
            if(currentNode == head)
                stringList = Integer.toString(currentNode.data);
            else{
                stringList += ", " + currentNode.data;
            }
            currentNode = currentNode.next;
        }
        return stringList;
    }
}