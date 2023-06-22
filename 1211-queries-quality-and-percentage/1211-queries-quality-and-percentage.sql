SELECT query_name,
ROUND(SUM(rating/position)/COUNT("*"), 2) AS quality,
ROUND(AVG(rating < 3) * 100, 2) AS poor_query_percentage
FROM queries
GROUP BY query_name;
