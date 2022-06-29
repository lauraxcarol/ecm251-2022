public abstract class Members implements PrintMensagem{
    private String  mensagemRegular;
    private String  mensagemExtra;
    private String  userName;
    private String  email;
    private Funcoes funcao;
    private Turnos  turno;
    

    public Members(String userName, String email, Funcoes funcao, Turnos turno) {
        
        this.userName = userName;
        
        this.email = email;

        this.funcao = funcao;

        this.turno = turno;
    }

    public String getMensagemRegular() {
        return mensagemRegular;
    }


    public void setMensagemRegular(String mensagemRegular) {
        this.mensagemRegular = mensagemRegular;
    }


    public String getMensagemExtra() {
        return mensagemExtra;
    }


    public void setMensagemExtra(String mensagemExtra) {
        this.mensagemExtra = mensagemExtra;
    }


    
    public String getNomeUsuario() {
        return userName;
    }


    public void setNomeUsuario(String userName) {
        this.userName = userName;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public Funcoes getFuncao() {
        return funcao;
    }
    
    
    public void setFuncao(Funcoes funcao) {
        this.funcao = funcao;
    }
    
    
    public Turnos getTurno() {
        return turno;
    }


    public void setTurno(Turnos turno) {
        this.turno = turno;
    }


    
    public void imprimirMensagem(){

        if(this.getTurno().equals(Turnos.REGULAR)){
            System.out.println("- User do membro: " + getNomeUsuario() +  "\n- E-mail: " + getEmail() + "\n- Função: " + getFuncao() + "\n- Mensagem: "+getMensagemRegular() + "\n");
        }
        
        else{
            System.out.println("- User do membro: " + getNomeUsuario() + "\n- Função: " + getFuncao() + "\n- Mensagem: "+getMensagemExtra() + "\n");
        }
    }
}