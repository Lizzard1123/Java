package helpers;

public class PreciseCoords {
    //in
    private double x;
    private double y;
    public double radius = 3;

    public PreciseCoords(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public String toString(){
        return "Drone at X: " + x + ", Y: " + y;
    }

    public int hashCode(){
        return (int) (Math.pow(x, 2) + Math.pow(y, 2));
    }

    public boolean equals(Object other){
        if(other == null){
            return false;
        }
        PreciseCoords others = (PreciseCoords) other;
        return this.x == others.getX() && this.y == others.getY();
    }
}
