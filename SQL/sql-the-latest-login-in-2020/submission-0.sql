-- Write your query below
SELECT user_id, Max(time_stamp) AS last_stamp FROM logins where time_stamp like '2020%' GROUP BY user_id;