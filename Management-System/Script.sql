--<ScriptOptions statementTerminator=";"/>

CREATE TABLE TEACHER_SUBJECT (
		ID NUMBER(10 , 0) NOT NULL,
		DESCRIPTION VARCHAR2(1020)
	);

CREATE TABLE SUBJECT_MARKS (
		SUBJECT_SUBJECT_ID NUMBER(10 , 0) NOT NULL,
		MARKSLIST_MARKS_ID NUMBER(10 , 0) NOT NULL
	);

CREATE TABLE TEST_MARKS (
		TEST_TEST_ID NUMBER(10 , 0) NOT NULL,
		MARKSLIST_MARKS_ID NUMBER(10 , 0) NOT NULL
	);

CREATE TABLE GROUPS_MARKS (
		GROUPS_ID NUMBER(10 , 0) NOT NULL,
		MARKSLIST_MARKS_ID NUMBER(10 , 0) NOT NULL
	);

CREATE TABLE SUBJECT_TEACHER_SUBJECT (
		SUBJECT_SUBJECT_ID NUMBER(10 , 0) NOT NULL,
		TECHSUBJECTLIST_ID NUMBER(10 , 0) NOT NULL
	);

CREATE TABLE TEST (
		TEST_ID NUMBER(10 , 0) NOT NULL,
		EXAM_DATE TIMESTAMP(11),
		MAXIMUM_MARKS NUMBER(10 , 0)
	);

CREATE TABLE TEACHER_TEACHER_SUBJECT (
		TEACHER_TEACHER_ID NUMBER(10 , 0) NOT NULL,
		TECHSUBJECTLIST_ID NUMBER(10 , 0) NOT NULL
	);

CREATE TABLE TEACHER (
		TEACHER_ID NUMBER(10 , 0) NOT NULL,
		FIRST_NAME VARCHAR2(1020),
		LAST_NAME VARCHAR2(1020)
	);

CREATE TABLE USERS (
		USER_ID NUMBER(10 , 0) NOT NULL,
		EMAIL VARCHAR2(1020),
		PASSWORD VARCHAR2(1020),
		USERNAME VARCHAR2(1020)
	);

CREATE TABLE GROUPS (
		ID NUMBER(10 , 0) NOT NULL,
		GROUP_NAME VARCHAR2(1020)
	);

CREATE TABLE SUBJECT (
		SUBJECT_ID NUMBER(10 , 0) NOT NULL,
		SUBJECT_NAME VARCHAR2(1020)
	);

CREATE TABLE STUDENTS_MARKS (
		STUDENTS_STUDENT_ID NUMBER(10 , 0) NOT NULL,
		STUDENTMARKS_MARKS_ID NUMBER(10 , 0) NOT NULL
	);

CREATE TABLE GROUPS_TEACHER_SUBJECT (
		GROUPS_ID NUMBER(10 , 0) NOT NULL,
		TECHSUBJECTLIST_ID NUMBER(10 , 0) NOT NULL
	);

CREATE TABLE GROUPS_STUDENTS (
		GROUPS_ID NUMBER(10 , 0) NOT NULL,
		STDENTSLIST_STUDENT_ID NUMBER(10 , 0) NOT NULL
	);

CREATE TABLE STUDENTS (
		STUDENT_ID NUMBER(10 , 0) NOT NULL,
		FIRST_NAME VARCHAR2(1020),
		LAST_NAME VARCHAR2(1020)
	);
	create student_marks

CREATE UNIQUE INDEX SYS_C007461 ON GROUPS (ID ASC);

CREATE UNIQUE INDEX SYS_C007477 ON SUBJECT (SUBJECT_ID ASC);

CREATE UNIQUE INDEX SYS_C007475 ON STUDENTS_MARKS (STUDENTS_STUDENT_ID ASC, STUDENTMARKS_MARKS_ID ASC);

CREATE UNIQUE INDEX UK_H3U6WAWFFYIPMIXOU8U65A32S ON GROUPS_MARKS (MARKSLIST_MARKS_ID ASC);

CREATE UNIQUE INDEX SYS_C007467 ON GROUPS_STUDENTS (GROUPS_ID ASC, STDENTSLIST_STUDENT_ID ASC);

CREATE UNIQUE INDEX UK_CM6BGN8KN7VWOIRRKKM360WYL ON SUBJECT_TEACHER_SUBJECT (TECHSUBJECTLIST_ID ASC);

CREATE UNIQUE INDEX UK_SIVCXG80GA93TFYPVJIR9SP7I ON SUBJECT_MARKS (MARKSLIST_MARKS_ID ASC);

