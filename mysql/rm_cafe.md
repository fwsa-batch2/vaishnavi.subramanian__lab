## R&M Cafe

***

```sql          
create database rm_cafe;
```

```sql
use rm_cafe;
```

***
#### Table 1 : User Details
```sql
create table user_details(id int primary key auto_increment,name varchar(50) not null check(length(name)>=3),number varchar(10) not null check(length(number)=10), email varchar(50) not null unique check(email like("___%@gmail.com")),password varchar(20) not null check(length(password)>=8));
```

```sql
alter table user_details add column pincode int not null;
```

```sql
insert into user_details values (101, "Nikhil","9876543210", "nikhil65@gmail.com","jokesapart");
```

```sql
insert into user_details (name,number,email,password) values ("Ismail",9643521895,"ismailu@gmail.com","sahanaismail),("Vaishnavi",9324568903,"vaishnavi12@gmail.com","screenshot"),("Ana",8795436320,"anamano@gmail.com","chocolates"),("San",8765436589,"santhanunu@gmail.com","santaclaus"),("Surya",9683467321,"surya@gmail.com","cornflakes"),("Hasan",8976536782,"hasanasan@gmail.com","humairaha"),("Yavvana",8779564381,"yavva@gmail.com","chickenchilly");
```

```sql
desc user_details;
```

| Field    | Type         | Null | Key | Default | Extra          |
|:---------|:-------------|:-----|:----|:--------|:---------------|
| id       | int          | NO   | PRI | NULL    | auto_increment |
| name     | varchar(50)  | NO   |     | NULL    |                |
| number   | varchar(10)  | NO   |     | NULL    |                |
| email    | varchar(50)  | NO   | UNI | NULL    |                |
| password | varchar(20)  | NO   |     | NULL    |                |

```sql
select * from user_details;
```

| id | name      | number     | email                 | password      |
|:-------|:----------|:-----------|:----------------------|:--------------|
|    101 | Nikhil    | 9876543210 | nikhil65@gmail.com    | jokesapart    | 
|    102 | Ismail    | 9643521895 | ismailu@gmail.com     | sahanaismail  | 
|    103 | Vaishnavi | 9324568903 | vaishnavi12@gmail.com | screenshot    | 
|    104 | Ana       | 8795436320 | anamano@gmail.com     | chocolates    | 
|    105 | San       | 8765436589 | santhanunu@gmail.com  | santaclaus    |
|    106 | Surya     | 9683467321 | surya@gmail.com       | cornflakes    | 
|    107 | Hasan     | 8976536782 | hasanasan@gmail.com   | humairaha     |
|    108 | Yavvana   | 8779564381 | yavva@gmail.com       | chickenchilly | 


***
#### Table 2 : User Address
```sql
create table user_address (id int primary key auto_increment ,user_id int not null,address varchar(100) not null,city varchar(50) not null default 'Chennai',pincode int not null, foreign key(user_id) references user_details(id));

```

```sql
desc user_address;
```
| Field   | Type         | Null | Key | Default | Extra          |
|:--------|:-------------|:-----|:----|:--------|:---------------|
| id      | int          | NO   | PRI | NULL    | auto_increment |
| user_id | int          | NO   | MUL | NULL    |                |
| address | varchar(100) | NO   |     | NULL    |                |
| city    | varchar(50)  | NO   |     | Chennai |                |
| pincode | int          | NO   |     | NULL    |                |

