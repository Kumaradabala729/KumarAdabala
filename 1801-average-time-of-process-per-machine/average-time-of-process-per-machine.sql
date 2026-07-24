# Write your MySQL query statement below
SELECT A.machine_id, ROUND(AVG(B.timestamp-a.timestamp),3) as processing_time

from ACTIVITY AS A JOIN ACTIVITY AS B ON
A.MACHINE_ID = B.MACHINE_ID AND A.PROCESS_ID = B.PROCESS_ID AND A.ACTIVITY_TYPE = "START" AND B.ACTIVITY_TYPE = "END"
GROUP BY MACHINE_ID;