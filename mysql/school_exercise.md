# Mysql

### Table 1
```
create table students (id int primary key auto_increment, name varchar(100) not null, email varchar(100) not null, mobile_no bigint not null, password varchar(100) not null, gender char(1) not null, dob date, created_date timestamp not null default current_timestamp, unique (email), check ( gender in ('M','F')));
```
| Field        | Type         | Null | Key | Default           | Extra             |
|:-------------|:-------------|:-----|:----|:------------------|:------------------|
| id           | int          | NO   | PRI | NULL              | auto_increment    |
| name         | varchar(100) | NO   |     | NULL              |                   |
| email        | varchar(100) | NO   | UNI | NULL              |                   |
| mobile_no    | bigint       | NO   |     | NULL              |                   |
| password     | varchar(100) | NO   |     | NULL              |                   |
| gender       | char(1)      | NO   |     | NULL              |                   |
| dob          | date         | YES  |     | NULL              |                   |
| created_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

### Table 2
```
create table student_class (id int primary key auto_increment, student_id int not null, class int not null, status varchar(20) not null, foreign key (student_id) references students(id), check( class >= 1 and class <=12), check (status in ('ACTIVE','INACTIVE')));
```
| Field      | Type        | Null | Key | Default | Extra          |
|:-----------|:------------|:-----|:----|:--------|:---------------|
| id         | int         | NO   | PRI | NULL    | auto_increment |
| student_id | int         | NO   | MUL | NULL    |                |
| class      | int         | NO   |     | NULL    |                |
| status     | varchar(20) | NO   |     | NULL    |                |

***
##### Feature 1: Student Registration
```
insert into students values (1,"Arohi","arohi23@gmail.com",9827247842,"arohi12","F","2000-07-12","2022-03-01"),(2,"Sam","sam56@gmail.com",9827247842,"samshelly","M","2001-03-19","2022-03-01"),("Manik","manik1@gmail.com",9827573824,"manikmanik","M","2001-10-21","2022-03-01"),("Sahana","sahana67@gmail.com",9827573824,"sahana","F","2000-05-14","2022-03-01"),("Nikhil","nikhil8@gmail.com",9827648272,"nikhilking","M","2000-06-08","2022-03-01"),("Ismail","ismail12@gmail.com","8365738736","ismalini","M","2001-06-10","2022-03-01"),("Sakthi","sakthi7@gmail.com",9876428422,"sakthi121","F","2001-02-18","2022-03-01"),("Rahul","rahul98@gmail.com",8936753210,"rahultall","M","2001-01-01","2022-03-01"),("Shalini","shalini3456@gmail.com",8977835432,"shaluinii","F","2000-10-12","2022-03-01"),("Merlin","merlin09@gmail.com",9073264136,"merlinshan","F","2002-12-22","2022-03-01");
```

***
##### Feature 2: List All Students
```
select * from students;
```
| id | name    | email                 | mobile_no  | password   | gender | dob        | created_date        |
|:---|:--------|:----------------------|:-----------|:-----------|:-------|:-----------|:--------------------|
|  1 | Arohi   | arohi23@gmail.com     | 9827247842 | arohi12    | F      | 2000-07-12 | 2022-03-01 00:00:00 |
|  2 | Sam     | sam56@gmail.com       | 9827247842 | samshelly  | M      | 2001-03-19 | 2022-03-01 00:00:00 |
|  3 | Manik   | manik1@gmail.com      | 9827573824 | manikmanik | M      | 2001-10-21 | 2022-03-01 00:00:00 |
|  4 | Sahana  | sahana67@gmail.com    | 9827573824 | sahana     | F      | 2000-05-14 | 2022-03-01 00:00:00 |
|  5 | Nikhil  | nikhil8@gmail.com     | 9827648272 | nikhilking | M      | 2000-06-08 | 2022-03-01 00:00:00 |
|  6 | Ismail  | ismail12@gmail.com    | 8365738736 | ismalini   | M      | 2001-06-10 | 2022-03-01 00:00:00 |
|  7 | Sakthi  | sakthi7@gmail.com     | 9876428422 | sakthi121  | F      | 2001-02-18 | 2022-03-01 00:00:00 |
|  8 | Rahul   | rahul98@gmail.com     | 8936753210 | rahultall  | M      | 2001-01-01 | 2022-03-01 00:00:00 |
|  9 | Shalini | shalini3456@gmail.com | 8977835432 | shaluinii  | F      | 2000-10-12 | 2022-03-01 00:00:00 |
| 10 | Merlin  | merlin09@gmail.com    | 9073264136 | merlinshan | F      | 2002-12-22 | 2022-03-01 00:00:00 |

