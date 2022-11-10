class box{
double width,height,length;

double volume(){
return width*height*length;
}
}

class boxdemo1{
public static void main(String args[]){
box mybox1 = new box();

mybox1.width=10.0;
mybox1.height=20.0;
mybox1.length=30.0;

double vol=mybox1.volume();
System.out.println("Volume of mybox1 is " + vol);

box mybox2=new box();

mybox2.width=20.0;
mybox2.height=5.0;
mybox2.length=10.0;
System.out.println("Volume of mybox2 is " + mybox2.volume());
}
}