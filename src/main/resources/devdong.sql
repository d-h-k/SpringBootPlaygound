DROP TABLE IF EXISTS user;

CREATE TABLE user(
    id int auto_increment primary key,
    email varchar(64) unique not null,
    name varchar(64),
    nickname varchar(64),
    photo_url varchar(255)
);

INSERT INTO user(email, name, nickname, photo_url) values
                                                          ('hinux@aho.com', 'honuz', 'hodor', 'https://a.com/ppp'),
                                                          ('devdong@db.man', 'devdong', 'pororo', 'https://a.com/pororo'),
                                                          ('navergogo@naver.com', 'dhkim', 'DongHunKim', 'https://www.donghunkim.com');
explain select count(*) from user;

DESC user;

SELECT * from user;


DROP TABLE IF EXISTS food;

CREATE TABLE food(
  name varchar(64),
  cal int,
  user int references user(id),
  expired_date datetime
);


CREATE INDEX food_idx on food(name); -- 인덱스를 새로 만들어줌
-- 인덱스가 생기면 pk랑 같이 정렬되고, 원래는 검색에 O(n) 인데, LogN으로 변경됨
-- 꽁짜 점심은 없다 인덱스 너무많이 만들면 삽입하는데 시간 오래걸림


CREATE INDEX food_idx2 on food(name,expired_date); -- 복합인덱스
-- 복합인덱스 용도 : 두개 조건으로 동시에 검색할 때 사용됨
select * from food where name='마라탕' and expired_date <= '2021-05-30';
-- 예를들면 위 쿼리의 의도같은 경우


INSERT INTO food (name,cal,user, user_key)values
('crab',1000,1,'crab'),
('gogi',250,1,'gogi'),
('chicken',1770,2,'chicken'),
('buger',1000,3,'buger');


DESC food;

SELECT * from food;


#  1:1 관계는 그냥 하나로 합쳐라, 왜냐하면 조인같은 헛짓거리를 하니까 말아지 >> 이미 사라진 user 와 1:1 관계였던 깃헙객체엔티티의 자리
#DROP TABLE IF EXISTS github;
#DESC github;
#INSERT INTO github(nickname, photo_url, user)
#    values('hodor', 'https://a.com/ppp',1),
#           ('pororo','https://a.com/pororo',2);
#SELECT * from github;
