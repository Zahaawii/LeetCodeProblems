-- Write your MySQL query statement below
-- 182. Duplicate Emails --
SELECT email as Email FROM person
GROUP BY email
HAVING COUNT(email) > 1

--