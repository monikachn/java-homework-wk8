package homeworkwk8;

public class Programme_16_Point {
    int x;
    int y;

    public Programme_16_Point(){
        this.x=0;
        this.y=0;

    }
    public Programme_16_Point(int x, int y){
        this.x=x;
        this.y=y;

    }
    public int getX(){

        return x;
    }
    public int getY(){

        return y;
    }
    public void setX(int x){

        System.out.println(x);
    }
    public void setY(int y){

        System.out.println(y);
    }
    public double distance(){

        return Math.sqrt((this.x-0)*(this.x-0)+(this.y-0)*(this.y-0));
    }
    public double distance(int x, int y){

        return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
    }
    public double distance(Programme_16_Point point){

        return distance(point.getX(), point.getY());
    }

    public static void main(String[] args) {
        Programme_16_Point first = new Programme_16_Point(6, 5);
        Programme_16_Point second = new Programme_16_Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Programme_16_Point point = new Programme_16_Point();
        System.out.println("distance()= " + point.distance());
    }
}
