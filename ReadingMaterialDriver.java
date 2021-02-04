import java.util.*;
//this is pretty much done you just have to think of the different methods that you can add as it relates to reading
public class ReadingMaterialDriver {

public static void main (String[] args){

    Scanner scan = new Scanner(System.in);

    ReadingMaterial r = new ReadingMaterial("Reading material",500,"General","None", "Reading Material I");
    books book = new books("Book", 100,"cooking book","None","The Juicing Bible");
    novel nov = new novel("Novel",150,"Murder mystery","nancy drew", "Nancy Drew Murder mystery");
    magazine vogue = new magazine("Magazine",20,"Fashion","None","Becoming Michelle obama");
    technicalJournal tj = new technicalJournal("Technical Journal", 145, "Science","none","The Journal of " +
            "TiawoJoseph 2020-2090");
    textbook JSS = new textbook("Textbook", 800,"Programming","none","Java Software Solutions");

    System.out.print(r+" "+ '\t'+ book +" "+ '\t'+nov+" "+'\t'+vogue+" "+'\t'+tj+" "+'\t'+JSS );
    System.out.println(r.readingM() +" "+'\t'+ JSS.readingM());

}

}
