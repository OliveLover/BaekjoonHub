SELECT   u.BOARD_ID
       , u.WRITER_ID
       , u.TITLE
       , u.PRICE
       , (CASE
               WHEN u.STATUS = 'SALE'
               THEN '판매중'
               WHEN u.STATUS = 'RESERVED'
               THEN '예약중'
               ELSE '거래완료'
          END
         ) AS STATUS
  FROM USED_GOODS_BOARD u
 WHERE DATE_FORMAT(u.CREATED_DATE, '%Y-%m-%d') = '2022-10-05'
 ORDER BY u.BOARD_ID DESC;