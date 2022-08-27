![icon](https://user-images.githubusercontent.com/101484294/186415674-f005dc9c-fdf1-4139-a106-fe6e82f7561e.jpg)

# Seven Days of Code Java - Alura

## Day 1:

#### O que você vai precisar fazer:

* Criar uma conta no IMDB para ter a chave de acesso ao serviço (apiKey), mas cuidado, essa chave não deve ser commitada no Github ou em outro repositório;

* Criar o código Java que executará uma requisição HTTP do tipo GET. Você pode usar o pacote java.net.http e as classes HttpRequest, HttpClient e HttpResponse, além da classe URI;

* Executar a requisição e pegar a resposta (o JSON);

* Imprimir o corpo da resposta no console;

## Day 2:

* Extrair o JSON inteiro dos filmes, ou seja, buscar na resposta JSON tudo o que estiver dentro dos colchetes (“[” , “]”) e guardar esse JSON;

* Usar o método split() para separar cada filme;

* Agora, com esse array disponível, você pode tratar cada filme separadamente para extrair os atributos que você quiser. Basta fazer a quebra do JSON de cada filme nas vírgulas para ter acesso aos atributos

* E a partir daí, “só” vai faltar pegar o atributo na posição correta usando métodos da classe String e guardá-lo em uma lista.