***
##### Feature 3: Login with email and password
```
select * from students where email="sam56@gmail.com" and password="samshelly";
```
| id | name | email           | mobile_no  | password  | gender | dob        | created_date        |
|:---|:-----|:----------------|:-----------|:----------|:-------|:-----------|:--------------------|
|  2 | Sam  | sam56@gmail.com | 9827247842 | samshelly | M      | 2001-03-19 | 2022-03-01 00:00:00 |

***
##### Feature 4: Update Password
```
update students set password="sam@123" where email="sam56@gmail.com";
```
| id | name    | email                 | mobile_no  | password   | gender | dob        | created_date        |
|:---|:--------|:----------------------|:-----------|:-----------|:-------|:-----------|:--------------------|
|  1 | Arohi   |  arohi23@gmail.com    | 9827247842 | arohi12    | F      | 2000-07-12 | 2022-03-01 00:00:00 |
|  2 | Sam     | sam56@gmail.com       | 9827247842 | sam@123    | M      | 2001-03-19 | 2022-03-01 00:00:00 |
|  3 | Manik   | manik1@gmail.com      | 9827573824 | manikmanik | M      | 2001-10-21 | 2022-03-01 00:00:00 |
|  4 | Sahana  | sahana67@gmail.com    | 9827573824 | sahana     | F      | 2000-05-14 | 2022-03-01 00:00:00 |
|  5 | Nikhil  | nikhil8@gmail.com     | 9827648272 | nikhilking | M      | 2000-06-08 | 2022-03-01 00:00:00 |
|  6 | Ismail  | ismail12@gmail.com    | 8365738736 | ismalini   | M      | 2001-06-10 | 2022-03-01 00:00:00 |
|  7 | Sakthi  | sakthi7@gmail.com     | 9876428422 | sakthi121  | F      | 2001-02-18 | 2022-03-01 00:00:00 |
|  8 | Rahul   | rahul98@gmail.com     | 8936753210 | rahultall  | M      | 2001-01-01 | 2022-03-01 00:00:00 |
|  9 | Shalini | shalini3456@gmail.com | 8977835432 | shaluinii  | F      | 2000-10-12 | 2022-03-01 00:00:00 |
| 10 | Merlin  | merlin09@gmail.com    | 9073264136 | merlinshan | F      | 2002-12-22 | 2022-03-01 00:00:00 |

***
##### Feature 5: Enroll Student into Class
```
 insert into student_class values (1,1,12,"ACTIVE"),(2,4,5,"INACTIVE"),(3,5,5,"INACTIVE"),(4,9,12,"ACTIVE"),;
```
| id | student_id | class | status   |
|:---|:-----------|:------|:---------|
|  1 |          1 |    12 | ACTIVE   |
|  2 |          4 |     5 | INACTIVE |
|  3 |          5 |     5 | INACTIVE |
|  4 |          8 |    12 | ACTIVE   |

***
##### Feature 6: Find Students who are studying in 5th standard.
```
select st.name,sc.class from students st inner join student_class sc on st.id=sc.student_id where class=5;
```
| name   | class |
|:-------|:------|
| Sahana |     5 |
| Nikhil |     5 |

