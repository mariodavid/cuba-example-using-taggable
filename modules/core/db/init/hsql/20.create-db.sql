-- begin CEUT_ORDER
alter table CEUT_ORDER add constraint FK_CEUT_ORDER_ON_CUSTOMER foreign key (CUSTOMER_ID) references CEUT_CUSTOMER(ID)^
create index IDX_CEUT_ORDER_ON_CUSTOMER on CEUT_ORDER (CUSTOMER_ID)^
-- end CEUT_ORDER
-- begin DDCT_TAGGING
alter table DDCT_TAGGING add constraint FK_DDCT_TAGGING_ON_CUSTOMER foreign key (CUSTOMER_ID) references CEUT_CUSTOMER(ID)^
create index IDX_DDCT_TAGGING_ON_CUSTOMER on DDCT_TAGGING (CUSTOMER_ID)^
-- end DDCT_TAGGING