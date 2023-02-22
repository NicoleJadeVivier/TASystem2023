# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table taapplication (
  id                            bigint auto_increment not null,
  title                         varchar(255),
  firstname                     varchar(255),
  constraint pk_taapplication primary key (id)
);

create table taposition (
  id                            bigint auto_increment not null,
  title                         varchar(255),
  description                   varchar(255),
  constraint pk_taposition primary key (id)
);

create table user (
  id                            bigint auto_increment not null,
  username                      varchar(255),
  password                      varchar(255),
  firstname                     varchar(255),
  lastname                      varchar(255),
  phone_number                  varchar(255),
  email                         varchar(255),
  address                       varchar(255),
  city                          varchar(255),
  region                        varchar(255),
  zipcode                       varchar(255),
  comments                      varchar(255),
  constraint pk_user primary key (id)
);


# --- !Downs

drop table if exists taapplication;

drop table if exists taposition;

drop table if exists user;

