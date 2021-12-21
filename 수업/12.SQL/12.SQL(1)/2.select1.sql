/*
TABLE DATA들
    INSERT
    DELETE
    SELECT - 90%
    UPDATE

    형식:
        SELECT (값, 컬럼명, 함수, SUB QUERY)
        FROM (테이블명, SUB QUERY) 
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
SELECT employee_id AS "사원 번호", salary as 월급, first_name 이름
FROM EMPLOYEES;

-- distinct : 중복행을 삭제
SELECT DISTINCT JOB_ID 
FROM EMPLOYEES;

DESC EMPLOYEES;

DESC TB_DATE;















