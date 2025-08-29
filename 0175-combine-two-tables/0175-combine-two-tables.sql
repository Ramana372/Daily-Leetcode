# Write your MySQL query statement below
SELECT Person.firstName,
Person.lastName,
Address.city,
Address.state
FROM Person
LEFT Join Address 
ON Person.personId = Address.personId;