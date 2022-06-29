public class BigBrothers extends Members{
    public BigBrothers(String userName, String email, Funcoes funcao, Turnos turno) {
        super(userName, email, funcao, turno);
        //TODO Auto-generated constructor stub
        setMensagemRegular(mensagemRegular);
        setMensagemExtra(mensagemExtra);
    }

    private final String mensagemExtra = "...";

    private final String mensagemRegular = "Sempre ajudando as pessoas membros ou não S2!";
    
}