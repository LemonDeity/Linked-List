public class Movie{
    private String date;
    private String title;
    private LinkedList actors;
    private LinkedList directors;
    public Movie(){
        date = null;
        title = null;
        actors = null;
        directors = null;
    }
    public Movie(String date, String title, LinkedList actors, LinkedList directors){
        this.date = date;
        this.title = title;
        this.actors = actors;
        this.directors = directors;
    }
    public void setDate(String str){
        date = str;
    }
    public void setTitle(String str){
        title = str;
    }
    public LinkedList getActors(){
        return actors;
    }
    public LinkedList getDirectors(){
        return directors;
    }
    public void setActors(LinkedList list){
        actors = list;
    }
    public void setDirectors(LinkedList list){
        directors = list;
    }
    public String toString(){
        String str = "";
        str += title+"\n";
        str += "Directors: "+directors+"\n";
        str += "Actors: "+actors+"\n";
        str += date+"\n";
        return str;
    }
}


