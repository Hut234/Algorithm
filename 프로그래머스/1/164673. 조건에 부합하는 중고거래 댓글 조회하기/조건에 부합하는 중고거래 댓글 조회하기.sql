SELECT ugb.title TITLE, ugb.board_id BOARD_ID, ugr.reply_id REPLY_ID, ugr.writer_id WRITER_ID, ugr.contents CONTENTS, DATE_FORMAT(UGR.CREATED_DATE, "%Y-%m-%d") CREATED_DATE
FROM USED_GOODS_BOARD ugb
JOIN USED_GOODS_REPLY ugr
ON ugb.board_id = ugr.board_id
WHERE YEAR(ugb.created_date) = 2022 AND MONTH(ugb.created_date) = 10
ORDER BY ugr.created_date, ugb.title
