public class caneta {
    private   String modelo;
    private float ponta;
    private  boolean tampada;
    private String cor;

    public   caneta(String m, String c, float p){ // este é o metodo construtor
        this.modelo =m;
        this.cor= c;
        this.ponta = p;
        this.tampar();

    }


    public String getModelo(){
        return this.modelo;
    }
    public void  setModelo (String m){
        this.modelo = m;
    }

    public  float getPonta(){
        return this.ponta;

    }
    public  void setPonta(float p){
        this.ponta = p;
    }
    public void tampar(){
        this.tampada =true;
    }
    public void destampar(){
        this.tampada =false;
    }

    public  void  status(){
        System.out.println("Sobre a caneta");
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Ponta: " +this.ponta);
        System.out.println("A Cor é "+this.cor);
        System.out.println("Tampanda: "+this.tampada);
    }


}
