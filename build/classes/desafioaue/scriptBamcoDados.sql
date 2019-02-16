CREATE DATABASE DataBase;

create table contato (
    codcontato integer primary key not null,
    nome varchar(50) not null,
    sexo varchar(1) not null,
    cidade varchar(50) not null,
    dia integer not null,
    mes integer not null,
    ano integer not null
);
