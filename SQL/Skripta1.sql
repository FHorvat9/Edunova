drop database if exists uprava;
create database uprava;
use uprava;

create table zupanija(
    sifra int not null primary key auto_increment,
    naziv varchar(25),
    zupan varchar(25)
);

create table opcina(
    sifra int not null primary key auto_increment,
    zupanija int(25),
    naziv varchar(25)
);

alter table opcina add foreign key (zupanija) references zupanija(sifra);

