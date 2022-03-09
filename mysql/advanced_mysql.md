# Mysql

## Indexing

### Query to CREATE index (NON-CLUSTERED)
```
 CREATE INDEX newIndex ON students(name);
```
###### Query OK, 0 rows affected (0.06 sec)
###### Records: 0  Duplicates: 0  Warnings: 0
***
### Query to SHOW index
```
 SHOW INDEX FROM students;
```

| Table    | Non_unique | Key_name | Seq_in_index | Column_name | Collation | Cardinality | Sub_part | Packed | Null | Index_type | Comment | Index_comment | Visible | Expression |
|:---------|:-----------|:---------|:-------------|:------------|:----------|:------------|:---------|:-------|:-----|:-----------|:--------|:--------------|:--------|:-----------|
| students |          0 | PRIMARY  |            1 | id          | A         |           6 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| students |          0 | name     |            1 | name        | A         |           6 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| students |          1 | newIndex |            1 | name        | A         |           6 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |

###### 3 rows in set (0.01 sec)
***
### Query to CREATE UNIQUE index
```
 CREATE UNIQUE INDEX newUniqueIndex ON students(name);
```
###### Query OK, 0 rows affected, 1 warning (0.07 sec)
###### Records: 0  Duplicates: 0  Warnings: 1
***
```
 SHOW INDEX FROM students;
```

| Table    | Non_unique | Key_name | Seq_in_index | Column_name | Collation | Cardinality | Sub_part | Packed | Null | Index_type | Comment | Index_comment | Visible | Expression |
|:---------|:-----------|:---------|:-------------|:------------|:----------|:------------|:---------|:-------|:-----|:-----------|:--------|:--------------|:--------|:-----------|
| students |          0 | PRIMARY  |            1 | id          | A         |           6 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| students |          0 | name     |            1 | name        | A         |           6 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| students |          0 | newUniqueIndex |            1 | name        | A         |           6 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| students |          1 | newIndex |            1 | name        | A         |           6 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |

###### 4 rows in set (0.01 sec)
***
### Query to DROP index
```
 DROP INDEX newIndex ON students;
```
###### Query OK, 0 rows affected (0.04 sec)
###### Records: 0  Duplicates: 0  Warnings: 0
***
***


### Order by and Group by

```
SELECT * FROM table_name ORDER BY column_name ASC; 
```
```
SELECT * FROM table_name ORDER BY column_name DESC;
```
```
SELECT column_name
FROM table_name
GROUP BY column_name
ORDER BY column_name;
```
***
## JOINS
##### Inner Join
```
SELECT columns FROM table1 INNER JOIN table2 ON table1.column = table2.column;
```
##### Left Join
```
SELECT columns FROM table1 LEFT JOIN table2 ON table1.column = table2.column;
```
##### Right Join
```
SELECT columns FROM table1 RIGHT [OUTER] JOIN table2 ON table1.column = table2.column;
```
##### Full Join
```
SELECT columns FROM table1 AS t1 FULL JOIN table2 AS t2 ON t1.column = t2.column ORDER BY column_name;
```
##### Cross Join
```
select * from table1 cross join table2;
```
***
