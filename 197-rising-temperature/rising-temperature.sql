select w1.id as Id 
from weather w,weather w1 
where datediff(w1.recorddate,w.recorddate) = 1
and w1.temperature>w.temperature