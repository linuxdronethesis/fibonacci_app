package sample;

public class Fibonacci{
    private int f;
    private int f_previous;
    private int f_2previous;
    private int index;

    public Fibonacci(){
        this.f=0 ;
        this.f_previous = 0;
        this.f_2previous = 0;
        this.index=0;
    }

    public int getNumber(){return this.f;}

    public void update(){
        if (this.index == 0) {
            this.f_previous = 0;
            this.f_2previous = 0;
            this.f = 1;
        }
        else {
            this.f_2previous = this.f_previous;
            this.f_previous = this.f;
            this.f = this.f_previous + this.f_2previous;
        }
        this.index += 1;
    }

    public void reset() {
        this.f=0 ;
        this.f_previous = 0;
        this.f_2previous = 0;
        this.index = 0;
    }
}
