package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false)
    private String body;

    //In your User and Post classes, define the post - user relationship.
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Post(String title, String body){
        this.title = title;
        this.body = body;
    }
    public Post(int id, String title, String body){
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Post() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
