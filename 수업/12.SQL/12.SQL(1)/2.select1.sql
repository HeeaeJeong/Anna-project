/*
TABLE DATA��
    INSERT
    DELETE
    SELECT - 90%
    UPDATE

    ����:
        SELECT (��, �÷���, �Լ�, SUB QUERY)
        FROM (���̺��, SUB QUERY) 
*/

select * from EMPLOYEES;

select EMPLOYEE_ID, FIRST_NAME, SALARY 
from EMPLOYEES;

SELECT LAST_NAME, SALARY, SALARY + 300 
FROM EMPLOYEES;

SELECT LAST_NAME, SALARY * 12
FROM EMPLOYEES;

-- String str = "hello", str1 = "world"   str = str + str1
--												str || str1	
SELECT FIRST_NAME || ' ' || SALARY 		-- FIRST_NAME + " " + SALARY
FROM EMPLOYEES;

-- ALIAS
SELECT employee_id AS "��� ��ȣ", salary as ����, first_name �̸�
FROM EMPLOYEES;

-- distinct : �ߺ����� ����
SELECT DISTINCT JOB_ID 
FROM EMPLOYEES;

DESC EMPLOYEES;

DESC TB_DATE;















