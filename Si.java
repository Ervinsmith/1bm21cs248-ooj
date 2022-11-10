class si{
double principle,time,rate;

void setvalues(double p, double t, double r){
principle = p; time = t; rate = r;
}
double SI(){
return principle*time*rate/100;
}
}

class SimpleInterest{
public static void main(String args[]){
si si1 =new si();

si1.setvalues(10,5,3);

System.out.println("Simple Interest of si1 is " + si1.SI());
}
}