DROP TABLE IF EXISTS user;

CREATE TABLE user(
    id int auto_increment primary key,
    email varchar(64) unique not null,
    name varchar(64)
);

INSERT INTO user(email, name)
    values ('hinux@aho.com', 'honuz'), ('devdong@db.man', 'devdong');

--explain select count(*) from user;
--여기서만 안돌고 터미널이나 시퀄에서는 잘도는 쿼리


-- 야 저거 위에 경고창 뜨는거 어캐없애냐 나중에 없애놔라