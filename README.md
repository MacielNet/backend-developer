# Teste prático (prazo 3 dias)

Para este teste de desenvolvimento da API foram utilizadas todas as tecnologias abaixo previamente solicitadas no escopo do projeto.
* Spring Boot - STS 4.9.0
* Java 8
* Hibernate / JPA
* Banco de dados em memória
* Postman Collection (para testes da api)

As etapas do desenvolvimento foram detalhadamente comitadas no branch **main** do repositório, que também contém um arquivo collection do Postman para testes dos endpoits.
Para a documentação foi utilizada a linguagem de descrição de interface **Swagger**, e para detalhar a configuração e implementação dessa ferramenta um novo branch **swagger** foi criado no repositório. Alem de documentar os métodos desenvolvidos a ferramenta permite também testar todos os endpoints da API.
Ao executar a aplicação no STS a documentação pode ser acessada pela URL abaixo:
* http://localhost:8080/swagger-ui.html
![tela inicial](http://www.meuti.com.br/api_img/tela_swagger_api.jpg "tela inicial")

------------

# Questionário

* **Você já trabalhou com Spring Boot?**
*Nunca tinha trabalhado com Spring Boot, mas encontrei facilidade de assimilar pela minha esperiência com outros frameworks.*

* **O que você conhece sobre micro-serviços?**
*micro-serviços são um modelo de organização e desenvolvimento de software onde as grandes soluções são 'quebradas'  em vários pequenos serviços independentes que executam um único processo e são interligados por APIs bem definidas.*

* **Cite algumas vantagens e desvantagens de usar esse modelo arquitetural**
*Os maiores ganhos com este modelo de desenvolvimento é a facilidade de implantação, manutenção e escalabilidade de cada serviço. 
Por outro lado, esse tipo de arquitetura possui alta complexidade uma vez que os sistemas são descentralizados. A governança é outro ponto que pode deixar a desejar quando se tem vários componentes distintos formando uma grande solução. Outro ponto que pode se tornar um problema é a segurança desses micro-serviços principalmente se não estiverem bem documentados e garantidos por meio de APIs seguras.*

* **Qual a sua experiência na construção de APIs?**
*Como desenvolvedor mobile as APIs são uma necessidade em quase 90% os projetos. A bastante tempo já estou lidando com criação, integração e manutenção de APIs.*

* **Alguma vez já teve que construir uma API pública?**
*Não, todas as APIs que construí são de uso privado.*

* **Como você controla o acesso à API?**
*Com a geração de chaves (credenciais) e logs de acesso para monitorar e controlar a forma de como a API está sendo utilizada.*

* **Como você trata questões da evolução das APIs?**
*Fazendo uso de ferramentas de relatório de erros, de análise e gerenciamento de APIs, que coletam e fornecem dados cruciais para entender e melhorar a experiência dos DEVs (DX) com o uso das soluções implementadas.*

* **Você acha válido fazer testes automatizados?**
*Com certeza, principalmente quando os sistemas são complexos. Os testes automatizados reduzem drasticamente o tempo na detecção de bugs e brechas de segurança.*

* **Imagine que você precisa construir uma API que vai ter um grande número de acessos. Como você garante que ela terá um tempo de resposta acessível durante um pico de acesso?**
*Algumas boas práticas podem ser usadas para diminuir o volume de dados trafegados entre o servidor e as aplicações-cliente, dentre elas: a remoção de valores nulos (nulls) nos retornos e a compressão das respostas com uso do padrão GZIP.*

* **Você conhece ou já trabalhou com containers?**
*Desde sempre trabalhei com VMs. Embora a vistualização esteja a bastante tempo cedendo lugar para os containers (Warden, Docker, etc) acredito que em algumas situações essas tecnologias possam co-existir.*

* **E orquestradores tipo Kubernetes ou Docker Swarm?**
*Já li bastante a respeito, numa ocasião até começei a estudar Go, mas nunca precisei aplicar na prática este aprendizado.*

* **Fale um pouco sobre o processo de versionamento de aplicações. Conhece Git?**
*Levo muito a sério o versionamento de aplicações sendo o Git a minha ferramenta preferida.*

* **Como você usa branches, tags, etc. Tem algo no Github ou Gitlab?**
*Geralmente crio outros branches sempre que preciso testar ou desenvolver novos recursos para uma aplicação sem comprometer o desenvolvimento do branch principal.* 

* **Você conhece CI/CD? Já chegou a fazer algum pipeline de CI/CD completo?**
*Conheço mas ainda não apliquei.*

* **Você já trabalhou com SCRUM ou Kanban?**
*Conheço SCRUM e Metodologia de desenvolvimento Ágil mas não posso dizer que sigo a risca.*

* **Conte um pouco sobre como foi fazer parte de um time ágil, quais dificuldades tiveram e como conseguiram superar.**
*Como atualmente desenvolvo sozinho não tenho experiência como parte de um time ágil.*