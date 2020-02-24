SELECT Dept_code,Dept_name,COUNT(S.Staff_name) AS NUMBEROFPEOPLE 
FROM staff_master S,Department_Master D
GROUP BY dept_code;