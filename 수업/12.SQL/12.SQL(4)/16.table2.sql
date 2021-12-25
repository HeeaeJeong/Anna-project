CREATE TABLE DEFT(DEPTNO, DNAME, MGR, LOC)
AS
SELECT department_id, department_name, manager_id, location_id 
FROM departments
WHERE 1=2;

-- insert
INSERT INTO deft(deptno, dname, mgr, loc)
VALUES(10, '扁裙何', 100, 123);

INSERT INTO deft(deptno, dname)
VALUES(20, '包府何'); 

INSERT INTO deft
VALUES(30, 'IT何', 333, 234);

INSERT INTO deft(dname, deptno, mgr, loc)
VALUES('版府何', 40, 200, 345);

INSERT INTO deft    -- not enough values
VALUES(30, 'IT何', 333);

INSERT INTO deft(deptno, dname, mgr, loc)
VALUES('40', '康诀何', '400', '678');

INSERT INTO deft(deptno, dname, mgr, loc)   -- ok
VALUES(40, 100, 400, 678);

INSERT INTO deft(deptno, dname, mgr, loc)   -- column not allowed here
VALUES(40, "康诀何", 400, 678);

-- delete
DELETE 
FROM deft
WHERE dname = '100';

DELETE
FROM deft
WHERE mgr IS NULL;

-- update
UPDATE deft
SET mgr = 300
WHERE deptno = 30;

UPDATE deft
SET deptno = 50, mgr = 500
WHERE dname = '康诀何';


