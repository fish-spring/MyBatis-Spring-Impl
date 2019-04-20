create database if not exists mybatis_spring;
use mybatis_spring;

create table monkey(
  id int primary key auto_increment,
  name char(30) not null ,
  password char(30) not null
);

insert into monkey(name, password)
VALUES ('Sun WuKong', '123456');

select * from monkey;