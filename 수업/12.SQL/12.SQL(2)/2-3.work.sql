-- ����1) EMPLOYEES Table�� ��� �ڷḦ ����Ͽ���.
SELECT
    * FROM employees;

-- ����2) EMPLOYEES Table�� �÷����� ��� ����϶�.
DESC employees;
DESC departments;

-- ����3) EMPLOYEES Table���� ��� ��ȣ, �̸�, �޿�, �������� ����Ͽ���.
SELECT employee_id, FIRST_NAME, salary, JOB_ID 
FROM employees;

-- ����4) ��� �������� �޿��� $300���� ��Ű�� ���ؼ� ���� �����ڸ� ����ϰ� ����� SALARY+300�� ���÷��� �մϴ�.
SELECT employee_id, salary, salary+300 AS "salary+300" 
FROM employees;

-- ����5) EMP ���̺��� �����ȣ, �̸�, �޿�, ���ʽ�, ���ʽ� �ݾ��� ����Ͽ���. 
-- (����� ���ʽ��� ���� + (����*Ŀ�̼�))
SELECT employee_id, first_name, salary, 
    NVL(salary * commission_pct, 0) as ���ʽ�, NVL(commission_pct, 0),
    salary + NVL(salary * commission_pct, 0) AS "���� ���� �޾�"
FROM employees;

/*
    NVL(�÷���, �÷��� ���� NULL�� ��� ���⿡ ������ ���� ���)
    IFNULL( ) -> MYSQL
*/

-- ����6) EMPLOYEES ���̺��� LAST_NAME�� �̸����� SALARY�� �޿��� ����Ͽ���.
SELECT last_name AS �̸�, salary as "�� ��" 
FROM employees;

-- ����7) EMPLOYEES ���̺��� LAST_NAME�� Name���� SALARY * 12�� Annual Salary(����)�� ����Ͽ���
SELECT last_name Name, salary * 12 AS "Annual Salary(����)"
FROM employees;

-- ����8) EMPLOYEES ���̺��� �̸��� ������ �����Ͽ� ����Ͽ���.     "" + ""     "" || ""
SELECT first_name || ' ' || job_id 
FROM employees;

-- ����9) EMPLOYEES ���̺��� �̸��� ������ ��KING is a PRESIDENT�� �������� ����Ͽ���. 
SELECT first_name || ' is a ' || job_id 
FROM employees;

-- ����10) EMPLOYEES ���̺��� �̸��� ������ ��KING: 1 Year salary = 60000�� �������� ����Ͽ���. 
SELECT first_name || ': 1 Year salary = ' || salary * 12 as "�̸��� ����"
FROM employees;

-- ����11) EMPLOYEES ���̺��� JOB�� ��� ����϶�(�ߺ�����).
SELECT DISTINCT job_id 
FROM employees;

SELECT DISTINCT department_id 
FROM employees;



