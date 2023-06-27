package entities;

public class Rectangle {

public double width;
public double height;

public double area, perimeter, diagonal;

public double area(){
    this.area = width*height;
    return area;
}

public double perimeter(){
    this.perimeter =  width*2+height*2;
    return perimeter;
}

public double diagonal(){
    this.diagonal =  Math.sqrt(Math.pow (width,2) + (Math.pow (height,2)));
    return diagonal;
}

public String toString(){

    return "AREA = " + String.format("%.2f\n", area)
            + "PERIMETER = " + String.format("%.2f\n", perimeter)
            + "DIAGONAL = " + String.format("%.2f\n", diagonal);

}

}
