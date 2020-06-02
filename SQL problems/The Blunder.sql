/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/

select  cast(CEILING(avg(cast(salary as float)) -
        avg(cast(REPLACE(cast(salary as NVARCHAR),'0','') as float))) as int)
from EMPLOYEES ;