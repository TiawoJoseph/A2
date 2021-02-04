public class technicalJournal extends ReadingMaterial {

    public technicalJournal(String type,int pages, String genre, String actor, String title){
        super(type,pages,genre,actor,title);
    }

    @Override
    public String readingM() {

        String rm="This is a technical Journal!!";
        return rm;
    }
}
