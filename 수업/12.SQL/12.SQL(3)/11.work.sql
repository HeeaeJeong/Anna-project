-- ����1) ������� �̸�, �μ���ȣ, �μ����� ����϶�
SELECT e.first_name, e.department_id, d.department_name 
FROM employees e, departments d
WHERE e.department_id = d.department_id;

-- ����2) 30�� �μ��� ������� �̸�,����,�μ����� ����϶�
SELECT e.first_name, e.job_id, d.department_name, j.job_title, d.department_id 
FROM employees e, departments d, jobs j
WHERE e.department_id = d.department_id
    AND e.job_id = j.job_id
        AND d.department_id = 30; 

-- ����3) Ŀ�̼��� �޴� ����� �̸�, ����, �μ���ȣ,�μ����� ����϶�
SELECT e.first_name, e.job_id, d.department_id, d.department_name, e.commission_pct * e.salary 
FROM employees e, departments d
WHERE e.department_id = d.department_id
    AND e.commission_pct IS NOT NULL;

-- ����4) ������ȣ 2500 ���� �ٹ��ϴ� ����� �̸�, ����,�μ���ȣ,�μ����� ����϶�
SELECT e.first_name, e.job_id, d.department_id, d.department_name,
    d.location_id, l.city
FROM employees e, departments d, locations l
WHERE e.department_id = d.department_id
    AND d.location_id = l.location_id
        AND d.location_id = 2500;

-- ����5) �̸��� A�� ���� ������� �̸��� �μ��̸��� ����϶�
SELECT e.first_name, d.department_name 
FROM employees e, departments d
WHERE e.department_id = d.department_id
    AND e.first_name LIKE 'A%';

-- ����6) ����̸��� �� ����� ������ �̸��� ����϶�
SELECT emp.first_name as "�����", mgr.first_name as "����" 
FROM employees emp, employees mgr
WHERE emp.manager_id = mgr.employee_id;

-- ����7) ����̸��� �μ���� ������ ����ϴµ� ������ 3000 �̻��� ����� ����϶�
SELECT e.first_name, d.department_name, e.salary 
FROM employees e, departments d
WHERE e.department_id = d.department_id
    AND e.salary >= 3000;

-- ����8) TJ �̶� ������� �ʰ� �Ի��� ����� �̸��� �Ի����� ����϶�
SELECT a.first_name, a.hire_date, b.first_name, b.hire_date 
FROM employees a, employees b     -- a: TJ  b: �����
WHERE a.first_name = 'TJ'
    AND a.hire_date < b.hire_date
ORDER BY b.hire_date ASC;

-- ����9) �޿��� 3000���� 5000������ ����� �̸��� �ҼӺμ��� ����϶�
SELECT e.first_name, e.salary, d.department_name 
FROM employees e, departments d
WHERE e.department_id = d.department_id
    AND e.salary BETWEEN 3000 AND 5000;

-- ����10) ACCOUNTING �μ� �Ҽ� ����� �̸��� �Ի��� ����϶�
SELECT e.first_name, e.hire_date, d.department_name 
FROM departments d, employees e
WHERE d.department_id = e.department_id
    AND d.department_name = 'Accounting';

-- ����11) �޿��� 3000������ ����� �̸��� �޿�, �ٹ����� ����϶�.
SELECT e.first_name, e.salary, d.location_id, l.city 
FROM employees e, departments d, locations l
WHERE e.department_id = d.department_id
    AND d.location_id = l.location_id
        AND e.salary <= 3000;
