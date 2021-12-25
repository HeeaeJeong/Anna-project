/*
    ���Ἲ : Constraint
            Column�� �����ϴ� ����

    Primary Key : �⺻Ű. NULL(��ĭ)�� ������� �ʴ´�. �ߺ��� ������� �ʴ´�.  id, �ֹι�ȣ
    Unique Key : ����Ű. NULL(��ĭ)�� ����Ѵ�. �ߺ��� ������� �ʴ´�.         email
    Foreign Key : �ܷ�Ű. ���̺�� ���̺��� �����ϴ� ������ �����̴�.
                  Employees(�ܷ�Ű:department_id) Departments(�⺻Ű:department_id)  
                  �ܷ�Ű�� ������ �÷��� PK�� UK�� �����Ǿ� �־�� �Ѵ�.
    CHECK : ������ ����, ������ ���ܿ� NULL�� ����Ѵ�.
    NOT NULL : NULL�� ������� �ʴ´�. (��ĭ�� ������� ����)
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

INSERT INTO tb_test1(col1, col2) -- ���ȵ�
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

-- Unique : ����Ű. �ߺ��� ���� �ԷºҰ�(=PK), NULL�� ���
CREATE TABLE tb_test1(
    UKCOL VARCHAR2(10) CONSTRAINT UK_TEST_01 UNIQUE,
    COL1 VARCHAR2(20),
    COL2 VARCHAR2(20)
);

INSERT INTO tb_test1(UKCOL, COL1, COL2)
VALUES('AAA', '111', 'aaa');

INSERT INTO tb_test1(COL1, COL2)
VALUES('111', 'aaa');

-- UK, PK�� ������ �ʿ��� ���
ALTER TABLE tb_test1
DROP 
CONSTRAINT  UK_TEST_01;

-- CHECK : ������ ���� ���. NULL�� ���. 
CREATE TABLE TB_CHECK(
    COL1 VARCHAR2(10),
    COL2 VARCHAR2(20),
    CONSTRAINT CHK_01 CHECK( COL1 IN('���', '��', '�ٳ���') ),
    CONSTRAINT CHK_02 CHECK( COL2 > 0 AND COL2 <= 10 )
);

INSERT INTO TB_CHECK(COL1, COL2)
VALUES('���', 5);

INSERT INTO TB_CHECK(COL1)
VALUES('��');

INSERT INTO TB_CHECK(COL2)
VALUES(10);

INSERT INTO TB_CHECK(COL1, COL2) -- X
VALUES('����', 5);

INSERT INTO TB_CHECK(COL1, COL2) -- X
VALUES('���', 0);

/*
    FOREIGN KEY :   �ܷ�Ű
                    �θ����̺�, �ڽ����̺� �� �����ϴ� ����
                    PK, UK�� �����Ǿ� �־�� �Ѵ�.
                    NULL�� ���
*/
-- �⺻ ���̺�
DROP TABLE TB_DEPT
CASCADE CONSTRAINTS;

CREATE TABLE TB_DEPT(
    DEPARTMENT_ID VARCHAR2(10),
    DEPARTMENT_NAME VARCHAR2(20),
    LOCATION_ID NUMBER,
    CONSTRAINT PK_DEPT_TEST PRIMARY KEY(DEPARTMENT_ID)
);

INSERT INTO TB_DEPT(DEPARTMENT_ID, DEPARTMENT_NAME, LOCATION_ID)
VALUES('10', '��ȹ��', 100);

INSERT INTO TB_DEPT(DEPARTMENT_ID, DEPARTMENT_NAME, LOCATION_ID)
VALUES('20', '������', 200);

INSERT INTO TB_DEPT(DEPARTMENT_ID, DEPARTMENT_NAME, LOCATION_ID)
VALUES('30', '���ߺ�', 300);


DROP TABLE TB_EMP
CASCADE CONSTRAINTS;

CREATE TABLE TB_EMP(
    EMPNO VARCHAR2(10),
    ENAME VARCHAR2(20),
    DEPARTMENT_ID VARCHAR2(10),
    CONSTRAINT FK_EMP_TEST FOREIGN KEY(DEPARTMENT_ID) REFERENCES TB_DEPT(DEPARTMENT_ID)
);

INSERT INTO TB_EMP(EMPNO, ENAME, DEPARTMENT_ID)
VALUES(1, 'ȫ�浿', '10');

INSERT INTO TB_EMP(EMPNO, ENAME, DEPARTMENT_ID)
VALUES(2, '������', '30');

INSERT INTO TB_EMP(EMPNO, ENAME, DEPARTMENT_ID) -- �θ� ���̺� ��ϵ� ���� ����
VALUES(3, 'ȫ�β�', '40');

INSERT INTO TB_EMP(EMPNO, ENAME, DEPARTMENT_ID)
VALUES(3, '������', '');

INSERT INTO TB_EMP(EMPNO, ENAME)
VALUES(4, '������');






