
public class ReadingMaterial {

    private String material;
    private int pages;
    private String genre;
    private String Characters;
    private String title;

    public ReadingMaterial(String type, int pages, String genre, String actors,String title){
        this.material=type;
        this.pages=pages;
        this.genre=genre;
        this.Characters=actors;
        this.title=title;
    }

    public String readingM (){

      String rm= "This is a Reading Material";
        return rm;
    }

    @Override
    public String toString() {
        String result= "The type of Reading material is: " +material+"\n";
        result+="The number of pages is: "+pages+"\n";
        result+="The genre is: "+genre+"\n";
        result+="The Characters in this reading material are: "+Characters+"\n";
        result+="The title of this Reading material is: "+title+"\n";
        result+='\t';

        return result;
    }
}
