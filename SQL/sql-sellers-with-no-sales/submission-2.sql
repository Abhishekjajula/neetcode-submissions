select s.seller_name
from seller s left join orders o on o.seller_id = s.seller_id 
And extract(year from o.sale_date) = '2020'
where o.seller_id is null
order by s.seller_name 