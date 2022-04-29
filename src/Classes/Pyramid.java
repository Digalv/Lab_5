package Classes;

public final class Pyramid extends Square{
    private int h;

    public int getH() {
        return h;
    }

    public void setH(int h) {
        if(h > 0){
            this.h = h;
        }
        else{
            this.h = 1;
        }
    }

    public Pyramid(int side, int h) {
        super(side);
        this.setH(h);
    }

    public double getApophem(){
        return Math.sqrt((Math.pow(this.side/2f, 2)) + (h*h));
    }

    public float getS(){
        return (float) (super.getS() + (2*side*getApophem()));
    }

    public float getV(){
        return (1/3f) * h * super.getS();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", h= " + this.getH() +
                ", apophem= " + this.getApophem() +
                ", v= " + this.getV();
    }
}