SELECT Staff_Master.Staff_Name,Staff_Master.Dept_code,Department_Master.Dept_Name,Staff_master.Staff_sal
FROM (SELECT * FROM Staff_Master INNER JOIN Department_Master
      ON Staff_Master.Dept_code=Department_Master.Dept_code )
WHERE Staff_salary>20000;