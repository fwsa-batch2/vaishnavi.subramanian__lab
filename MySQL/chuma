# Mysql

### Query to SHOW all databases
```
SHOW DATABASES;
```
| Database           |
|:--|
| information_schema |
| mysql              |
| performance_schema |
| rm_cafe            |
| sys                |
###### 5 rows in set (0.00 sec)
***


### Query to CREATE DATABASE
```
CREATE DATABASE school;
```
```
SHOW DATABASES;
```
| Database           |
|:--|
| information_schema |
| mysql              |
| performance_schema |
| rm_cafe            |
| school             |          |
| sys                |
###### 6 rows in set (0.00 sec)
***


### Query to USE database
```
USE school;
```
###### Database changed
***


### Query to CREATE TABLE
```
CREATE TABLE students_cs(Id int primary key auto_increment, Name varchar(40) NOT NULL, Email varchar(40) UNIQUE NOT NULL, Age tinyint(2) NOT NULL, Department varchar(70) default 'Computer Science' );
```
###### Query OK, 0 rows affected, 1 warning (0.05 sec)
```
CREATE TABLE students_bio(Id int primary key auto_increment, Name varchar(40) NOT NULL, Email varchar(40) UNIQUE NOT NULL, Age tinyint(2) NOT NULL, Department varchar(70) default 'Biology', check(Age>15) );
```
###### Query OK, 0 rows affected, 1 warning (0.05 sec)
***


### Query to SHOW all tables
```
SHOW TABLES;
```
| Tables_in_school |
|:----|
| students_bio     |
| students_cs      |
###### 2 rows in set (0.00 sec)
***


### Query to DESCRIBE table
```
DESC students_bio;
```
```
DESCRIBE students_bio;
```
| Field      | Type        | Null | Key | Default | Extra          |
|:-----------|:------------|:-----|:----|:--------|:---------------|
| Id         | int         | NO   | PRI | NULL    | auto_increment |
| Name       | varchar(40) | NO   |     | NULL    |                |
| Email      | varchar(40) | NO   | UNI | NULL    |                |
| Age        | tinyint     | NO   |     | NULL    |                |
| Department | varchar(70) | YES  |     | Biology |                |
###### 5 rows in set (0.00 sec)
***


### Query to INSERT data into tables
```
INSERT INTO students_bio (Name,Email,Age) VALUES ("Anamica","anamica320@gmail.com",16);
```
###### Query OK, 1 row affected (0.02 sec)
```
INSERT INTO students_bio (Name,Email,Age) VALUES ("Nithya","nithya012@gmail.com",16);
```
###### Query OK, 1 row affected (0.02 sec)
```
INSERT INTO students_bio (Name,Email,Age) VALUES ("Vishal","vishal@gmail.com",16);
```
###### Query OK, 1 row affected (0.02 sec)
***


### Query to SELECT from table
```
SELECT * FROM students_bio;
```
| Id | Name    | Email                | Age | Department |
|:---|:--------|:---------------------|:----|:-----------|
|  1 | Anamica | anamica320@gmail.com |  16 | Biology    |
|  2 | Nithya  | nithya012@gmail.com  |  16 | Biology    |
|  3 | Vishal  | vishal@gmail.com     |  16 | Biology    |
###### 3 rows in set (0.00 sec)
***


### Query to SELECT paricular row from table
```
SELECT * FROM students_bio where ID=2;
```
| Id | Name   | Email               | Age | Department |
|:---|:-------|:--------------------|:----|:-----------|
|  2 | Nithya | nithya012@gmail.com |  16 | Biology    |

###### 1 row in set (0.00 sec)
***

