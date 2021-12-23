--������ �߿��� ����.

/*
JOIN
�ΰ��̻��� ���̺��� �����ؼ� �����͸� �˻��ϴ� ���.
���� �� �� �̻��� ��(ROW)���� ����� �� �⺻Ű, �ܷ�Ű�� ����ؼ� JOIN�Ѵ�.

�⺻ Ű(PRIMARY KEY) : ���̺��� �ߺ��� ���� �ʴ� Ű
�ܷ� Ű(FOREIGN KEY) :�ٸ� ���̺��� PK, UK�� ��찡 ����.

JOIN�� ����
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
WHERE e.department_id = d.department_id; --���� ��, join.

SELECT e.employee_id, e.first_name,
e.job_id, j.job_id,
j.job_title
FROM employees e, jobs j
WHERE e.job_id = j.job_id;

--CROSS JOIN ���� �� ���� ����.
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


--LEFT OUTER JOIN + ������
SELECT e.employee_id, e.first_name,
e.department_id, d.department_id,
d.department_name 
FROM employees e, departments d
WHERE e.department_id = d.department_id(+);
AND e.department_id IS NULL;

--FULL OUTER JOIN + ������
SELECT e.employee_id, e.first_name,
e.department_id, d.department_id,
d.department_name 
FROM employees e FULL OUTER JOIN departments d
ON e.department_id = d.department_id
WHERE e.department_id IS NULL
    OR d.department_id IS NULL;
    
--SELF JOIN : ������ ���̺��� JOIN
SELECT a.employee_id, a.first_name,
a.manager_id, b.employee_id,
b.first_name
FROM employees a, employees b --a : ��� / b : ���
WHERE a.manager_id = b.employee_id
AND a.employee_id = 168;


