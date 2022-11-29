import java.util.HashMap;

public class BookGenre {
    public static void main(String[] args) {
        HashMap<String, String> bookGenre = new HashMap<String, String>();

        bookGenre.put("Lord of The Rings", "Fantasy");

        String fantasy = bookGenre.get("Lord of The Rings");
        Integer fantasyCount = bookGenre.size();

        String output = String.format("There are %s %s books", fantasyCount, fantasy);
        System.out.println(output);
    }
}
