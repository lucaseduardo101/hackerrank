/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/

select distinct city from station
where city like 'i.e.%' or 
city like 'a%' or
city like 'e%' or
city like 'i%' or
city like 'o%' or
city like 'u%' 