-- begin CEUT_CUSTOMER
create table CEUT_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end CEUT_CUSTOMER
-- begin CEUT_ORDER
create table CEUT_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ORDER_DATE date not null,
    CUSTOMER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end CEUT_ORDER
-- begin DDCT_TAGGING
alter table DDCT_TAGGING add column CUSTOMER_ID varchar(36) ^
alter table DDCT_TAGGING add column DTYPE varchar(100) ^
update DDCT_TAGGING set DTYPE = 'ceut$PersistentTagging' where DTYPE is null ^
-- end DDCT_TAGGING
