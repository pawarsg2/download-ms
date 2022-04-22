
CREATE TABLE user_comments (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  user_id INT NOT NULL,
  comment_text VARCHAR(250) DEFAULT NULL
);
insert into user_comments
(id,user_id,comment_text)
values(10001,101,'Good song');
