  
 ```
 CREATE DATABASE Academy;
 ```
###### Query OK, 1 row affected (0.02 sec)

```
USE Academy;
```
###### Database changed

```
SHOW TABLES;
```
###### Empty set (0.00 sec)


 ```CREATE TABLE Users(id TINYINT PRIMARY KEY AUTO_INCREMENT,User_name VARCHAR(50) NOT NULL);
 ```
###### Query OK, 0 rows affected (0.05 sec)


 ```
 CREATE TABLE Courses(id TINYINT PRIMARY KEY AUTO_INCREMENT,Course_name VARCHAR(50) NOT NULL);
 ```
###### Query OK, 0 rows affected (0.05 sec)


 ```CREATE TABLE Batch(id TINYINT PRIMARY KEY AUTO_INCREMENT,Batch_name VARCHAR(50) NOT NULL);
 ```
###### Query OK, 0 rows affected (0.05 sec)

 ```
 DESC Batch;
 ```

| Field      | Type        | Null | Key | Default | Extra          |
|:-----------|:------------|:-----|:----|:--------|:---------------|
| id         | tinyint     | NO   | PRI | NULL    | auto_increment |
| Batch_name | varchar(50) | NO   |     | NULL    |                |

###### 2 rows in set (0.00 sec)

```
 DESC Users;
 ```
| Field     | Type        | Null | Key | Default | Extra          |
|:----------|:------------|:-----|:----|:--------|:---------------|
| id        | tinyint     | NO   | PRI | NULL    | auto_increment |
| User_name | varchar(50) | NO   |     | NULL    |                |

###### 2 rows in set (0.01 sec)

```
 DESC Courses;
 ```

| Field       | Type        | Null | Key | Default | Extra          |
|:------------|:------------|:-----|:----|:--------|:---------------|
| id          | tinyint     | NO   | PRI | NULL    | auto_increment |
| Course_name | varchar(50) | NO   |     | NULL    |                |
###### 2 rows in set (0.00 sec)


 ```
 INSERT INTO Users(User_name) VALUES("Carlos"),("Nikhil");
 ```
###### Query OK, 2 rows affected (0.00 sec)
###### Records: 2  Duplicates: 0  Warnings: 0


``` 
SELECT * FROM Users;
```

| id | User_name |
|:---|:----------|
|  1 | Carlos     |
|  2 | Nikhil     |
###### 2 rows in set (0.00 sec)


```
 INSERT INTO Batch(Batch_name) VALUES("Batch-1"),("Batch-2");
 ```
###### Query OK, 2 rows affected (0.01 sec)
###### Records: 2  Duplicates: 0  Warnings: 0


 ```
 INSERT INTO Courses(Course_name) VALUES("HTML"),("CSS"),("JS");
 ```
###### Query OK, 3 rows affected (0.01 sec)
###### Records: 3  Duplicates: 0  Warnings: 0


 ```
 SELECT * FROM Users;
 ```

| id | User_name |
|:---|:----------|
|  1 | Carlos     |
|  2 | Nikhil     |

###### 2 rows in set (0.00 sec)


 ```
 SELECT * FROM Batch;
 ```

| id | Batch_name |
|:---|:-----------|
|  1 | Batch-1    |
|  2 | Batch-2    |

###### 2 rows in set (0.00 sec)

```
 SELECT * FROM Courses;
 ```

| id | Course_name |
|:---|:------------|
|  1 | HTML        |
|  2 | CSS         |
|  3 | JS          |

###### 3 rows in set (0.00 sec)

```
 DESC Batch;
 ```

| Field      | Type        | Null | Key | Default | Extra          |
|:-----------|:------------|:-----|:----|:--------|:---------------|
| id         | tinyint     | NO   | PRI | NULL    | auto_increment |
| Batch_name | varchar(50) | NO   |     | NULL    |                |

###### 2 rows in set (0.00 sec)

```
 DESC Users;
 ```

| Field     | Type        | Null | Key | Default | Extra          |
|:----------|:------------|:-----|:----|:--------|:---------------|
| id        | tinyint     | NO   | PRI | NULL    | auto_increment |
| User_name | varchar(50) | NO   |     | NULL    |                |

