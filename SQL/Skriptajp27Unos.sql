drop database if exists edunovajp27Unos;
create database edunovajp27Unos default charset utf8;
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

insert into osoba(ime,prezime,email)
values
('Kristijan','Ratković','ratkovic.kristijan@gmail.com'),
('Kristijan','Vidaković','kristijan.vidakovic111@gmail.com'),
('Isidora','Karan','karanisidora@hotmail.com'),
('Martina','Novoselac','novoselac.martina@gmail.com'),
('Lorena','Čiček','cicek.lorena@gmail.com'),
('Marko','Mijatović','mijat5555@gmail.com'),
('Marko','Perak','markoperak469@gmail.com'),
('Lovre','Burazer-Pavešković','lburazer8@gmail.com'),
('Krunoslav','Kasalo','kkruno25@msn.com'),
('Karlo','Odobašić','karloodobasic26@gmail.com'),
('Karlo','Kapl','kaplkarlo0@gmail.com'),
('Ivan','Dubravac','ivandubravac99@gmail.com'),
('Mario','Živković','mario.zivkovic.znr@gmail.com'),
('Toni','Stojčević','stojcevict@gmail.com'),
('Filip','Horvat','filiphorvat912@gmail.com'),
('Tomislav','Jakopec','tomislavjakopec@gmail.com');

insert into polaznik (osoba)
values(1),(2),(3),(4),(5),(6),(7),(8),
(9),(10),(11),(12),(13),(14),(15);

insert into predavac (osoba)
values (16);

insert into clan (grupa,polaznik)
values
(1,1),(1,2),
(1,3),(1,4),
(1,5),(1,6),
(1,7),(1,8),
(1,9),(1,10),
(1,11),(1,12),
(1,13),(1,14),
(1,15);

update grupa set datumpocetka='2022-11-07 17:00:00' where sifra=1;

delete from smjer where sifra=3;

