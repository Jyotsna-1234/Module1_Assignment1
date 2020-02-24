SELECT S.Staff_Code,S.Staff_Name,D.Dept_name,F.Design_name 
FROM Staff_Master S, Department_master D,Designation_master F 
WHERE MONTHS_BETWEEN(TO_CHAR(HIREDATE,'MM') ,TO_CHAR(SYSDATE,'MM'))<3;