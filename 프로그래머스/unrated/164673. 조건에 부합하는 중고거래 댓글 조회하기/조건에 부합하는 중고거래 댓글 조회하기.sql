SELECT 
       ugb.TITLE,
       ugb.BOARD_ID,
       ugr.REPLY_ID,
       ugr.WRITER_ID,
       ugr.CONTENTS,
       DATE_FORMAT(ugr.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
       
FROM USED_GOODS_BOARD ugb       

INNER JOIN USED_GOODS_REPLY ugr ON ugb.BOARD_ID = ugr.BOARD_ID
WHERE DATE_FORMAT(ugb.CREATED_DATE, '%Y-%m') = '2022-10'
ORDER BY ugr.CREATED_DATE, ugb.TITLE

# SELECT 
#        ugb.TITLE,
#        ugb.BOARD_ID,
#        ugr.REPLY_ID,
#        ugr.WRITER_ID,
#        ugr.CONTENTS,
#        DATE_FORMAT(ugr.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
       
# FROM USED_GOODS_BOARD ugb

# INNER JOIN USED_GOODS_REPLY ugr ON ugb.BOARD_ID = ugr.BOARD_ID
# WHERE DATE_FORMAT(ugb.CREATED_DATE, '%Y-%m') = '2022-10'
# ORDER BY ugr.CREATED_DATE, ugb.TITLE