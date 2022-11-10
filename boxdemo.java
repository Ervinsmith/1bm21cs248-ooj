class box{
double width;
double height;
double length;
}

class boxdemo{
public static void main(String args[]){
box mybox1=new box();

mybox1.width = 10.0;
mybox1.height = 20.0;
mybox1.length = 30.0;
System.out.println("Width of mybox1 is" + " " + mybox1.width);
System.out.println("Height of mybox1 is" + " " + mybox1.height);
System.out.println("Lenght of mybox1 is " + mybox1.length);
}
}