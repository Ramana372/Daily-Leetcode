# Write your MySQL query statement below
select r as id, count(*) as num from(
select requester_id as r, accepter_id as a from requestAccepted union all select accepter_id as r, requester_id as a from requestAccepted
) tab
group by r order by count(*) desc limit 1;