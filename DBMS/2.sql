create database dbms_lab7;
 
use dbms_lab7;
create table CLIENT_MASTER(ClientNO varchar(6), NAME varchar(20), Address1 varchar(30), Address2 varchar(30), CITY varchar(15), PINCODE integer, STATE varchar(15), BALDUE decimal (10,2));
 
create table PRODUCT_MASTER(PRODUCTNO varchar(6), DESCRIPTION Varchar(15), PROFITPERCENT Decimal (4,2) ,UNITMEASURE Varchar (10),QTYONHAND Integer,REORDERL_VL Integer,SELLPRICE Decimal(8,2),COSTPRICE Decimal(8,2));
 
create table SALESMAN_MASTER(SALESMANNO Varchar(6), SALESMANNAME Varchar(20),ADDRESS1 Varchar(30),ADDRESS2 Varchar(30) , CITY Varchar(20) , PINCODE Integer ,STATE Varchar(20) , SALAMT Real, TGTTOGET Decimal , YTDSALES Double(6,2) , REMARKS Varchar(60));