CREATE UNIQUE INDEX SYS_C007485 ON TEACHER (TEACHER_ID ASC);

CREATE UNIQUE INDEX SYS_C007487 ON TEACHER_SUBJECT (ID ASC);

CREATE UNIQUE INDEX SYS_C007497 ON USERS (USER_ID ASC);

CREATE UNIQUE INDEX SYS_C007483 ON SUBJECT_TEACHER_SUBJECT (SUBJECT_SUBJECT_ID ASC, TECHSUBJECTLIST_ID ASC);

CREATE UNIQUE INDEX SYS_C007495 ON TEST_MARKS (TEST_TEST_ID ASC, MARKSLIST_MARKS_ID ASC);

CREATE UNIQUE INDEX UK_IH4D8ETW2FNIJWNTL3G61MJU4 ON TEST_MARKS (MARKSLIST_MARKS_ID ASC);

CREATE UNIQUE INDEX SYS_C007472 ON STUDENTS (STUDENT_ID ASC);

CREATE UNIQUE INDEX UK_AURBOM2U19MTX0KSIMOCEOSYO ON TEACHER_TEACHER_SUBJECT (TECHSUBJECTLIST_ID ASC);

CREATE UNIQUE INDEX SYS_C007492 ON TEST (TEST_ID ASC);

CREATE UNIQUE INDEX UK_JJ0O2W1UQMDOUTABCSJWQC8RW ON STUDENTS_MARKS (STUDENTMARKS_MARKS_ID ASC);

CREATE UNIQUE INDEX SYS_C007464 ON GROUPS_MARKS (GROUPS_ID ASC, MARKSLIST_MARKS_ID ASC);

CREATE UNIQUE INDEX UK_3CAANJ0FWD149YMT15W36G9UN ON GROUPS_STUDENTS (STDENTSLIST_STUDENT_ID ASC);

CREATE UNIQUE INDEX SYS_C007480 ON SUBJECT_MARKS (SUBJECT_SUBJECT_ID ASC, MARKSLIST_MARKS_ID ASC);

CREATE UNIQUE INDEX SYS_C007490 ON TEACHER_TEACHER_SUBJECT (TEACHER_TEACHER_ID ASC, TECHSUBJECTLIST_ID ASC);

CREATE UNIQUE INDEX UK_32X1PCJAQQTH2XNWD4MTRPV91 ON GROUPS_TEACHER_SUBJECT (TECHSUBJECTLIST_ID ASC);

CREATE UNIQUE INDEX SYS_C007470 ON GROUPS_TEACHER_SUBJECT (GROUPS_ID ASC, TECHSUBJECTLIST_ID ASC);

ALTER TABLE STUDENTS_MARKS ADD CONSTRAINT SYS_C007475 PRIMARY KEY (STUDENTS_STUDENT_ID, STUDENTMARKS_MARKS_ID);

ALTER TABLE TEST_MARKS ADD CONSTRAINT SYS_C007495 PRIMARY KEY (TEST_TEST_ID, MARKSLIST_MARKS_ID);

ALTER TABLE GROUPS_STUDENTS ADD CONSTRAINT SYS_C007467 PRIMARY KEY (GROUPS_ID, STDENTSLIST_STUDENT_ID);

ALTER TABLE STUDENTS ADD CONSTRAINT SYS_C007472 PRIMARY KEY (STUDENT_ID);

ALTER TABLE TEACHER ADD CONSTRAINT SYS_C007485 PRIMARY KEY (TEACHER_ID);

ALTER TABLE GROUPS_TEACHER_SUBJECT ADD CONSTRAINT SYS_C007470 PRIMARY KEY (GROUPS_ID, TECHSUBJECTLIST_ID);

ALTER TABLE GROUPS ADD CONSTRAINT SYS_C007461 PRIMARY KEY (ID);

ALTER TABLE GROUPS_MARKS ADD CONSTRAINT SYS_C007464 PRIMARY KEY (GROUPS_ID, MARKSLIST_MARKS_ID);

ALTER TABLE TEACHER_SUBJECT ADD CONSTRAINT SYS_C007487 PRIMARY KEY (ID);

ALTER TABLE USERS ADD CONSTRAINT SYS_C007497 PRIMARY KEY (USER_ID);

ALTER TABLE TEACHER_TEACHER_SUBJECT ADD CONSTRAINT SYS_C007490 PRIMARY KEY (TEACHER_TEACHER_ID, TECHSUBJECTLIST_ID);

ALTER TABLE TEST ADD CONSTRAINT SYS_C007492 PRIMARY KEY (TEST_ID);

ALTER TABLE SUBJECT ADD CONSTRAINT SYS_C007477 PRIMARY KEY (SUBJECT_ID);

