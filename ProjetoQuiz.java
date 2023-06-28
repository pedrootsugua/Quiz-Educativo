import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProjetoQuiz {

  //variaveis usadas para armazenar a pontuação total de cada teste
	static int pontuacaoFinalMatematica = 0;
	static int pontuacaoFinalPortugues = 0;
	static int pontuacaoFinalCiencias = 0;
	static int pontuacaoFinalHistoria = 0;
	static int pontuacaoFinalEdFisica = 0;

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("****JAVA EDUCATIONAL QUIZ****");

		boolean sair = false;
		do {
			System.out.println("\n--------------------------------------------------------------------------------------------\n");
			System.out.println("\n|============================|");
			System.out.println("|       MENU DE OPÇÕES       |");
			System.out.println("|============================|");
			System.out.println("|    1- Instruções           |");
			System.out.println("|    2- Jogar                |");
			System.out.println("|    3- Creditos             |");
			System.out.println("|    4- Dicas e conteúdos    |");
			System.out.println("|       para estudo          |");
			System.out.println("|    5- Ultimas pontuações   |");
			System.out.println("|    6- Sair                 |");
			System.out.println("|============================|");
			System.out.print("Sua opção: ");

			int opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				instrucoes();
				break;
			case 2:
				jogar();
				break;
			case 3:
				creditos();
				break;
			case 4:
				conteudos();
				break;
			case 5:
				ultimasPontuacoes();
				break;
			case 6:
				sair = true;
				System.out.println("\n---------------------------------------------------------------------\n");
				System.out.println("****Você saiu do jogo!****");
				System.out.println("\n---------------------------------------------------------------------\n");
				System.out.println("Para voltar ao jogo reinicie o programa.");
				break;
			default:
				System.out.println("\n---------------------------------------------------------------------\n");
				System.out.println("****Opção invalida!****");
				System.out.println("\nDigite uma opção valida citada no menu.\n");
				System.out.println("\n---------------------------------------------------------------------\n");
			}
		} while (sair == false);
	}
  
  //intruções de como jogar e regras do jogo
	static void instrucoes() {
		System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("****INSTRUÇÕES****");
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\nPara começar escolha uma das opções citadas no menu principal.");
		System.out.println("\n****COMO JOGAR?****\n");
    System.out.println("1° Para jogar basta você escolher a opção (2- Jogar) no menu de opções.");
    System.out.println("2° Logo em seguida aparecerá o menu com os temas, assim basta você escolher qual tema você deseja testar os seus conhecimentos e seleciona-lo.");
    
    System.out.println("\nCada teste é composto por 10 questões, a pontução máxima em cada teste será de 100 pontos. Abaixo você encontrará as regras para a contabilização das pontuações em cada teste.");
      
    System.out.println("\n****REGRAS DE PONTUAÇÃO****\n");
    System.out.println("Você terá duas chances para acertar cada questão, sendo que:\n");
    System.out.println("* Se você acertar na primeira tentativa soma +10 pontos na sua pontuação final.");
    System.out.println("* Se você acertar na segunda tentativa soma +5 pontos na sua pontuação final.");
    System.out.println("\nVocê pode verificar quais foram as suas últimas pontuações nos testes, selecionando a opção (5- Ultimas pontuações) no menu principal.");
		System.out.println("\n--------------------------------------------------------------------------------------------\n");
		tecleParaVoltar();
	}
  
  // Função que executa cada um dos testes.
	static void jogar() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n\n****Bem vindo(a) ao JAVA EDUCATIONAL QUIZ****");

		boolean sair = false;
		do {
			System.out.println("\nEm qual tema deseja testar seus conhecimentos ?\n");
			System.out.println("|==================================|");
			System.out.println("|              TEMAS               |");
			System.out.println("|==================================|");
			System.out.println("|    1- Matemática                 |");
			System.out.println("|    2- Português                  |");
			System.out.println("|    3- Ciências                   |");
			System.out.println("|    4- História                   |");
			System.out.println("|    5- Educação Fisica            |");
			System.out.println("|    6- Voltar ao menu principal   |");
			System.out.println("|==================================|");
			System.out.print("Sua opção: ");

			int opcao = entrada.nextInt();

      //nos cases abaixo as funções de jogar usam como parametro a função que embaralha o numero de perguntas, usando para alterar a ordem das perguntas em cada rodada que o teste for executado. Após as pontuações são armazenadas nas variaveis globais.
			switch (opcao) {
			case 1:
				pontuacaoFinalMatematica = JogarMatematica(embaralharPerguntas());
				break;
      case 2: 
        pontuacaoFinalPortugues = JogarPortugues(embaralharPerguntas());
				break;
      case 3:
        pontuacaoFinalCiencias = JogarCiencias(embaralharPerguntas());
        break;
      case 4:
        pontuacaoFinalHistoria = JogarHistoria(embaralharPerguntas());
       break;
      case 5:
        pontuacaoFinalEdFisica = JogarEdfisica(embaralharPerguntas());
       break;
			case 6:
				sair = true;
				break;
      default:
				System.out.println("\n---------------------------------------------------------------------\n");
				System.out.println("****Opção invalida!****");
				System.out.println("\nDigite uma opção valida citada no menu.\n");
				System.out.println("\n---------------------------------------------------------------------\n");
			}
		} while (sair == false);
	}
  
	/**** MATEMATICA ****/
	static int JogarMatematica(int[] pergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
    System.out.println("*****QUIZ DE MATEMÁTICA*****");
    int pontuacaoTotal = 0;
		for (int i = 0; i < pergunta.length; i++) {
			switch (pergunta[i]) {
			case 1:
				int pontosPergunta1 = pergunta1_Mt(i+1);
        pontuacaoTotal += pontosPergunta1;
				break;
			case 2:
        int pontosPergunta2 = pergunta2_Mt(i+1);
        pontuacaoTotal += pontosPergunta2;
				break;
			case 3:
        int pontosPergunta3 = pergunta3_Mt(i+1);
        pontuacaoTotal += pontosPergunta3;
				break;
			case 4:
        int pontosPergunta4 = pergunta4_Mt(i+1);
        pontuacaoTotal += pontosPergunta4;
				break;
			case 5:
        int pontosPergunta5 = pergunta5_Mt(i+1);
        pontuacaoTotal += pontosPergunta5;
				break;
			case 6:
        int pontosPergunta6 = pergunta6_Mt(i+1);
        pontuacaoTotal += pontosPergunta6;
				break;
			case 7:
        int pontosPergunta7 = pergunta7_Mt(i+1);
        pontuacaoTotal += pontosPergunta7;
				break;
			case 8:
        int pontosPergunta8 = pergunta8_Mt(i+1);
        pontuacaoTotal += pontosPergunta8;
				break;
			case 9:
        int pontosPergunta9 = pergunta9_Mt(i+1);
        pontuacaoTotal += pontosPergunta9;
				break;
			case 10:
        int pontosPergunta10 = pergunta10_Mt(i+1);
        pontuacaoTotal += pontosPergunta10;
				break;
			case 11:
        int pontosPergunta11 = pergunta11_Mt(i+1);
        pontuacaoTotal += pontosPergunta11;
				break;
			case 12:
        int pontosPergunta12 = pergunta12_Mt(i+1);
        pontuacaoTotal += pontosPergunta12;
				break;
			case 13:
        int pontosPergunta13 = pergunta13_Mt(i+1);
        pontuacaoTotal += pontosPergunta13;
				break;
			case 14:
        int pontosPergunta14 = pergunta14_Mt(i+1);
        pontuacaoTotal += pontosPergunta14;
				break;
			case 15:
        int pontosPergunta15 = pergunta15_Mt(i+1);
        pontuacaoTotal += pontosPergunta15;
				break;
			}
		}
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
    System.out.println("\nSua pontuação final no teste de matemática: " + pontuacaoTotal);
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
    tecleParaVoltar();
    return pontuacaoTotal;
	}

	static int pergunta1_Mt(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Ângulo agudo é aquele que...?\n");
		System.out.println("A) mede 90º");
		System.out.println("B) mede mais que 0º e menos que 90º");
		System.out.println("C) mede 180º ou mais");
		System.out.println("D) mede 240º ou mais");
		System.out.println("E) mede 1500º");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'B';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;
	}
	static int pergunta2_Mt(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Em um jogo, Alice ganhou 12 pontos e perdeu 7. Com quantos pontos ela ficou?\n");
		System.out.println("A) 19");
		System.out.println("B) -5");
		System.out.println("C) 5");
		System.out.println("D) 18");
		System.out.println("E) 12");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'C';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
	}
	static int pergunta3_Mt(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Seu João depositou R$ 239,00 em sua conta corrente que estava com o saldo devedor de R$ 540,00. Com quanto ele ficou?\n");
		System.out.println("A) Saldo devedor de R$ 301,00");
		System.out.println("B) Saldo credor de R$ 301,00");
		System.out.println("C) Saldo credor de R$ 779,00");
		System.out.println("D) Saldo devedor de R$ 709,00");
		System.out.println("E) Saldo devedor de R$ 433,00");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'A';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
	}
	static int pergunta4_Mt(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Uma comida congelada estava sendo mantida à temperatura de -20°C e sofreu uma variação de -5°C.A qual temperatura mínima essa comida chegou?\n");
		System.out.println("A) -25");
		System.out.println("B) -15");
		System.out.println("C) 25");
		System.out.println("D) 30");
		System.out.println("E) 20");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'A';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
	}
  static int pergunta5_Mt(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Em um torneio de futebol, um time tem 14 pontos ganhos e 20 pontos perdidos. Qual o placar final?\n");
		System.out.println("A) -6");
		System.out.println("B) +34");
		System.out.println("C) +6");
		System.out.println("D) 28");
		System.out.println("E) 33");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'A';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
  }
  static int pergunta6_Mt(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
    System.out.println("\n"+indicePergunta+") Resolva a expressão abaixo:\n ");
		System.out.println("(-12) + (-2) = ?\n");
		System.out.println("A) 10");
		System.out.println("B) -14");
		System.out.println("C) -10");
		System.out.println("D) 14");
		System.out.println("E) 24");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'B';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
  }
  static int pergunta7_Mt(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
    System.out.println("\n"+indicePergunta+") Resolva a expressão abaixo:\n ");
		System.out.println("(-7) . (-8) = ?\n");
		System.out.println("A) 10");
		System.out.println("B) 15");
		System.out.println("C) -56");
		System.out.println("D) +56");
		System.out.println("E) 24");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'D';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
  }
   static int pergunta8_Mt(int indicePergunta) {
     System.out.println("\n--------------------------------------------------------------------------------------------\n");
    System.out.println("\n"+indicePergunta+") Resolva a expressão abaixo:\n ");
		System.out.println("4/5 - 1/5 = ?\n");
		System.out.println("A) 3/5");
		System.out.println("B) 5");
		System.out.println("C) 5/10");
		System.out.println("D) 5/3");
		System.out.println("E) 10/5");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'A';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
   }
  static int pergunta9_Mt(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
    System.out.println("\n"+indicePergunta+") Resolva a expressão abaixo:\n ");
		System.out.println("(-7) . (-7) = ?\n");
		System.out.println("A) -14");
		System.out.println("B) -49");
		System.out.println("C) +49");
		System.out.println("D) +14");
		System.out.println("E)  59");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'C';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
  }
  static int pergunta10_Mt(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
    System.out.println("\n"+indicePergunta+") Resolva a expressão abaixo:\n ");
		System.out.println("(8) : (-8) = ?\n");
		System.out.println("A) -2");
		System.out.println("B) +1");
		System.out.println("C) 16");
		System.out.println("D) 1");
		System.out.println("E) -1");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'E';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
  }
  static int pergunta11_Mt(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
    System.out.println("\n"+indicePergunta+") Resolva a expressão abaixo:\n ");
		System.out.println("(-8) : (-8) = ?\n");
		System.out.println("A) -2");
		System.out.println("B) +1");
		System.out.println("C) 16");
		System.out.println("D) 1");
		System.out.println("E) -1");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'D';
    int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
  }
  static int pergunta12_Mt(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
    System.out.println("\n"+indicePergunta+") Resolva a expressão abaixo:\n ");
		System.out.println("10 - 1 - 4 - 3 - 2 = ?\n");
		System.out.println("A) 3");
		System.out.println("B) 0");
		System.out.println("C) 18");
		System.out.println("D) 1");
		System.out.println("E) 2");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'B';
    int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
  }
  static int pergunta13_Mt(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
    System.out.println("\n"+indicePergunta+") Resolva a expressão abaixo:\n ");
		System.out.println("2 x 2 x 3 = ?\n");
		System.out.println("A) 9");
		System.out.println("B) 7");
		System.out.println("C) 8");
		System.out.println("D) 12");
		System.out.println("E) 11");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'D';
    int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
  }
  static int pergunta14_Mt(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
    System.out.println("\n"+indicePergunta+") Resolva a expressão abaixo:\n ");
		System.out.println("9 : 3 : 3 = ?\n");
		System.out.println("A) 3");
		System.out.println("B) 15");
		System.out.println("C) 0");
		System.out.println("D) 1");
		System.out.println("E) 2");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'D';
    int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
  }
  static int pergunta15_Mt(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Se há cinco dias foi um dia antes de sábado, que dia será depois de amanhã?\n");
		System.out.println("A) Quinta");
		System.out.println("B) Quarta");
		System.out.println("C) Sexta");
		System.out.println("D) Segunda");
		System.out.println("E) Terça");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'C';
    int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
  }

  /**** PORTUGUÊS ****/
	static int JogarPortugues(int[] pergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
    System.out.println("*****QUIZ DE PORTUGUÊS*****");
    int pontuacaoTotal = 0;
		for (int i = 0; i < pergunta.length; i++) {
			switch (pergunta[i]) {
			case 1:
				int pontosPergunta1 = pergunta1_Pt(i+1);
        pontuacaoTotal += pontosPergunta1;
				break;
			case 2:
        int pontosPergunta2 = pergunta2_Pt(i+1);
        pontuacaoTotal += pontosPergunta2;
				break;
			case 3:
        int pontosPergunta3 = pergunta3_Pt(i+1);
        pontuacaoTotal += pontosPergunta3;
				break;
			case 4:
        int pontosPergunta4 = pergunta4_Pt(i+1);
        pontuacaoTotal += pontosPergunta4;
				break;
			case 5:
        int pontosPergunta5 = pergunta5_Pt(i+1);
        pontuacaoTotal += pontosPergunta5;
				break;
			case 6:
        int pontosPergunta6 = pergunta6_Pt(i+1);
        pontuacaoTotal += pontosPergunta6;
				break;
			case 7:
        int pontosPergunta7 = pergunta7_Pt(i+1);
        pontuacaoTotal += pontosPergunta7;
				break;
			case 8:
        int pontosPergunta8 = pergunta8_Pt(i+1);
        pontuacaoTotal += pontosPergunta8;
				break;
			case 9:
        int pontosPergunta9 = pergunta9_Pt(i+1);
        pontuacaoTotal += pontosPergunta9;
				break;
			case 10:
        int pontosPergunta10 = pergunta10_Pt(i+1);
        pontuacaoTotal += pontosPergunta10;
				break;
			case 11:
        int pontosPergunta11 = pergunta11_Pt(i+1);
        pontuacaoTotal += pontosPergunta11;
				break;
			case 12:
        int pontosPergunta12 = pergunta12_Pt(i+1);
        pontuacaoTotal += pontosPergunta12;
				break;
			case 13:
        int pontosPergunta13 = pergunta13_Pt(i+1);
        pontuacaoTotal += pontosPergunta13;
				break;
			case 14:
        int pontosPergunta14 = pergunta14_Pt(i+1);
        pontuacaoTotal += pontosPergunta14;
				break;
			case 15:
        int pontosPergunta15 = pergunta15_Pt(i+1);
        pontuacaoTotal += pontosPergunta15;
				break;
			}
		}
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
    System.out.println("\nSua pontuação final no teste de português: " + pontuacaoTotal);
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
    tecleParaVoltar();
    return pontuacaoTotal;
	}

  static int pergunta1_Pt(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Qual é o tipo de predicado da frase: 'O vento sopra forte' ?\n");
		System.out.println("A) Verbal.");
		System.out.println("B) Nominal.");
		System.out.println("C) Verbo-nominal.");
		System.out.println("D) Elíptico.");
    System.out.println("E) Adverbial.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'C';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;
	}
  static int pergunta2_Pt(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Qual é sujeito da frase: 'Vive-se bem aqui' ?\n");
		System.out.println("A) Sujeito simples.");
		System.out.println("B) Sujeito indeterminado.");
		System.out.println("C) Sujeito inexistente.");
		System.out.println("D) Sujeito Oculto ou elíptico.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'B';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;
	}
   static int pergunta3_Pt(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Qual é sujeito da frase: 'O vizinho está chamando para tirar uma dúvida' ?\n");
		System.out.println("A) Está chamando.");
		System.out.println("B) O vizinho.");
		System.out.println("C) Para tirar uma duvida.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'B';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;
	}
  static int pergunta4_Pt(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Qual sujeito apresenta apenas um núcleo?\n");
		System.out.println("A) Sujeito simples.");
		System.out.println("B) Sujeito composto.");
		System.out.println("C) Sujeito oculto.");
    System.out.println("D) Sujeito indeterminado.");
    System.out.println("E) Sujeito elíptico.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'A';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;
  }
  static int pergunta5_Pt(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Escolha a alternativa correta de acordo com a oração a seguir, 'Maria e João conversavam alegres'. \n");
		System.out.println("A) O predicado é nominal.");
		System.out.println("B) O sujeito da oração é composto.");
		System.out.println("C) O predicado é 'Maria e João'.");
    System.out.println("D) O sujeito é 'conversavam alegres'.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'B';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;
  }
  static int pergunta6_Pt(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") O que é um sujeito indeterminado?\n");
		System.out.println("A) Apresenta apenas um núcleo.");
		System.out.println("B) Apresenta dois ou mais núcleos do sujeito.");
    System.out.println("C) Não pode ser identificado nem pelo contexto nem pela forma verbal.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'C';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;
   }
   static int pergunta7_Pt(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") O que que é um predicado verbo nominal?\n");
		System.out.println("A) É um predicado que tem dois núcleos: Um verbo e um nome.");
		System.out.println("B) Aquele que tem apenas um nome como núcleo.");
    System.out.println("C) É aquele que tem apenas um verbo como núcleo.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'A';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;
   }
  static int pergunta8_Pt(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Em qual das orações abaixo o sujeito é oculto?\n");
		System.out.println("A) Livros e cinema são o meu passatempo favorito.");
		System.out.println("B) Gostamos de pular carnaval.");
    System.out.println("C) O empregado do supermercado vendeu a sua casa.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'B';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;
  }
  static int pergunta9_Pt(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Identifique a oração em que o predicado é verbo nominal:\n");
		System.out.println("A) Clara chegou cansada.");
		System.out.println("B) Ana Maria continua triste.");
    System.out.println("C) Marina comprou muitos vestidos ontem.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'A';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;
  }
  static int pergunta10_Pt(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") O predicado verbal está presente em:\n");
		System.out.println("A) Lúcia está adoentada.");
		System.out.println("B) Eu considerava aquela mulher minha amiga.");
    System.out.println("C) Ponha a mão na consciência.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'A';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;
  }
  static int pergunta11_Pt(int indicePergunta) {
    	System.out.println("\n--------------------------------------------------------------------------------------------\n");
      System.out.println("\n"+indicePergunta+") Escolha a única alternativa que possui uma oração subordinada adverbial condicional:\n");
      System.out.println("A) Levarei comida para que você possa alimentar-se durante a viagem.");
		  System.out.println("B) Tenho estudado menos do que deveria.");
		  System.out.println("C) Não tendo clientes, você poderá ir embora mais cedo.");
      System.out.println("D) Embora não conhecesse ninguém na cidade, logo se enturmou.");
      System.out.println("E) Percebendo o perigo, ligou para a polícia.");
		  System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'A';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;
  }
  static int pergunta12_Pt(int indicePergunta) {
      System.out.println("\n--------------------------------------------------------------------------------------------\n");
    	System.out.println("\n"+indicePergunta+")  Indique, entre as orações abaixo, qual delas é uma oração subordinada adverbial concessiva:\n");
      System.out.println("A) Venha agora ou perderá a vez de jogar.");
		  System.out.println("B) Marcelo prometeu chegar no horário combinado, porém chegou duas horas depois.");
		  System.out.println("C) Viajaremos se não chover amanhã.");
      System.out.println("D) “Se queres ser aprovado...");
      System.out.println("E) Quero muito que você venha ao jantar, ainda que chegue tarde.");
		  System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'E';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;
  }
  static int pergunta13_Pt(int indicePergunta) {
      System.out.println("\n--------------------------------------------------------------------------------------------\n");
      System.out.println("\n"+indicePergunta+") Temos uma oração subordinada adverbial concessiva em:\n");
      System.out.println("A) Se eu tivesse dinheiro, compraria hoje um carro.");
		  System.out.println("B) Fizemos a consulta, conforme a solicitação dos auditores.");
		  System.out.println("C) O especialista não concordará com sua opinião, por mais que você insista.");
      System.out.println("D) Enquanto a mídia entrevistava o especialista, os telespectadores assistiam impávidos.");
      System.out.println("E) Se houvesse uma despedida talvez fosse mais triste (...)");
		  System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'C';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;
  }
  static int pergunta14_Pt(int indicePergunta){
      System.out.println("\n--------------------------------------------------------------------------------------------\n");
      System.out.println("\n"+indicePergunta+") Pergunta: Qual a figura de linguagem presente na seguinte expressão: 'Seu sorriso era um raio de sol'?\n");
      System.out.println("A) Metáfora.");
		  System.out.println("B) Metonímia.");
		  System.out.println("C) Hipérbole.");
      System.out.println("D) Anáfora.");
      System.out.println("E) Pleonasmo");
		  System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'A';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;
  }
  static int pergunta15_Pt(int indicePergunta) {
      System.out.println("\n--------------------------------------------------------------------------------------------\n");    
      System.out.println("\n"+indicePergunta+") 'Você será aprovado, porque estudou muito.' É uma oração subordinada adjetiva:\n");
      System.out.println("A) Causal.");
		  System.out.println("B) Comparativa.");
		  System.out.println("C) Concessiva");
      System.out.println("D) Proporcional");
      System.out.println("E) Temporal");
		  System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'A';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;
  }
  
  /**** CIÊNCIAS ****/
	static int JogarCiencias(int[] pergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
    System.out.println("*****QUIZ DE CIÊNCIAS*****");
    int pontuacaoTotal = 0;
		for (int i = 0; i < pergunta.length; i++) {
			switch (pergunta[i]) {
			case 1:
				int pontosPergunta1 = pergunta1_Ci(i+1);
        pontuacaoTotal += pontosPergunta1;
				break;
			case 2:
        int pontosPergunta2 = pergunta2_Ci(i+1);
        pontuacaoTotal += pontosPergunta2;
				break;
			case 3:
        int pontosPergunta3 = pergunta3_Ci(i+1);
        pontuacaoTotal += pontosPergunta3;
				break;
			case 4:
        int pontosPergunta4 = pergunta4_Ci(i+1);
        pontuacaoTotal += pontosPergunta4;
				break;
			case 5:
        int pontosPergunta5 = pergunta5_Ci(i+1);
        pontuacaoTotal += pontosPergunta5;
				break;
			case 6:
        int pontosPergunta6 = pergunta6_Ci(i+1);
        pontuacaoTotal += pontosPergunta6;
				break;
			case 7:
        int pontosPergunta7 = pergunta7_Ci(i+1);
        pontuacaoTotal += pontosPergunta7;
				break;
			case 8:
        int pontosPergunta8 = pergunta8_Ci(i+1);
        pontuacaoTotal += pontosPergunta8;
				break;
			case 9:
        int pontosPergunta9 = pergunta9_Ci(i+1);
        pontuacaoTotal += pontosPergunta9;
				break;
			case 10:
        int pontosPergunta10 = pergunta10_Ci(i+1);
        pontuacaoTotal += pontosPergunta10;
				break;
			case 11:
        int pontosPergunta11 = pergunta11_Ci(i+1);
        pontuacaoTotal += pontosPergunta11;
				break;
			case 12:
        int pontosPergunta12 = pergunta12_Ci(i+1);
        pontuacaoTotal += pontosPergunta12;
				break;
			case 13:
        int pontosPergunta13 = pergunta13_Ci(i+1);
        pontuacaoTotal += pontosPergunta13;
				break;
			case 14:
        int pontosPergunta14 = pergunta14_Ci(i+1);
        pontuacaoTotal += pontosPergunta14;
				break;
			case 15:
        int pontosPergunta15 = pergunta15_Ci(i+1);
        pontuacaoTotal += pontosPergunta15;
				break;
			}
		}
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
    System.out.println("\nSua pontuação final no teste de ciências: " + pontuacaoTotal);
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
    tecleParaVoltar();
    return pontuacaoTotal;
  }
  
  static int pergunta1_Ci(int indicePergunta) {
      System.out.println("\n--------------------------------------------------------------------------------------------\n");    
      System.out.println("\n"+indicePergunta+") Qual o maior osso do corpo humano?\n");
      System.out.println("A) Fêmur.");
		  System.out.println("B) Crânio.");
		  System.out.println("C) Coluna.");
      System.out.println("D) Braço.");
		  System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'A';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;  
  }
  static int pergunta2_Ci(int indicePergunta)  {
      System.out.println("\n--------------------------------------------------------------------------------------------\n");    
      System.out.println("\n"+indicePergunta+") Qual a verdadeira cor do coração?\n");
      System.out.println("A) Branco.");
		  System.out.println("B) Amarelo.");
		  System.out.println("C) Vermelho.");
      System.out.println("D) Roxo.");
		  System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'A';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;  
  }
  static int pergunta3_Ci(int indicePergunta)  {
      System.out.println("\n--------------------------------------------------------------------------------------------\n");  
      System.out.println("\n"+indicePergunta+") Quais desses animais é vertebrado?\n");
      System.out.println("A) Peixe.");
		  System.out.println("B) Borboleta.");
		  System.out.println("C) formiga.");
      System.out.println("D) Minhoca.");
		  System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'A';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;  
  }
  static int pergunta4_Ci(int indicePergunta)  {
      System.out.println("\n--------------------------------------------------------------------------------------------\n");    
      System.out.println("\n"+indicePergunta+") Quantos ossos um ser humano adulto tem?\n");
      System.out.println("A) 565 ossos.");
		  System.out.println("B) 345 ossos.");
		  System.out.println("C) 270 ossos.");
      System.out.println("D) 206 ossos.");
		  System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'D';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;  
  }
  static int pergunta5_Ci(int indicePergunta) {
      System.out.println("\n--------------------------------------------------------------------------------------------\n");        System.out.println("\n"+indicePergunta+") Os planetas anões são corpos celestes semelhantes aos planetas, mas que não possuem uma órbita desimpedida e são pequenos em tamanho. O planeta abaixo do sistema solar que é considerado um planeta anão é:\n");
      System.out.println("A) Júpiter.");
		  System.out.println("B) Mercúrio.");
		  System.out.println("C) Plutão.");
      System.out.println("D) Marte.");
		  System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'C';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;  
  }
  static int pergunta6_Ci(int indicePergunta) {
      System.out.println("\n--------------------------------------------------------------------------------------------\n");         System.out.println("\n"+indicePergunta+") Qual animal desses é considerado ovino?\n");
      System.out.println("A) Cavalo.");
		  System.out.println("B) Porco.");
		  System.out.println("C) Carneiro.");
      System.out.println("D) Pato.");
		  System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'C';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;  
  }
   static int pergunta7_Ci(int indicePergunta) {
      System.out.println("\n--------------------------------------------------------------------------------------------\n");         System.out.println("\n"+indicePergunta+") No ciclo do carbono, os vegetais utilizam o gás carbônico no processo de obtenção do seu alimento. Qual seria está etapa?\n"); 
      System.out.println("A) Respiração.");
		  System.out.println("B) Fotossíntese.");
		  System.out.println("C) Transpiração.");
      System.out.println("D) Decomposição.");
		  System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'B';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;  
  }
  static int pergunta8_Ci(int indicePergunta) {
      System.out.println("\n--------------------------------------------------------------------------------------------\n");         System.out.println("\n"+indicePergunta+") O gás oxigênio é produzido a partir da fotossíntese realizada por todas as plantas clorofiladas e algumas algas.");
      System.out.println("\nEsse processo faz parte do ciclo biogeoquímico, chamado:\n");
      System.out.println("A) Ciclo do enxofre.");
		  System.out.println("B) Ciclo do carbono.");
		  System.out.println("C) Ciclo do oxigênio.");
      System.out.println("D) Ciclo do nitrogênio.");
		  System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'C';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;  
  }
  static int pergunta9_Ci(int indicePergunta) {
      System.out.println("\n--------------------------------------------------------------------------------------------\n");         System.out.println("\n"+indicePergunta+") A variação da pressão atmosférica está relacionada à força da gravidade. Essa força tem origem no centro da Terra e atrai tudo o que está no planeta, inclusive a atmosfera.");
      System.out.println("\nQuanto mais próximo da superfície terrestre você estiver:\n");
      System.out.println("A) Maior o esforço para respirar.");
		  System.out.println("B) Maior a pressão da atmosfera.");
		  System.out.println("C) Menor a pressão da atmosfera.");
      System.out.println("D) Menor a quantidade de gases.");
		  System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'B';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;  
  }
   static int pergunta10_Ci(int indicePergunta) {
      System.out.println("\n--------------------------------------------------------------------------------------------\n");         System.out.println("\n"+indicePergunta+") A alimentação do goiano vem sofrendo sérias modificações com o passar do tempo. Hoje, cresce o consumo de alimentação “fast-food” pobre em fibras e extremamente calórica.");
      System.out.println("\nA associação do arroz com feijão já não é mais comum. Essa associação, entre outras razões, é importante porque pode:\n");
      System.out.println("A) Representar uma boa fonte de energia, além de fornecer ao organismo aminoácidos essencias.");
		  System.out.println("B) Diminuir a absorção de vitaminas no intestino.");
		  System.out.println("C) Aumentar a ingestão de triglicerídeos e ácidos graxos.");
      System.out.println("D) Contribuir para consumir parte das reservas de glicogênio no figado.");
		  System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'A';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;  
   }
   static int pergunta11_Ci(int indicePergunta) {
      System.out.println("\n--------------------------------------------------------------------------------------------\n");                  
      System.out.println("\n"+indicePergunta+") O órgão responsável por alojar o bebê durante o periodo de gestação é chamado de:\n");
      System.out.println("A) Ovário.");
		  System.out.println("B) Útero.");
		  System.out.println("C) Vagina.");
      System.out.println("D) Vulva.");
		  System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'B';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;  
  }
  static int pergunta12_Ci(int indicePergunta) {
      System.out.println("\n--------------------------------------------------------------------------------------------\n");         System.out.println("\n"+indicePergunta+") Quando levamos um susto ou praticamos um esporte radical, a adrenalina produzida nas glândulas suprarrenais é liberada na corrente sanguínea e o organismo fica pronto para enfrentar uma situação de perigo ou alerta.\n");
      System.out.println("Um dos efeitos imediatos da ação da adrenalina é:\n");
      System.out.println("A) A inibição dos batimentos cardiacos.");
		  System.out.println("B) O aumento da frequência respiratória.");
		  System.out.println("C) A diminuição da frequência respiratória.");
      System.out.println("D) A aceleração do desenvolvimento da musculatura.");
		  System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'B';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;  
  }
  static int pergunta13_Ci(int indicePergunta) {
      System.out.println("\n--------------------------------------------------------------------------------------------\n");                                System.out.println("\n"+indicePergunta+") O sol emite calor e luz continuamente. Ao seu redor, giram não apenas a Terra, mas também outros corpos celestes. Que tipo de astro celeste é o Sol?\n");
      System.out.println("A) Planeta.");
		  System.out.println("B) Cometa.");
		  System.out.println("C) Satélite natural.");
      System.out.println("D) Estrela.");
		  System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'D';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;  
  }
   static int pergunta14_Ci(int indicePergunta) {
      System.out.println("\n--------------------------------------------------------------------------------------------\n");         System.out.println("\n"+indicePergunta+") O nosso universo é formado por bilhões de galáxias, onde há muitas estrelas e girando em torno delas. Qual o nome da galáxia em que o Sistema Solar está inserido?\n");
      System.out.println("A) Via Urbana.");
		  System.out.println("B) Via Marte.");
		  System.out.println("C) Via Lactea.");
      System.out.println("D) Via Solar.");
		  System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'C';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;  
  }
  static int pergunta15_Ci(int indicePergunta) {
      System.out.println("\n--------------------------------------------------------------------------------------------\n");         System.out.println("\n"+indicePergunta+") Alguns astros não têm luz própria como a lua. O brilho da Lua ou luar, como conhecemos, é a luz do Sol e de outras estrelas refletida por ela. Que tipo de astro celeste é a Lua?\n");
      System.out.println("A) Planeta.");
		  System.out.println("B) Estrela.");
		  System.out.println("C) Satélite Natural.");
      System.out.println("D) Satélite artificial.");
		  System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'C';
		int pontuacao = corrigePergunta(respostaCorreta);
    return pontuacao;  
  }

  /**** HISTÓRIA ****/
	static int JogarHistoria(int[] pergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
    System.out.println("*****QUIZ DE HISTÓRIA*****");
    int pontuacaoTotal = 0;
		for (int i = 0; i < pergunta.length; i++) {
			switch (pergunta[i]) {
			case 1:
				int pontosPergunta1 = pergunta1_Ht(i+1);
        pontuacaoTotal += pontosPergunta1;
				break;
			case 2:
        int pontosPergunta2 = pergunta2_Ht(i+1);
        pontuacaoTotal += pontosPergunta2;
				break;
			case 3:
        int pontosPergunta3 = pergunta3_Ht(i+1);
        pontuacaoTotal += pontosPergunta3;
				break;
			case 4:
        int pontosPergunta4 = pergunta4_Ht(i+1);
        pontuacaoTotal += pontosPergunta4;
				break;
			case 5:
        int pontosPergunta5 = pergunta5_Ht(i+1);
        pontuacaoTotal += pontosPergunta5;
				break;
			case 6:
        int pontosPergunta6 = pergunta6_Ht(i+1);
        pontuacaoTotal += pontosPergunta6;
				break;
			case 7:
        int pontosPergunta7 = pergunta7_Ht(i+1);
        pontuacaoTotal += pontosPergunta7;
				break;
			case 8:
        int pontosPergunta8 = pergunta8_Ht(i+1);
        pontuacaoTotal += pontosPergunta8;
				break;
			case 9:
        int pontosPergunta9 = pergunta9_Ht(i+1);
        pontuacaoTotal += pontosPergunta9;
				break;
			case 10:
        int pontosPergunta10 = pergunta10_Ht(i+1);
        pontuacaoTotal += pontosPergunta10;
				break;
			case 11:
        int pontosPergunta11 = pergunta11_Ht(i+1);
        pontuacaoTotal += pontosPergunta11;
				break;
			case 12:
        int pontosPergunta12 = pergunta12_Ht(i+1);
        pontuacaoTotal += pontosPergunta12;
				break;
			case 13:
        int pontosPergunta13 = pergunta13_Ht(i+1);
        pontuacaoTotal += pontosPergunta13;
				break;
			case 14:
        int pontosPergunta14 = pergunta14_Ht(i+1);
        pontuacaoTotal += pontosPergunta14;
				break;
			case 15:
        int pontosPergunta15 = pergunta15_Ht(i+1);
        pontuacaoTotal += pontosPergunta15;
				break;
			}
		}
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
    System.out.println("\nSua pontuação final no teste de história: " + pontuacaoTotal);
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
    tecleParaVoltar();
    return pontuacaoTotal;
	}
  
  static int pergunta1_Ht(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Qual foi a principal causa da Primeira Guerra Mundial?\n");
		System.out.println("A) Assassinato do Arquiduque Francisco Ferdinando.");
		System.out.println("B) Imperialismo.");
		System.out.println("C) A Grande Depressão.");
		System.out.println("D) Nacionalismo extremo.");
		System.out.println("E) Conflitos territoriais.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'A';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
	}
  static int pergunta2_Ht(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Quem foi o líder revolucionário que desempenhou um papel fundamental na Revolução Cubana?\n");
		System.out.println("A) Fidel Castro.");
		System.out.println("B) Che Guevara.");
		System.out.println("C) Ernesto Cardenal.");
		System.out.println("D) Hugo Chávez.");
		System.out.println("E) Raúl Castro.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'A';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
	}
  static int pergunta3_Ht(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Qual foi o evento que marcou o início da Revolução Industrial?\n");
		System.out.println("A) Invenção da roda.");
		System.out.println("B) Queda do Império Romano.");
		System.out.println("C) Descoberta da eletricidade.");
		System.out.println("D) Revolução Francesa.");
		System.out.println("E) Invenção da máquina a vapor.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'E';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
	}
  static int pergunta4_Ht(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Quem foi o líder político responsável pela reunificação da Alemanha em 1871?\n");
		System.out.println("A) Otto von Bismarck.");
		System.out.println("B) Adolf Hitler.");
		System.out.println("C) Friedrich Nietzsche.");
		System.out.println("D) Ludwig van Beethoven.");
		System.out.println("E) Karl Marx.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'A';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
  }
  static int pergunta5_Ht(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Quem foi o imperador romano conhecido por ter estabelecido um código legal abrangente chamado 'Código de Justiniano'?\n");
		System.out.println("A) Augusto.");
		System.out.println("B) Nero.");
		System.out.println("C) Constantino.");
		System.out.println("D) Trajano.");
		System.out.println("E) Justiniano.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'E';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
  }
  static int pergunta6_Ht(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Qual foi a cidade japonesa alvo do primeiro ataque atômico na história?\n");
		System.out.println("A) Osaka.");
		System.out.println("B) Nagasaki.");
		System.out.println("C) Tóquio.");
		System.out.println("D) Hiroshima.");
		System.out.println("E) Quioto.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'D';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
  }
  static int pergunta7_Ht(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Quem foi o explorador português que liderou a primeira viagem de circunavegação ao redor do mundo?\n");
		System.out.println("A) Cristóvão Colombo.");
		System.out.println("B) Vasco da Gama.");
		System.out.println("C) Fernão de Magalhães.");
		System.out.println("D) Pedro Álvares Cabral.");
		System.out.println("E) Bartolomeu Dias.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'C';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
  }
  static int pergunta8_Ht(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Quem foi o líder sul-africano que combateu o apartheid e se tornou o primeiro presidente negro do país?\n");
		System.out.println("A) Desmond Tutu.");
		System.out.println("B) Nelson Mandela.");
		System.out.println("C) FW de Klerk.");
		System.out.println("D) Jacob Zuma.");
		System.out.println("E) Thabo Mbeki.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'B';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
  }
  static int pergunta9_Ht(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Qual foi o tratado que cerrou oficialmente a Primeira Guerra Mundial?\n");
		System.out.println("A) Tratado de Versalhes.");
		System.out.println("B) Tratado de Tordesilhas.");
		System.out.println("C) Tratado de Paris.");
		System.out.println("D) Tratado de Brest-Litovski.");
		System.out.println("E) Tratado de Locarno.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'A';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
  }
   static int pergunta10_Ht(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Quem foi o líder soviético responsável pela Perestroika e pela Glasnost?\n");
		System.out.println("A) Joseph Stalin.");
		System.out.println("B) Vladimir Lenin.");
		System.out.println("C) Mikhail Gorbachev.");
		System.out.println("D) Leon Trotsky.");
		System.out.println("E) Boris Yeltsin.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'C';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
  }
   static int pergunta11_Ht(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Qual foi o período conhecido como 'Idade das Trevas' na Europa?\n");
		System.out.println("A) Idade Antiga.");
		System.out.println("B) Idade Média.");
		System.out.println("C) Renascimento.");
		System.out.println("D) Idade Moderna.");
		System.out.println("E) Idade Contemporânea.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'B';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
   }
  static int pergunta12_Ht(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Quem foi o líder militar francês que se tornou imperador e estabeleceu um vasto império durante as Guerras Napoleônicas?\n");
		System.out.println("A) Felipe II.");
		System.out.println("B) Luís XIV.");
		System.out.println("C) Charles de Gaulle.");
		System.out.println("D) Napoleão Bonaparte.");
		System.out.println("E) Joana d'Arc.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'D';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
  }
  static int pergunta13_Ht(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Qual foi a revolução ocorrida no continente asiatico em 1949 que resultou na fundação da República Popular da China?\n");
		System.out.println("A) Revolução Cubana.");
		System.out.println("B) Revolução Industrial.");
		System.out.println("C) Revolução Russa.");
		System.out.println("D) Revolução Chinesa.");
		System.out.println("E) Revolução Francesa.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'D';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
  }
  static int pergunta14_Ht(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Quem foi o líder dos direitos civis dos Estados Unidos que defendeu a igualdade racial através da não violência?\n");
		System.out.println("A) Martin Luther King Jr.");
		System.out.println("B) Malcolm X.");
		System.out.println("C) Rosa Parks.");
		System.out.println("D) Harriet Tubman.");
		System.out.println("E) Abraham Lincoln.");
		System.out.print("\nDigite a sua alternativa:");
		char respostaCorreta = 'A';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
   }
  static int pergunta15_Ht(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Qual foi o evento que marcou o início da Segunda Guerra Mundial na Europa?\n");
		System.out.println("A) Invasão da Polônia.");
		System.out.println("B) Ataque a Pearl Harbor.");
		System.out.println("C) Queda do Muro de Berlim.");
		System.out.println("D) Batalha de Stalingrado.");
		System.out.println("E) Tratado de Versalhes.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'A';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
   }
  
  /**** EDUCAÇÃO FISICA ****/
	static int JogarEdfisica(int[] pergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
    System.out.println("*****QUIZ DE EDUCAÇÃO FISÍCA*****");
    int pontuacaoTotal = 0;
		for (int i = 0; i < pergunta.length; i++) {
			switch (pergunta[i]) {
			case 1:
				int pontosPergunta1 = pergunta1_Ef(i+1);
        pontuacaoTotal += pontosPergunta1;
				break;
			case 2:
        int pontosPergunta2 = pergunta2_Ef(i+1);
        pontuacaoTotal += pontosPergunta2;
				break;
			case 3:
        int pontosPergunta3 = pergunta3_Ef(i+1);
        pontuacaoTotal += pontosPergunta3;
				break;
			case 4:
        int pontosPergunta4 = pergunta4_Ef(i+1);
        pontuacaoTotal += pontosPergunta4;
				break;
			case 5:
        int pontosPergunta5 = pergunta5_Ef(i+1);
        pontuacaoTotal += pontosPergunta5;
				break;
			case 6:
        int pontosPergunta6 = pergunta6_Ef(i+1);
        pontuacaoTotal += pontosPergunta6;
				break;
			case 7:
        int pontosPergunta7 = pergunta7_Ef(i+1);
        pontuacaoTotal += pontosPergunta7;
				break;
			case 8:
        int pontosPergunta8 = pergunta8_Ef(i+1);
        pontuacaoTotal += pontosPergunta8;
				break;
			case 9:
        int pontosPergunta9 = pergunta9_Ef(i+1);
        pontuacaoTotal += pontosPergunta9;
				break;
			case 10:
        int pontosPergunta10 = pergunta10_Ef(i+1);
        pontuacaoTotal += pontosPergunta10;
				break;
			case 11:
        int pontosPergunta11 = pergunta11_Ef(i+1);
        pontuacaoTotal += pontosPergunta11;
				break;
			case 12:
        int pontosPergunta12 = pergunta12_Ef(i+1);
        pontuacaoTotal += pontosPergunta12;
				break;
			case 13:
        int pontosPergunta13 = pergunta13_Ef(i+1);
        pontuacaoTotal += pontosPergunta13;
				break;
			case 14:
        int pontosPergunta14 = pergunta14_Ef(i+1);
        pontuacaoTotal += pontosPergunta14;
				break;
			case 15:
        int pontosPergunta15 = pergunta15_Ef(i+1);
        pontuacaoTotal += pontosPergunta15;
				break;
			}
		}
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
    System.out.println("\nSua pontuação final no teste de Ed. Física: " + pontuacaoTotal);
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
    tecleParaVoltar();
    return pontuacaoTotal;
	}
  
  static int pergunta1_Ef(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Qual das opções abaixo não é um estilo de luta do Brasil?\n");
		System.out.println("A) Huka-huka.");
		System.out.println("B) Capoeira.");
		System.out.println("C) Jiu-Jitsu.");
		System.out.println("D) Marical.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'D';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
   }
  static int pergunta2_Ef(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Quais são os componentes principais do condicionamento físico?\n");
		System.out.println("A) Equilíbrio e coordenação.");
		System.out.println("B) Velocidade e potência.");
		System.out.println("C) Flexibilidade e agilidade.");
		System.out.println("D) Força muscular e composição corporal.");
		System.out.println("E) Resistência cardiovascular e flexibilidade.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'D';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
   }
  static int pergunta3_Ef(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") O que é flexibilidade?\n");
		System.out.println("A) Flexibilidade é a capacidade de correr longas distâncias sem cansaço.");
		System.out.println("B) Flexibilidade é a habilidade de levantar pesos pesados sem se machucar.");
		System.out.println("C) Flexibilidade é a amplitude de movimento das articulações e músculos.");
		System.out.println("D) Flexibilidade é a resistência ao cansaço durante exercícios intensos.");
		System.out.println("E) Flexibilidade é a força muscular durante exercícios de alta intensidade.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'C';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
   }
  static int pergunta4_Ef(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Quais são as principais diferenças entre exercícios aeróbicos e anaeróbicos?\n");
		System.out.println("A) Exercícios aeróbicos são de alta intensidade, enquanto exercícios anaeróbicos são de baixa intensidade.");
		System.out.println("B)  Os exercícios aeróbicos utilizam oxigênio para produzir energia, enquanto os exercícios anaeróbicos não são alimentados com oxigênio.");
		System.out.println("C) Exercícios aeróbicos são de curta duração, enquanto exercícios anaeróbicos são de longa duração.");
		System.out.println("D) Exercícios aeróbicos são focados no fortalecimento muscular, enquanto exercícios anaeróbicos são focados no condicionamento cardiovascular.");
		System.out.println("E) Exercícios aeróbicos são realizados com equipamentos específicos, enquanto exercícios aeróbicos podem ser feitos apenas com o peso do corpo.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'B';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
   }
  static int pergunta5_Ef(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") O que é o VO2 max e qual é a sua importância no treino físico?\n");
		System.out.println("A) O VO2 max é a quantidade máxima de vitaminas e minerais necessários para o corpo funcionar corretamente.");
		System.out.println("B) O VO2 max é um tipo de exercício de alta intensidade que visa melhorar a resistência cardiovascular.");
		System.out.println("C) O VO2 max é a quantidade máxima de oxigênio que o corpo pode usar durante o exercício físico.");
		System.out.println("D) O VO2 max é uma técnica de exercícios físicos utilizada para melhorar a recuperação muscular após o exercício.");
		System.out.println("E) O VO2 max é uma medida da força muscular dos membros inferiores e sua importância está relacionada à capacidade de realizar exercícios de levantamento de peso.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'C';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
   }
  static int pergunta6_Ef(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Quais são os princípios do treinamento físico?\n");
		System.out.println("A) Variedade, inatividade e desequilíbrio.");
		System.out.println("B) Estabilidade, monotonia e inflexibilidade.");
		System.out.println("C) Progressão, sobrecarga e especificidade.");
		System.out.println("D) Passividade, estagnação e generalidade.");
		System.out.println("E) Aleatoriedade, relaxamento e inconstância.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'C';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
   }
  static int pergunta7_Ef(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") A partir de qual ano a copa do mundo contará com 48 seleções participantes?\n");
		System.out.println("A) 2023.");
		System.out.println("B) 2026.");
		System.out.println("C) 2034.");
		System.out.println("D) 2038.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'B';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
   }
   static int pergunta8_Ef(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Quais são os diferentes tipos de alongamento e quando é apropriado usar cada um deles?\n");
		System.out.println("A) Alongamento estático e dinâmico - O alongamento estático é mais adequado antes do exercício, enquanto o alongamento dinâmico é melhor após o exercício.");
		System.out.println("B) Alongamento passivo e alongamento ativo - O alongamento passivo é mais adequado antes do exercício, enquanto o alongamento ativo é melhor após o exercício.");
		System.out.println("C) Alongamento estático e alongamento balístico - O alongamento estático é mais adequado antes do exercício, enquanto o alongamento balístico é melhor após o exercício.");
		System.out.println("D) Alongamento ativo e alongamento estático - O alongamento ativo é mais adequado antes do exercício, enquanto o alongamento estático é melhor após o exercício.");
		System.out.println("E) Alongamento dinâmico e alongamento passivo - O alongamento dinâmico é mais adequado antes do exercício.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'A';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
   }
   static int pergunta9_Ef(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Quais são as melhores estratégias para prevenir lesões durante a prática de atividades físicas?\n");
		System.out.println("A) Não se aquecer antes do exercício.");
		System.out.println("B) Ignorar os sinais de fadiga durante o treino.");
		System.out.println("C) Realizar movimentos bruscos e rápidos durante o exercício.");
		System.out.println("D) Utilizar equipamentos inadequados ou danificados.");
		System.out.println("E) Realizar um programa de treinamento progressivo e incluir exercícios de força e alongamento.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'E';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
   }
  static int pergunta10_Ef(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Qual é a importância do descanso e recuperação no treinamento físico?\n");
		System.out.println("A) O descanso e a recuperação não são necessários no treinamento físico.");
		System.out.println("B) O descanso e a recuperação são importantes apenas para atletas profissionais.");
		System.out.println("C) O descanso e a recuperação ajudam a prevenir lesões e reduzir o risco de overtraining.");
		System.out.println("D) O descanso e a recuperação são apenas para os indivíduos mais velhos.");
		System.out.println("E) O descanso e a recuperação atrapalham o progresso e o desempenho no treinamento físico.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'C';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
   }
  static int pergunta11_Ef(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Quais são os benefícios do treinamento de resistência?\n");
		System.out.println("A) Aumento da flexibilidade muscular.");
		System.out.println("B) Melhora da velocidade e potência.");
		System.out.println("C) Redução da densidade óssea.");
		System.out.println("D) Aumento da ansiedade e estresse.");
		System.out.println("E) Melhora da agilidade e coordenação motora.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'B';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
  }
  static int pergunta12_Ef(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") O que são exercícios de pliometria e qual é o objetivo deles?\n");
		System.out.println("A) Exercícios de pliometria são exercícios de alongamento para melhorar a flexibilidade.");
		System.out.println("B) Exercícios de pliometria são exercícios de baixa intensidade para melhorar a resistência cardiovascular.");
		System.out.println("C) Exercícios de pliometria são exercícios de fortalecimento muscular utilizando apenas o peso do corpo.");
		System.out.println("D) Exercícios de pliometria são exercícios de alta intensidade que envolvem movimentos explosivos para melhorar a potência muscular.");
		System.out.println("E) Exercícios de pliometria são exercícios de equilíbrio e estabilidade para melhorar a coordenação motora.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'D';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
  }
  static int pergunta13_Ef(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Qual é a principal função do sistema cardiovascular no corpo humano\n");
		System.out.println("A) Aumentar a força muscular.");
		System.out.println("B) Promover a queima de gordura.");
		System.out.println("C) Auxiliar na recuperação mental.");
		System.out.println("D) Melhorar a velocidade de reação.");
		System.out.println("E) Melhora da agilidade e coordenação motora.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'E';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
  }
  static int pergunta14_Ef(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Qual é a função principal dos carboidratos na dieta de um atleta?\n");
		System.out.println("A) Regular a temperatura corporal.");
		System.out.println("B) Realizar a digestão dos alimentos.");
		System.out.println("C) Controlar o equilíbrio ácido-base do organismo.");
		System.out.println("D) Transportar oxigênio e nutrientes para os tecidos do corpo.");
		System.out.println("E) Produzir e armazenar células sanguíneas.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'D';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
  }
  static int pergunta15_Ef(int indicePergunta) {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n"+indicePergunta+") Qual é o componente essencial de uma dieta saudável e equilibrada? \n");
		System.out.println("A) Açúcar refinado.");
		System.out.println("B) Gorduras saturadas.");
		System.out.println("C) Alimentos processados.");
		System.out.println("D) Vitaminas e minerais.");
		System.out.println("E) Refrigerantes açucarados.");
		System.out.print("\nDigite a sua alternativa: ");
		char respostaCorreta = 'D';
		int pontuacao = corrigePergunta(respostaCorreta);
		return pontuacao;
  }
  
  //Corrige as perguntas de cada teste e retorna a potuação atingida pelo ususario.
	static int corrigePergunta(char respostaCorreta) {
		Scanner entrada = new Scanner(System.in);
		boolean acertou = false;
		int qtdeTentativas = 2;
		int pontuacao = 0;
		char respostaUsuario;
		while (qtdeTentativas > 0 && acertou == false) {
			respostaUsuario = entrada.next().toUpperCase().charAt(0);

			if (respostaUsuario != 'A' && respostaUsuario != 'B' && respostaUsuario != 'C' && respostaUsuario != 'D' && respostaUsuario != 'E') {
				System.out.println("Alternativa invalida! Tente novamente");
			} else if (respostaUsuario == respostaCorreta) {
        if(qtdeTentativas == 2) {
          pontuacao += 10;
          System.out.println("\nResposta correta!   Parabéns +10 pontos :)");
        } else {
          pontuacao += 5;
          System.out.println("\nResposta correta!   Parabéns +5 pontos :)");
        }
				acertou = true;
			} else {
				qtdeTentativas--;
				System.out.println("\nResposta incorreta! :(\n");
				if (qtdeTentativas > 0) {
					System.out.println("Você tem mais " + qtdeTentativas + " tentativa\n");
					System.out.print("Digite a sua alternativa: ");
				} else {
					System.out.println("Suas tentativas acabaram :(");
				}
			}
		}
		tecleParaContinuar();
		return pontuacao;
	}

  //embaralha a ordem das perguntas em cada teste.
	static int[] embaralharPerguntas() {
		ArrayList<Integer> perguntas = new ArrayList<Integer>();
    for(int i = 1; i <= 15; i++) {
      perguntas.add(i);
    }

		Collections.shuffle(perguntas);

		int p1 = perguntas.get(0);
		int p2 = perguntas.get(1);
		int p3 = perguntas.get(2);
		int p4 = perguntas.get(3);
		int p5 = perguntas.get(4);
		int p6 = perguntas.get(5);
		int p7 = perguntas.get(6);
		int p8 = perguntas.get(7);
		int p9 = perguntas.get(8);
		int p10 = perguntas.get(9);

		int numPerguntas[] = new int[] { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10 };

		return numPerguntas;
	}

	static void creditos() {
		System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("\n|       ****CRÉDITOS****        |");
		System.out.println("|=================================|");
		System.out.println("|      Jogo desenvolvido por:     |");
		System.out.println("|=================================|");
		System.out.println("|----------Pedro Augusto----------|");
		System.out.println("|----------Patrick Santos---------|");
		System.out.println("|=================================|\n");
		System.out.println("\n--------------------------------------------------------------------------------------------\n");
		tecleParaVoltar();
	}
  
  //Função para exibir links de conteudos e dicas extras para estudo
  static void conteudos() {
    Scanner entrada = new Scanner(System.in);

    ArrayList<String> linksMatematica = new ArrayList<String>();
    linksMatematica.add("https://mundoeducacao.uol.com.br/matematica/multiplicacao.htm");
    linksMatematica.add("https://escolakids.uol.com.br/matematica/multiplicacao-e-divisao-de-numeros-negativos.htm");
    linksMatematica.add("https://www.todamateria.com.br/adicao-e-subtracao-de-fracoes/");
    linksMatematica.add("https://youtu.be/lDynq8TLBZo");
    linksMatematica.add("https://www.todamateria.com.br/angulos/");
    linksMatematica.add("https://resumos.mesalva.com/numeros-negativos-soma-subtracao/");

    ArrayList<String> linksPortugues = new ArrayList<String>();
    linksPortugues.add("https://www.todamateria.com.br/predicado/");
    linksPortugues.add("https://www.normaculta.com.br/predicado/");
    linksPortugues.add("https://mundoeducacao.uol.com.br/gramatica/tipos-sujeito.htm");
    linksPortugues.add("https://youtu.be/PLEVKgonM0E");
    linksPortugues.add("https://brasilescola.uol.com.br/gramatica/verbo.htm");
    linksPortugues.add("https://brasilescola.uol.com.br/gramatica/oracao.htm");
    linksPortugues.add("https://www.todamateria.com.br/oracao-tipos-e-exemplos/");

    ArrayList<String> linksCiencias = new ArrayList<String>();
    linksCiencias.add("https://mundoeducacao.uol.com.br/biologia/esqueleto-humano.htm");
    linksCiencias.add("https://cursinhoparamedicina.com.br/blog/biologia/animais-vertebrados-e-invertebrados-quais-as-diferencas/");
    linksCiencias.add("https://www.todamateria.com.br/reino-animal/");
    linksCiencias.add("https://mundoeducacao.uol.com.br/geografia/planetas.htm");
    linksCiencias.add("https://brasilescola.uol.com.br/biologia/ciclo-carbono.htm");
    linksCiencias.add("https://www.todamateria.com.br/o-que-e-universo/");
    linksCiencias.add("https://mundoeducacao.uol.com.br/biologia/orgaos-do-corpo-humano.htm");

    ArrayList<String> linksHistoria = new ArrayList<String>();
    linksHistoria.add("https://brasilescola.uol.com.br/historiag/primeira-guerra.htm");
    linksHistoria.add("https://brasilescola.uol.com.br/historiag/revolucao-cubana.htm");
    linksHistoria.add("https://brasilescola.uol.com.br/historiag/revolucao-industrial.htm");
    linksHistoria.add("https://www.todamateria.com.br/expansao-maritima-europeia/");
    linksHistoria.add("https://brasilescola.uol.com.br/biografia/nelson-mandela.htm");
    linksHistoria.add("https://www.todamateria.com.br/martin-luther-king/");
    linksHistoria.add("https://brasilescola.uol.com.br/guerras/a-segunda-guerra-mundial.htm");
    linksHistoria.add("https://mundoeducacao.uol.com.br/historiageral/idade-media.htm");

    ArrayList<String> linksEdFisica = new ArrayList<String>();
    linksEdFisica.add("https://www.acessoriosparaacademia.com.br/blog/tudo-o-que-voce-precisa-saber-sobre-condicionamento-fisico/");
    linksEdFisica.add("https://blog.winsocial.com.br/exercicios-aerobicos-versus-anaerobicos/");
    linksEdFisica.add("https://blog.gsuplementos.com.br/vo2-maximo/");
    linksEdFisica.add("https://vitat.com.br/alongamento/");
    linksEdFisica.add("https://news.gympass.com/evitar-lesoes-durante-os-exercicios/");
    linksEdFisica.add("https://treinamentosurfevolutivo.com.br/treino-de-resistencia-entenda-o-que-e-e-quais-sao-seus-tipos/");
    linksEdFisica.add("https://www.todamateria.com.br/sistema-cardiovascular/");
    linksEdFisica.add("https://mundoeducacao.uol.com.br/saude-bem-estar/alimentacao-saudavel.htm");

		boolean sair = false;
		do {
      System.out.println("\n--------------------------------------------------------------------------------------------\n");
		  System.out.println("****DICAS E CONTEÚDOS PARA ESTUDO****");
      System.out.println("\n--------------------------------------------------------------------------------------------\n");
			System.out.println("\nEm qual tema deseja aprofundar seus conhecimentos ?\n");
			System.out.println("|==================================|");
			System.out.println("|              TEMAS               |");
			System.out.println("|==================================|");
			System.out.println("|    1- Matemática                 |");
			System.out.println("|    2- Português                  |");
			System.out.println("|    3- Ciências                   |");
			System.out.println("|    4- História                   |");
			System.out.println("|    5- Educação Fisica            |");
			System.out.println("|    6- Voltar ao menu principal   |");
			System.out.println("|==================================|");
			System.out.print("Sua opção: ");

			int opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
        System.out.println("\n--------------------------------------------------------------------------------------------\n");
        System.out.println("****CONTEUDOS EXTRAS DE MATEMÁTICA****\n");
        for(int i = 0; i < linksMatematica.size(); i++) {
          System.out.println("\n"+linksMatematica.get(i));
        }
        tecleParaVoltar();
				break;
      case 2: 
        System.out.println("\n--------------------------------------------------------------------------------------------\n");
        System.out.println("****CONTEUDOS EXTRAS DE PORTUGUÊS****\n");
        for(int i = 0; i < linksPortugues.size(); i++) {
          System.out.println("\n"+linksPortugues.get(i));
        }
        tecleParaVoltar();
				break;
      case 3:
        System.out.println("\n--------------------------------------------------------------------------------------------\n");
        System.out.println("****CONTEUDOS EXTRAS DE CIÊNCIAS****\n");
        for(int i = 0; i < linksCiencias.size(); i++) {
          System.out.println("\n"+linksCiencias.get(i));
        }
        tecleParaVoltar();
        break;
      case 4:
        System.out.println("\n--------------------------------------------------------------------------------------------\n");
        System.out.println("****CONTEUDOS EXTRAS DE HISTÓRIA****\n");
        for(int i = 0; i < linksHistoria.size(); i++) {
          System.out.println("\n"+linksHistoria.get(i));
        }
        tecleParaVoltar();
        break;
      case 5:
        System.out.println("\n--------------------------------------------------------------------------------------------\n");
        System.out.println("****CONTEUDOS EXTRAS DE ED. FÍSICA****\n");
        for(int i = 0; i < linksEdFisica.size(); i++) {
          System.out.println("\n"+linksEdFisica.get(i));
        }
        tecleParaVoltar();
        break;
			case 6:
				sair = true;
				break;
      default:
				System.out.println("\n---------------------------------------------------------------------\n");
				System.out.println("****Opção invalida!****");
				System.out.println("\nDigite uma opção valida citada no menu.\n");
				System.out.println("\n---------------------------------------------------------------------\n");
			}
		} while (sair == false);
	}

  //mostra as ultimas pontuações do usuario em cada um dos testes.
  static void ultimasPontuacoes() {
    System.out.println("\n--------------------------------------------------------------------------------------------\n");
		System.out.println("****ULTIMAS PONTUAÇÕES****\n");
    System.out.println("Ultima pontuação em Matematica: " + pontuacaoFinalMatematica);
    System.out.println("Ultima pontuação em Português: " + pontuacaoFinalPortugues);
    System.out.println("Ultima pontuação em Ciências: " + pontuacaoFinalCiencias);
    System.out.println("Ultima pontuação em História: " + pontuacaoFinalHistoria);
    System.out.println("Ultima pontuação em Ed. Física: " + pontuacaoFinalEdFisica);
		tecleParaVoltar();
	}
  
  // função de parada que solicita que o usuario tecle enter duas vezes para seguir.
	public static void tecleParaContinuar() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\n|=======================================|");
		System.out.println("| Tecle enter duas vezes para continuar |");
		System.out.print("|=======================================|\n");
		try {
			System.in.read();
			entrada.nextLine();
		} catch (Exception e) {
		}
	}
  
  // função de parada que solicita que o usuario tecle enter duas vezes para seguir para a voltar.
	public static void tecleParaVoltar() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\n|============================================|");
		System.out.println("| Tecle enter duas vezes para voltar ao menu |");
		System.out.println("|============================================|\n");
		try {
			System.in.read();
			entrada.nextLine();
		} catch (Exception e) {
		}
	}
}