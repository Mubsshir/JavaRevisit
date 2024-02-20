package Shapes;

import java.util.Objects;

public class Rectangle {
    private Integer width;
    private  Integer breath;
    public Rectangle(){
        width=1;
        breath=1;
    }
    public  Rectangle(int breath , int width){
        this.breath=breath;
        this.width=width;
    }
    public Integer getBreath() {
        return breath;
    }

    public Integer getWidth() {
        return width;
    }

    public void setBreath(Integer breath) {
        this.breath = breath;
    }

    public  void setWidth(Integer breath){
        this.width=breath;
    }

    public  Integer getArea(){
        return  this.breath*this.width;
    }
    public Boolean isSquare(){
        return Objects.equals(this.width, this.breath);
    }
}
