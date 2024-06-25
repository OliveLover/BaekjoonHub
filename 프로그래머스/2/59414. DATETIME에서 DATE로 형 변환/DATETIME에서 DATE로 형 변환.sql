SELECT   a.ANIMAL_ID
       , a.NAME
       , DATE_FORMAT(a.DATETIME, '%Y-%m-%d') AS '날짜'
  FROM ANIMAL_INS a
 ORDER BY 1;