# Write your MySQL query statement below
select email AS Email from Person
group by email
Having count(email)>1;