public class Actor{
    private String name;
    private Actor next;
    private int count;
    public Actor(){
        next = null;
        name = "";
        count = 0;
    }
    public Actor(String nam){
        name = nam;
        count = 0;
    }
    public void add(Actor act){
        act.setNextPtr(this.getNextPtr());
        this.next = act;
    }
    public String getName(){
        return name;
    }
    public void setName(String nam){
        name = nam;
    }
    public Actor getNextPtr(){
        return next;
    }
    private void setEnd(Actor base, Actor act){
        Actor g = new Actor();
        if (base.getNextPtr()!= null){
            setEnd(base.getNextPtr(),act);
        }
        else{
            base.next = act;
        }
    }
    public void setNextPtr(Actor nex){
        setEnd(this,nex);
        count++;
    }
    private String goToEnd(Actor base,String str){
        if (base.getNextPtr() != null) {
            str += base.getNextPtr().getName() + ",";
            return goToEnd(base.getNextPtr(), str);
        }
        return str + "]";
    }
    public String toString(){
        String s = "";
        if (!(this.name.equals(""))){
            s = this.name + ", ";
        }
        return goToEnd(this,"["+s);
    }
    public int size(){
        return count;
    }
    public Actor get(int index){
        Actor g = this;
        try{
            for (int i = 0; i < index; i++) {
                g = g.getNextPtr();
            }
        }catch(Exception IndexOutOfBoundsException){
            System.out.println("Invalid index");
        }
        return g;
    }
}
