SELECT   f.PRODUCT_ID
       , f.PRODUCT_NAME
       , f.PRODUCT_CD
       , f.CATEGORY
       , f.PRICE 
  FROM FOOD_PRODUCT f
 ORDER BY f.PRICE DESC
 LIMIT 1;