drop database if exists zupanije;
create database zupanije;
use zupanije;

create table zupanija(
    sifra int not null primary key auto_increment,
    naziv varchar (50),
    zupan int
);

create table zupan(
    sifra int  not null primary key auto_increment,
    ime varchar(20),
    prezime varchar(20)    
);

create table opcina(
    sifra int not null primary key auto_increment,
    zupanija int,
    naziv varchar(50) 
);

create table mjesto(
    sifra int not null primary key auto_increment,
    opcina int,
    naziv varchar(50) 
);





alter table zupanija add foreign key (zupan) references zupan(sifra);
alter table opcina add foreign key (zupanija) references zupanija(sifra);
alter table mjesto add foreign key (opcina) references opcina(sifra);


