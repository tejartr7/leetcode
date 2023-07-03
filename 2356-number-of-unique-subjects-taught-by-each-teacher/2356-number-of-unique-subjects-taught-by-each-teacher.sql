SELECT teacher_id, COUNT(distinct subject_id) AS cnt
FROM teacher
GROUP BY teacher_id;
