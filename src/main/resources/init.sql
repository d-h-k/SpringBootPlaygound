DROP TABLE IF EXISTS user;

CREATE TABLE user(
    id int auto_increment primary key,
    email varchar(64) unique not null,
    name varchar(64)
);

INSERT INTO user(email, name)
    values ('hinux@aho.com', 'honuz'), ('devdong@db.man', 'devdong');


explain select count(*) from user;

DESC user;

SELECT * from user;



DROP TABLE IF EXISTS github;

CREATE TABLE github(
    nickname varchar(64),
    photo varchar(255),
    `user` int references user(id)
);

DESC github;

INSERT INTO github(nickname, photo, user)
    values('hodor', 'https://a.com/ppp',1),
           ('pororo','https://a.com/pororo',2);

SELECT * from github;