# Write your MySQL query statement below


# UPDATE Salary 
# SET sex = IF(sex = 'm', 'f' , 'm')


UPDATE Salary 
SET sex =
case
    when sex = 'm' then 'f'
    when sex = 'f' then 'm'
end;