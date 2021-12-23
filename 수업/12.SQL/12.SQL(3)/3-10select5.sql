--굉장히 중요한 내용.

/*
JOIN
두개이상의 테이블을 연결해서 데이터를 검색하는 방법.
보통 두 개 이상의 행(ROW)들의 공통된 값 기본키, 외래키를 사용해서 JOIN한다.

기본 키(PRIMARY KEY) : 테이블에서 중복이 되지 않는 키
외래 키(FOREIGN KEY) :다른 테이블에서 PK, UK인 경우가 많다.

JOIN의 종류
INNER JOIN
FULL OUTER JOIN
CROSS JOIN
OUTER JOIN
    LEFT
    RIGHT
SELF JOIN    

*/

--INNER JOIN
--ANSI SQL
SELECT e.employee_id, e.first_name,
e.department_id, d.department_id,
d.department_name
FROM employees e INNER JOIN departments d
ON e.department_id = d.department_id;

--ORACLE
SELECT e.employee_id, first_name,
e.department_id, d.department_id,
d.department_name
FROM employees e, departments d
WHERE e.department_id = d.department_id; --같을 때, join.

SELECT e.employee_id, e.first_name,
e.job_id, j.job_id,
j.job_title
FROM employees e, jobs j
WHERE e.job_id = j.job_id;

--CROSS JOIN 거의 쓸 일이 없음.
--ANSI
SELECT e.employee_id, e.first_name,
e.department_id, d.department_id,
d.department_name
FROM EMPLOYEES e CROSS JOIN departments d;

--ORACLE
SELECT e.employee_id, e.first_name,
e.department_id, d.department_id,
d.department_name
FROM employees e, departments d;

--FULL OUTER JOIN
--ANSI
SELECT e.employee_id, e.first_name,
e.department_id, d.department_id,
d.department_name 
FROM employees e FULL OUTER JOIN departments d
ON e.department_id = d.department_id;

--ORACLE X

--OUTER
--LEFT
--ANSI(LEFT)
SELECT e.employee_id, e.first_name,
e.department_id, d.department_id,
d.department_name 
FROM employees e LEFT OUTER JOIN departments d
ON e.department_id = d.department_id;

--ORACLE
SELECT e.employee_id, e.first_name,
e.department_id, d.department_id,
d.department_name 
FROM employees e, departments d
WHERE e.department_id = d.department_id(+);
UNION
SELECT e.employee_id, e.first_name,
e.department_id, d.department_id,
d.department_name 
FROM employees e, departments d
WHERE e.department_id(+) = d.department_id;


--RIGHT
--ANSI
SELECT e.employee_id, e.first_name,
e.department_id, d.department_id,
d.department_name 
FROM employees e RIGHT OUTER JOIN departments d
ON e.department_id = d.department_id;


--LEFT OUTER JOIN + 차집합
SELECT e.employee_id, e.first_name,
e.department_id, d.department_id,
d.department_name 
FROM employees e, departments d
WHERE e.department_id = d.department_id(+);
AND e.department_id IS NULL;

--FULL OUTER JOIN + 차집합
SELECT e.employee_id, e.first_name,
e.department_id, d.department_id,
d.department_name 
FROM employees e FULL OUTER JOIN departments d
ON e.department_id = d.department_id
WHERE e.department_id IS NULL
    OR d.department_id IS NULL;
    
--SELF JOIN : 동일한 테이블을 JOIN
SELECT a.employee_id, a.first_name,
a.manager_id, b.employee_id,
b.first_name
FROM employees a, employees b --a : 사원 / b : 상사
WHERE a.manager_id = b.employee_id
AND a.employee_id = 168;


