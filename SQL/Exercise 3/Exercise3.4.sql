SELECT Staff_Code,Staff_Name,Dept_name,designation_name,Book_Code,Book_Name,Issue_Date
FROM FROM Book_Master LEFT JOIN Book_Transaction ON Book_Transaction.Book_Code=Book_Master.Book_Code
LEFT JOIN Staff_Master ON Staff_Master.Staff_Code=Book_Transaction.Staff_code
WHERE (SELECT DATEDIFF(day, Book_Issue_date, SELECT GETDATE())==30 ;