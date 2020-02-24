SELECT Staff_Code,Staff_Name,Design_Name,Dept_Name,Book_Code,Book_Name,Book_pub_author, 5*((SELECT GETDATE())-Book_expected_return_date) AS Fine
FROM Book_Transaction INNER JOIN Staff_master on Book_Transaction.Staff_code=Staff_Master.Staff_code
INNER JOIN Book_master on Book_Transaction.Book_code=Book_Master.Book_code
INNER JOIN Designation_master on Book_Transaction.Design_code=Designation_Master.Design_code
INNER JOIN Department_master on Book_Transaction.Dept_code=Department_Master.Dept_code
