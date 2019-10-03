public class Node {
    private Object data;
    private Node next;
    private int count;
    public Node(){
        data = null;
        next = null;
        count = 0;
    }

    public Node(Object dat){
        data = dat;
        next = null;
        count = 0;
    }

    private void setEnd(Node base, Node n){
        Node g = new Node();
        if (base.getNextPtr()!= null){
            setEnd(base.getNextPtr(),n);
        }
        else{
            base.next = n;
        }
    }

    public void set(Object dat){
        data = dat;
    }

    public Node get(int index){
        Node g = this;
        try{
            for (int i = 0; i < index; i++) {
                g = g.getNextPtr();
            }
        }catch(Exception IndexOutOfBoundsException){
            System.out.println("Invalid index");
        }
        return g;
    }

    public void setNextPtrE(Node nex){
        setEnd(this,nex);
        count++;
    }
    public void setNextPtr(Node nex){
        next = nex;
        count++;
    }

    public Node getNextPtr(){
        return next;
    }

    private String goToEnd(Node base,String str){
        if (base.getNextPtr() != null){
            str += "" + base.getNextPtr()+",";
            return goToEnd(base.getNextPtr(),str);
        }
        return str + "]";
    }

    public String printList(){
        String s = "";
        if (this.data != null){
            s = this.data + ", ";
        }
        return goToEnd(this,"["+s);
    }

    public String toString(){
        String str = ""+data;
        return str;
    }

    public int size(){
        return count;
    }
}
