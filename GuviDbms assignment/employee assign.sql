select ename, sal
FROM Empl
WHERE sal >= 2200;

SELECT *
FROM Empl
WHERE comm IS NULL OR comm = 0;


SELECT ename, sal
FROM Empl
WHERE sal NOT BETWEEN 2500 AND 4000;

SELECT ename, job, sal
FROM Empl
WHERE mgr IS NULL;

SELECT ename
FROM Empl
WHERE ename LIKE '__A%';

SELECT ename
FROM Empl
WHERE ename LIKE '%T';




