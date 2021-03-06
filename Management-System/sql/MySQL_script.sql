create database usersdb;

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1

SELECT *
  FROM YUSUF.teacher;

CREATE OR REPLACE TRIGGER CRUD_trigger 
AFTER INSERT OR
       UPDATE OR
       DELETE ON STUDENTS FOR EACH ROW BEGIN IF inserting THEN SYS.DBMS_OUTPUT.PUT_LINE('Inserting a record, Trigger');
elsif updating THEN
  sys.dbms_output.put_line('Updating, trigger');
elsif deleting THEN
  sys.dbms_output.put_line('deleting, trigger');
END IF;
END;

DROP TRIGGER CRUD_trigger;

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`user_id`)
  
)ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

create table groups(
group_id  integer(5) not null AUTO_INCREMENT,
group_name varchar(20) not null,
primary key (group_id))ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

create table students(
student_id integer(9) not null AUTO_INCREMENT,
firstname varchar(15) not null,
lastname varchar(15) not null,
primary key (student_id))ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

create table subjects(
subject_id not null AUTO_INCREMENT,
subject_name varchar(25),
primary key (subject_id));

create table marks(
mark_id integer(9) not null AUTO_INCREMENT,
student_id integer(9) not null,
subject_id integer(9) not null,
date timestamp not null,
foreign key (student_id) references students(student_id),
foreign key (subject_id) references subject(subject_id),
primary key (mark_id));



alter table marks
add column marks integer(3);



create table teacher(
teacher_id integer(9) not null AUTO_INCREMENT,
firstname varchar(25) not null,
lastname varchar(25) not null,
primary key (teacher_id))ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

use cput_db;
create table tech_subject(
teach_sub_id integer(9) not null AUTO_INCREMENT,
subject_id integer(9) not null,
teacher_id integer(9) not null,
group_id integer(9) not null,
primary key (teach_sub_id),
foreign key(subject_id) references subject(subject_id),
foreign key(teacher_id) references teacher(teacher_id),
foreign key(group_id) references groups(group_id)
)ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

select * from students;

select * from TEST;
insert INTO STUDENTS (STUDENT_ID,FIRST_NAME,LAST_NAME)
            VALUES (33,'Saidu','Kaita');
            insert INTO STUDENTS (STUDENT_ID,FIRST_NAME,LAST_NAME)
            VALUES (34,'Mamado','Dialo');
            insert INTO STUDENTS (STUDENT_ID,FIRST_NAME,LAST_NAME)
            VALUES (35,'Didier','Drogba');
            insert INTO STUDENTS (STUDENT_ID,FIRST_NAME,LAST_NAME)
            VALUES (36,'Paul','Pogba');
            insert INTO STUDENTS (STUDENT_ID,FIRST_NAME,LAST_NAME)
            VALUES (37,'Paul','Heins');
            insert INTO STUDENTS (STUDENT_ID,FIRST_NAME,LAST_NAME)
            VALUES (38,'Gonzalo','Heguin');
            insert INTO STUDENTS (STUDENT_ID,FIRST_NAME,LAST_NAME)
            VALUES (39,'Delasima','Ronaldo R9');
            insert INTO STUDENTS (STUDENT_ID,FIRST_NAME,LAST_NAME)
            VALUES (40,'Christiano','Ronaldo CR7');
            insert INTO STUDENTS (STUDENT_ID,FIRST_NAME,LAST_NAME)
            VALUES (41,'Steven','Peneer');
            insert INTO STUDENTS (STUDENT_ID,FIRST_NAME,LAST_NAME)
            VALUES (42,'Luckus','Radebe');
            insert INTO STUDENTS (STUDENT_ID,FIRST_NAME,LAST_NAME)
            VALUES (43,'Angel','Demaria');
            insert INTO STUDENTS (STUDENT_ID,FIRST_NAME,LAST_NAME)
            VALUES (44,'Teko','Modise');
            insert INTO STUDENTS (STUDENT_ID,FIRST_NAME,LAST_NAME)
            VALUES (345,'Simphiwe','Tshabalala');
            insert INTO STUDENTS (STUDENT_ID,FIRST_NAME,LAST_NAME)
            VALUES (46,'Gilberto','Silver');
            insert INTO STUDENTS (STUDENT_ID,FIRST_NAME,LAST_NAME)
            VALUES (47,'Loren','Blonk');
            insert INTO STUDENTS (STUDENT_ID,FIRST_NAME,LAST_NAME)
            VALUES (48,'David','Tresigate');
            insert INTO STUDENTS (STUDENT_ID,FIRST_NAME,LAST_NAME)
            VALUES (49,'Geogeo',' kilini');
            insert INTO STUDENTS (STUDENT_ID,FIRST_NAME,LAST_NAME)
            VALUES (50,'Philip','Matinez');
            insert INTO STUDENTS (STUDENT_ID,FIRST_NAME,LAST_NAME)
            VALUES (51,'Mario','Gomez');
            insert INTO STUDENTS (STUDENT_ID,FIRST_NAME,LAST_NAME)
            VALUES (52,'Steven','Gerrade');
            insert INTO STUDENTS (STUDENT_ID,FIRST_NAME,LAST_NAME)
            VALUES (53,'Paul','Ince');

 *******  Groups data ********
 
