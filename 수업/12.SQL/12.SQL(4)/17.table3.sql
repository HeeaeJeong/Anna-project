/*
    무결성 : Constraint
            Column을 지정하는 성질

    Primary Key : 기본키. NULL(빈칸)을 허용하지 않는다. 중복을 허용하지 않는다.  id, 주민번호
    Unique Key : 고유키. NULL(빈칸)을 허용한다. 중복을 허용하지 않는다.         email
    Foreign Key : 외래키. 테이블과 테이블을 연결하는 목적의 성질이다.
                  Employees(외래키:department_id) Departments(기본키:department_id)  
                  외래키로 설정된 컬럼은 PK나 UK로 설정되어 있어야 한다.
    CHECK : 범위를 지정, 지정된 값외에 NULL을 사용한다.
    NOT NULL : NULL을 허용하지 않는다. (빈칸을 허용하지 않음)
*/
-- NOT NULL
CREATE TABLE TB_TEST1(
    COL1 VARCHAR2(10) NOT NULL,
    COL2 VARCHAR2(20)
);

INSERT INTO tb_test1(col1, col2)
VALUES('AAA', '111');

INSERT INTO tb_test1(col1)
VALUES('BBB');

INSERT INTO tb_test1(col2)
VALUES('111');

INSERT INTO tb_test1(col1, col2) -- 허용안됨
VALUES('', '222');

-- Primary Key = Unique + NOT NULL
DROP TABLE tb_test1
CASCADE CONSTRAINTS;

CREATE TABLE tb_test1(
    PKCOL VARCHAR2(10) CONSTRAINT PK_TEST_01 PRIMARY KEY,
    COL1 VARCHAR2(20),
    COL2 VARCHAR2(20)
);

INSERT INTO tb_test1(pkcol, col1, col2)
VALUES('AAA', '111', 'aaa');

INSERT INTO tb_test1(pkcol)
VALUES('BBB');

INSERT INTO tb_test1(pkcol, col1, col2)
VALUES('CCC', '222', 'bbb');

INSERT INTO tb_test1(pkcol, col1, col2)
VALUES('', '222', 'bbb');

INSERT INTO tb_test1(col1, col2)
VALUES('222', 'bbb');

DROP TABLE tb_test1
CASCADE CONSTRAINTS;

-- Unique : 고유키. 중복된 값은 입력불가(=PK), NULL을 허용
CREATE TABLE tb_test1(
    UKCOL VARCHAR2(10) CONSTRAINT UK_TEST_01 UNIQUE,
    COL1 VARCHAR2(20),
    COL2 VARCHAR2(20)
);

INSERT INTO tb_test1(UKCOL, COL1, COL2)
VALUES('AAA', '111', 'aaa');

INSERT INTO tb_test1(COL1, COL2)
VALUES('111', 'aaa');

-- UK, PK를 삭제가 필요한 경우
ALTER TABLE tb_test1
DROP 
CONSTRAINT  UK_TEST_01;

-- CHECK : 지정된 값만 허용. NULL을 허용. 
CREATE TABLE TB_CHECK(
    COL1 VARCHAR2(10),
    COL2 VARCHAR2(20),
    CONSTRAINT CHK_01 CHECK( COL1 IN('사과', '배', '바나나') ),
    CONSTRAINT CHK_02 CHECK( COL2 > 0 AND COL2 <= 10 )
);

INSERT INTO TB_CHECK(COL1, COL2)
VALUES('사과', 5);

INSERT INTO TB_CHECK(COL1)
VALUES('배');

INSERT INTO TB_CHECK(COL2)
VALUES(10);

INSERT INTO TB_CHECK(COL1, COL2) -- X
VALUES('포도', 5);

INSERT INTO TB_CHECK(COL1, COL2) -- X
VALUES('사과', 0);

/*
    FOREIGN KEY :   외래키
                    부모테이블, 자식테이블 를 연결하는 목적
                    PK, UK로 설정되어 있어야 한다.
                    NULL을 허용
*/
-- 기본 테이블
DROP TABLE TB_DEPT
CASCADE CONSTRAINTS;

CREATE TABLE TB_DEPT(
    DEPARTMENT_ID VARCHAR2(10),
    DEPARTMENT_NAME VARCHAR2(20),
    LOCATION_ID NUMBER,
    CONSTRAINT PK_DEPT_TEST PRIMARY KEY(DEPARTMENT_ID)
);

INSERT INTO TB_DEPT(DEPARTMENT_ID, DEPARTMENT_NAME, LOCATION_ID)
VALUES('10', '기획부', 100);

INSERT INTO TB_DEPT(DEPARTMENT_ID, DEPARTMENT_NAME, LOCATION_ID)
VALUES('20', '영업부', 200);

INSERT INTO TB_DEPT(DEPARTMENT_ID, DEPARTMENT_NAME, LOCATION_ID)
VALUES('30', '개발부', 300);


DROP TABLE TB_EMP
CASCADE CONSTRAINTS;

CREATE TABLE TB_EMP(
    EMPNO VARCHAR2(10),
    ENAME VARCHAR2(20),
    DEPARTMENT_ID VARCHAR2(10),
    CONSTRAINT FK_EMP_TEST FOREIGN KEY(DEPARTMENT_ID) REFERENCES TB_DEPT(DEPARTMENT_ID)
);

INSERT INTO TB_EMP(EMPNO, ENAME, DEPARTMENT_ID)
VALUES(1, '홍길동', '10');

INSERT INTO TB_EMP(EMPNO, ENAME, DEPARTMENT_ID)
VALUES(2, '성춘향', '30');

INSERT INTO TB_EMP(EMPNO, ENAME, DEPARTMENT_ID) -- 부모 테이블에 등록된 값이 없다
VALUES(3, '홍두께', '40');

INSERT INTO TB_EMP(EMPNO, ENAME, DEPARTMENT_ID)
VALUES(3, '일지매', '');

INSERT INTO TB_EMP(EMPNO, ENAME)
VALUES(4, '정수동');






