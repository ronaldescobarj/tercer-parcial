delete from city where id=3001;
delete from city where id=3002;
delete from city where id=3003;
delete from city where id=3004;


delete from country where id=4001;
delete from country where id=4002;

insert into country(id, name) values (4001, 'Colombia');
insert into country(id, name) values (4002, 'España');

insert into city(id, name, country_id) values (3001, 'Bogota', 4001);
insert into city(id, name, country_id) values (3002, 'Cali', 4001);
insert into city(id, name, country_id) values (3003, 'Madrid', 4002);
insert into city(id, name, country_id) values (3004, 'Barcelona', 4002);
