CREATE SCHEMA IF NOT EXISTS integracaoapi;

CREATE TABLE IF NOT EXISTS integracaoapi.autenticacao(
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password TEXT NOT NULL
);