### Query to ALTER TABLE
#### To modify column
```
ALTER TABLE students_bio MODIFY COLUMN Department varchar(70) NOT NULL;
```
###### Query OK, 3 rows affected (0.11 sec)
###### Records: 3  Duplicates: 0  Warnings: 0
```
DESC students_bio;
```
| Field      | Type        | Null | Key | Default | Extra          |
|:-----------|:------------|:-----|:----|:--------|:---------------|
| Id         | int         | NO   | PRI | NULL    | auto_increment |
| Name       | varchar(40) | NO   |     | NULL    |                |
| Email      | varchar(40) | NO   | UNI | NULL    |                |
| Age        | tinyint     | NO   |     | NULL    |                |
| department | varchar(70) | NO  |     | NULL    |                |
###### 5 rows in set (0.01 sec)
#### To add column
```
ALTER TABLE students_bio add column Date_of_birth date after Email;
```
###### Query OK, 0 rows affected (0.11 sec)
###### Records: 0  Duplicates: 0  Warnings: 0
```
SELECT * FROM students_bio;
```
| Id | Name    | Email                | Date_of_birth  | Age | Department |
|:---|:--------|:---------------------|:---------------|:----|:-----------|
|  1 | Anamica | anamica320@gmail.com | NULL           |  16 | Biology    |
|  2 | Nithya  | nithya012@gmail.com  | NULL           |  16 | Biology    |
|  3 | Vishal  | vishal@gmail.com     | NULL           |  16 | Biology    |
###### 3 rows in set (0.00 sec)
#### To rename a column
```
ALTER TABLE students_bio RENAME COLUMN Date_of_birth TO DOB;
```
| Id | Name    | Email                | DOB  | Age | Department |
|:---|:--------|:---------------------|:-----|:----|:-----------|
|  1 | Anamica | anamica320@gmail.com | NULL |  16 | Biology    |
|  2 | Nithya  | nithya012@gmail.com  | NULL |  16 | Biology    |
|  3 | Vishal  | vishal@gmail.com     | NULL |  16 | Biology    |
###### 3 rows in set (0.00 sec)
***

### Query to UPDATE COLUMN
```
UPDATE students_bio SET DOB='2005-02-04' Where ID=1;
```
###### Query OK, 1 row affected (0.01 sec)
###### Rows matched: 1  Changed: 1  Warnings: 0
```
UPDATE students_bio SET DOB='2005-12-08' Where ID=1;
```
###### Query OK, 1 row affected (0.01 sec)
###### Rows matched: 1  Changed: 1  Warnings: 0
```
UPDATE students_bio SET DOB='2005-09-10' Where ID=1;
```
###### Query OK, 1 row affected (0.01 sec)
###### Rows matched: 1  Changed: 1  Warnings: 0
```
SELECT * FROM students_bio;
```
| Id | Name    | Email                | DOB        | Age | Department |
|:---|:--------|:---------------------|:-----------|:----|:-----------|
|  1 | Anamica | anamica320@gmail.com | 2005-02-04 |  16 | Biology    |
|  2 | Nithya  | nithya012@gmail.com  | 2005-12-08 |  16 | Biology    |
|  3 | Vishal  | vishal@gmail.com     | 2005-09-10 |  16 | Biology    |
###### 3 rows in set (0.00 sec)
***

### Query to DELETE ROW
```
DELETE FROM students_bio where ID=3;
```
###### Query OK, 1 row affected (0.00 sec)
```
SELECT * FROM students_bio;
```
| Id | Name    | Email                | DOB        | Age | Department |
|:---|:--------|:---------------------|:-----------|:----|:-----------|
|  1 | Anamica | anamica320@gmail.com | 2005-02-04 |  16 | Biology    |
|  2 | Nithya  | nithya012@gmail.com  | 2005-12-08 |  16 | Biology    |
###### 2 rows in set (0.00 sec)
***


### Query to DROP column
```
ALTER TABLE students_bio drop column Age;
```
###### Query OK, 0 rows affected (0.11 sec)
###### Records: 0  Duplicates: 0  Warnings: 0
```
SELECT * FROM students_bio;
```
| Id | Name    | Email                | DOB        | Department |
|:---|:--------|:---------------------|:-----------|:-----------|
|  1 | Anamica | anamica320@gmail.com | 2005-02-04 | Biology    |
|  2 | Nithya  | nithya012@gmail.com  | 2005-12-08 | Biology    |
###### 2 rows in set (0.01 sec)
***


### Query to DROP TABLE
```
DROP TABLE students_bio;
```
###### Query OK, 0 rows affected (0.03 sec)
```
SHOW TABLES;
```
| Tables_in_school |
|:----|
| students_cs      |
###### 1 row in set (0.00 sec)
***


### Query to DROP DATABASE
```
DROP DATABASE school;
```
###### Query OK, 0 rows affected (0.03 sec)
```
SHOW DATABASES;
```
| Database           |
|:--|
| information_schema |
| mysql              |
| performance_schema |
| rm_cafe            |
| sys                |
###### 5 rows in set (0.00 sec)
***
