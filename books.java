

public class books extends ReadingMaterial {



    public books (String type, int pages, String genre, String actors, String title){
        super(type, pages, genre, actors,title);
    }
    @Override
    public String readingM() {
        String rm="This is a book!!";
        return rm;
    }
}