insert into GROUPS (GROUP_NAME,ID)values('Commerce',1);
insert into GROUPS (GROUP_NAME,ID)values('Marketing',2);
insert into GROUPS (GROUP_NAME,ID)values('Sales',3);
insert into GROUPS (GROUP_NAME,ID)values('Photography',4);
insert into GROUPS (GROUP_NAME,ID)values('IT',5);
insert into GROUPS (GROUP_NAME,ID)values('BNA',6);
insert into GROUPS (GROUP_NAME,ID)values('Comm Net',7);
insert into GROUPS (GROUP_NAME,ID)values('Cisco',8);
insert into GROUPS (GROUP_NAME,ID)values('Agriculture',9);
insert into GROUPS (GROUP_NAME,ID)values('Engineering',10);

****** Teacher ******

INSERT INTO TEACHER (TEACHER_ID,FIRST_NAME,LAST_NAME) VALUES(1,'Boniface','Kabaso');
INSERT INTO TEACHER (TEACHER_ID,FIRST_NAME,LAST_NAME) VALUES(2,'Kruben','Naido');
INSERT INTO TEACHER (TEACHER_ID,FIRST_NAME,LAST_NAME) VALUES(3,'Lakay','BL');
INSERT INTO TEACHER (TEACHER_ID,FIRST_NAME,LAST_NAME) VALUES(4,'Lance','Van Blerk');
INSERT INTO TEACHER (TEACHER_ID,FIRST_NAME,LAST_NAME) VALUES(5,'Mongezi','Ngindana');
INSERT INTO TEACHER (TEACHER_ID,FIRST_NAME,LAST_NAME) VALUES(6,'Fezile','Mqoma');
INSERT INTO TEACHER (TEACHER_ID,FIRST_NAME,LAST_NAME) VALUES(7,'Lilo','Mazibuko');
INSERT INTO TEACHER (TEACHER_ID,FIRST_NAME,LAST_NAME) VALUES(8,'Qolo','Yhuri');
INSERT INTO TEACHER (TEACHER_ID,FIRST_NAME,LAST_NAME) VALUES(9,'Kofi','Annan');
INSERT INTO TEACHER (TEACHER_ID,FIRST_NAME,LAST_NAME) VALUES(10,'Jacob','Zuma');
INSERT INTO TEACHER (TEACHER_ID,FIRST_NAME,LAST_NAME) VALUES(11,'Patricia','Dellil');
INSERT INTO TEACHER (TEACHER_ID,FIRST_NAME,LAST_NAME) VALUES(12,'Julius','Malema');
INSERT INTO TEACHER (TEACHER_ID,FIRST_NAME,LAST_NAME) VALUES(13,'Denis','Burkamp');
INSERT INTO TEACHER (TEACHER_ID,FIRST_NAME,LAST_NAME) VALUES(14,'Chris','Jones');
INSERT INTO TEACHER (TEACHER_ID,FIRST_NAME,LAST_NAME) VALUES(15,'Khungani','Qolo');
INSERT INTO TEACHER (TEACHER_ID,FIRST_NAME,LAST_NAME) VALUES(16,'Cassim','Zuko');
INSERT INTO TEACHER (TEACHER_ID,FIRST_NAME,LAST_NAME) VALUES(17,'Yusuf','Khunga');
************************************
create table subject()
insert INTO subject(SUBJECT_ID,SUBJECT_NAME) VALUES(2,'DS3');
insert INTO subject(SUBJECT_ID,SUBJECT_NAME) VALUES(3,'IP3');
insert INTO subject(SUBJECT_ID,SUBJECT_NAME) VALUES(4,'BNA3');
insert INTO subject(SUBJECT_ID,SUBJECT_NAME) VALUES(5,'CCNA3');
insert INTO subject(SUBJECT_ID,SUBJECT_NAME) VALUES(6,'CCMA3');
insert INTO subject(SUBJECT_ID,SUBJECT_NAME) VALUES(7,'DB2');
insert INTO subject(SUBJECT_ID,SUBJECT_NAME) VALUES(8,'DB3');
insert INTO subject(SUBJECT_ID,SUBJECT_NAME) VALUES(9,'ISY3');
insert INTO subject(SUBJECT_ID,SUBJECT_NAME) VALUES(10,'TP2');
insert INTO subject(SUBJECT_ID,SUBJECT_NAME) VALUES(11,'IT SKILLS3');
insert INTO subject(SUBJECT_ID,SUBJECT_NAME) VALUES(12,'MATHS3');
insert INTO subject(SUBJECT_ID,SUBJECT_NAME) VALUES(13,'STATS3');
insert INTO subject(SUBJECT_ID,SUBJECT_NAME) VALUES(14,'Programming Fundamentals 2');
insert INTO subject(SUBJECT_ID,SUBJECT_NAME) VALUES(15,'Risk Management');
insert INTO subject(SUBJECT_ID,SUBJECT_NAME) VALUES(16,'PM 3');
insert INTO subject(SUBJECT_ID,SUBJECT_NAME) VALUES(17,'DATA ANALYSIS 3');
insert INTO subject(SUBJECT_ID,SUBJECT_NAME) VALUES(18,'DATA SCIENCE 3');

