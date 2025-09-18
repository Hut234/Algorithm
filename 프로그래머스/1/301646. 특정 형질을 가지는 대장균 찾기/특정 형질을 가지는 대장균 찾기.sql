SELECT count(*) COUNT
FROM ECOLI_DATA
WHERE (genotype & 2) = 0 
AND ((genotype & 1) != 0 or (genotype & 4) != 0);