

public class books extends ReadingMaterial {

    private String mr;

    public books (String type, int pages, String genre, String actors){
        super(type, pages, genre, actors);
    }
    @Override
    public String readingM(String rm) {
        this.mr=rm;
        System.out.println("This is a book!!");
        return rm;
    }
}
