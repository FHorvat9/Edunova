select * from smjer
select * from grupa
select * from predavac
select * from osoba

select * from grupa where  smjer=1;

select a.naziv, b.*
from smjer a
inner join grupa b on a.sifra=b.smjer
where a.naziv='Java programiranje';

select a.naziv, b.*
from smjer a
left join grupa b on a.sifra=b.smjer
where b.sifra is null;

select a.naziv, b.*
from smjer a
inner join grupa b on a.sifra=b.smjer
where a.naziv='Java programiranje';

insert into smjer(naziv,cijena,upisnina,certificiran)
values('Serviser',5500,500,0);

select b.sifra from osoba a 
inner join predavac b on a.sifra=b.osoba 
where a.ime='Tomislav' and a.prezime='Jakopec';

update grupa set predavac=1 where naziv='JP27';

select a.naziv as smjer,b.naziv as grupa,  
concat(d.ime,' ',d.prezime) as predavac
from smjer a
inner join grupa b on a.sifra=b.smjer
inner join predavac c on b.predavac=c.sifra
inner join osoba d  on c.osoba=d.sifra 
where a.naziv='Java programiranje';



