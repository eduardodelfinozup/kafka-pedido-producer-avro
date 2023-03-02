## kafka Producer avro

# Subir docker opção 1
```shell
cd ./docker/opcao1
docker-compose up
```
# Subir docker opção 2
```shell
cd ./docker/opcao2
docker-compose up
```
# Remover docker opção 1
```shell
cd ./docker/opcao1
docker-compose down
```

# Remover docker opção 2
```shell
cd ./docker/opcao2
docker-compose down
```
# kafdrop
```
http://localhost:19000/
```
# Lences.io
```
http://localhost:3030

```
# Payload Criar pedido
```
curl --location --request POST 'localhost:8080/pedidos' \
--header 'Content-Type: application/json' \
--data-raw '{
    "idCliente": 444,
    "idRestaurante": 78985,
    "items": [
        {
            "quantidade": 3,
            "sku": 125778,
            "valor": 10.25
        }
    ]
}'
```

# Cancelar Pedido
```
curl --location --request DELETE 'localhost:8080/pedidos/1'
```

