import java.util.ArrayList;

public class App {

    private static Turnos turnoAtual = Turnos.REGULAR;

    public static Turnos getTurnoAtual() {
        return turnoAtual;
    }

    public static void setTurnoAtual(Turnos turnoAtual) {
        App.turnoAtual = turnoAtual;
    }

    public static void PostarMensagem(ArrayList<Members> AllMembers){
        for (Members member : AllMembers){
            member.imprimirMensagem();
        }

    }

    public static void mudarTurno(Turnos turno, ArrayList<Members> AllMembers){
        setTurnoAtual(turno);
        for (Members member : AllMembers){
            member.setTurno(turno);
        }
    }

    public static void main(String[] args) throws Exception {
        
        ArrayList<Members> TodosMembros = new ArrayList<Members>();

        TodosMembros.add(new BigBrothers("B4n4n4", "bananinha@maua.br",
        Funcoes.BIGBROTHERS, turnoAtual));
        
        TodosMembros.add(new MobileMembers("M4ca", "macadamonica@maua.br",
        Funcoes.MOBILEMEMBERS, turnoAtual));
        
        TodosMembros.add(new HeavyLifters("M0r4ng0", "moranguinho@maua.br",
        Funcoes.HEAVYLIFTERS, turnoAtual));

        TodosMembros.add(new HeavyLifters("4b4cax1", "abacaxis@maua.br",
        Funcoes.HEAVYLIFTERS, turnoAtual));
        
        TodosMembros.add(new ScriptGuys("P3ra", "peraai@maua.br",
        Funcoes.SCRIPTGUYS, turnoAtual));
    
        
        TodosMembros.add(new ScriptGuys("C3rej4", "cereja@maua.br",
        Funcoes.SCRIPTGUYS, turnoAtual));
        



        System.out.println("Turno: " + turnoAtual + "\n");

        PostarMensagem(TodosMembros);




        mudarTurno(Turnos.EXTRA, TodosMembros);
        System.out.println("\n" + "Turno: " + turnoAtual + "\n");

        PostarMensagem(TodosMembros);




        mudarTurno(Turnos.REGULAR, TodosMembros);
        System.out.println("\n" + "Turno: " + turnoAtual + "\n");
        

        RemoverMembro(Funcoes.SCRIPTGUYS, null, TodosMembros);
        RemoverMembro(Funcoes.HEAVYLIFTERS, null, TodosMembros);

        PostarMensagem(TodosMembros);

        System.out.println("\nTodos usuários cadastrados/removidos com sucesso!\nHora de encerrar o sistema...");



        //mudarTurno(Turnos.EXTRA, TodosMembros);
        //System.out.println("\n" + "Turno: " + turnoAtual + "\n");

        //PostarMensagem(TodosMembros);

    }

    public static void RemoverMembro(Funcoes scriptguys, Funcoes heavylifters, ArrayList<Members> TodosMembros){
        int i = 0;
        int remover = 0;
        for (Members member : TodosMembros){

            if(member.getFuncao().equals(scriptguys) || member.getFuncao().equals(heavylifters)){
                remover = i;
            }

            i++;
        }
        TodosMembros.remove(remover);
     }

}
