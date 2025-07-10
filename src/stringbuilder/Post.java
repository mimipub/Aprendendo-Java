package stringbuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static stringbuilder.Programa.sdf;

public class Post {
    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private Comment comment;
    List<Comment> comments = new ArrayList<>();

    public Post() {
    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCcontent() {
        return content;
    }

    public void setCcontent(String ccontent) {
        this.content = ccontent;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Comment getComent() {
        return comment;
    }

    public void setComent(Comment comment) {
        this.comment = comment;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("comments: \n");

        for(Comment c : comments){
            sb.append(c.getText() + "\n");
        }
        return sb.toString();
    }
}