public interface PrintMensagem {
    public static String mandarMensagem(Members member){
       
        if (member.getTurno().equals(Turnos.REGULAR)){
           System.out.println(member.getMensagemRegular());
           return member.getMensagemRegular();
       }
       
       else{
           System.out.println(member.getMensagemExtra());
           return member.getMensagemExtra();
       }
   }
   
}