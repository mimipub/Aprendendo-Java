package stringbuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa {

    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public static void main(String[] args) throws ParseException {
        Comment comment = new Comment("Have a nice trip!");
        Comment comment1 = new Comment("how thats´s awesome!");

        Post post = new Post(sdf.parse("21/06/2023 13:05:44"), "Traveling to New Zealand", "I´m going to visit this wonderful country!", 12);

        post.addComment(comment);
        post.addComment(comment1);

        Comment comment2 = new Comment("Good night!");
        Comment comment3 = new Comment("may the force be with you!");

        Post post1 = new Post(sdf.parse("28/07/2023 23:14:19"),
                "Traveling to New Zealand",
                "se you tomorrow!",
                5);

        post1.addComment(comment2);
        post1.addComment(comment3);

        System.out.println(post);
        System.out.println(post1);
    }
}