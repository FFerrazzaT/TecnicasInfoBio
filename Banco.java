import java.util.Scanner;
import java.util.Random;

public class Banco {

        //Variaveis
        
        public String nome;
        public double inicial=0;
        Scanner entrada = new Scanner(System.in);
        public double saldo=0;
        public int saques=0;
        public int opcao;
        public double valor;
        Random numero = new Random();
        int conta = 1 + numero.nextInt(9999);

      
        public static void main(String[] args){

               Banco nova=new Banco();
               nova.CadastroInicial();
               nova.Tela();

        }
        
        public void CadastroInicial(){

                //Cadastro do cliente
               System.out.println("Cadastrando novo cliente.");
               System.out.print("Entre com seu nome: ");
               nome = entrada.nextLine();
                                    
               //Deposito inicial
               System.out.print("Entre com o valor inicial depositado na conta: ");
               inicial = entrada.nextDouble();
               saldo=inicial;
        }

        public void Tela(){

                       do{
             
                               System.out.println("\n\t Escolha a opção desejada");
                               System.out.println("1 - Consultar Extrato");
                               System.out.println("2 - Sacar");
                               System.out.println("3 - Depositar");
                               System.out.println("4 - Sair\n");
                               System.out.print("Opção: ");
                               opcao = entrada.nextInt();
              
                               switch(opcao){
                                       
                                               //Extrato
                                       case 1:    
                             
                                               RetirarExtrato();
                                               break;
                             
                                               //Saque
                                       case 2:

                                               SaqueValor();
                                               break;
                                      
                                               //Deposito
                                       case 3:
                           
                                               IniciarDeposito();
                                               break;
                            
                                               //Saida do programa
                                       case 4: 
                              
                                               System.out.println("Sistema encerrado.");
                                               System.out.println("\nObrigado pela preferencia!");
                                               break;
                               
                                       default:
                                               System.out.println("Opção inválida");
                               }

                       }while(opcao!=4);
        }

        public void RetirarExtrato(){

                       System.out.println("\n\tEXTRATO");
                       System.out.println("Nome: " + nome);
                       System.out.println("Número da conta: " + conta);
                       System.out.printf("Saldo atual: %.2f\n", saldo);
                       System.out.println("Saques realizados hoje: " + saques + "\n");
        }

        public void SaqueValor(){

                       if(saques<3){
                       
                               System.out.print("Quanto deseja sacar: ");
                               valor = entrada.nextDouble();
                               
                               if(saldo >= valor){
                                        
                                       saldo -= valor;
                                       saques++;
                                       System.out.println("Sacado: " + valor);
                                       System.out.println("Novo saldo: " + saldo + "\n");
                               }
                               
                               else {
                                       System.out.println("Saldo insuficiente. Faça um depósito\n");
                               }
                       } 

                       else{
                               System.out.println("Limite de saques diários atingidos.\n");
                       }
        }

        public void IniciarDeposito(){

                       System.out.print("Quanto deseja depositar: ");
                       valor = entrada.nextDouble();
                       saldo += valor;
                       System.out.println("Depositado: " + valor);
                       System.out.println("Novo saldo: " + saldo + "\n");
                       
        }

}
