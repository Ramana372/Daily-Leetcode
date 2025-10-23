# Write your MySQL query statement below
-- -- select r as id, count(*) as num from(
-- select requester_id as r, accepter_id as a from requestAccepted union all select accepter_id as r, requester_id as a from requestAccepted;
-- ) tab
-- group by r order by count(*) desc limit 1;

SELECT id, COUNT(*) AS num
FROM (
    SELECT requester_id AS id FROM requestAccepted
    UNION ALL
    SELECT accepter_id AS id FROM requestAccepted
) AS all_ids
GROUP BY id
ORDER BY num DESC
LIMIT 1;