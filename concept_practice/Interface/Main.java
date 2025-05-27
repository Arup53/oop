public class Main{
    public static void main(String[] args){
        Tacobox tacoPractical= new TripleTacoBox();
        System.out.println(tacoPractical.tacosRemaining());
        tacoPractical.eat();
        System.out.println(tacoPractical.tacosRemaining());
    }
}

// -------- Task-1 ----------
interface Tacobox{
    int tacosRemaining();
    void eat();
}

class TripleTacoBox implements Tacobox{
    private int tacos;

    public TripleTacoBox(){
        this.tacos=3;
    }

    public int tacosRemaining(){
        return this.tacos;
    }

    public void eat(){
        if(this.tacos>0){
            this.tacos--;
        }
    }

}

class CustomTacoBox implements Tacobox{
    private int tacos ;
    public CustomTacoBox(int tacos){
        this.tacos=tacos;
    }
    public int tacosRemaining(){
        return this.tacos;
    }

    public void eat(){
        if(this.tacos>0){
            this.tacos--;
        }
    }
}