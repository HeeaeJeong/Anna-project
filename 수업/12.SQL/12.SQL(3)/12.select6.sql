-- SUB QUERY
/*
    QUERY���� QUERY
    
    SELECT  ���� ROW ���� COLUMN(����Ǵ� �����ʹ� �Ѱ�, �÷��� �Ѱ�)
    FROM    ���� ROW ���� COLUMN
    WHERE   ���� ROW ���� COLUMN
*/

-- SELECT
SELECT employee_id, first_name,
    (SELECT first_name 
     FROM employees
     WHERE employee_id = 100)
FROM employees;

-- �̰� �ȵ� -> �������̱� ������
SELECT employee_id, first_name,
    (SELECT first_name 
     FROM employees
     WHERE salary > 10000)
FROM employees;

-- �̰� �ȵ� -> ���� �÷��̱� ������
SELECT employee_id, first_name,
    (SELECT first_name, salary 
     FROM employees
     WHERE employee_id = 100)
FROM employees;

SELECT employee_id, first_name, (SELECT COUNT(*) FROM employees)
FROM employees;

-- FROM
SELECT employee_id, salary
FROM (  SELECT employee_id, first_name, salary
        FROM employees 
        WHERE department_id = 80)
WHERE salary >= 10000;

-- �μ���ȣ 50��, �޿��� 6000�̻��� ���
SELECT * 
FROM employees 
WHERE salary >= 6000
    AND department_id = 50;

SELECT employee_id, salary, department_id 
FROM (SELECT * 
      FROM employees
      WHERE department_id = 50)
WHERE salary >= 6000;

-- ������ �޿��� �հ�, �ο���, �����, �޿�
SELECT e.employee_id, e.salary,
    e.job_id, j.job_id,
    j."�޿��� �հ�", j.�ο���
FROM employees e, (SELECT job_id, SUM(salary) as "�޿��� �հ�", COUNT(*) as �ο���
                   FROM employees
                   GROUP BY job_id) j
WHERE e.job_id = j.job_id;
    
-- WHERE
-- (��ձ޿�)���� ���� �޴� ���
SELECT first_name, salary 
FROM employees
WHERE salary > (SELECT AVG(salary) FROM employees);

-- �μ����� ���� ���� �޴� ����� ���� �޿��� �޴� ����� �����϶�.
SELECT department_id, salary, first_name 
FROM employees
WHERE salary IN(SELECT MAX(salary) 
                FROM employees
                GROUP BY department_id);
    
-- �μ����� �޿��� ���� ���� �޴� ������� �����϶�.
SELECT department_id, salary, first_name 
FROM employees
WHERE (department_id, salary) IN(   SELECT department_id, MAX(salary) 
                                    FROM employees
                                    GROUP BY department_id)
ORDER BY department_id;






