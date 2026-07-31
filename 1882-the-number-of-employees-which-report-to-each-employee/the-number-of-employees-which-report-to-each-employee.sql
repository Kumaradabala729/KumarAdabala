# Write your MySQL query statement below
select emp.employee_id,emp.name,count(em.reports_to) as reports_count,round(avg(em.age),0) as average_age from employees as em join employees as emp on em.reports_to = emp.employee_id
group by employee_id
order by employee_id