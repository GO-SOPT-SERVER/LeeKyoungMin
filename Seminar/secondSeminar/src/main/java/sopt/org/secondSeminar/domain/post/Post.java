package sopt.org.secondSeminar.domain.post;

import lombok.Getter;

@Getter
public class Post {
    private Long id;
    private String title;
    private String content;

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id: " + this.id + "\n" +
                "title: " + this.title + "\n" +
                "content: " + this.content;
    }
}
