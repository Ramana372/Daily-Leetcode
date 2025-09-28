# Write your MySQL query statement below
with t1 as(
    select * from students join subjects
)

select  t1.student_id, t1.student_name, t1.subject_name, case when count(e.subject_name) then count(e.student_id) else 0 end as attended_exams from t1 left join examinations e on t1.student_id=e.student_id and t1.subject_name = e.subject_name group by t1.student_id,t1.subject_name order by t1.student_id;