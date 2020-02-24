SELECT Staff_Code, Staff_Name,Staff_sal  
FROM Staff_Master
WHERE Staff_Sal<(SELECT AVG(Staff_sal) FROM Staff_master);