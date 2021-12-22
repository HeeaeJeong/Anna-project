/*
DISTINCT : 중복 생략 
사용법이 폭넓지가 않음.
*/

SELECT DISTINCT JOB_ID
FROM EMPLOYEES;

/*
GROUP BY : 그룹으로 묶는 기능
HAVING : 그룹으로 묶은 후의 조건
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
왜 그룹으로 묶는가?
-> 통계 때문이다.

통계
COUNNT - 그룹함수
SUM
AVG
MAX
MIN
*/
SELECT job_id, COUNT(*), SUM(salary), AVG(salary), MAX(salary), MIN(salary) 
--COUNT(*)전부 포함시키겠다는 의미.
FROM employees
GROUP BY job_id;

SELECT JOB_ID, COUNT(*),SUM(SALARY),AVG(SALARY)
FROM EMPLOYEES
GROUP BY JOB_ID
HAVING SUM(SALARY) >= 100000;

--급여기 5000이상 받는 사원만으로 합계를 내서 JOB_ID으로 그룹화하여
--급여의 합계가 20000을 초과하는 JOB_ID명을 구하라.
SELECT JOB_ID, SUM(SALARY)
FROM EMPLOYEES
WHERE SALARY >= 5000 -- 묶기 전에 필터링 한 것.
GROUP BY JOB_ID
HAVING SUM(SALARY) > 20000; -- 묶은 후에 조건 출력.
