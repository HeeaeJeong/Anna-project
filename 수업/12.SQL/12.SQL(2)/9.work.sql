-- ����
-- ����1) EMPLOYEES ���̺��� �Ի����� ������ �����Ͽ� �����ȣ, �̸�, ����, �޿�, �Ի�����,�μ���ȣ�� ����϶�.
SELECT employee_id, first_name, job_id, salary, hire_date, department_id 
FROM employees
ORDER BY hire_date ASC;

-- ����2) EMPLOYEES ���̺��� ���� �ֱٿ� �Ի��� ������ �����ȣ, �̸�, ����, �޿�, �Ի�����,�μ���ȣ�� ����϶�.
SELECT employee_id, first_name, job_id, salary, hire_date, department_id 
FROM employees
ORDER BY hire_date DESC;

-- ����3) EMPLOYEES ���̺��� �μ���ȣ�� ������ �� �μ���ȣ�� ���� ��� �޿��� ���� ������ �����Ͽ� 
-- �����ȣ, ����, ����, �μ���ȣ, �޿��� ����Ͽ���.
SELECT employee_id, first_name, job_id, salary, department_id 
FROM employees
ORDER BY department_id ASC, salary DESC;

-- ����4) EMPLOYEES ���̺��� ù��° ������ �μ���ȣ�� �ι�° ������ ������ ����° ������ �޿��� ���� ������ �����Ͽ� 
-- �����ȣ, ����, �Ի�����, �μ���ȣ, ����, �޿��� ����Ͽ���.
SELECT employee_id, department_id, job_id, salary 
FROM employees
ORDER BY department_id ASC, job_id ASC, salary DESC;

-- ǥ���Լ� TO_DATE TO_CHAR     king King KING
-- ����1) EMPLOYEES ���̺��� King�� ������ �빮�ڷ� �˻��ϰ� �����ȣ, ����, �������� �빮�ڷ� �׸��� �μ���ȣ�� ����϶�.
SELECT employee_id, last_name, upper(job_id), department_id 
FROM employees
WHERE UPPER(last_name) = 'KING';

-- ����2) DEPARTMENTS ���̺��� �μ���ȣ�� �μ��̸�, �μ��̸��� ��ġ��ȣ�� ���Ͽ� ����ϵ��� �϶�.
SELECT department_id, department_name, department_id || ' ' || location_id 
FROM departments;

-- concat
SELECT department_id, department_name, CONCAT(department_id, location_id) 
FROM departments;

-- ����3) EMPLOYEES ���̺��� �̸� �� ��e������ ��ġ�� ����϶�.
-- INSTR
SELECT first_name, INSTR(first_name, 'e') 
FROM employees;

SELECT first_name, INSTR(first_name, 'e', 1, 2) 
FROM employees;

-- ����4) EMPLOYEES ���̺��� �μ���ȣ�� 80�� ����� �޿��� 30���� ���� �������� ���Ͽ� ����϶�. MOD
SELECT department_id, first_name, MOD(salary, 30), salary 
FROM employees
WHERE department_id = 80;

-- ����5) EMPLOYEES ���̺��� ������� �ٹ��� ���� ���� ���� �ΰ��� ����Ͽ���. 
-- �� �ٹ� �ϼ��� ���� ��� ������ ����Ͽ���.
SELECT first_name, hire_date,
    TO_DATE('09/01/01') - hire_date as "�� �ٹ� �ϼ�",
    TRUNC( (TO_DATE('09/01/01') - hire_date) / 7 ) as "�� �ٹ� ���ϼ�"
FROM employees
order by "�� �ٹ� �ϼ�" DESC;

-- ����6) EMPLOYEES ���̺��� �μ� 50���� �޿� �տ� $�� �����ϰ� 3�ڸ����� ,�� ����϶�
SELECT first_name, salary, TO_CHAR(salary, '$999,999,999')
FROM employees
WHERE department_id = 50;

-- �׷���
-- ����1) EMPLOYEES ���̺��� ��� SALESMAN(SA_)�� ���Ͽ� �޿��� ���, �ְ��, ������, �հ踦 ���Ͽ� ����Ͽ���.
SELECT AVG(salary), MAX(salary), MIN(salary), SUM(salary)
FROM employees
WHERE job_id LIKE 'SA_%';

-- ����2) EMPLOYEES ���̺� ��ϵǾ� �ִ� �ο���, 
-- ���ʽ��� NULL�� �ƴ� �ο���, ���ʽ��� ���, ��ϵǾ� �ִ� �μ��� ���� ���Ͽ� ����϶�.
SELECT COUNT(*), COUNT(commission_pct), ROUND(AVG(commission_pct * salary)), COUNT(DISTINCT department_id)
FROM employees;


-- ����3) EMPLOYEES ���̺��� �μ����� �ο���, ��� �޿�, �����޿�, �ְ� �޿�, �޿��� ���� ���Ͽ� ����϶�.
SELECT department_id, COUNT(*), ROUND(AVG(salary)), MIN(salary), MAX(salary), SUM(salary) 
FROM employees
GROUP BY department_id;

-- ����4) EMPLOYEES ���̺��� �� �μ����� �ο���,�޿��� ���, ���� �޿�, �ְ� �޿�, �޿��� ���� ���Ͽ� �޿��� ���� ���� ������ ����Ͽ���.
SELECT department_id, COUNT(*), AVG(salary), MIN(salary), MAX(salary), SUM(salary) AS "�޿��� ��"  
FROM employees
GROUP BY department_id
ORDER BY "�޿��� ��" DESC;

-- ����5) EMPLOYEES ���̺��� �μ���, ������ �׷��Ͽ� ����� �μ���ȣ, ����, 
-- �ο���, �޿��� ���, �޿��� ���� ���Ͽ� ����Ͽ���.
SELECT department_id, job_id, COUNT(*), AVG(salary), SUM(salary) 
FROM employees
GROUP BY department_id, job_id;

-- ����6) EMPLOYEES ���̺��� �μ� �ο��� 4���� ���� �μ��� �μ���ȣ, �ο���, �޿��� ���� ���Ͽ� ����Ͽ���
SELECT department_id, COUNT(*), SUM(salary) 
FROM employees
GROUP BY department_id
HAVING COUNT(*) > 4;

-- ����7) EMPLOYEES ���̺��� �޿��� �ִ� 10000�̻��� �μ��� ���ؼ� �μ���ȣ, ��� �޿�, �޿��� ���� ���Ͽ� ����Ͽ���.
SELECT department_id, TRUNC(AVG(salary)), MAX(salary), SUM(salary) 
FROM employees
GROUP BY department_id
HAVING MAX(salary) >= 10000;

-- ����8) EMPLOYEES ���̺��� ������ �޿��� ����� 10000 �̻��� ������ ���ؼ� ������,��� �޿�, �޿��� ���� ���Ͽ� ����϶�.
SELECT job_id, AVG(salary), SUM(salary) 
FROM employees
GROUP BY job_id
HAVING AVG(salary) > 10000;

-- ����9) EMPLOYEES ���̺��� ��ü ������ 10000�� �ʰ��ϴ� �� ������ ���ؼ� ������ ���޿� �հ踦 ����϶�. 
-- �� �Ǹſ�(SA)�� �����ϰ�  �� �޿� �հ�� ����(��������)�϶�.
SELECT job_id, SUM(salary) 
FROM employees
WHERE job_id NOT LIKE 'SA%'
GROUP BY job_id
HAVING SUM(salary) > 10000
ORDER BY SUM(salary) DESC;









