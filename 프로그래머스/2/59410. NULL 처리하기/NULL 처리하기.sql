SELECT   a.ANIMAL_TYPE
       , IFNULL(a.NAME, 'No name') AS NAME
       , a.SEX_UPON_INTAKE
  FROM ANIMAL_INS a
 ORDER BY a.ANIMAL_ID;