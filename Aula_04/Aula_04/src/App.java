public class App {
    public static void main(String[] args) throws Exception {
       // Declara um objeto do tipo Conta
        Conta minhaConta;

        // Instanciar em objeto do tipo Conta
        minhaConta = new Conta();

        // Declarou e instanciou um objeto do tipo Conta
        Conta outraConta = new Conta();

        minhaConta.saldo = 200.0;
        minhaConta.numero = 1234;
        outraConta.saldo = 150.0;
        outraConta.numero = 5678;

        System.out.println("Saldo na minhaConta:");
        // Traz o comportamento de visualizarSaldo
        minhaConta.visualizarSaldo();
        System.out.println("Saldo na outraConta:");
        outraConta.visualizarSaldo();
    }
}
