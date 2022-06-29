public class MobileMembers extends Members{
    public MobileMembers(String userName, String email, Funcoes funcao, Turnos turno) {
        super(userName, email, funcao, turno);
        //TODO Auto-generated constructor stub
        setMensagemRegular(mensagemRegular);
        setMensagemExtra(mensagemExtra);
    }

    private final String mensagemExtra = "MAsK_S0c13ty";

    private final String mensagemRegular = "Happy Coding!";
    
}