```sql
insert into user_address (user_id,address,pincode) values (101,"No.40,Kurunji St,Anna Nagar",608238),(102,"No.69,Kamaraj St,Cam road",678098),(103,"NO.20,Pandiyan St,Vandalur",657894),(104,"No.19,Mullai St,Kandanchavadi",665837),(105,"No.34,Siranjivi St,Perungudi",673267),(106,"No.12,North St,Mambalam",690459),(107,"No.29,Marudham St,Vadapalani",687098),(108,"No.98,Maya Nagar,Thuraipakkam",638983);
```
| id | user_id | address                       | city    | pincode |
|:---|:--------|:------------------------------|:--------|:--------|
|  1 |     101 | No.40,Kurunji St,Anna Nagar   | Chennai |  608238 |
|  2 |     102 | No.69,Kamaraj St,Cam road     | Chennai |  678098 |
|  3 |     103 | NO.20,Pandiyan St,Vandalur    | Chennai |  657894 |
|  4 |     104 | No.19,Mullai St,Kandanchavadi | Chennai |  665837 |
|  5 |     105 | No.34,Siranjivi St,Perungudi  | Chennai |  673267 |
|  6 |     106 | No.12,North St,Mambalam       | Chennai |  690459 |
|  7 |     107 | No.29,Marudham St,Vadapalani  | Chennai |  687098 |
|  8 |     108 | No.98,Maya Nagar,Thuraipakkam | Chennai |  638983 |

***

#### Table 3 : Roles
```sql
create table roles (id int primary key auto_increment,role_name varchar(50) unique not null);
```

```sql
desc roles;
```

| Field     | Type        | Null | Key | Default | Extra          |
|:----------|:------------|:-----|:----|:--------|:---------------|
| id        | int         | NO   | PRI | NULL    | auto_increment |
| role_name | varchar(50) | NO   | UNI | NULL    |                |

```sql
insert into roles values (1,"Admin"),(2,"Customer");
```

```sql
select * from roles
```

| id | role_name |
|:---|:----------|
|  1 | Admin     |
|  2 | Customer  |

***

#### Table 4 : User Roles
```sql
create table user_roles (id int primary key auto_increment,user_id int,foreign key(user_id) references user_details(id),role_id int,foreign key(role_id) references roles(id));
```

```sql
desc user_roles;
```

| Field   | Type | Null | Key | Default | Extra          |
|:--------|:-----|:-----|:----|:--------|:---------------|
| id      | int  | NO   | PRI | NULL    | auto_increment |
| user_id | int  | NO  | MUL | NULL    |                |
| role_id | int  | NO  | MUL | NULL    |                |

```sql
insert into user_roles (user_id,role_id) values (101,2),(102,1),(103,1),(104,2),(105,2),(106,2),(107,2),(108,2);
```

```sql
select * from user_roles;
```
| id | user_id | role_id |
|:---|:--------|:--------|
|  1 |     101 |       2 |
|  2 |     102 |       1 |
|  3 |     103 |       1 |
|  4 |     104 |       2 |
|  5 |     105 |       2 |
|  6 |     106 |       2 |
|  7 |     107 |       2 |

***

#### Table 5 : List of Coffee

```sql
create table listOfCoffee (coffeeId int primary key auto_increment, coffeeName varchar(30) unique not null, price int not null);
```

```sql
insert into listOfCoffee (coffeeName,price) values ("Affogato",125),("Americano",115),("Cappuccino",130),("Dalgona",140),("Espresso",190),("Flat White",160),("Frappe",150),("Glace",130),("Latte",140),("Mocha",190),("Ristretto",160);
```

```sql
desc listOfCoffee;
```

| Field      | Type        | Null | Key | Default | Extra          |
|:-----------|:------------|:-----|:----|:--------|:---------------|
| coffeeId   | int         | NO   | PRI | NULL    | auto_increment |
| coffeeName | varchar(30) | NO   | UNI | NULL    |                |
| price      | int         | NO   |     | NULL    |                |

```sql
select * from listOfCoffee;
```

| coffeeId | coffeeName | price |
|:---------|:-----------|:------|
|        1 | Affogato   |   125 |
|        2 | Americano  |   115 |
|        3 | Cappuccino |   130 |
|        4 | Dalgona    |   140 |
|        5 | Espresso   |   190 |
|        6 | Flat White |   160 |
|        7 | Frappe     |   150 |
|        8 | Glace      |   130 |
|        9 | Latte      |   140 |
|       10 | Mocha      |   190 |
|       11 | Ristretto  |   160 |

