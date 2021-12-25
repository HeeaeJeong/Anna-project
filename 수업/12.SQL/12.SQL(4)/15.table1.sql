/*
    Table : 기본적인 저장 단위
            Row(행), Column(열)
            
    Table  -  TableSpace  -  Data File

    table - object
            create drop alter
            
    data -  insert delete select update
*/
CREATE TABLE TB_TEST01(
    COL1 VARCHAR2(10),
    COL2 VARCHAR2(10),
    COL3 VARCHAR2(10)
);

CREATE TABLE TB_TEST02(
    COL1 VARCHAR2(10),
    COL2 VARCHAR2(10),
    COL3 VARCHAR2(10)
)
TABLESPACE TABLESPACE1;

-- Table 복제 : 데이터 포함
CREATE TABLE TB_TEST03
AS 
SELECT employee_id, first_name, salary 
FROM employees;

DROP TABLE TB_TEST03;

-- Table 복제 : 데이터 미포함
CREATE TABLE TB_TEST04
AS 
SELECT *
FROM employees
WHERE 1 = 2;     -- 성립되지 않는 조건을 작성

DROP TABLE TB_TEST04;

CREATE TABLE TB_TEST04( empno, name, money )
AS 
SELECT employee_id, first_name, salary
FROM employees
WHERE 1 = 2;

-- 테이블 수정 : 테이블 명
ALTER TABLE TB_TEST04
RENAME TO TB_TEST99;

-- 테이블 수정 : 컬럼추가
ALTER TABLE TB_TEST99
ADD 
DEPTNAME NUMBER(3);

-- 테이블 수정 : 컬럼수정
ALTER TABLE TB_TEST99
MODIFY 
DEPTNAME VARCHAR(20);

-- 테이블 수정 : 컬럼삭제
ALTER TABLE TB_TEST99
DROP 
COLUMN DEPTNAME;

DROP TABLE TB_TEST01;
DROP TABLE TB_TEST02;
DROP TABLE TB_TEST03;
DROP TABLE TB_TEST99;

PURGE RECYCLEBIN;