select * from TEACHER;
delete from students where student_id = 59;

INSERT INTO TEST(TEST_ID,EXAM_DATE,MAXIMUM_MARKS)values(2,TO_DATE('14 04 2015','DD MM YYYY'),100);
INSERT INTO TEST(TEST_ID,EXAM_DATE,MAXIMUM_MARKS)values(40,TO_DATE('14 04 2015','DD MM YYYY'),200);
INSERT INTO TEST(TEST_ID,EXAM_DATE,MAXIMUM_MARKS)values(44,TO_DATE('14 04 2015','DD MM YYYY'),200);
INSERT INTO TEST(TEST_ID,EXAM_DATE,MAXIMUM_MARKS)values(5,TO_DATE('14 04 2015','DD MM YYYY'),100);
INSERT INTO TEST(TEST_ID,EXAM_DATE,MAXIMUM_MARKS)values(61,TO_DATE('14 04 2015','DD MM YYYY'),101);
INSERT INTO TEST(TEST_ID,EXAM_DATE,MAXIMUM_MARKS)values(7,TO_DATE('14 04 2015','DD MM YYYY'),100);
INSERT INTO TEST(TEST_ID,EXAM_DATE,MAXIMUM_MARKS)values(8,TO_DATE('14 04 2015','DD MM YYYY'),100);
INSERT INTO TEST(TEST_ID,EXAM_DATE,MAXIMUM_MARKS)values(9,TO_DATE('14 04 2015','DD MM YYYY'),100);
INSERT INTO TEST(TEST_ID,EXAM_DATE,MAXIMUM_MARKS)values(110,TO_DATE('14 04 2015','DD MM YYYY'),200);
INSERT INTO TEST(TEST_ID,EXAM_DATE,MAXIMUM_MARKS)values(11,TO_DATE('14 04 2015','DD MM YYYY'),100);
INSERT INTO TEST(TEST_ID,EXAM_DATE,MAXIMUM_MARKS)values(12,TO_DATE('14 04 2015','DD MM YYYY'),100);
INSERT INTO TEST(TEST_ID,EXAM_DATE,MAXIMUM_MARKS)values(13,TO_DATE('14 04 2015','DD MM YYYY'),100);
INSERT INTO TEST(TEST_ID,EXAM_DATE,MAXIMUM_MARKS)values(144,TO_DATE('14 04 2015','DD MM YYYY'),90);
INSERT INTO TEST(TEST_ID,EXAM_DATE,MAXIMUM_MARKS)values(115,TO_DATE('14 04 2015','DD MM YYYY'),80);
INSERT INTO TEST(TEST_ID,EXAM_DATE,MAXIMUM_MARKS)values(16,TO_DATE('14 04 2015','DD MM YYYY'),100);
INSERT INTO TEST(TEST_ID,EXAM_DATE,MAXIMUM_MARKS)values(17,TO_DATE('14 04 2015','DD MM YYYY'),100);
INSERT INTO TEST(TEST_ID,EXAM_DATE,MAXIMUM_MARKS)values(181,TO_DATE('14 04 2015','DD MM YYYY'),150);
INSERT INTO TEST(TEST_ID,EXAM_DATE,MAXIMUM_MARKS)values(191,TO_DATE('14 04 2015','DD MM YYYY'),120);
INSERT INTO TEST(TEST_ID,EXAM_DATE,MAXIMUM_MARKS)values(201,TO_DATE('14 04 2015','DD MM YYYY'),110);
INSERT INTO TEST(TEST_ID,EXAM_DATE,MAXIMUM_MARKS)values(211,TO_DATE('14 04 2015','DD MM YYYY'),110);
INSERT INTO TEST(TEST_ID,EXAM_DATE,MAXIMUM_MARKS)values(221,TO_DATE('14 04 2015','DD MM YYYY'),50);
INSERT INTO TEST(TEST_ID,EXAM_DATE,MAXIMUM_MARKS)values(231,TO_DATE('14 04 2015','DD MM YYYY'),50);
INSERT INTO TEST(TEST_ID,EXAM_DATE,MAXIMUM_MARKS)values(241,TO_DATE('14 04 2015','DD MM YYYY'),50);