***

#### Table 6 : Orders

```sql
create table orders (id int primary key auto_increment, user_id int not null, ordered_date datetime not null, foreign key(user_id) references user_details(id));
```

```sql
desc orders;
```

| Field        | Type     | Null | Key | Default | Extra          |
|:-------------|:---------|:-----|:----|:--------|:---------------|
| id           | int      | NO   | PRI | NULL    | auto_increment |
| user_id      | int      | NO   | MUL | NULL    |                |
| ordered_date | datetime | NO   |     | NULL    |                |

```sql
insert into orders values(1,101,"2022-01-01 12-10-11"),(2,105,"2022-01-01 12-15-20"),(3,103,"2022-01-01 01-13-09"),(4,107,"2022-01-01 05-11-30"),(5,102,"2022-01-01 19-18-08");
```

```sql
 select * from orders;
```
| id | user_id | ordered_date        |
|:---|:--------|:--------------------|
|  1 |     101 | 2022-01-01 12:10:11 |
|  2 |     105 | 2022-01-01 12:15:20 |
|  3 |     103 | 2022-01-01 01:13:09 |
|  4 |     107 | 2022-01-01 05:11:30 |
|  5 |     102 | 2022-01-01 19:18:08 |

***

#### Table 7 : Ordered Items

```sql
create table ordered_items (order_number int not null, coffeeId int not null,quantity int not null, foreign key(coffeeId) references listOfCoffee(coffeeId), foreign key(order_number) references orders(id));
```

```sql
desc ordered_items;
```

| Field        | Type        | Null | Key | Default | Extra |
|:-------------|:------------|:-----|:----|:--------|:------|
| order_number | int         | NO   | MUL | NULL    |       |
| coffeeId     | int         | NO   | MUL | NULL    |       |
| quantity     | int         | NO   |     | NULL    |       |
| status       | varchar(50) | No   |     | NULL    |       |

```sql
insert into ordered_items values (1,1,1,"delivered"),(1,4,1,"delivered"),(2,6,2,"delivered"),(3,9,1,"delivered"),(3,11,1,"delivered"),(4,7,2,"on the way"),(5,3,1,"preparing");
```

```sql
select * from ordered_items;
```

| order_number | coffeeId | quantity | status     |
|:-------------|:---------|:---------|:-----------|
|            1 |        1 |        1 | delivered  |
|            1 |        4 |        1 | delivered  |
|            2 |        6 |        2 | delivered  |
|            3 |        9 |        1 | delivered  |
|            3 |       11 |        1 | delivered  |
|            4 |        7 |        2 | on the way |
|            5 |        3 |        1 | preparing  |

***

#### Table 8 : Reviews

```sql
create table reviews (user_id int not null, reviews varchar(255) not null, ratings int not null,foreign key(user_id) references user_details(id));
```

```sql
desc reviews;
```

| Field   | Type         | Null | Key | Default | Extra |
|:--------|:-------------|:-----|:----|:--------|:------|
| user_id | int          | NO   | MUL | NULL    |       |
| reviews | varchar(255) | NO   |     | NULL    |       |
| ratings | int          | NO   |     | NULL    |       |

```sql
insert into reviews values (103,"I would probably say that this coffee shop is a must for coffee lovers! The service was good, and the variety of coffee served in the ambiance was very satisfying.",5),(101,"This coffee shop is my favorite place to hang and do my works. I really like this place because it has a good ambiance and not too crowded as well.",5),(108,"Will go again.I only popped in to get take-away cappuccinos, but I was struck by how friendly the service was. The cappuccinos were wonderful too! And very well priced.",5),(105,"This coffee shop has it all. The ambiance, interior designs, good coffee, tasty foods, and fast wi-fi connection.",4);
```

