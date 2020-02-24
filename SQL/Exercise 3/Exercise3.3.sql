SELECT Student_code,Student_Name, Book_Code, Book_Name
FROM Book_Transaction LEFT JOIN Book_Master ON Book_Transaction.Book_Code=Book_Master.Book_Code
LEFT JOIN Student_Master ON Student_Master.Student_Code=Book_Master.Student_code
WHERE Book_expected_return_date=(SELECT GETDATE());