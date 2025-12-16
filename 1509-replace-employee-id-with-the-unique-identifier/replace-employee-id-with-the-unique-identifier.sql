# Write your MySQL query statement below
select em.unique_id,e.name
from employees E
left join employeeuni em on em.id=e.id