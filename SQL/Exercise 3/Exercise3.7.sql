SELECT Book_pub_author,Book_name
FROM Book_master 
GROUP BY Book_pub_Author_name HAVING COUNT(Book_pub_author)>1;