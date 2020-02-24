SELECT department_id "Department Code", 
COUNT(*) "No of Employees" 
FROM employees 
GROUP BY department_id; 