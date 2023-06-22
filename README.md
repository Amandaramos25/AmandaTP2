Atividade da matéria de Programação III

Gerador de extratos

1 Descrição
Este problema consiste na leitura de um arquivo de entrada contendo uma
série de transações bancárias que ocorreram em diversas contas, e depois na
emissão dos extratos (histórico de operações) de cada conta. Cada linha do
arquivo de entrada é uma transação, que pode ser um saque, um depósito, uma
transferência ou um pagamento. Cada transação identica a conta envolvida.
A ordem das transações reete a ordem temporal dos acontecimentos.
Uma transação possui as seguintes informações, em ordem:
1. o número da conta
2. o tipo de operação, sendo 1-saque, 2-depósito, e 4-pagamento.
3. o valor da operação.
O formato do arquivo de entrada é CSV (Comma-Separated Values), ou seja,
cada informação é separada por uma vírgula.

A saída será uma série de extratos, em que cada um exibirá as seguintes infor-
mações:

 O número da conta
 uma tabela com as colunas: Tipo da transação, valor e saldo parcial.
 Um rodapé contendo o saldo nal da conta.
1.1 Exemplo de entrada e saída
Segue um exemplo de um arquivo de entrada:
123,2,1000
456,1,100
789,2,2000
456,2,1500
123,1,200
789,1,300
456,4,200
123,2,500
456,1,50

1

E segue a saída gerada a partir dessa entrada:
Número da Conta: 123
----------------------------------------
Detalhes das Transações:
----------------------------------------
Tipo | Valor | Saldo
----------------------------------------
Depósito | 1000 | 1000
Saque | 200 | 800
Depósito | 500 | 1300
----------------------------------------
Saldo Atual: 1300
Número da Conta: 456
----------------------------------------
Detalhes das Transações:
----------------------------------------
Tipo | Valor | Saldo
----------------------------------------
Saque | 100 | -100
Depósito | 1500 | 1400
Pagamento | 200 | 1200
Depósito | 50 | 1150
----------------------------------------
Saldo Atual: 1150

Número da Conta: 789
----------------------------------------
Detalhes das Transações:
----------------------------------------
Tipo | Valor | Saldo
----------------------------------------
Depósito | 2000 | 2000
Saque | 300 | 1700
----------------------------------------
Saldo Atual: 1700

Perceba que dois extratos são sempre separados por uma linha em branco.
2 Detalhes de implementação

Utilize estruturas de dados apropriadas para armazenar e manipular as infor-
mações da conta bem como o histórico de transações. Você deve utilizar as

estruturas de dados vistas até agora em aula (pilhas, las e listas encadeadas).
Você não deve utilizar estruturas de dados prontas da biblioteca Java (como
ArrayList, LinkedList, Stack e Queue). Ao invés disso, você deve construir as

2

estruturas necessárias do zero. Por outro lado, você pode usar classes auxiliares,
como Iterator, Iterable e String.
Aproveite para praticar suas habilidades de programação orientada a objetos.

Reita sobre como você pode fazer uma boa separação de interesses, quais mó-
dulos devem existir e a responsabilidade de cada um deles. Preocupe-se com

uma boa documentação das APIs.
Seu programa deve receber os nomes dos arquivos de entrada e de saída como
parâmetros da linha de comando. Arquivos de teste serão providenciados para
você juntamente com seus respectivos arquivos de saída. Com eles, você pode
conferir se seu programa está produzindo a saída correta.
3 Entregáveis
Você deve entregar um código-fonte (sem os binários) e um relatório técnico.
3.1 Sobre o relatório
O relatório deve ser entregue em formato PDF e deve conter os seguintes itens:
 Título e autor.
 Introdução: uma apresentação bem resumida do problema.

 Método: descrição de como o problema foi resolvido. Detalhe as estru-
turas de dados empregadas, os tipos abstratos de dados (ou classes) e

funções (ou métodos) criados. Utilize diagramas de classes e diagramas
de comunicação ou sequência. Não precisa colocar código, a não ser que
você considere crucial para o entendimento do seu trabalho.
 Análise: faça uma análise do tempo de execução e do espaço de
memória gastos pelas principais funções do seu programa. Explique
se as instruções gastam tempo linear no pior caso, ou se gastam
tempo constante, por exemplo. Explique também como as instruções
gastam memória.

 Conclusão: deve contar uma sentença inicial sobre o que foi feito no tra-
balho. Posteriormente deve-se sumarizar o que foi aprendido.

4 Avaliação
Os itens de avaliação são descritos a seguir, na forma de declarações:
 Seu programa deve compilar. Caso contrário, o trabalho não será avaliado.
 Vou rodar seu programa usando vários casos de teste. Se passar em todos,
seu trabalho tem 50% da nota nal.
 Sua documentação deve ter o conteúdo exigido (50% da nota).
