package D19OOP;

public class Civic extends Honda {// henüz abstract methodu kullanmadığımız için ilk başta hata alırız.

    //abstract methodu override edelim



    //override ettik ve hata kalktı
    @Override
    public void engine() {
        System.out.println("Gas 1.6 Eco");}


        //istersek abstract olmayan methodu da override edebiliriz

       @Override
        public void music () {
            System.out.println("Normal system");
        } //BUNU NİYE YAPAMADIK


}
