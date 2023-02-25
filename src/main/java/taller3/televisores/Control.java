package taller3.televisores;

public class Control {
    private TV tv;

    public void turnOn() {
        tv.turnOn();
    }

    public void turnOff() {
        tv.turnOff();
    }

    public void canalUp(){
        tv.canalUp();
    }

    public void canalDown(){
        tv.canalDown();
    }

    public void volumenUp(){
        tv.volumenUp();
    }

    public void volumenDown(){
        tv.volumenDown();
    }

    public void setCanal(int c) {
        tv.setCanal(c);
    }

    public void enlazar(TV televisor){
        this.tv = televisor;
        televisor.setControl(this);
    }

    public TV getTv(){
        return tv;
    }
    
    public void setTv(TV tv) {
        this.tv=tv;

    }
}
