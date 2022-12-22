drop database if exists edunovajp27;
create database edunovajp27;
use edunovajp27;
create table smjer(
    sifra int,
    naziv varchar(50),
    cijena decimal(18,2),
    upisnina decimal(18,2),
    certificiran boolean
);

create table grupa(
    sifra int,
    naziv varchar(50),
    maksimalnopolaznika int,
    datumpocetka datetime,
    smjer int,
    predavac int
);