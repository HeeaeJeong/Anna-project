select * from EMPLOYEES;
    
-- 한줄 주석문

-- 테이블생성
/*
    CREATE TABLE 테이블명(
        컬럼명1 자료형, 
        컬럼명2 자료형, 
    )

*/

-- 자료형
/*
    String      VARCHAR2
    int         INTEGER, NUMBER
    double      NUMBER
    Date        DATE
*/
CREATE TABLE TB_VARCHAR(
    COL1 VARCHAR2(10 BYTE),
    COL2 VARCHAR2(10),
    COL3 VARCHAR2(20)
);
/*
	INSERT INTO 테이블명( 컬럼명, 컬럼명, ... )
	VALUES( 값, 값, 값 ...
  */

SELECT * FROM TB_VARCHAR; 

INSERT INTO TB_VARCHAR(COL1, COL2, COL3)
VALUES('ABC', 'ABC', 'ABC');

INSERT INTO TB_VARCHAR(COL1, COL2, COL3)
VALUES('가나다', '가나다', '가나다');

SELECT COL1, COL2, COL3, lengthb(COL1), lengthb(COL2), lengthb(COL3)
FROM TB_VARCHAR;

INSERT INTO TB_VARCHAR(COL1, COL2, COL3) -- ORA-12899: "HR"."TB_VARCHAR"."COL1" 열에 대한 값이 너무 큼(실제: 12, 최대값: 10)
VALUES('가나다라', '가나다라', '가나다라');

CREATE TABLE TB_LONG(
    COL LONG
  --  COL1 LONG
);

INSERT INTO TB_LONG(COL)
VALUES('ABCDE');

select * FROM TB_LONG;

CREATE TABLE BOOK(	
	TITLE VARCHAR2(200),
	CONTENT LONG
);

-- 숫자(정수, 실수)
-- INTEGER 정수
CREATE TABLE TB_INTEGER(
	COL1 INTEGER,
	COL2 INTEGER
);

INSERT INTO TB_INTEGER(COL1, COL2)
VALUES(123, 456);

SELECT * FROM TB_INTEGER;

INSERT INTO TB_INTEGER(COL1, COL2)
VALUES('123', '456');

INSERT INTO TB_INTEGER(COL1, COL2)
VALUES(123.1, 456);

-- NUMBER 정수, 실수
CREATE TABLE TB_NUMBER(
	COL1 NUMBER,
	COL2 NUMBER(5),
	COL3 NUMBER(5, 2),
	COL4 NUMBER(*, 2)
);

INSERT INTO TB_NUMBER(COL1, COL2, COL3, COL4)
VALUES(1234.5678, 12345.67, 123.456, 12345.6789);

SELECT * FROM TB_NUMBER;


-- 날짜 DATE
-- 연도, 월, 일, 시, 분, 초
CREATE TABLE TB_DATE(
	COL1 DATE, 
	COL2 DATE
);

-- SYSDATE == 현재 날짜와 시간
INSERT INTO TB_DATE(COL1, COL2)
VALUES(SYSDATE, SYSDATE-1);

SELECT * FROM TB_DATE;

-- String date = "2021-12-31 11:50:10"
INSERT INTO TB_DATE(COL1, COL2)
VALUES(SYSDATE, '2021-12-31 11:50:10');	-- X

INSERT INTO TB_DATE(COL1, COL2)
VALUES(SYSDATE, '2021-12-31'); -- OK

INSERT INTO TB_DATE(COL1, COL2)
VALUES(SYSDATE, '2021/12/31'); -- OK

INSERT INTO TB_DATE(COL1, COL2)
VALUES(SYSDATE, TO_DATE('2021-12-31 11:50:10', 'YYYY-MM-DD HH:MI:SS')  );














