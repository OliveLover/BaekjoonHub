SELECT   h.HOUR
       , COUNT(h.HOUR) AS COUNT
  FROM   ANIMAL_OUTS a
        , (
                SELECT 9 AS HOUR
                UNION ALL
                SELECT 10
                UNION ALL
                SELECT 11
                UNION ALL
                SELECT 12
                UNION ALL
                SELECT 13
                UNION ALL
                SELECT 14
                UNION ALL
                SELECT 15
                UNION ALL
                SELECT 16
                UNION ALL
                SELECT 17
                UNION ALL
                SELECT 18
                UNION ALl
                SELECT 19
          ) AS h
 WHERE HOUR(a.DATETIME) = h.HOUR
 GROUP BY h.HOUR
 ORDER BY h.HOUR;