import java.util.*;
import java.io.IOException;
import java.io.File;
public class WordLadder{
    private char[] w1;
    private char[] w2;
    private LinkedList list;
    private Queue<char[]> q;
    private String[] dictionary;
    private Scanner sc;
    private String FileName;
    public WordLadder(String one, String two, String fName)throws IOException{
        FileName = fName;
        sc = new Scanner(new File(FileName));
        dictionary = diction();
        if (one.length()==two.length()){
            w1 = one.toCharArray();
            w2 = two.toCharArray();
            list = new LinkedList(w1);
        }
        else{
            System.out.println("Invalid Strings words are different lengths");
            w1 = null;
            w2 = null;
            list = null;
        }
        System.out.println(diff());
        System.out.println(list);
    }
    public void changeFile(String newFile){
        FileName = newFile;
    }
    private void resetScanner()throws IOException{
        sc = new Scanner(new File(FileName));
    }
    private void resetDictionary(){
        dictionary = diction();
    }
    private String[] diction(){
        Stack<String> arr = new Stack<String>();
        while(sc.hasNextLine()){
            arr.push(sc.nextLine());
        }
        String[] strR = new String[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            strR[i] = arr.pop();
        }
        return strR;
    }
    public void setFirst(String str){
        w1 = str.toCharArray();
    }
    public void setSecond(String str){
        w2 = str.toCharArray();
    }
    public void setWords(String str, String str2){
        setFirst(w1.toString());
        setSecond(w2.toString());
    }
    private int diff(){
        int num = -1;
        if(w1 == null){
            return num;
        }else{
            num = w1.length;
        }
        for(int i = 0; i < w1.length; i++){
            if(w1[i] == w2[i]) {
                num--;
            }
        }
        return num;
    }
    public void findLadders(Stack<String> arr){
        for(String str : dictionary){
            if(str.length() != w1.length) {

            }
            else{

            }
        }
    }
}




