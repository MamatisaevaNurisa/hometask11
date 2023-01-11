public class triangle {

    int a;

    int b;
    int c;



     double area (){

    double p = (a+b+c)/2d;
    double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    System.out.println("Uch burchtuktun ayanty : " +s);

    return p;


}

}