ALTER TABLE SUBJECT_MARKS ADD CONSTRAINT SYS_C007480 PRIMARY KEY (SUBJECT_SUBJECT_ID, MARKSLIST_MARKS_ID);

ALTER TABLE SUBJECT_TEACHER_SUBJECT ADD CONSTRAINT SYS_C007483 PRIMARY KEY (SUBJECT_SUBJECT_ID, TECHSUBJECTLIST_ID);

ALTER TABLE TEST_MARKS ADD CONSTRAINT FK_MQ85L1AVNYX3LQSTYIFI5YIRY FOREIGN KEY (TEST_TEST_ID)
	REFERENCES TEST (TEST_ID)
	ON DELETE RESTRICT
	ON UPDATE CASCADE;

ALTER TABLE TEACHER_TEACHER_SUBJECT ADD CONSTRAINT FK_2QXEU24KMSD26DJD5TBXESDWA FOREIGN KEY (TEACHER_TEACHER_ID)
	REFERENCES TEACHER (TEACHER_ID)
	ON DELETE RESTRICT
	ON UPDATE CASCADE;

ALTER TABLE TEACHER_TEACHER_SUBJECT ADD CONSTRAINT FK_AURBOM2U19MTX0KSIMOCEOSYO FOREIGN KEY (TECHSUBJECTLIST_ID)
	REFERENCES TEACHER_SUBJECT (ID)
	ON DELETE RESTRICT
	ON UPDATE CASCADE;

ALTER TABLE STUDENTS_MARKS ADD CONSTRAINT FK_2N4LPUFL1Q46PBWOASUFB4NV3 FOREIGN KEY (STUDENTS_STUDENT_ID)
	REFERENCES STUDENTS (STUDENT_ID)
	ON DELETE RESTRICT
	ON UPDATE CASCADE;

ALTER TABLE GROUPS_STUDENTS ADD CONSTRAINT FK_M8TGNOH65MBN7SPPYQG2A5QIE FOREIGN KEY (GROUPS_ID)
	REFERENCES GROUPS (ID)
	ON DELETE RESTRICT
	ON UPDATE CASCADE;

ALTER TABLE SUBJECT_TEACHER_SUBJECT ADD CONSTRAINT FK_CM6BGN8KN7VWOIRRKKM360WYL FOREIGN KEY (TECHSUBJECTLIST_ID)
	REFERENCES TEACHER_SUBJECT (ID)
	ON DELETE RESTRICT
	ON UPDATE CASCADE;

ALTER TABLE GROUPS_TEACHER_SUBJECT ADD CONSTRAINT FK_32X1PCJAQQTH2XNWD4MTRPV91 FOREIGN KEY (TECHSUBJECTLIST_ID)
	REFERENCES TEACHER_SUBJECT (ID)
	ON DELETE RESTRICT
	ON UPDATE CASCADE;

ALTER TABLE GROUPS_STUDENTS ADD CONSTRAINT FK_3CAANJ0FWD149YMT15W36G9UN FOREIGN KEY (STDENTSLIST_STUDENT_ID)
	REFERENCES STUDENTS (STUDENT_ID)
	ON DELETE RESTRICT
	ON UPDATE CASCADE;

ALTER TABLE SUBJECT_TEACHER_SUBJECT ADD CONSTRAINT FK_N83O909CTJHKIW3JBATL6SORT FOREIGN KEY (SUBJECT_SUBJECT_ID)
	REFERENCES SUBJECT (SUBJECT_ID)
	ON DELETE RESTRICT
	ON UPDATE CASCADE;

ALTER TABLE SUBJECT_MARKS ADD CONSTRAINT FK_NGQF15AKHB50FUOE33TE0BL94 FOREIGN KEY (SUBJECT_SUBJECT_ID)
	REFERENCES SUBJECT (SUBJECT_ID)
	ON DELETE RESTRICT
	ON UPDATE CASCADE;

ALTER TABLE GROUPS_MARKS ADD CONSTRAINT FK_DO1E93X2D2GEU1UDNG2T3LM79 FOREIGN KEY (GROUPS_ID)
	REFERENCES GROUPS (ID)
	ON DELETE RESTRICT
	ON UPDATE CASCADE;

ALTER TABLE GROUPS_TEACHER_SUBJECT ADD CONSTRAINT FK_6HYMBOPD51YPYLPG3IRXJ5NF4 FOREIGN KEY (GROUPS_ID)
	REFERENCES GROUPS (ID)
	ON DELETE RESTRICT
	ON UPDATE CASCADE;

	select * from audit_table;