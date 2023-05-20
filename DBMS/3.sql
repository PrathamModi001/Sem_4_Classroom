use dbms_lab;
show tables;
create table CLIENT_MASTER1(CLIENTNO varchar(6) primary key, CHECK (CLIENTNO LIKE 'C%'), NAME varchar(20) NOT NULL,ADDRESS1 varchar(30),ADDRESS2 varchar(30), CITY Varchar (15), 
PINCODE Integer(8) ,STATE Varchar (15),BALDUE decimal (10,2));
insert into  CLIENT_MASTER1(CLIENTNO,NAME,CITY,PINCODE,STATE,BALDUE) values
("C00001","Ivan bayross" , "Mumbai", 400054," Maharashtra", 15000),
("C00002"," Mamta muzumdar" , "Madras", 780001," Tamil nadu", 0),
("C00003","Chhaya bankar" , "Mumbai", 400057," Maharashtra", 5000),
("C00004","Ashwini joshi" , "Bangalore ",560001 ," Karnataka", 0),
("C00005","Hansel colaco" , "Mumbai", 400060," Maharashtra", 2000),
("C00006","Deepak sharma" , "Mangalore", 560050," Karnataka", 0);

select * from client_master1;


create table  PRODUCT_MASTER_1 (PRODUCTNO varchar(6) primary key, CHECK(PRODUCTNO LIKE 'P%'), DESCRIPTION Varchar(15) not null, PROFITPERCENT Decimal (4,2) not null,
UNITMEASURE Varchar (10) not null ,QTYONHAND Integer(8) not null,REORDERL_VL Integer(8) not null, SELLPRICE Decimal(8,2) not null, CostPrice Decimal (8,2) not null);

insert into PRODUCT_MASTER_1 values
("P00001","T-Shirt" , 5 , "Piece" , 200 , 50 , 350 , 250),
("P0345","Shirts" , 6 , "Piece" , 150 , 50 , 500 , 350),
("P06734","Cotton jeans" , 5 , "Piece" , 100 , 20 , 600 , 450),
("P07865","Jeans" , 5 , "Piece" , 100 , 20 , 750 , 500),
("P07868 ","Trousers" , 2 , "Piece" , 150 , 50 , 850 , 550),
("P07885","Pull Overs" , 2.5 , "Piece" , 80 , 30 , 700 , 450),
("P07965","Denim jeans" , 4 , "Piece" , 100 , 40 , 350 , 250),
("P07975","Lycra tops" , 5 , "Piece" , 70 , 30 , 300 , 175),
("P08865","Skirts" , 5 , "Piece" , 75 , 30 , 450 , 300);

select * from product_master;


create table SALESMAN_MASTER_1(
		SALESMANNO Varchar(6) primary key,CHECK (SALESMANNO LIKE 'S%'), 
        SALESMANNAME Varchar(20) NOT NULL,
        ADDRESS1 Varchar(30) NOT NULL,
        ADDRESS2 Varchar(30) ,
		CITY Varchar(20) , 
        PINCODE Integer ,
        STATE Varchar(20) , 
        SALAMT Real(8,2) NOT NULL,CHECK (SALAMT !=0), 
        TGTTOGET Decimal(6,2) NOT NULL , 
        CHECK (TGTTOGET !=0), 
		YTDSALES Double(6,2) NOT NULL , 
        REMARKS Varchar(60));

insert into SALESMAN_MASTER_1 values ("S00001","Aman", "A/14", "Worli", "Mumbai", 400002,"Maharashtra",3000,100,50,"Good"),
								   ("S00002","Omkar", "65", "Nariman", "Mumbai", 400001, "Maharashtra", 3000, 200, 100, "Good"),
                                   ("S00003","Raj", "P-7", "Bandra", "Mumbai", 400032,"Maharashtra",3000,200,100,"Good"),
                                   ("S00004","Ashish", "A/5", "Juhu", "Mumbai", 400044,"Maharashtra",3500,200,150,"Good");
                                   
select * from salesman_master_1;               

