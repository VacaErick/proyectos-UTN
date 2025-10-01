CREATE DATABASE IF NOT EXISTS i4app_db CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE i4app_db;

CREATE TABLE IF NOT EXISTS roles (
    id TYNYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
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
('Admin vaca', 'vaca@i4app.local', 'admin', 1, 'active'),

INSERT INTO users (name, email, password_hash, role_id, status) VALUES 
('User prueba', 'prueba@i4app.local', 'prueba' ,2, 'active');