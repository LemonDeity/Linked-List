import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.Stack;
public class MovieTester {
    public static void main(String [] args)throws IOException{
        LinkedList actors = new LinkedList("Noah");
        actors.add("Naomi");
        Object[] d = {"John","David"};
        LinkedList directors = new LinkedList();
        directors.add(d);
        Movie StarWars = new Movie("11/9","StarWars",actors,directors);

        LinkedList Movies = new LinkedList(StarWars);
        Movies.add(fill("MovieTestFile.dat"));
        System.out.println(Movies);
    }
    public static Stack<Object> fill(String fileName)throws IOException{
        Scanner kb = new Scanner(new File(fileName));
        Movie[] arr = new Movie[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Movie();
        }
        int index = 0;
        int num = -1;
        while(kb.hasNextLine()){
            String st = kb.nextLine();
            if (st.equals("begin")){
                num = 0;
            }else if(st.equals("end")){
                num = -1;
                index++;
            }else{
                switch(num){
                    case -1:
                        break;
                    case 0:
                        //Title
                        arr[index].setTitle(st);
                    case 1:
                        //Date
                        arr[index].setDate(st);
                    case 2:
                        //Actors
                        LinkedList act = new LinkedList();
                        String[] s = st.split(",");
                        for (int i = 0; i < s.length; i++) {
                            act.add(s[i]);
                        }
                        arr[index].setActors(act);
                    case 3:
                        LinkedList dir = new LinkedList();
                        s = st.split(",");
                        for (int i = 0; i < s.length; i++) {
                            dir.add(s[i]);
                        }
                        arr[index].setDirectors(dir);
                     num++;
                }
            }
        }
        Stack<Object> arr2 = new Stack<Object>();
        for (int i = 0; arr[i].getDirectors() != null; i++) {
            arr2.push(arr[i]);
        }
        return arr2;
    }
}
