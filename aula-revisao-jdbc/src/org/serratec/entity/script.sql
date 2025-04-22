create table funcionario (
id serial primary key,
nome varchar(50) not null,
email varchar(30) unique not null
);

insert into funcionario (nome, email) values ('Carla','carla@gmail.com');

select * from funcionario;