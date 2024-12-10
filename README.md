<div align="center"> <br> 
  <img align="center" alt="guru-java" height="200" width="300" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/spring/spring-original.svg" />
</div> <br>  <br> 


<div align="center"> 
  Esta API foi projetada com o objetivo de facilitar a integração, permitindo que os clientes acessem e interajam com os dados armazenados no Banco de Dados de maneira eficiente, por meio dos endpoints   
  disponíveis.
</div>


 <br> 


## 🚀 Ferramentas Utilizadas

* Intellij

* Java 17

* Postgres 16

* Spring Boot 3.3.5

  <br> 


## 📑 Swagger UI

<br>

```bash
# URL para acessar a documentação da API 
$ http://localhost:8080/swagger-ui/index.html#/
```

<br>


## 🐘 Banco de Dados

Para que a API consiga se conectar ao Banco de Dados, é necessário que o arquivo `vr.properties` esteja localizado no diretório home do seu computador, dentro da pasta `vr`, funcionando tanto em sistemas Linux quanto Windows.

 <br>

🌐 Windows
```bash
# Caminho para Windows
$ C:\Users\<nome-do-usuario>\vr\vr.properties
```

🐧 Linux
```bash
# Caminho para Linux
$ /home/<nome-do-usuario>/vr/vr.properties
```

 <br>

**Baixe o arquivo `vr.properties` e coloque-o no diretório apropriado.**

🔹 [vr.properties](src/main/resources/examples/vr.properties)


<br>


## 🔐 Autenticação

 <br>

  🔹 POST
```bash
# Gera um Token JWT 
$ http://localhost:8080/auth
```

```bash
# Exemplo de requisição
{
    "username": "VRSoftware",
    "password": "integracao_@VRSoftware"
}
```

 <br>


## 🔶 Principais Métodos Disponíveis

 <br> 

🔹 GET
```bash
# Retorna todos os registros.
$ http://localhost:8080/fornecedor/v1
```

🔹 GET
```bash
# Retorna o registro pelo ID.
$ http://localhost:8080/fornecedor/v1/{💲id}
```

🔹 POST
```bash
# Salva um registro.
$ http://localhost:8080/fornecedor/v1
```

🔹 PATCH
```bash
# Atualiza um registro.
$ http://localhost:8080/fornecedor/v1/{💲id}
```

🔹 DELETE
```bash
# Deleta um registro.
$ http://localhost:8080/fornecedor/v1/{💲id}
```

<br> 

## 🖥️ Desenvolvido por:

### 📝 Linkedin: [Gustavo Correa](https://www.linkedin.com/in/gustavo-chauar-correa-946168269/)
