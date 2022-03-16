insert into Location(id, name) values(1, 'Budapest, Hungary');
insert into Location(id, name) values(2, 'Lagos, Nigeria');
insert into Location(id, name) values(3, 'Texas, USA');

insert into User(id, first_name, last_name, email, locationid) values(1, 'Roqeeb', 'Musibawu', 'roq@gmail.com', 2);
insert into User(id, first_name, last_name, email, locationid) values(2, 'Adelani', 'Roqeeb', 'ade@gmail.com', 1);
insert into User(id, first_name, last_name, email, locationid) values(3, 'Ayinde', 'Akande', 'ay@gmail.com', 2);

insert into Post(id, post_date, details, userid) values(1, CURRENT_TIMESTAMP(), 'latest post in the era of ours', 1);
insert into Post(id, post_date, details, userid) values(2, CURRENT_TIMESTAMP(), 'latest sport report', 1);
insert into Post(id, post_date, details, userid) values(3, CURRENT_TIMESTAMP(), 'latest football result and fixtures', 1);