package D19OOP;

public class Child extends Parent {


@Override
public Integer multiply(Integer a, Integer b) {

 Integer s = super.multiply(5,6);//super çağrısı ile parent classtaki metodu çagırıp
    // kendi istediğimiz şekilde override ettik önceki metoduu bir daha yaznak zorunda klmadık
 return s + 30 ; //işlevselli ekledik +30 gibi kendi istediğimiz şekilde etodu değiştirdik;
}


















}
