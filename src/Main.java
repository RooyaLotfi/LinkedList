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
        myList.insertFront(new Node(500));
        myList.insertMiddle(new Node(4321),2);
        myList.insertMiddle(new Node(4321),20);
        System.out.println("my new list is :");
        System.out.println(myList);
        printAnyList(myList.head);
    }

    public static void printAnyList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.data+", ");
            curr = curr.next;
        }
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

    public void insertFront(Node newNode){
        if(this.head == null){
            this.head = newNode;
            head.next = null;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertMiddle(Node newNode, int index){
        Node currentNode = this.head;
        for(int i = 0; i < index - 1 && currentNode != null ; i++){
            currentNode = currentNode.next;
        }

        if(currentNode!=null){
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        } else{
            System.out.println("index is too big");
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