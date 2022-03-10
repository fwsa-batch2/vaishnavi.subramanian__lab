### Mysql Views
```
create table office(id int primary key auto_increment, name varchar(100) not null, salary int not null);
```
###### Query OK, 0 rows affected (0.06 sec)
```insert into office (name,salary) values ("Ismail",6000),("Aadhu",5000),("Hardik",8000),("Meenu Kutty",10000),("Nikhil",4000),("Vinay",3500);
```
###### Query OK, 6 rows affected (0.02 sec)
###### Records: 6  Duplicates: 0  Warnings: 0
```
select * from office;
```
| id | name        | salary |
|:---|:------------|:-------|
|  1 | Ismail      |   6000 |
|  2 | Aadhu       |   5000 |
|  3 | Hardik      |   8000 |
|  4 | Meenu Kutty |  10000 |
|  5 | Nikhil      |   4000 |
|  6 | Vinay       |   3500 |
###### 6 rows in set (0.00 sec)
***
### Creating view
```
create view salary_more_than_5000 as
    -> select name,salary
    -> from office
    -> where salary > 5000;
```
###### Query OK, 0 rows affected (0.01 sec)
```
show tables;
```
| Tables_in_view       |
|:---------------------|
| office               |
| salary_more_than_5000 |
###### 2 rows in set (0.01 sec)
```
select * from salary_more_than_5000;
```
| name        | salary |
|:------------|:-------|
| Ismail      |   6000 |
| Hardik      |   8000 |
| Meenu Kutty |  10000 |
###### 3 rows in set (0.00 sec)
***
### Updating / modifying view 
```
 create or replace view salary_moe_than_5000 as
    -> select id,name,salary
    -> from office
    -> where salary < 5000;
```
###### Query OK, 0 rows affected (0.01 sec)
```
 select * from salary_more_than_5000;
```
| id | name   | salary |
|:---|:-------|:-------|
|  5 | Nikhil |   4000 |
|  6 | Vinay  |   3500 |
###### 2 rows in set (0.00 sec)
***
### Renaming view name
```
 rename table salary_more_than_5000 to salary_less_than_5000;
```
###### Query OK, 0 rows affected (0.01 sec)
```
show tables;
```
| Tables_in_view        |
|:----------------------|
| office                |
| salary_less_than_5000 |
###### 2 rows in set (0.00 sec)
***
### Inserting row in view
```
 insert into salary_less_than_5000 (name,salary) values ("Sam",2500);
Query OK, 1 row affected (0.01 sec)
```
```
select * from salary_less_than_5000;       -----------view
```

| id | name   | salary |
|:---|:-------|:-------|
|  5 | Nikhil |   4000 |
|  6 | Vinay  |   3500 |
|  7 | Sam    |   2500 |

###### 3 rows in set (0.00 sec)
```
select * from office;     -----------main table
```

| id | name        | salary |
|:---|:------------|:-------|
|  1 | Ismail      |   6000 |
|  2 | Aadhu       |   5000 |
|  3 | Hardik      |   8000 |
|  4 | Meenu Kutty |  10000 |
|  5 | Nikhil      |   4000 |
|  6 | Vinay       |   3500 |
|  7 | Sam         |   2500 |

###### 7 rows in set (0.00 sec)
***