###### 2 rows in set (0.01 sec)

```
 CREATE TABLE Batch_users(id INT PRIMARY KEY AUTO_INCREMENT, Batch_id TINYINT , User_id TINYINT , FOREIGN KEY (Batch_id) REFERENCES Batch(id), FOREIGN KEY (User_id) REFERENCES Users(id));
 ```
###### Query OK, 0 rows affected (0.08 sec)

```
 DESC Batch_users;
 ```
| Field    | Type    | Null | Key | Default | Extra          |
|:---------|:--------|:-----|:----|:--------|:---------------|
| id       | int     | NO   | PRI | NULL    | auto_increment |
| Batch_id | tinyint | YES  | MUL | NULL    |                |
| User_id  | tinyint | YES  | MUL | NULL    |                |

###### 3 rows in set (0.01 sec)

```
 INSERT INTO Batch_users(Batch_id,User_id) VALUES(1, 1),(2,2),(2,1);
 ```
###### Query OK, 3 rows affected (0.02 sec)
###### Records: 3  Duplicates: 0  Warnings: 0

```
 SELECT * FROM Batch_users;
 ```

| id | Batch_id | User_id |
|:---|:---------|:--------|
|  1 |        1 |       1 |
|  2 |        2 |       2 |
|  3 |        2 |       1 |

###### 3 rows in set (0.00 sec)

```
 CREATE TABLE Batch_courses(id INT PRIMARY KEY AUTO_INCREMENT, batch_id TINYINT , course_id TINYINT , FOREIGN KEY (Batch_id) REFERENCES Batch(id), FOREIGN KEY (course_id) REFERENCES Courses(id));
 ```
###### Query OK, 0 rows affected (0.11 sec)

```
 SELECT * FROM Batch_courses;
 ```
###### Empty set (0.00 sec)

```
 DESC Batch_courses;
 ```

| Field     | Type    | Null | Key | Default | Extra          |
|:----------|:--------|:-----|:----|:--------|:---------------|
| id        | int     | NO   | PRI | NULL    | auto_increment |
| batch_id  | tinyint | YES  | MUL | NULL    |                |
| course_id | tinyint | YES  | MUL | NULL    |                |

###### 3 rows in set (0.00 sec)

```
 INSERT INTO Batch_courses(batch_id,course_id) VALUES(1, 1),(2,2),(2,3),(1,3);
 ```
###### Query OK, 4 rows affected (0.01 sec)
###### Records: 4  Duplicates: 0  Warnings: 0

```
 SELECT * FROM Batch_courses;
 ```

| id | batch_id | course_id |
|:---|:---------|:----------|
|  1 |        1 |         1 |
|  2 |        2 |         2 |
|  3 |        2 |         3 |
|  4 |        1 |         3 |

###### 4 rows in set (0.00 sec)

```
 SELECT Users.id, Users.User_name , Batch.Batch_name FROM Users INNER JOIN Batch ON Users.id=Batch.id;
 ```

| id | User_name | Batch_name |
|:---|:----------|:-----------|
|  1 | Carlos     | Batch-1    |
|  2 | Nikhil     | Batch-2    |

###### 2 rows in set (0.01 sec)

```
 SHOW TABLES;
 ```

| Tables_in_Academy |
|:------------------|
| Batch             |
| Batch_courses     |
| Batch_users       |
| Courses           |
| Users             |
###### 5 rows in set (0.00 sec)

```
 DESC Users;
 ```
| Field     | Type        | Null | Key | Default | Extra          |
|:----------|:------------|:-----|:----|:--------|:---------------|
| id        | tinyint     | NO   | PRI | NULL    | auto_increment |
| User_name | varchar(50) | NO   |     | NULL    |                |
###### 2 rows in set (0.00 sec)

```
 DESC Batch;
 ```
| Field      | Type        | Null | Key | Default | Extra          |
|:-----------|:------------|:-----|:----|:--------|:---------------|
| id         | tinyint     | NO   | PRI | NULL    | auto_increment |
| Batch_name | varchar(50) | NO   |     | NULL    |                |
###### 2 rows in set (0.00 sec)

