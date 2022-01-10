package oop.post;

import java.util.ArrayList;
import java.util.Arrays;

public class Post {
    public String title; // заголовок
    public String content; // содержание
    public String[] tags; // теги
    public ArrayList<PostComment> comments; //комментарии

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public void setComments(ArrayList<PostComment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        String result = "post{" + "title='" + title + '\'';
        if (content != null) {
            result += ", content.length=" + content.length();
        } else {
            result += ", content=null";
        }
        return result + ", tags=" + Arrays.toString(tags)
                + ", comments=" + comments.toString()
                + '}';
    }
}
