CREATE DATABASE IF NOT EXISTS i4app_db CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE i4app_db;

CREATE TABLE IF NOT EXISTS roles (
    id TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS users (
    id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(120) UNIQUE NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    role_id TINYINT UNSIGNED NOT NULL,
    status ENUM ('active', 'blocked') DEFAULT 'active',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (role_id) REFERENCES roles(id)
);

INSERT IGNORE INTO roles (name) VALUES ('admin'), ('user');

INSERT INTO users (name, email, password_hash, role_id, status) VALUES 
('Admin vaca', 'vaca@i4app.local', '$2y$10$r8R2HkfVJdS6gM7qLwZ4TuY7zA1bC3eF5hJ8kL2nP4sV6xR9tBvW', 1, 'active');

INSERT INTO users (name, email, password_hash, role_id, status) VALUES 
('User prueba', 'prueba@i4app.local', '$2y$10$m5QpS8rV2tH7jK3lN6bF9eR1cW4xZ7yA0dC3fG6hJ8kL2nP4sV6xR9' ,2, 'active');