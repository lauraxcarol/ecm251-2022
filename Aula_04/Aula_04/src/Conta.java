public class Conta {
    // Atributos da nossa classa
    int numero;
    String titular;
    double saldo;
    String cpf;

    // Métodos de classe
    void visualizarSaldo(){
        // Adicionar um comportamento
        // This é a auto-referência
        System.out.println("Saldo atual na conta " + numero + ": R$" + saldo);
    }
    void depositar(){}
    void sacar(){}
    void transferirDinheiro(){}

}
