class box{
double width,height,length;

void setDim(double w, double h, double l){
width=w;height=h;length=l;
}
double volume(){
return width*height*length;
}
}

class boxdemo2{
public static void main(String args[]){
box mybox1 = new box();
box mybox2 = new box();

mybox1.setDim(10,20,30);
mybox2.setDim(10,5,4);

System.out.println("Volume of mybox1 is " + mybox1.volume());
System.out.println("volume of mybox2 is " + mybox2.volume());
}
}