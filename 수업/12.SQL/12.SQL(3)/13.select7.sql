-- 특수 query
-- CASE == switch
SELECT employee_id, first_name, phone_number,
    CASE SUBSTR(phone_number, 1, 3)
        WHEN '515' THEN '서울'
        WHEN '590' THEN '부산'
        WHEN '650' THEN '광주'
        ELSE '기타'
    END
FROM employees;
    
-- String str = "hello";
-- String substr = str.substring(1, 4);

SELECT 'A' FROM dual;

SELECT SUBSTR('hello', 3, 3) 
FROM dual;

SELECT employee_id, first_name, phone_number,
    CASE 
        WHEN SUBSTR(phone_number, 1, 3) = '515' THEN '서울'
        WHEN SUBSTR(phone_number, 1, 3) = '590' THEN '부산'
        WHEN SUBSTR(phone_number, 1, 3) = '650' THEN '광주'
        ELSE '기타'
    END AS 지역
FROM employees;

-- DECODE
SELECT employee_id, first_name, phone_number,
    DECODE( SUBSTR(phone_number, 1, 3), 
            '515', '서울',
            '590', '부산',
            '650', '광주'
    ) AS 지역
FROM employees;

-- 분석 함수
/*
    순위 함수
    RANK()
    DENSE_RANK()
    ROW_NUMBER()
    ROWNUM
*/
SELECT employee_id, first_name 
FROM employees
WHERE employee_id >= 100 AND employee_id <= 109;

-- 급여 랭킹 top10을 구하라
SELECT employee_id, first_name, salary 
FROM employees
ORDER BY salary DESC;

SELECT ROWNUM, employee_id, first_name 
FROM employees
WHERE ROWNUM <= 10;

SELECT ROWNUM, employee_id, first_name 
FROM employees
WHERE ROWNUM > 10 AND ROWNUM <= 20;

-- 1. 급여의 순위 -> 정렬
-- 2. 번호지정 -> ROWNUM
-- 3. 범위지정

SELECT RNUM, employee_id, first_name, salary    
    FROM
    (SELECT ROWNUM AS RNUM, employee_id, first_name, salary  -- 2. 번호지정
     FROM    
        (SELECT employee_id, first_name, salary  -- 1. 급여의 순위
        FROM employees
        ORDER BY salary DESC)
    )
WHERE RNUM >= 11 AND RNUM <= 20;    -- 3. 범위지정




