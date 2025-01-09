CREATE TABLE IF NOT EXISTS integracaoapi.autenticacao(
    id SERIAL PRIMARY KEY,
    username VARCHAR(255) UNIQUE NOT NULL,
    password TEXT NOT NULL
);