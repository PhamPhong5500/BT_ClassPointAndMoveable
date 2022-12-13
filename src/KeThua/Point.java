package KeThua;

public class Point {
    private float x;
    private float y;

    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX(){
        return x ;
    }
    public void setX(float x){
        this.x = x;
    }
    public float getY(){
        return y ;
    }
    public void  setY(float y){
        this.y = y;
    }
    public void setXY(float x, float y){
        setX(x);
        setY(y);
    }
    public float[] getXY(){
        float[] array = { getX(), getY()};
        return array;
    }
    @Override
    public String toString () {
        return "Một điểm có tọa độ x là : "
                +getX()
                +", có tọa độ y là : "
                +getY();
    }

}
