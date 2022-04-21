import java.util.Scanner;
public class ControleRemoto {
    
    Scanner c1 = new Scanner(System.in);

    private int volume, canal;
    public ControleRemoto(){

    }

    public int getCanal(){
        return this.canal;
    }
    public void setCanal(int canal){
        this.canal = canal;
    }

    void AumentarVolume(){
        if(this.volume < 100)
            this.volume++;
        else
            System.out.println("Volume no Máximo");
    }
    void DiminuirVolume(){
        if(this.volume > 1)
            this.volume--;
        else
            System.out.println("Volume no Mínimo");
    }
    void AumentarCanal(){
        if(this.canal < 50)
            this.canal++;
        else
            this.canal = 1;

    }
    void DiminuirCanal(){
        if(this.canal > 1)
            this.canal--;
        else
            this.canal = 50;
    }
    void CanalIncicado(){
        System.out.println("Canal desejado: ");
        int canal = c1.nextInt();
    }
    void ImprimeVolume(){
        System.out.println("Volume: "+ volume);
    }
    void ImprimeCanal(){
        System.out.println("Canal: "+ canal);
    }
}
