
public class UnLaboratorio
{
   public static void main(String[] args){
       Laboratorio unLabo = new Laboratorio("Colgate S.A.", "Junín 5204", "54-11-4239-8447",5,3);
       String info = unLabo.mostrar();
       System.out.println(info);
   }
}
