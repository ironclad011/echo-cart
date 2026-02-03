SELECT price,source,recorded_at
FROM price_history
WHERE product_id = 1
ORDER BY recorded_at DESC;