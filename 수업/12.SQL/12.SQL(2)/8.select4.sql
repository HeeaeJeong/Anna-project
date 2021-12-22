/*
DISTINCT : �ߺ� ���� 
������ �������� ����.
*/

SELECT DISTINCT JOB_ID
FROM EMPLOYEES;

/*
GROUP BY : �׷����� ���� ���
HAVING : �׷����� ���� ���� ����
*/

SELECT DEPARTMENT_ID
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
ORDER BY DEPARTMENT_ID ASC;

SELECT JOB_ID
FROM EMPLOYEES
GROUP BY JOB_ID
ORDER BY JOB_ID ASC;

/*
�� �׷����� ���°�?
-> ��� �����̴�.

���
COUNNT - �׷��Լ�
SUM
AVG
MAX
MIN
*/
SELECT job_id, COUNT(*), SUM(salary), AVG(salary), MAX(salary), MIN(salary) 
--COUNT(*)���� ���Խ�Ű�ڴٴ� �ǹ�.
FROM employees
GROUP BY job_id;

SELECT JOB_ID, COUNT(*),SUM(SALARY),AVG(SALARY)
FROM EMPLOYEES
GROUP BY JOB_ID
HAVING SUM(SALARY) >= 100000;

--�޿��� 5000�̻� �޴� ��������� �հ踦 ���� JOB_ID���� �׷�ȭ�Ͽ�
--�޿��� �հ谡 20000�� �ʰ��ϴ� JOB_ID���� ���϶�.
SELECT JOB_ID, SUM(SALARY)
FROM EMPLOYEES
WHERE SALARY >= 5000 -- ���� ���� ���͸� �� ��.
GROUP BY JOB_ID
HAVING SUM(SALARY) > 20000; -- ���� �Ŀ� ���� ���.
