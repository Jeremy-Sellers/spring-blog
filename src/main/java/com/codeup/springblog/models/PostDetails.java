package com.codeup.springblog.models;

import org.w3c.dom.Text;

import javax.persistence.*;
import java.awt.*;

@Entity
@Table(name = "posts_Details")
public class PostDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private boolean isAwesome;
    @Column(nullable = false, length = 255)
    private String historyOfPost;
    @Column(nullable = false, length = 255)
    private String topicDescription;
    //post_details belongs to individual Post
    @OneToOne
    private Post post;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHistoryOfPost() {
        return historyOfPost;
    }

    public void setHistoryOfPost(String historyOfPost) {
        this.historyOfPost = historyOfPost;
    }

    public String getTopicDescription() {
        return topicDescription;
    }

    public void setTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
    }

    public void setAwesome(boolean awesome) {
        isAwesome = awesome;
    }

    public boolean getIsAwesome() {
        return isAwesome;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
