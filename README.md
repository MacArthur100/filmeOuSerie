Exercício da matéria de Estrutura de Dados 2º semestre Curso Sistemas para Internet - FATEC

Explicação do código Linh a Linha:

Aqui está uma explicação linha a linha do código:
1. import java.util.Scanner;
•	Explicação: Importa a classe Scanner do pacote java.util para que possamos usar esse objeto para capturar dados de entrada do usuário (como texto ou números) via console.
________________________________________
2. public class FilmeOuSerie {
•	Explicação: Inicia a definição da classe pública chamada FilmeOuSerie. Em Java, todo programa precisa estar dentro de uma classe, e o nome da classe deve corresponder ao nome do arquivo (sem a extensão .java).
________________________________________
3. public static void main(String[] args) {
•	Explicação: Define o método main, que é o ponto de entrada do programa. Toda aplicação Java começa a execução por esse método. A palavra-chave static significa que o método pode ser chamado sem criar uma instância da classe, e void indica que o método não retorna nenhum valor.
________________________________________
4. Scanner scanner = new Scanner(System.in);
•	Explicação: Cria um objeto da classe Scanner chamado scanner que vai ler dados a partir da entrada padrão (System.in), ou seja, o teclado. Esse objeto será usado para capturar as entradas do usuário.
________________________________________
5. System.out.println("Escolha uma opção:");
•	Explicação: Exibe a mensagem "Escolha uma opção:" no console para informar o usuário sobre o que fazer a seguir.
________________________________________
6. System.out.println("1 - Filme");
•	Explicação: Exibe a opção "1 - Filme" para que o usuário saiba que, se escolher "1", estará escolhendo a opção "Filme".
________________________________________
7. System.out.println("2 - Série");      
•	Explicação: Exibe a opção "2 - Série" para que o usuário saiba que, se escolher "2", estará escolhendo a opção "Série".
________________________________________
8. int escolha = scanner.nextInt();
•	Explicação: Lê a entrada do usuário e armazena em uma variável do tipo int chamada escolha. O método nextInt() lê um número inteiro digitado pelo usuário.
________________________________________
9. scanner.nextLine(); // Limpar o buffer do scanner
•	Explicação: O método nextInt() lê apenas o número inteiro e deixa um caractere de nova linha (Enter) no buffer de entrada. nextLine() é usado aqui para "limpar" o buffer, permitindo que o próximo uso do scanner.nextLine() funcione corretamente para capturar texto sem erros.
________________________________________
10. switch (escolha) {
•	Explicação: Inicia uma estrutura de controle switch baseada na variável escolha. O valor de escolha será comparado com as opções (1 e 2) para determinar qual código executar a seguir.
________________________________________
11. case 1: // Caso o usuário escolha Filme
•	Explicação: Se a variável escolha for igual a 1, o código dentro do case 1 será executado. Isso representa a escolha do usuário por "Filme".
________________________________________
12. String[] filmeFavorito = new String[4];
•	Explicação: Cria um vetor (array) chamado filmeFavorito que pode armazenar 4 valores do tipo String. Esse vetor será usado para armazenar os 4 filmes favoritos do usuário.
________________________________________
13. System.out.println("Digite os 4 filmes favoritos:");
•	Explicação: Exibe uma mensagem pedindo ao usuário que digite os 4 filmes favoritos.
________________________________________
14. for (int i = 0; i < 4; i++) {
•	Explicação: Inicia um laço de repetição for que vai se repetir 4 vezes (de i = 0 até i < 4). Esse laço será usado para capturar os 4 filmes favoritos.
________________________________________
15. System.out.println("Digite o " + (i + 1) + "º filme:");
•	Explicação: Exibe uma mensagem pedindo ao usuário para digitar o filme favorito de número i + 1 (o + 1 é para exibir a contagem correta, começando de 1, não 0).
________________________________________
16. filmeFavorito[i] = scanner.nextLine();
•	Explicação: Lê a entrada do usuário (um título de filme) e armazena no vetor filmeFavorito na posição i. O método nextLine() lê uma linha inteira de texto.
________________________________________
17. }
•	Explicação: Fecha o bloco do laço for, ou seja, ele terminou de capturar os 4 filmes.
________________________________________
18. System.out.println("Você escolheu Filme. Seus filmes favoritos são:");
•	Explicação: Exibe uma mensagem confirmando que o usuário escolheu "Filme" e que a lista de filmes favoritos será exibida.
________________________________________
19. for (String filme : filmeFavorito) {
•	Explicação: Inicia um laço for-each para iterar sobre cada elemento do vetor filmeFavorito. A variável filme irá representar cada um dos filmes armazenados.
________________________________________
20. System.out.println(filme);
•	Explicação: Exibe o nome de cada filme armazenado no vetor filmeFavorito na tela.
________________________________________
21. }
•	Explicação: Fecha o bloco do laço for-each.
________________________________________
22. break;
•	Explicação: Interrompe a execução do switch. Quando o usuário escolhe "Filme" e todos os filmes foram exibidos, o break impede que o código continue executando o próximo case (caso de "Série").
________________________________________
23. case 2: // Caso o usuário escolha Série
•	Explicação: Se a variável escolha for igual a 2, o código dentro do case 2 será executado. Isso representa a escolha do usuário por "Série".
________________________________________
24. String[] serieFavorita = new String[5];
•	Explicação: Cria um vetor serieFavorita que pode armazenar 5 valores do tipo String. Esse vetor será usado para armazenar as 5 séries favoritas do usuário.
________________________________________
25. System.out.println("Digite as 5 séries favoritas:");
•	Explicação: Exibe uma mensagem pedindo ao usuário que digite as 5 séries favoritas.
________________________________________
26. for (int i = 0; i < 5; i++) {
•	Explicação: Inicia um laço de repetição for que vai se repetir 5 vezes (de i = 0 até i < 5). Esse laço será usado para capturar as 5 séries favoritas.
________________________________________
27. System.out.println("Digite a " + (i + 1) + "ª série:");
•	Explicação: Exibe uma mensagem pedindo ao usuário para digitar a série favorita de número i + 1.
________________________________________
28. serieFavorita[i] = scanner.nextLine();
•	Explicação: Lê a entrada do usuário (um título de série) e armazena no vetor serieFavorita na posição i.
________________________________________
29. }
•	Explicação: Fecha o bloco do laço for.
________________________________________
30. System.out.println("Você escolheu Série. Suas séries favoritas são:");
•	Explicação: Exibe uma mensagem confirmando que o usuário escolheu "Série" e que a lista de séries favoritas será exibida.
________________________________________
31. for (String serie : serieFavorita) {
•	Explicação: Inicia um laço for-each para iterar sobre cada elemento do vetor serieFavorita. A variável serie irá representar cada uma das séries armazenadas.
________________________________________
32. System.out.println(serie);
•	Explicação: Exibe o nome de cada série armazenada no vetor serieFavorita na tela.
________________________________________
33. }
•	Explicação: Fecha o bloco do laço for-each.
________________________________________
34. break;
•	Explicação: Interrompe a execução do switch após o usuário escolher "Série" e exibir as séries favoritas.
________________________________________
35. default:
•	Explicação: Inicia o bloco default, que será executado se a escolha do usuário não for 1 nem 2.
________________________________________
36. System.out.println("Opção inválida.");
•	Explicação: Exibe uma mensagem informando que a opção fornecida pelo usuário é inválida, caso o valor de escolha não seja 1 nem 2.
________________________________________
37. break;
•	Explicação: Finaliza o bloco default.
________________________________________
38. }
•	Explicação: Fecha o bloco do switch.
________________________________________
39. scanner.close();
•	Explicação: Fecha o objeto scanner para liberar o recurso de leitura do console. É uma boa prática fechar o Scanner quando ele não for mais necessário.
________________________________________
Este é o código completo e a explicação linha por linha do que ele faz. O programa basicamente permite que o usuário escolha entre "Filme" ou "Série", insira suas preferências, e depois exibe essas preferências de acordo com a escolha feita.
