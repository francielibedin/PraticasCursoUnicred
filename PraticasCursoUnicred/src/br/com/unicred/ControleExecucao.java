package br.com.unicred;

public class ControleExecucao {
    
    public static void main(String[] args) {
        
        ContaCorrente objContaLeonardo;
        objContaLeonardo = new ContaCorrente("1234-5"); //ou as duas linhas acima tbm podem ser assim: linha abaixo
        
        ContaCorrente objContaThiago = new ContaCorrente("6789-0");
        
        System.out.println("Instanciamos contas.");
        
        //objContaLeonardo.setNumeroConta("1234-5");
        String numero = objContaLeonardo.getNumeroConta();
        System.out.println("O numero do Leonardo �: " + numero);
        
        objContaThiago.numeroConta = "123";
        
        System.out.println(objContaLeonardo.getQtdeContas());//n�o seria o correto pq pega de conta a classe conta corrente e n s� do leonardo
        System.out.println(ContaCorrente.getQtdeContas()); //est� seria a forma mais correta, considenrando todas as contas
    }

}
