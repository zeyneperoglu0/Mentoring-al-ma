package weekendcollections;

public class Polymorphism {
/*
    Polymorphism ve metod çağrısı mantığı
1️⃣ Tanımlar
    B obj = new C();


    B → compile-time tipi (derleyiciye görünür)

    C → runtime tipi / gerçek obje tipi

2️⃣ Metod çağrısı kuralları
    Durum	Hangi metod çalışır?	Açıklama
    Metod C tarafından override edilmişse	C’nin metodu	Runtime objesine göre çağrılır (dynamic dispatch)
    Metod override edilmemişse B’de varsa	B’nin metodu	Runtime’da B’deki metot çalışır
    Metod sadece C’de varsa	❌ Çağrılamaz	Compile-time error (obj’nin tipi B olduğu için)
    Metod interface’de tanımlı ve C override ettiyse	C’nin metodu	Runtime objesine göre çalışır
    Metod interface’de tanımlı ama C override etmediyse	B veya default metod	Override yoksa üst sınıf veya default metod çalışır
    */

}
