public class LinkedList{
    private Node head;
    private int count;
    public LinkedList(){
        head = null;
        count = 0;
    }
    public LinkedList(Object dat){
        head = new Node(dat);
        count = 0;
    }
    public void add(Object data){
        Node g = new Node(data);
        if (head == null){
            head = g;
        }
        else{
            g.setNextPtr(head.getNextPtr());
            head.setNextPtr(g);
        }
        count++;
    }
    public void add(Object[] data){
        for (int i = 0; i < data.length; i++) {
            if (head == null){
                head = new Node(data[i]);
            }else{
                head.setNextPtrE(new Node(data[i]));
            }
        }
    }
    // gets top of List
    public Object pop(){
        Object g = get(size()-1);
        getN(size()-2).setNextPtr(null);
        return g;
    }
    public Object get(int index){
        Node g = head;
        try{
            for (int i = 0; i < index; i++){
                g = g.getNextPtr();
            }
        }catch(Exception IndexOutOfBoundsException){
            System.out.println(index + " is an invalid index");
        }
        return g;
    }

    private Node getN(int index){
        Node g = head;
        try{
            for (int i = 0; i < index; i++){
                g = g.getNextPtr();
            }
        }catch(Exception IndexOutOfBoundsException){
            System.out.println(index + " is an invalid index");
        }
        return g;
    }
    public String toString(){
        return head.printList();
    }
    public int size(){
        return count;
    }
}

