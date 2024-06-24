SELECT   a.ANIMAL_ID
       , a.NAME
       , a.SEX_UPON_INTAKE
  FROM ANIMAL_INS a
 WHERE a.NAME IN ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')
 ORDER BY a.ANIMAL_ID;