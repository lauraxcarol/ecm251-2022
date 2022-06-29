public class HeavyLifters extends Members{
    public HeavyLifters(String userName, String email, Funcoes funcao, Turnos turno) {
        super(userName, email, funcao, turno);
        //TODO Auto-generated constructor stub
        setMensagemRegular(mensagemRegular);
        setMensagemExtra(mensagemExtra);
    }

    private final String mensagemExtra = "N00b_qu3_n_Se_r3pita.bat";

    private final String mensagemRegular = "Podem Contar Conosco!";

}