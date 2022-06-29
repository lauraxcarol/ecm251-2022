public class ScriptGuys extends Members{
    public ScriptGuys(String userName, String email, Funcoes funcao, Turnos turno) {
        super(userName, email, funcao, turno);
        //TODO Auto-generated constructor stub
        setMensagemRegular(mensagemRegular);
        setMensagemExtra(mensagemExtra);
    }
    
    private final String mensagemExtra = "QU3Ro_S3us_r3curs0s.py";
    
    private final String mensagemRegular = "Prazer em ajudar novos amigos de codigo!";
    
}