| user_id | reviews                                                                                                                                                                   | ratings |
|:--------|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:--------|
|     103 | I would probably say that this coffee shop is a must for coffee lovers! The service was good, and the variety of coffee served in the ambiance was very satisfying.      |       5 |
|     101 | This coffee shop is my favorite place to hang and do my works. I really like this place because it has a good ambiance and not too crowded as well.                      |       5 |
|     108 | Will go again.I only popped in to get take-away cappuccinos, but I was struck by how friendly the service was. The cappuccinos were wonderful too! And very well priced. |       5 |
|     105 | This coffee shop has it all. The ambiance, interior designs, good coffee, tasty foods, and fast wi-fi connection.                                                        |       4 |

***

#### Table 9 : Contact

```sql
create table contact (id int primary key auto_increment,name varchar(50) not null check(length(name)>=3),number bigint not null check(length(number)=10), email varchar(50) not null unique check(email like("___%@gmail.com")),queries varchar(255) not null);
```

```sql
desc contact;
```

| Field   | Type         | Null | Key | Default | Extra          |
|:--------|:-------------|:-----|:----|:--------|:---------------|
| id      | int          | NO   | PRI | NULL    | auto_increment |
| name    | varchar(50)  | NO   |     | NULL    |                |
| number  | bigint       | NO   |     | NULL    |                |
| email   | varchar(50)  | NO   | UNI | NULL    |                |
| queries | varchar(255) | NO   |     | NULL    |                |

```sql
insert into contact values (1,"Alex",8754780601,"alexandar23@gmail.com","I want to know the exact running timing of the cafe"),(2,"Chithu",9987543782,"chithrajrajan2@gmail.com","I would like Filter Coffee to be added in the menu. It will be better if you also provide it."),(3,"Sunaina",8946743234,"sunai78@gmail.com","Is the cafe open on weekends too??");
```

```sql
select * from contact;
```

| id | name    | number     | email                    | queries                                                                                       |
|:---|:--------|:-----------|:-------------------------|:----------------------------------------------------------------------------------------------|
|  1 | Alex    | 8754780601 | alexandar23@gmail.com    | I want to know the exact running timing of the cafe                                           |
|  2 | Chithu  | 9987543782 | chithrajrajan2@gmail.com | I would like Filter Coffee to be added in the menu. It will be better if you also provide it. |
|  3 | Sunaina | 8946743234 | sunai78@gmail.com        | Is the cafe open on weekends too??                                                            |

***
!!!!!11



<<<<<<< HEAD
alter table orders add column address varchar(100) not null, foreign key(address) references user_address(id)



=======
***
![1](https://user-images.githubusercontent.com/93571050/159883515-1819455b-e3d6-4fe2-9922-ab4fac623008.png)
***
![2](https://user-images.githubusercontent.com/93571050/159883529-20004a6e-a211-408a-be17-40cb4bea6fd8.png)
***
![3](https://user-images.githubusercontent.com/93571050/159883542-c6791866-a76c-425b-8dea-60530ba7b774.png)
***
![4](https://user-images.githubusercontent.com/93571050/159883552-b4dc70cb-69a5-4ef8-b2e0-9663860600bb.png)
***
![5](https://user-images.githubusercontent.com/93571050/159883562-d9cf3fd4-717b-41f1-881d-0cd0b59bf6f8.png)
***
#### ER Diagram
![Drawing (4)](https://user-images.githubusercontent.com/93571050/159880633-be7ddad5-0f8e-42f9-b694-542ae9fdfa57.png)
***
#### EER Diagram
![Screenshot from 2022-03-22 12-56-16](https://user-images.githubusercontent.com/93571050/159881090-54712e2c-cfef-4932-804e-763d7bdf1ab9.png)
>>>>>>> 0499a9bb24e9d65b8b3fff596540619e7fc285f0

