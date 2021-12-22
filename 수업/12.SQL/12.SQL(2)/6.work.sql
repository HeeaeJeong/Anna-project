-- ����1) EMPLOYEES ���̺��� �޿��� 3000�̻��� ����� �����ȣ, �̸�, ������, �޿��� ����϶�.
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY
FROM EMPLOYEES
WHERE SALARY >= 3000;


-- ����2) EMPLOYEES ���̺��� ��� ������ ST_MAN�� ����� �����ȣ, ����, ������, �޿�, �μ���ȣ�� ����϶�.
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY, DEPARTMENT_ID
FROM EMPLOYEES
WHERE JOB_ID = 'ST_MAN';


-- ����3) EMPLOYEES ���̺��� �Ի����ڰ� 2006�� 1�� 1�� ���Ŀ� �Ի��� ����� ������ 
-- �����ȣ, ����, ������, �޿�, �Ի�����, �μ���ȣ�� ����϶�.
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY, HIRE_DATE, DEPARTMENT_ID
FROM EMPLOYEES
--WHERE HIRE_DATE > '06/01/01';
WHERE HIRE_DATE > TO_DATE('060101','YYMMDD')


-- ����4) EMPLOYEES ���̺��� �޿��� 3000���� 5000������ ����� ����, ������, �޿�, �μ���ȣ�� ����϶�.
SELECCT FIRST_NAME, JOB_ID, SALARY, DEPARTMENT_ID
FROM EMPLOYEES
WHERE SALARY >= 3000 AND SALARY <=5000;
--WHERE SALARY BETWEEN 3000 AND 5000; ���� �����ϰ� ��µ�.


-- ����5) EMPLOYEES ���̺��� �����ȣ�� 145,152,203�� ����� ������ �����ȣ, ����, ������, �޿�, �Ի����ڸ� ����϶�
SELECT EMPLOYEE_ID, FIRST_NAME, JOB__ID, SALARY, HIRE_DATE
FROM EMPLOYEES
WHERE EMPLOYEE_ID IN(145, 152, 203);


-- ����6) EMPLOYEES ���̺��� �Ի����ڰ� 05�⵵�� �Ի��� ����� ������ �����ȣ, ����, ������, �޿�, �Ի�����, �μ���ȣ�� ����϶�.
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY, HIRE_DATE, DEPARTMENT_ID
FROM EMPLOYEES
WHERE HIRE_DATE LIKE '05%';


-- ����7) EMPLOYEES ���̺��� ���ʽ��� ���� ����� �����ȣ, ����, ������, �޿�, �Ի�����, ���ʽ�, �μ���ȣ�� ����϶�.
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY, HIRE_DATE, SALARY * NVL(COMMISSION_PCT, 0), DEPARTMENT_ID --NVL ==���ʽ�
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NULL; --���ʽ��� ���� ���


-- ����8) EMPLOYEES ���̺��� �޿��� 1100�̻��̰� JOB�� ST_MAN�� ����� �����ȣ, ����, ������, �޿�, �Ի�����, �μ���ȣ�� ����϶�
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY, HIRE_DATE, DEPARTMENT_ID
FROM EMPLOYEES
WHERE SALARY >= 1100 AND JOB_ID = 'ST_MAN';


-- ����9) EMPLOYEES ���̺��� �޿��� 10000�̻��̰ų� JOB�� ST_MAN�� ����� �����ȣ, ����, ������, �޿�, �Ի�����, �μ���ȣ�� ����϶�
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID,SALARY, HIRE_DATE, DEPARTMENT_ID
FROM EMPLOYEES
WHERE SALARY >= 10000
OR JOB_ID = 'ST_MAN';


-- ����10) EMPLOYEES ���̺��� JOB�� ST_MAN, SA_MAN, SA_REP�� �ƴ� ����� �����ȣ, ����, ������, �޿�, �μ���ȣ�� ����϶�
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY, DEPARTMENT_ID
FROM EMPLOYEES
WHERE JOB_ID NOT IN('ST_MAN', 'SA_MAN', 'SA_REP');


-- ����11) ������ PRES�̰� �޿��� 12000�̻��̰ų� ������ SA_MAN�� ����� �����ȣ, �̸�, ����, �޿��� ����϶�.
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY
FROM EMPLOYEES
WHERE JOB_ID LIKE '%PRES%'
AND SALARY >= 12000
OR JOB_ID = 'SA_MAN';


-- ����12) ������ AD_PRES �Ǵ� SA_MAN�̰� �޿��� 12000�̻��� ����� �����ȣ, �̸�, ����, �޿��� ����϶�.
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY
FROM EMPLOYEES
WHERE JOB_ID = 'AD_PRES'
OR JOB_ID = 'SA_MAN'
AND SALARY >= 12000;