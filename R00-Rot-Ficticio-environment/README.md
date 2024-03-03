# ROTEIRO FICTÍCIO - IMPORTAÇÃO DO JUNIT E CRIAÇÃO DE TESTES

## 1. Por que é importante fazer testes em LEDA?
- Muitos alunos acabam não aprendendo a criar testes para seus códigos em LP2. Esta falha na base acaba acarretando problemas em LEDA
- Em provas, muitos alunos acabam "testando" seus códigos usando o public static void main
- Caso o aluno esqueça de remover este método do seu código, o servidor não processará a prova dele corretamente
- Assim o aluno pode perder 40% de sua nota de uma prova
- É importante fixar este conhecimento também para disciplinas futuras 
## 2. Adicionar a dependência do JUnit no arquivo pom.xml

    <dependency>
		<groupId>junit</groupId>
		<artifactId>junit</artifactId>
		<version>4.13.1</version>
	</dependency>

## 3. Importar o JUnit na(s) classe(s) de testes

    import org.junit.Test;
    import org.junit.Assert;
    import org.junit.Before;

## 4. Escrever testes!

    @Test
    public void teste() {
        Assert.assertTrue(true);
    }

## 5. Como escrever bons testes?
Resposta: Testar vários cenários diferentes
Exemplo: SelectionSort
- Array vazio
- Array com apenas 1 Integer
- Array já ordenado
- Arrays de tamanhos diferentes (ímpar/par)
- Array ordenado em ordem reversa
- Array com elementos repetidos
- Array com Integers negativos
- Arrays de outros tipos de objetos (String, Char, Boolea, Double, Pessoa, ContaCorrente, etc)

### Seja criativo! Quanto mais diversidade em seus testes, maior a chance de encontrar um erro inesperado e assim poder corrigí-lo