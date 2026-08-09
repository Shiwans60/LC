select s1.student_id, s1.subject , s2.score as first_score, s1.score as latest_score
from Scores s1 join Scores s2
on s1.student_id = s2.student_id
and s1.subject = s2.subject
and s1.exam_date > s2.exam_date
where not exists (select 1 from scores s3 where s3.student_id = s1.student_id and s3.subject = s1.subject and s3.exam_date > s1.exam_date)
and not exists (select 1 from scores s4 where s4.student_id = s2.student_id and s4.subject = s2.subject and s4.exam_date < s2.exam_date)
and s1.score > s2.score
order by s1.student_id, s1.subject


