SELECT   c.CAR_TYPE
       , COUNT(*) AS CARS
  FROM CAR_RENTAL_COMPANY_CAR c
 WHERE c.OPTIONS LIKE '%통풍시트%'
       OR c.OPTIONS LIKE '%열선시트%'
       OR c.OPTIONS LIKE '%가죽시트%'
 GROUP BY c.car_type
 ORDER BY 1;