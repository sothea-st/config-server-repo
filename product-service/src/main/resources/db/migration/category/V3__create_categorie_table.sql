CREATE TABLE categories (
    id SERIAL PRIMARY KEY,
    category_name VARCHAR(100) NOT NULL,
    status BOOLEAN DEFAULT true
);
