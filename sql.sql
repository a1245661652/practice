`student``result``test``student``grade``category``result``student``result`CREATE DATABASE school;
-- tinyint 十分小的数据 1个字节
-- samllint 较小的数据 2个字节
-- mediumint 中等大小的数据 3个字节
-- int 标准的整数  4个字节 常用的int
-- bigint 较大的数据 8个字节
-- float 单精度浮点数 4个字节
-- double 双精度浮点数 8个字节
-- decimal 字符串形式浮点数 decimal（m,d） m个字节
-- char 字符串固定大小的 0~255 
-- varchar 可变字符串 0~65535 常用变了String
-- tinytext 微型文本串  2^8-1 
-- text 文本串2^16-1
-- 目标 : 创建一个school数据库
-- 创建学生表(列,字段)
-- 学号int 登录密码varchar(20) 姓名,性别varchar(2),出生日期(datatime),家庭住址,email
-- 创建表之前 , 一定要先选择数据库
CREATE TABLE IF NOT EXISTS `student`(
`id` INT(4) NOT NULL AUTO_INCREMENT COMMENT '学号',
`name` VARCHAR(30) NOT NULL DEFAULT '匿名' COMMENT '姓名',
`sex` VARCHAR(2) NOT NULL DEFAULT '男' COMMENT '性别',
`birthday` DATETIME DEFAULT '2000.01.01' COMMENT '出生日期',
`address` VARCHAR(100) DEFAULT '地球' COMMENT '家庭住址',
`email` VARCHAR(50) DEFAULT '未填写联系方式' COMMENT '邮箱',
PRIMARY KEY (`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8
-- insert into 表名[(字段1，字段2，字段3，.....)]value('值1，' ,'值2','值3')
EXIT;`school`
`student`;
`student``student`
ALTER TABLE student DROP FOREIGN KEY FK_gradeid;
ALTER TABLE student DROP INDEX FK_gradeid;

-- insert into 表名[(字段1，字段2，字段3...)]value('值1','值2','值3')

INSERT INTO grade(gradename) VALUES ('大二');
INSERT INTO grade(gradename) VALUES ('大三'),('大四');
-- update 表名 set 字段1=值1，字段2=值2，....where....
INSERT INTO student(NAME,sex,birthday,address,email,gradeid) VALUES ('吴','男','1999-09-09','beijing','1245661652@qq.com',3);
INSERT INTO student(NAME,sex,birthday,address,email,gradeid) VALUES ('周','女','2001-02-12','xingtai','15533856680',3),('周','女','2001-02-12','xingtai','15533856680',2);
UPDATE student SET address='石家庄',gradeid=1 WHERE id=2;
UPDATE student SET birthday='2001-02-12 01:01:01',gradeid=5
WHERE id>=1 AND id<4 ;
ALTER TABLE student ADD score INT(10) AFTER gradeid;
ALTER TABLE student ADD hobby VARCHAR(10);

UPDATE student SET score=70 WHERE id>=1 AND id<=3 ;
UPDATE student SET score=score+10 WHERE score=70;
UPDATE student SET hobby='programming';
ALTER TABLE student MODIFY COLUMN hobby VARCHAR(30);
UPDATE student SET hobby='programming';
INSERT INTO test(id,coll)
VALUES(1,'ceshi')
DELETE FROM test WHERE id=1;
INSERT INTO test(id,coll)
VALUES (1,'谢谢'),(2,'不用谢')
DELETE FROM test;
TRUNCATE TABLE test;
CREATE DATABASE IF NOT EXISTS `school`;
TRUNCATE TABLE student;
CREATE DATABASE IF NOT EXISTS `school`;
-- 创建一个school数据库
USE `school`;-- 创建学生表
`student`
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade`(
	`gradeid` INT(11) NOT NULL AUTO_INCREMENT COMMENT '年级编号',
  `gradename` VARCHAR(50) NOT NULL COMMENT '年级名称',
    PRIMARY KEY (`gradeid`)
) ENGINE=INNODB AUTO_INCREMENT = 6 DEFAULT CHARSET = utf8;
CREATE TABLE `subject`(
	`subjectno`INT(11) NOT NULL AUTO_INCREMENT COMMENT '课程编号',
    `subjectname` VARCHAR(50) DEFAULT NULL COMMENT '课程名称',
    `classhour` INT(4) DEFAULT NULL COMMENT '学时',
    `gradeid` INT(4) DEFAULT NULL COMMENT '年级编号',
    PRIMARY KEY (`subjectno`)
)ENGINE = INNODB AUTO_INCREMENT = 19 DEFAULT CHARSET = utf8;
DROP TABLE IF EXISTS `result`;
CREATE TABLE `result`(
	`studentno` INT(4) NOT NULL COMMENT '学号',
    `subjectno` INT(4) NOT NULL COMMENT '课程编号',
    `examdate` DATETIME NOT NULL COMMENT '考试日期',
    `studentresult` INT (4) NOT NULL COMMENT '考试成绩',
    KEY `subjectno` (`subjectno`)
)ENGINE = INNODB DEFAULT CHARSET = utf8;
INSERT INTO `student` (`studentno`,`loginpwd`,`studentname`,`sex`,`gradeid`,`phone`,`address`,`borndate`,`email`,`identitycard`)
VALUES
(1000,'123456','张伟',0,2,'13800001234','北京朝阳','1980-1-1','text123@qq.com','123456198001011234'),
(1001,'123456','赵强',1,3,'13800002222','广东深圳','1990-1-1','text111@qq.com','123456199001011233');
INSERT INTO `result`(`studentno`,`subjectno`,`examdate`,`studentresult`)
VALUES
(1000,1,'2013-11-11 16:00:00',85),
(1000,2,'2013-11-12 16:00:00',70),
(1000,3,'2013-11-11 09:00:00',68),
(1000,4,'2013-11-13 16:00:00',98),
(1000,5,'2013-11-14 16:00:00',58);
INSERT INTO `subject`(`subjectno`,`subjectname`,`classhour`,`gradeid`)VALUES
(1,'高等数学-1',110,1),
(2,'高等数学-2',110,2),
(3,'高等数学-3',100,3),
(4,'高等数学-4',130,4),
(5,'C语言-1',110,1),
(6,'C语言-2',110,2),
(7,'C语言-3',100,3),
(8,'C语言-4',130,4),
(9,'Java程序设计-1',110,1),
(10,'Java程序设计-2',110,2),
(11,'Java程序设计-3',100,3),
(12,'Java程序设计-4',130,4),
(13,'数据库结构-1',110,1),
(14,'数据库结构-2',110,2),
(15,'数据库结构-3',100,3),
(16,'数据库结构-4',130,4),
(17,'C#基础',130,1);
CREATE TABLE `school`.`category`( `categoryid` INT(3) NOT NULL COMMENT 'id', `pid` INT(3) NOT NULL COMMENT '父id 没有父则为1', `categoryname` VARCHAR(10) NOT NULL COMMENT '种类名字', PRIMARY KEY (`categoryid`) ) ENGINE=INNODB CHARSET=utf8 COLLATE=utf8_general_ci; 

INSERT INTO `school`.`category` (`categoryid`, `pid`, `categoryname`) VALUES ('2', '1', '信息技术');
INSERT INTO `school`.`CATEGOrY` (`categoryid`, `pid`, `categoryname`) VALUES ('3', '1', '软件开发');
INSERT INTO `school`.`category` (`categoryid`, `PId`, `categoryname`) VALUES ('5', '1', '美术设计');
INSERT INTO `School`.`category` (`categoryid`, `pid`, `categorynamE`) VALUES ('4', '3', '数据库'); 
INSERT INTO `school`.`category` (`CATEgoryid`, `pid`, `categoryname`) VALUES ('8', '2', '办公信息');
INSERT INTO `school`.`category` (`categoryid`, `pid`, `CAtegoryname`) VALUES ('6', '3', 'web开发'); 
INSERT INTO `SCHool`.`category` (`categoryid`, `pid`, `categoryname`) VALUES ('7', '5', 'ps技术');
`grade``result``student`

SELECT * FROM student;
SELECT `studentno`,`studentname` FROM student;
SELECT `studentno` AS 学号,`studentname` AS 学生姓名 FROM student AS s;
SELECT CONCAT('姓名:',studentname) AS 新名字 FROM STUDENT;
SELECT * FROM result;
SELECT `studentno` FROM result
SELECT DISTINCT `studentno` FROM result
SELECT studentno,studentresult FROM result;
SELECT studentno,studentresult FROM result
WHERE studentresult>=95 AND studentresult<=100
SELECT studentno,studentresult FROM result
WHERE studentresult>=60 && studentresult<=100
SELECT studentno,studentresult FROM result
WHERE studentresult BETWEEN 68 AND 85
SELECT studentno AS '学生编号',studentresult AS '成绩' FROM result 
WHERE studentno!=1000; 
SELECT studentno,studentname FROM student
WHERE studentname LIKE '赵%';
DROP TABLE IF EXISTS student;
USE `school`;-- 创建学生表
DROP TABLE IF EXISTS `student`;
INSERT INTO student(studentname) VALUES('赵志文'),('赵县'),('赵啦'),('赵伟伟'),('张丹丹'),('张坤坤'); 
SELECT studentno,studentname FROM student
WHERE studentname LIKE '赵_';
SELECT studentno,studentname FROM student
WHERE studentname LIKE '赵__'
SELECT studentno,studentname FROM student
WHERE studentname LIKE '%伟%';
SELECT studentno,studentname FROM student
WHERE studentno IN (1009,1008,1006);
SELECT studentname FROM student
WHERE address IS NOT NULL
SELECT studentname FROM student
WHERE email='';

SELECT * FROM student;
SELECT * FROM result;
SELECT s.studentno,studentname,subjectno,studentresult
FROM student AS s
INNER JOIN result AS r
WHERE s.studentno=r.studentno
-- right join
SELECT s.studentno,studentname,subjectname,studentresult,classhour
FROM student s
RIGHT JOIN result r
ON s.studentno= r.studentno
INNER JOIN SUBJECT sub
ON r.`subjectno`=sub.subjectno

INSERT INTO grade(gradeid,gradename)VALUES(2,'大二'),(3,'大三'),(4,'大四')
SELECT s.studentno,studentname,subjectname,studentresult,gradename
FROM student s
LEFT JOIN result r
ON s.`studentno`=r.`studentno`
INNER JOIN SUBJECT sub
ON r.`subjectno`=sub.`subjectno`
INNER JOIN grade g
ON sub.gradeid=g.gradeid

SELECT a.categoryname AS '父栏目',b.categoryname AS '子栏目'
FROM category AS a,category AS b
WHERE a.categoryid=b.pid;
-- 核心思想：把一张表看成两张一模一样的表，然后将这两张表连接查询（自连接）
-- 思考题:查询参加了考试的同学信息(学号,学生姓名,科目名,分数)
SELECT s.studentno,studentname,subjectname,studentresult
FROM student s
INNER JOIN result r
ON s.`studentno`=r.`studentno`
INNER JOIN SUBJECT sub
ON r.`subjectno`=sub.`subjectno`

-- 查询学员及所属的年级(学号,学生姓名,年级名)
SELECT s.`studentno` AS '学号',studentname AS '姓名',gradename AS '年级名'
FROM student s
INNER JOIN grade g
ON s.`gradeid`=g.`gradeid`



-- 查询科目及所属的年级(科目名称,年级名称)
SELECT sub.subjectno AS '科目',gradename AS '年级名'
FROM SUBJECT sub
INNER JOIN grade g
ON sub.`gradeid`=g.`gradeid`

