SELECT S.Staff_Code,D.Staff_Name,D.Dept_name 
FROM Staff_master S,Book_Transaction D 
GROUP BY S.Staff_name HAVING COUNT(D.Staff_name)>1;