```
 DESC Courses;
 ```
| Field       | Type        | Null | Key | Default | Extra          |
|:------------|:------------|:-----|:----|:--------|:---------------|
| id          | tinyint     | NO   | PRI | NULL    | auto_increment |
| Course_name | varchar(50) | NO   |     | NULL    |                |
###### 2 rows in set (0.00 sec)

```
 DESC Batch_users;
 ```
| Field    | Type    | Null | Key | Default | Extra          |
|:---------|:--------|:-----|:----|:--------|:---------------|
| id       | int     | NO   | PRI | NULL    | auto_increment |
| Batch_id | tinyint | YES  | MUL | NULL    |                |
| User_id  | tinyint | YES  | MUL | NULL    |                |
###### 3 rows in set (0.01 sec)

```
 DESC Batch_courses;
 ```

| Field     | Type    | Null | Key | Default | Extra          |
|:----------|:--------|:-----|:----|:--------|:---------------|
| id        | int     | NO   | PRI | NULL    | auto_increment |
| batch_id  | tinyint | YES  | MUL | NULL    |                |
| course_id | tinyint | YES  | MUL | NULL    |                |

###### 3 rows in set (0.00 sec)

```
 SELECT Courses.id AS course_id , Courses.course_name AS course_name ,Batch.id AS Batch_id , Batch.Batch_name AS batch_name , Users.id AS user_id , Users.User_name AS user_name FROM Courses INNER JOIN Batch ON Courses.id=Batch.id INNER JOIN Users ON Users.id=Batch.id;
 ```

| course_id | course_name | Batch_id | batch_name | user_id | user_name |
|:----------|:------------|:---------|:-----------|:--------|:----------|
|         1 | HTML        |        1 | Batch-1    |       1 | Carlos     |
|         2 | CSS         |        2 | Batch-2    |       2 | Nikhil     |

###### 2 rows in set (0.00 sec)

```
 SELECT Courses.id AS course_id , Courses.course_name AS course_name ,Batch.id AS Batch_id , Batch.Batch_name AS batch_name , Users.id AS user_id , Users.User_name AS user_name FROM Courses,Batch,Users WHERE Course_name="HTML";
 ```

| course_id | course_name | Batch_id | batch_name | user_id | user_name |
|:----------|:------------|:---------|:-----------|:--------|:----------|
|         1 | HTML        |        2 | Batch-2    |       1 | Carlos     |
|         1 | HTML        |        1 | Batch-1    |       1 | Carlos     |
|         1 | HTML        |        2 | Batch-2    |       2 | Nikhil     |
|         1 | HTML        |        1 | Batch-1    |       2 | Nikhil     |

###### 4 rows in set (0.00 sec)

```
 SELECT Users.User_name , Courses.Course_name FROM Users,Courses;
```
| User_name | Course_name |
|:----------|:------------|
| Nikhil     | HTML        |
| Carlos     | HTML        |
| Nikhil     | CSS         |
| Carlos     | CSS         |
| Nikhil     | JS          |
| Carlos     | JS          |
###### 6 rows in set (0.00 sec)

```
 SELECT Users.User_name , Courses.Course_name FROM Users INNER JOIN Courses USING(id) ;
```
| User_name | Course_name |
|:----------|:------------|
| Carlos     | HTML        |
| Nikhil     | CSS         |
###### 2 rows in set (0.00 sec)

```
 SELECT * FROM Batch_users;
```
| id | Batch_id | User_id |
|:---|:---------|:--------|
|  1 |        1 |       1 |
|  2 |        2 |       2 |
|  3 |        2 |       1 |
###### 3 rows in set (0.00 sec)

```
 SELECT Batch_users.Batch_id  , Batch_users.User_id  FROM Batch_users ;
 ```
| Batch_id | User_id |
|:---------|:--------|
|        1 |       1 |
|        2 |       2 |
|        2 |       1 |
###### 3 rows in set (0.00 sec)









