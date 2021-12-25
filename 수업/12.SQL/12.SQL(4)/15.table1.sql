/*
    Table : �⺻���� ���� ����
            Row(��), Column(��)
            
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

-- Table ���� : ������ ����
CREATE TABLE TB_TEST03
AS 
SELECT employee_id, first_name, salary 
FROM employees;

DROP TABLE TB_TEST03;

-- Table ���� : ������ ������
CREATE TABLE TB_TEST04
AS 
SELECT *
FROM employees
WHERE 1 = 2;     -- �������� �ʴ� ������ �ۼ�

DROP TABLE TB_TEST04;

CREATE TABLE TB_TEST04( empno, name, money )
AS 
SELECT employee_id, first_name, salary
FROM employees
WHERE 1 = 2;

-- ���̺� ���� : ���̺� ��
ALTER TABLE TB_TEST04
RENAME TO TB_TEST99;

-- ���̺� ���� : �÷��߰�
ALTER TABLE TB_TEST99
ADD 
DEPTNAME NUMBER(3);

-- ���̺� ���� : �÷�����
ALTER TABLE TB_TEST99
MODIFY 
DEPTNAME VARCHAR(20);

-- ���̺� ���� : �÷�����
ALTER TABLE TB_TEST99
DROP 
COLUMN DEPTNAME;

DROP TABLE TB_TEST01;
DROP TABLE TB_TEST02;
DROP TABLE TB_TEST03;
DROP TABLE TB_TEST99;

PURGE RECYCLEBIN;