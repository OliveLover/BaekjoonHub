SELECT   ((p.PRICE DIV 10000)*10000) AS PRICE_GROUP 
      , COUNT((p.PRICE DIV 10000)*10000) AS PRODUCTS
 FROM PRODUCT p
GROUP BY (p.PRICE DIV 10000)*10000
ORDER BY PRICE_GROUP;

       
