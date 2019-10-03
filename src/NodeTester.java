public class NodeTester {
    public static void main(String [] args){
        Actor m = new Actor("Kate");
        m.setNextPtr(new Actor("John"));
        m.setNextPtr(new Actor("Sam"));
        m.setNextPtr(new Actor("Ryan"));
        m.add(new Actor("Noah"));
        System.out.println(m);
    }
}
