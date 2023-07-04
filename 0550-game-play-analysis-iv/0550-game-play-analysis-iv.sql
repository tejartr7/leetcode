SELECT ROUND(COUNT(DISTINCT b.player_id) / COUNT(DISTINCT a.player_id), 2) AS fraction
FROM
  (SELECT player_id, MIN(event_date) AS min_event_date
   FROM activity
   GROUP BY player_id) a
LEFT JOIN activity b
  ON a.player_id = b.player_id AND a.min_event_date + INTERVAL 1 DAY = b.event_date;
