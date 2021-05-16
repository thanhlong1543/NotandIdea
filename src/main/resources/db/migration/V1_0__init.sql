drop table if exists `user`;
create table `user` (
    id                  bigint not null auto_increment,
    user_name           varchar (32) not null,
    password            varchar (32) not null,
    create_at           datetime default current_timestamp not null,
    update_at           datetime default current_timestamp not null,

    primary key (id)
) engine= InnoDB default charset=utf8