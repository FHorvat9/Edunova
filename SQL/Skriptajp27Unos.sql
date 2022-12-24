drop database if exists edunovajp27Unos;
create database edunovajp27Unos;
use edunovajp27Unos;

create table smjer(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    cijena decimal(18,2),
    upisnina decimal(18,2),
    certificiran boolean
);

create table grupa(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    maksimalnopolaznika int not null,
    datumpocetka datetime,
    smjer int not null,
    predavac int
);

create table osoba(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    email varchar(50) not null,
    oib char(11)    
);

create table polaznik(
    sifra int not null primary key auto_increment,
    brojugovora varchar(20),
    osoba int not null
);

create table predavac (
    sifra int not null primary key auto_increment,
    iban varchar(50),
    osoba int not null
);

create table clan(
    grupa int not null,
    polaznik int not null
);

alter table grupa add foreign key (smjer) references smjer (sifra);
alter table grupa add foreign key (predavac) references predavac (sifra);

alter table clan add foreign key (polaznik) references polaznik (sifra);
alter table clan add foreign key (grupa) references grupa (sifra);

alter table polaznik add foreign key (osoba) references osoba (sifra);
alter table predavac add foreign key (osoba) references osoba (sifra);

insert into smjer
values(null,'Java programiranje',5999.99,500,true);

insert into smjer(sifra,naziv)
values(null,'PHP programiranje');

insert into smjer(sifra,naziv,cijena,upisnina,certificiran)
values(null,'Serviser',null,null,null);

#sifra 1
insert  into grupa(naziv,sifra,maksimalnopolaznika,datumpocetka,smjer,predavac)
values('JP27',null,20,'2022-11-07',1,null);

#sifra 2
insert  into grupa(naziv,maksimalnopolaznika,smjer,datumpocetka)
values('PP26',20,2,'2022-11-07 19:00:00');
