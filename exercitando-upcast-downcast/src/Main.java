public class Main {
    public static void main(String[] args) throws Exception {
        
        Funcionario funcionario = new Funcionario();

        // upcast:
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Funcionario caixa = new Caixa(); 'testando a herança'

        // downcast:
        //Gerente gerente = new Funcionario();
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
