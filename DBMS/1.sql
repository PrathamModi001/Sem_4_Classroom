create table CLIENT_MASTER(CLIENTNO Varchar(6) Primary Key,
    Name Varchar(20),
    Address1 varchar(30),
    Address2 varchar(30),
    City varchar(15),
    Pincode Integer,
    State Varchar(15),
    BALDUE decimal(10,2));


create table PRODUCT_MASTER(ProductNo Varchar(6),
   Description Varchar(15),
   ProfitPercent Decimal(4,2),
   UnitMeasure Varchar(10),
   QTYONHAND Integer,
   Reorder_VL Integer,
   SellPrice Decimal(8,2),
   CostPrice Decimal(8,2));
   
create table SALESMAN_MASTER(SalesmanNo Varchar(6) Primary Key,
   SalesmanName Varchar(20),
   Address1 varchar(30),
   Address2 varchar(30),
   City varchar(20),
   Pincode Integer,
   State Varchar(20),
   Salamt Real,
   TGTTOGET Decimal,
   YTDSALES Double(6,2),
   Remarks Varchar(60));
   
   
insert into CLIENT_MASTER values 
("C00001","Ivan bayross" ,NULL,NULL, "Mumbai", 400054," Maharashtra", 15000),
("C00002"," Mamta muzumdar" ,NULL,NULL, "Madras", 780001," Tamil nadu", 0),
("C00003","Chhaya bankar" ,NULL,NULL, "Mumbai", 400057," Maharashtra", 5000),
("C00004","Ashwini joshi" ,NULL,NULL, "Bangalore ",560001 ," Karnataka", 0),
("C00005","Hansel colaco" ,NULL,NULL, "Mumbai", 400060," Maharashtra", 2000),
("C00006","Deepak sharma" ,NULL,NULL, "Mangalore", 560050," Karnataka", 0);
 
insert into PRODUCT_MASTER values
("P00001","T-Shirt" , 5 , "Piece" , 200 , 50 , 350 , 250),
("P0345","Shirt" , 6 , "Piece" , 150 , 50 , 500 , 350),
("P06734","Cotton jeans" , 5 , "Piece" , 100 , 20 , 600 , 450),
("P07865","Jeans" , 5 , "Piece" , 100 , 20 , 750 , 500),
("P07868","Trousers" , 2 , "Piece" , 150 , 50 , 850 , 550),
("P07885","Pull Overs" , 2.5 , "Piece" , 80 , 30 , 350*2 , 450),
("P07965","Denim jeans" , 4 , "Piece" , 100 , 40 , 350 , 250),
("P07975","Lycra tops" , 5 , "Piece" , 70 , 30 , 300 , 175),
("P08865","Skirts" , 5 , "Piece" , 75 , 30 , 450 , 300);
 
insert into SALESMAN_MASTER values 
("S00001","Aman", "A/14", "Worli", "Mumbai", 400002,"Maharashtra",3000,100,50,"Good"),
("S00002" ,"Omkar", "65", "Nariman", "Mumbai", 400001, "Maharashtra", 3000, 200, 100, "Good"),
("S00003","Raj", "P-7", "Bandra", "Mumbai", 400032,"Maharashtra",3000,200,100,"Good"),
("S00004","Ashish", "A/5", "Jihu", "Mumbai", 400044,"Maharashtra",3500,200,150,"Good");

select * from SALESMAN_MASTER;
select * from PRODUCT_master;
select * from CLIENT_master;