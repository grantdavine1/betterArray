//package edu.buffalo.cse116;

public class BetterArray {
    private Node head;
    private Node tail;
    private int noOfNodes;
    private Node recAddNode;

    public BetterArray(int n) {

        for(int i = 0; i < n; i++) {
        	
            Node node = new Node();
            
            if (i == 0) {
                head = node;
                head.prev = null;
                recAddNode = head;
                continue;
            }
            
            recAddNode.next = node;
            node.prev = recAddNode;
            recAddNode = node;
        }

        tail = recAddNode;
        tail.next = null;
        noOfNodes = n;
    }

    public BetterArray() {
        head = new Node();
        head.next = null;
        head.prev = null;
        tail = head;
        recAddNode = head;
    }

    public int get(int index) throws IndexOutOfBoundsException {
    	
        if(index < noOfNodes) {
        	
            int tempIndex = 0;
            Node temp = head;
            
            while (tempIndex < index) {
                temp = temp.next;
                tempIndex++;
            }
            
            recAddNode = temp;
            return temp.get();
        } 
        else{
            throw new IndexOutOfBoundsException("Index should be less than the number of nodes.");
        }
    }

    public void put(int value, int index) {
        if(index < noOfNodes) {
            int tempIndex = 0;
            Node temp = head;
            
            while (tempIndex < index) {
                temp = temp.next;
                tempIndex++;
            }
            
            recAddNode = temp;
            temp.set(value);
        } 
        else{
            recAddNode = tail;
            
            for (int i = noOfNodes; i <= index; i++) {
                Node node = new Node();
                recAddNode.next = node;
                node.prev = recAddNode;
                recAddNode = node;
            }
            
            tail = recAddNode;
            noOfNodes = index + 1;
            tail.set(value);
        }
    }

    public void insert(int value, int index) {
    	
        if (index == 0) {
            Node node = new Node(value);
            node.next = head;
            head = node;
            head.prev = null;
            noOfNodes++;
        } 
        else if(index < noOfNodes) {
            get(index);
            Node Prev = recAddNode.prev;
            Node node = new Node(value);
            Prev.next = node;
            node.next = recAddNode;
            node.prev = Prev;
            recAddNode.prev = node;
            noOfNodes++;
        } 
        else if(index == noOfNodes) {
            Node node = new Node(value);
            tail.next = node;
            node.prev = tail;
            tail = node;
            noOfNodes++;
        } 
        else{
            put(value, index);
        }

        get(index);
    }

    public void delete(int index) throws IndexOutOfBoundsException {
    	
        if(index < noOfNodes) {
            get(index);
            recAddNode.prev.next = recAddNode.next;
            recAddNode.next.prev = recAddNode.prev;
            recAddNode.prev = null;
            recAddNode.next = null;
        } 
        else{
            throw new IndexOutOfBoundsException("Index should be less than the number of nodes.");
        }
    }

    public void printArray(){
        Node temp = head;
        
        if(head.next == null){
            System.out.println("Empty Array!");
            return;
        }
        
        while(temp != null){
            System.out.println(temp.get());
            temp = temp.next;
        }
    }
}