select * from marks;

insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (1,50);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (4,20);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (7,33);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (17,57);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (18,80);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (19,81);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (20,82);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (24,81);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (25,70);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (26,50);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (27,50);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (33,50);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (34,48);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (35,50);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (36,92);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (37,97);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (38,77);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (39,60);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (40,78);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (41,88);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (42,45);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (43,39);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (44,49);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (46,51);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (47,58);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (48,55);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (49,73);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (50,92);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (51,98);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (52,71);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (53,70);
insert into STUDENTS_MARKS(STUDENTS_STUDENT_ID,STUDENTMARKS_MARKS_ID)VALUES (345,80);

insert into GROUPS_MARKS (GROUPS_ID,MARKSLIST_MARKS_ID) VALUES (3,10);
insert into GROUPS_MARKS (GROUPS_ID,MARKSLIST_MARKS_ID) VALUES (4,50);
insert into GROUPS_MARKS (GROUPS_ID,MARKSLIST_MARKS_ID) VALUES (5,70);
insert into GROUPS_MARKS (GROUPS_ID,MARKSLIST_MARKS_ID) VALUES (6,77);
insert into GROUPS_MARKS (GROUPS_ID,MARKSLIST_MARKS_ID) VALUES (7,54);

insert into GROUPS_STUDENTS (GROUPS_ID,STDENTSLIST_STUDENT_ID) VALUES (2,33);
insert into GROUPS_STUDENTS (GROUPS_ID,STDENTSLIST_STUDENT_ID) VALUES (3,34);
insert into GROUPS_STUDENTS (GROUPS_ID,STDENTSLIST_STUDENT_ID) VALUES (4,35);
insert into GROUPS_STUDENTS (GROUPS_ID,STDENTSLIST_STUDENT_ID) VALUES (5,36);
insert into GROUPS_STUDENTS (GROUPS_ID,STDENTSLIST_STUDENT_ID) VALUES (6,37);
insert into GROUPS_STUDENTS (GROUPS_ID,STDENTSLIST_STUDENT_ID) VALUES (7,38);
insert into GROUPS_STUDENTS (GROUPS_ID,STDENTSLIST_STUDENT_ID) VALUES (8,39);
insert into GROUPS_STUDENTS (GROUPS_ID,STDENTSLIST_STUDENT_ID) VALUES (9,40);
insert into GROUPS_STUDENTS (GROUPS_ID,STDENTSLIST_STUDENT_ID) VALUES (10,42);
insert into GROUPS_STUDENTS (GROUPS_ID,STDENTSLIST_STUDENT_ID) VALUES (29,43);
insert into GROUPS_STUDENTS (GROUPS_ID,STDENTSLIST_STUDENT_ID) VALUES (10,44);
insert into GROUPS_STUDENTS (GROUPS_ID,STDENTSLIST_STUDENT_ID) VALUES (9,45);
insert into GROUPS_STUDENTS (GROUPS_ID,STDENTSLIST_STUDENT_ID) VALUES (8,46);
insert into GROUPS_STUDENTS (GROUPS_ID,STDENTSLIST_STUDENT_ID) VALUES (7,47);
insert into GROUPS_STUDENTS (GROUPS_ID,STDENTSLIST_STUDENT_ID) VALUES (6,48);
insert into GROUPS_STUDENTS (GROUPS_ID,STDENTSLIST_STUDENT_ID) VALUES (5,49);
insert into GROUPS_STUDENTS (GROUPS_ID,STDENTSLIST_STUDENT_ID) VALUES (4,50);
insert into GROUPS_STUDENTS (GROUPS_ID,STDENTSLIST_STUDENT_ID) VALUES (4,51);
insert into GROUPS_STUDENTS (GROUPS_ID,STDENTSLIST_STUDENT_ID) VALUES (4,52);
insert into GROUPS_STUDENTS (GROUPS_ID,STDENTSLIST_STUDENT_ID) VALUES (5,53);
