/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/

select top 1 city, len(city) 
from station
where len(city ) = (select min(len(city)) from station )
order by city;

select  city, len(city) 
from station
where len(city ) = (select max(len(city)) from station ) 
order by city;