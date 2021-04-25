DROP TABLE IF EXISTS user;

CREATE TABLE user(
    id int auto_increment primary key,
    email varchar(64) unique ,
    name varchar(64)
);

INSERT INTO user(email, name)
    values ('hinux@aho.com', 'honuz'), ('devdong@db.man', 'devdong');

