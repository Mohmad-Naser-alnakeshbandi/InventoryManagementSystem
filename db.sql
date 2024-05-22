CREATE TABLE cars (
                      id INT AUTO_INCREMENT PRIMARY KEY,
                      color VARCHAR(50),
                      marke VARCHAR(100),
                      milliage INT,
                      model VARCHAR(100),
                      priccee DECIMAL(10, 2),
                      year INT
);


INSERT INTO cars (color, marke, milliage, model, priccee, year)
VALUES
    ('Black', 'BMW', '15000', 'X5', '50000', '2021'),
    ('White', 'Mercedes-Benz', '20000', 'C-Class', '45000', '2020'),
    ('Silver', 'Audi', '25000', 'A4', '40000', '2019'),
    ('Blue', 'Volkswagen', '30000', 'Golf', '35000', '2018'),
    ('Red', 'BMW', '10000', '3 Series', '55000', '2022'),
    ('Green', 'Mercedes-Benz', '5000', 'E-Class', '60000', '2021'),
    ('Grey', 'Audi', '15000', 'Q7', '70000', '2020'),
    ('Black', 'Volkswagen', '35000', 'Passat', '30000', '2019'),
    ('Blue', 'BMW', '20000', '5 Series', '65000', '2020'),
    ('White', 'Mercedes-Benz', '12000', 'GLA', '48000', '2021'),
    ('Silver', 'Audi', '22000', 'A6', '53000', '2019'),
    ('Grey', 'Volkswagen', '18000', 'Tiguan', '37000', '2020');