***
##### Feature 7: Update student from 5th standard to 6th standard.
```
update student_class set class=6 where class=5;
```
| id | student_id | class | status   |
|:---|:-----------|:------|:---------|
|  1 |          1 |    12 | ACTIVE   |
|  2 |          4 |     6 | INACTIVE |
|  3 |          5 |     6 | INACTIVE |
|  4 |          8 |    12 | ACTIVE   |

***
##### Feature 8: Student withdrawn from a Class
```
 delete from student_class where id=4;
```
| id | student_id | class | status   |
|:---|:-----------|:------|:---------|
|  1 |          1 |    12 | ACTIVE   |
|  2 |          4 |     6 | INACTIVE |
|  3 |          5 |     6 | INACTIVE |

***
##### Feature 9: Find student details who have not updated their Date Of Birth
```
select * from students inner join student_class on students.id=student_class.student_id where students.dob is null;
```
```
select * from students where dob is null;
```
###### Empty set (0.00 sec)

***
##### Feature 10: Find Total no of students actively studying in this school

```
select count(*) from student_class where status="ACTIVE";
```
| count(*) |
|:---------|
|        1 |

***
##### Feature 11: Find Total no of students actively studying in each class
```
select count(*) from student_class where status="ACTIVE" group by class;
```
| count(*) |
|:---------|
|        1 |
```
select count(*),class from student_class where status="ACTIVE" group by class;
```
| count(*) | class |
|:---------|:------|
|        1 |    12 |

***
##### Feature 12: Find Total no of students actively studying each class which has less than 5 students.
```
select count(*),class from student_class where status="ACTIVE" group by class having count(*)<5;
```
| count(*) | class |
|:---------|:------|
|        1 |    12 |

***
##### Feature 13: Display student and class details Using Joins (Inner Join) * Using Subqueries ( Scalar SubQuery)
```
select * from students inner join student_class on students.id=student_class.student_id;
```
| id | name   | email              | mobile_no  | password   | gender | dob        | created_date        | id | student_id | class | status   |
|:---|:-------|:-------------------|:-----------|:-----------|:-------|:-----------|:--------------------|:---|:-----------|:------|:---------|
|  1 | Arohi  | arohi23@gmail.com  | 9827247842 | arohi12    | F      | 2000-07-12 | 2022-03-01 00:00:00 |  1 |          1 |    12 | ACTIVE   |
|  4 | Sahana | sahana67@gmail.com | 9827573824 | sahana     | F      | 2000-05-14 | 2022-03-01 00:00:00 |  2 |          4 |     6 | INACTIVE |
|  5 | Nikhil | nikhil8@gmail.com  | 9827648272 | nikhilking | M      | 2000-06-08 | 2022-03-01 00:00:00 |  3 |          5 |     6 | INACTIVE |

***
##### Feature 14: Display Student Details for the given input class Class : 5th Standard Using Joins
```
select * from students inner join student_class on students.id=student_class.student_id where student_class.class=5;
```
###### Empty set (0.01 sec)

***
##### Feature 15: Find Class for the given student email id Email: n@gmail.com Using Subquery ( single row subquery )
```
select sc.class from students st inner join student_class sc on st.id=sc.student_id where email="arohi23@gmail.com"
```
| class |
|:------|
|    12 |

###### Empty set (0.01 sec)

***
##### Feature 16: Find Students who has not enrolled in a class Using Subquery ( multiple row subquery )
```
select name from students st inner join student_class sc on st.id=sc.student_id where class is null;
```
###### Empty set (0.01 sec)

***
##### Feature 17: Display all students name with class - include both enrolled and not enrolled Using Joins ( Left outer join)
```
select st.name,sc.class from students st left join student_class sc on st.id=sc.student_id;
```
| name    | class |
|:--------|:------|
| Arohi   |    12 |
| Sam     |  NULL |
| Manik   |  NULL |
| Sahana  |     6 |
| Nikhil  |     6 |
| Ismail  |  NULL |
| Sakthi  |  NULL |
| Rahul   |  NULL |
| Shalini |  NULL |
| Merlin  |  NULL |
***

select * from shipments where quantity_supplied > avg(quantity_supplied);
