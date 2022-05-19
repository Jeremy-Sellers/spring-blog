USE spring_blog_db;
#3. Seed a couple of entries into the PostDetails and Posts table
INSERT INTO posts(id,title,body) VALUES (3,'third title','body of third ad');

INSERT INTO posts_details(id, history_of_post, is_awesome, topic_description, post_id) VALUES (1,'Created now',true,'this is the topic description',1);

INSERT INTO posts_details(id, history_of_post, is_awesome, topic_description, post_id) VALUES (2,'Created now',false,'second topic description',2);
#4. Add a GetMapping method to the PostController that returns a simple view that displays a given post’s historyOfPost detail.

