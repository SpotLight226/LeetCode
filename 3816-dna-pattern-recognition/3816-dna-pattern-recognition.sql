# Write your MySQL query statement below
SELECT sample_id,
       dna_sequence,
       species,
       CASE WHEN dna_sequence LIKE 'ATG%' THEN 1
            ELSE 0 END AS has_start,
       CASE WHEN dna_sequence LIKE '%TAA'
              OR dna_sequence LIKE '%TAG'
              OR dna_sequence LIKE '%TGA' THEN 1
            ELSE 0 END AS has_stop,
       CASE WHEN dna_sequence LIKE '%ATAT%' THEN 1
            ELSE 0 END AS has_atat,
       CASE WHEN dna_sequence LIKE '%GGG%' THEN 1
            ELSE 0 END has_ggg
FROM samples
ORDER BY sample_id 
-- 문제에 제시된 각 조건에 따라 CASE WHEN 문으로 조건을 작성