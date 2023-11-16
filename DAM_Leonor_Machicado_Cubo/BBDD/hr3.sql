/*1*/
SELECT e.first_name, j.job_title, j.min_salary 
    FROM employees e, jobs j 
    WHERE e.job_id = j.job_id 
    AND j.min_salary > 6000; 
    
/*2*/
SELECT e.first_name, e.commission_pct, d.department_name 
    FROM employees e, departments d 
    WHERE e.department_id = d.department_id 
    AND commission_pct IS NOT NULL; 
    
/*3*/
SELECT e.first_name, l.city 
    FROM employees e, departments d, locations l 
    WHERE e.department_id = d.department_id 
    AND d.location_id = l.location_id 
    AND e.first_name LIKE 'D%'; 
    
/*4*/
SELECT c.country_name, d.department_name 
    FROM countries c, departments d, locations l 
    WHERE d.location_id = l.location_id 
    AND l.country_id = c.country_id 
    AND d.department_id = 100; 
    
/*5*/
SELECT e.first_name, e.phone_number, c.country_name
    FROM employees e, departments d, locations l, countries c
    WHERE e.department_id = d.department_id
    AND d.location_id = l.location_id
    AND l.country_id = c.country_id
    AND e.phone_number LIKE '6%'
    AND c.country_name = 'United States of America'
/*6*/
SELECT l.postal_code, j.job_title
    FROM locations l, departments d, job_history h, jobs j
    WHERE l.location_id = d.location_id
    AND d.department_id = h.department_id
    AND h.job_id = j.job_id
    AND l.postal_code = 'OX9 9ZB';
/*7*/
SELECT l.postal_code, e.first_name
    FROM locations l, departments d, employees e
    WHERE l.location_id = d.location_id
    AND d.department_id = e.department_id
    AND l.postal_code = '98199';
    
/*8a*/
SELECT c.country_name, e.first_name
    FROM countries c, locations l, departments d, employees e
    WHERE c.country_id = l.country_id
    AND l.location_id = d.location_id
    AND d.department_id = e.department_id
    AND (c.country_name = 'E%'
    OR c.country_name = '%e%'
    OR c.country_name = '%e');
    
/*8b*/
SELECT c.country_name, e.first_name
    FROM countries c, locations l, departments d, employees e
    WHERE c.country_id = l.country_id
    AND l.location_id = d.location_id
    AND d.department_id = e.department_id
    AND (e.first_name = 'E%'
    OR e.first_name = '%e%'
    OR e.first_name = '%e');

/*9*/
SELECT r.region_name, j.job_title
    FROM regions r, countries c, locations l, departments d, job_history h, jobs j
    WHERE r.region_id = c.region_id
    AND c.country_id = l.country_id
    AND l.location_id = d.location_id
    AND d.department_id = h.department_id
    AND h.job_id = j.job_id
    AND r.region_name LIKE 'Americas';
    
/*10*/
SELECT r.region_name, e.first_name, e.salary, e.commission_pct
    FROM regions r, countries c, locations l, departments d, employees e
    WHERE r.region_id = c.region_id
    AND c.country_id = l.country_id
    AND l.location_id = d.location_id
    AND d.department_id = e.department_id
    AND salary > 4500
    AND r.region_name LIKE 'Europe'
    AND e.commission_pct IS NULL;