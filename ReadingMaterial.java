
public class ReadingMaterial {

    private String material;
    private int pages;
    private String genre;
    private String Characters;

    public ReadingMaterial(String type, int pages, String genre, String actors){
        this.material=type;
        this.pages=pages;
        this.genre=genre;
        this.Characters=actors;

    }

    public String readingM (String rm){

        System.out.println("This is a reading material!!");
        return rm;
    }


}
