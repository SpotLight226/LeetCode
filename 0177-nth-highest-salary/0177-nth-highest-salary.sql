CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  DECLARE result INT;
  DECLARE offsetValue INT;

  -- N-1을 계산하여 OFFSET에 사용할 값으로 저장
  SET offsetValue = N - 1;

  -- N번째 높은 급여를 구하는 쿼리
  SELECT salary INTO result
  FROM (
      SELECT DISTINCT salary 
      FROM Employee 
      ORDER BY salary DESC 
      LIMIT 1 OFFSET offsetValue
  ) AS temp;

  -- 결과가 없으면 NULL을 반환
  RETURN result;

END 