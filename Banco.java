import java.util.Scanner;
import java.util.Random;

public class Banco {

        public static void main(String[] args){
      
               String nome;
               double inicial;
               Scanner entrada = new Scanner(System.in);
               Random numero = new Random();
               int conta = 1 + numero.nextInt(9999);
               double saldo=0;
               int saques=0;
               int opcao;
               double valor;

               System.out.println("Cadastrando novo cliente.");
               System.out.print("Entre com seu nome: ");
               nome = entrada.nextLine();
                                                                                                             
               System.out.print("Entre com o valor inicial depositado na conta: ");
               inicial = entrada.nextDouble();
             
               saldo=inicial;

               do{
               System.out.println("\t Escolha a opção desejada");
               System.out.println("1 - Consultar Extrato");
               System.out.println("2 - Sacar");
               System.out.println("3 - Depositar");
               System.out.println("4 - Sair\n");
               System.out.print("Opção: ");

               opcao = entrada.nextInt();

               switch(opcao){
                               
                       case 1:    
                               System.out.println("\tEXTRATO");
                               System.out.println("Nome: " + nome);
                               System.out.println("Número da conta: " + conta);
                               System.out.printf("Saldo atual: %.2f\n", saldo);
                               System.out.println("Saques realizados hoje: " + saques + "\n");
                               break;
                               
                       case 2: 
                               if(saques<3){
                                       System.out.print("Quanto deseja sacar: ");
                                       valor = entrada.nextDouble();

                                       if(saldo >= valor){
                                        
                                               saldo -= valor;
                                               saques++;
                                               System.out.println("Sacado: " + valor);
                                               System.out.println("Novo saldo: " + saldo + "\n");
                                       } else {
                                               System.out.println("Saldo insuficiente. Faça um depósito\n");
                                       }
                               } else{
                                       System.out.println("Limite de saques diários atingidos.\n");
                               }
                               break;
                                                                                                                           
                       case 3:
                               System.out.print("Quanto deseja depositar: ");
                               valor = entrada.nextDouble();
                               saldo += valor;
                               System.out.println("Depositado: " + valor);
                               System.out.println("Novo saldo: " + saldo + "\n");
                               break;
                               
                       case 4: 
                               System.out.println("Sistema encerrado.");
                               System.out.println("\nObrigado pela preferencia!");
                               break;
                               
                       default:
                               System.out.println("Opção inválida");
               }

        }while(opcao!=4);
            
        
}
}


