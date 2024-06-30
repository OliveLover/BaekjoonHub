SELECT   d.ID
       , d.EMAIL
       , d.FIRST_NAME
       , d.LAST_NAME
  FROM DEVELOPERS d
 WHERE EXISTS (
                    SELECT 1
                      FROM SKILLCODES s
                     WHERE (s.CODE & d.SKILL_CODE) != 0
                       AND (s.NAME = 'Python' OR s.NAME = 'C#')
              )
 ORDER BY d.ID;