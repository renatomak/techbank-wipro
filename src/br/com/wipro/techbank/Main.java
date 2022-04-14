package br.com.wipro.techbank;

public class Main {

    public static void main(String[] args) {
//        System.out.println("REnato ");
        
        Client junior = new Client(1L, "Junior", "816.413.864.98", "(13)99183-6713", "junior007@gmail.com");
        SpecialAccount sAccount = new SpecialAccount(1L,500.0,junior,"15456487879",500.00);
        
        Client luna = new Client(1L, "Luna", "786.113.464.00", "(13)99183-6713", "luna@gmail.com");
        SpecialAccount sAccount2 = new SpecialAccount(1L,500.0,luna,"15456487879",500.00);
        
        System.out.println("###### Saque Conta 1#######\n");
        sAccount.withDraw(510.00);
        
        System.out.println("###### TRANSFERENCIA de Conta 1 para Conta 2#######");
        System.out.println("Saldo Conta 2 antes da Transferência:  " +  sAccount2.getBalance() +"\n \n");
        
        System.out.println("Informações Conta 1 após a operação:");
        sAccount.transfer(80.00, sAccount2);
        System.out.println("\nSaldo Conta depois da Transferência: " +  sAccount2.getBalance());
        
    }
}
