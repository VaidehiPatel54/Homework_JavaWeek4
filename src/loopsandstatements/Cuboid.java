package loopsandstatements;
/* 2. Write a class with the name Cuboid that extends Rectangle class. The class needs one field
(instance variable) with name height of type double.
The class needs to have one constructor with three parameters width, length, and height all of type
double. It needs to call the parent constructor and initialize a height field.
In case the height parameter is less than 0 it needs to set the height field value to 0.
Write the following methods (instance methods):
● Method named getHeight without any parameters, it needs to return the value of height
field.
● Method named getVolume without any parameters, it needs to return the calculated volume.
To calculate volume multiply the area with height.
*/
public class Cuboid extends Rectangle {  //Child class extends Parent class

    double height;                        //instance variable

    public Cuboid(double width, double length, double height) {     //constructor with parameters
        super(width, length);
        if (height<0){
            this.height=0;
        }else
            this.height = height;
        }
        public double getHeight(){              //method with return type without any parameters,
        return this.height;
    }
    public double getVolume(){                  //method with return type without any parameters,
        double volume = (getArea()*height);
        return volume;
    }
}