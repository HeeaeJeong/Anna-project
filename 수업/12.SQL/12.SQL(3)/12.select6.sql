-- SUB QUERY
/*
    QUERY안의 QUERY
    
    SELECT  단일 ROW 단일 COLUMN(산출되는 데이터는 한개, 컬럼도 한개)
    FROM    다중 ROW 다중 COLUMN
    WHERE   다중 ROW 다중 COLUMN
*/

-- SELECT
SELECT employee_id, first_name,
    (SELECT first_name 
     FROM employees
     WHERE employee_id = 100)
FROM employees;

-- 이건 안됨 -> 다중행이기 때문에
SELECT employee_id, first_name,
    (SELECT first_name 
     FROM employees
     WHERE salary > 10000)
FROM employees;

-- 이건 안됨 -> 다중 컬럼이기 때문에
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

-- 부서번호 50번, 급여가 6000이상인 사원
SELECT * 
FROM employees 
WHERE salary >= 6000
    AND department_id = 50;

SELECT employee_id, salary, department_id 
FROM (SELECT * 
      FROM employees
      WHERE department_id = 50)
WHERE salary >= 6000;

-- 업무별 급여의 합계, 인원수, 사원명, 급여
SELECT e.employee_id, e.salary,
    e.job_id, j.job_id,
    j."급여의 합계", j.인원수
FROM employees e, (SELECT job_id, SUM(salary) as "급여의 합계", COUNT(*) as 인원수
                   FROM employees
                   GROUP BY job_id) j
WHERE e.job_id = j.job_id;
    
-- WHERE
-- (평균급여)보다 많이 받는 사원
SELECT first_name, salary 
FROM employees
WHERE salary > (SELECT AVG(salary) FROM employees);

-- 부서별로 가장 많이 받는 사원과 같은 급여를 받는 사원을 산출하라.
SELECT department_id, salary, first_name 
FROM employees
WHERE salary IN(SELECT MAX(salary) 
                FROM employees
                GROUP BY department_id);
    
-- 부서별로 급여를 가장 많이 받는 사원만을 산출하라.
SELECT department_id, salary, first_name 
FROM employees
WHERE (department_id, salary) IN(   SELECT department_id, MAX(salary) 
                                    FROM employees
                                    GROUP BY department_id)
ORDER BY department_id;






