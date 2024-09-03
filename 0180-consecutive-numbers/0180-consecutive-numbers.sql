SELECT DISTINCT l1.num AS ConsecutiveNums -- 중복을 제거하여 L1의 NUM만을 출력
FROM Logs AS l1,
     Logs AS l2,
     Logs AS l3
WHERE l1.id = l2.id - 1 -- id 를 비교(연속적으로 나타나기 위해서는 각 id - 1이 이전 id와 같아야함)
  AND l2.id = l3.id - 1
  AND l1.num = l2.num -- num을 비교한다
  AND l2.num = l3.num