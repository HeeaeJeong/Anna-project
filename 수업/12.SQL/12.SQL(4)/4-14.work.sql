-- ����1) EMPLOYEES ���̺��� (Kochhar�� �޿�)���� ���� ����� ������ �����ȣ,�̸�,������,�޿��� ����϶�.
SELECT first_name, last_name 
FROM employees
WHERE first_name = 'Kochhar';

SELECT employee_id, first_name, job_id, salary 
FROM employees
WHERE salary > (SELECT salary 
                FROM employees
                WHERE last_name = 'Kochhar');

-- ����2) EMPLOYEES ���̺��� (�޿��� ���)���� ���� ����� ������ �����ȣ,�̸�,������,�޿�,�μ���ȣ�� ����Ͽ���.  
SELECT employee_id, first_name, job_id, salary, department_id 
FROM employees
WHERE salary < (SELECT ROUND(AVG(salary)) 
                FROM employees);

-- ����3) EMPLOYEES ���̺��� (100�� �μ��� �ּ� �޿�)���� �ּ� �޿��� ���� �ٸ� ��� �μ��� ����϶�
SELECT department_id, MIN(salary) 
FROM employees
GROUP BY department_id
HAVING MIN(salary) > (  SELECT MIN(salary) 
                        FROM employees
                        WHERE department_id = 100);

-- ����4) (�������� �ּ� �޿�)�� �޴� ����� ������ �����ȣ,�̸�,����,�μ���ȣ�� ����Ͽ���. 
-- �� �������� �����Ͽ���.
SELECT employee_id, first_name, job_id, salary, department_id
FROM employees
WHERE (job_id, salary) IN ( SELECT job_id, MIN(salary) 
                            FROM employees
                            GROUP BY job_id);

-- ����5) EMPLOYEES �� DEPARTMENTS ���̺��� ������ SA_MAN ����� ������ �̸�,����,�μ���,�ٹ����� ����϶�.
-- FROM, WHERE�� �� �� �ۼ� 
SELECT first_name, job_id, d.department_name, l.city 
FROM (SELECT * 
      FROM employees
      WHERE job_id = 'SA_MAN') e, departments d, locations l
WHERE e.department_id = d.department_id
    AND d.location_id = l.location_id;
    
SELECT first_name, job_id, d.department_name, l.city  
FROM employees e, departments d, locations l
WHERE e.department_id = d.department_id
    AND d.location_id = l.location_id
        AND e.job_id = 'SA_MAN';

-- ����6) EMPLOYEES ���̺��� (���� ���� ���)�� ���� MANAGER�� �����ȣ�� ����϶�.
SELECT manager_id, COUNT(*) 
FROM employees
GROUP BY manager_id
HAVING COUNT(manager_id) = (SELECT MAX(COUNT(*)) 
                            FROM employees
                            GROUP BY manager_id);

-- ����7) EMPLOYEES ���̺��� (���� ���� ���)�� ���� �ִ� �μ� ��ȣ�� �������  ����϶�.
SELECT department_id, COUNT(*) 
FROM employees
GROUP BY department_id
HAVING COUNT(department_id) = (  SELECT MAX(COUNT(*)) 
                                FROM employees
                                GROUP BY department_id);

-- ����8) EMPLOYEES ���̺��� (�����ȣ�� 123�� ����� ����)�� ���� 
--                           (�����ȣ�� 192�� ����� �޿�(SAL))���� ���� ����� �����ȣ,�̸�,����,�޿��� ����϶�.
SELECT employee_id, first_name, job_id, salary 
FROM employees
WHERE
    job_id = (SELECT job_id FROM employees WHERE employee_id = 123)
    AND
    salary > (SELECT salary FROM employees WHERE employee_id = 192);

-- ����9)����(JOB)���� �ּұ޿��� �޴� ����� ������ �����ȣ,�̸�,����,�μ����� ����϶�.
-- ����1 :�������� ������������
SELECT job_id, e.first_name, department_name, e.salary 
FROM employees e, departments d
WHERE e.department_id = d.department_id
    AND (job_id, salary) IN(SELECT job_id, MIN(salary) 
                            FROM employees 
                            GROUP BY job_id)
ORDER BY e.job_id DESC;

-- ����10) EMPLOYEES ���̺��� (50�� �μ��� �ּ� �޿�)�� �޴� ������� ���� �޿��� �޴� 
-- ����� ������ �����ȣ,�̸�,����,�Ի�����,�޿�,�μ���ȣ�� ����϶�. 
-- �� 50���� ����
SELECT employee_id, first_name, job_id, hire_date, salary, department_id 
FROM employees
WHERE salary >  (   SELECT MIN(salary) 
                    FROM employees
                    WHERE department_id = 50)
    AND department_id <> 50;

-- ����11) EMPLOYEES ���̺��� 50�� �μ��� �ְ� �޿��� �޴� ��� ���� ���� �޿��� �޴� ����� ������ �����ȣ,�̸�,����,�Ի�����,�޿�,�μ���ȣ�� ����϶�. 
-- ��50���� ����
SELECT employee_id, first_name, job_id, hire_date, salary, department_id 
FROM employees
WHERE salary >  (   SELECT MAX(salary) 
                    FROM employees
                    WHERE department_id = 50)
    AND department_id <> 50;



