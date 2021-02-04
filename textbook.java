public class textbook extends ReadingMaterial {

    public textbook(String type, int pages, String genre, String actor, String title){
        super(type,pages,genre,actor,title);
    }

    @Override
    public String readingM() {
        String rm="This is a Textbook";

        return rm;
    }
}
