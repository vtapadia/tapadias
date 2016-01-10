create table person (
    id integer not null primary key,
    first_name varchar(40),
    middle_name varchar(40),
    last_name varchar(40),
    previous_last_name varchar(40),
    gender varchar(10),
    date_of_birth timestamp,
    date_of_marriage date,
    date_of_death date,
    mother integer,
    spouse integer
);