public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Node first = new Node(4);
        Node second = new Node(12);
        Node third = new Node(35);
        Node fourth = new Node(40);
        LinkedList myList = new LinkedList();
        myList.insert(first);
        myList.insert(second);
        myList.insert(third);
        myList.insert(fourth);
        System.out.println("my new list is :");
        System.out.println(myList);
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

    public void insert(Node newNode){
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
                stringList += ", " + Integer.toString(currentNode.data);
            }
            currentNode = currentNode.next;
        }
        return stringList;
    }
}