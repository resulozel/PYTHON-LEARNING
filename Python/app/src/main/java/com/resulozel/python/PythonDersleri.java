package com.resulozel.python;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PythonDersleri extends Activity {
    TextView kotlinDersNedirDetay,kotlinDersNedirDetay2;
    ImageView imageView1,imageView2;
    String detaylar = "";
    String detaylar2 = "";
    String kotlin_nedir_ders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.python_dersleri_detay);


        kotlinDersNedirDetay = (TextView) findViewById(R.id.python_ders_bilgi_detay);
        kotlinDersNedirDetay2 = (TextView) findViewById(R.id.python_ders_bilgi_detay2);
        imageView1 = (ImageView) findViewById(R.id.python_ders_picture1);
        imageView2 = (ImageView) findViewById(R.id.python_ders_picture2);

        Intent intent = getIntent();

        kotlin_nedir_ders = intent.getStringExtra("kotlinders_adi");




        if (kotlin_nedir_ders.equals("1# Hello World")) {
            imageView1.setImageResource(R.drawable.pythonresim);
            detaylar ="Python da Hello World yazdırarak dersimize başlıyoruz.\n"+
                    "Python da ekrana bilgi yazdırmak için print()fonksiyonu kullanılır.\n"+
                    "Söz dizimi Kotlin diline çok benzemektedir.\n"+
                    "Kotlin dilindeki gibi noktalama işaretlerine hassiyet düşük seviyededir.";
            imageView2.setImageResource(R.drawable.ornek1b);
            detaylar2="Diğer dillere göre oldukça kısa ve anlaşılması kolay bir söz dizimine sahip" +
                    " olduğu örneğimizden anlaşılıyor.\n"+
                    "Bir alt satıra inmek için Println() fonksiyonu kullanılmaz.";

        }

        else  if (kotlin_nedir_ders.equals("2# Veri Tipleri")) {
             imageView1.setImageResource(R.drawable.pythonresim);
            detaylar ="Değişken tanımlarında diğer diller de olduğu gibi tip belirtmeye gerek yoktur." +
                    " Bu durumun üstesinden Python kendisi gelir. Python atama yapıldığı anda değişkenin tipini otomatik olarak belirler. ";
            imageView2.setImageResource(R.drawable.ornek2b);
            detaylar2="Bu örnekte değişken oluşturup yazilimsanati değerini atayarak ifadenin karakterlerini teker teker yazdırıyoruz.";


        }

        else if (kotlin_nedir_ders.equals("3# Matematiksel İşlemler")) {
            imageView1.setImageResource(R.drawable.pythonresim);
            detaylar ="Python  ile Matematiksel işlemler yaparak dersimize devam ediyoruz. Matematiksel işlemler herkesin bildigi gibi operatörleri vardır." +
                    "+,-,/,*,% operatörlerini kullanarak işlemler yaparız.";


            imageView2.setImageResource(R.drawable.ornek3b);
            detaylar2="Burada ilk önce basit bir toplama işlemi yapılarak sonra bazı değişken değerleri verilerek toplama,çıkarma,çarpma  ve bölme yapılmıştır.";

        }

        else if (kotlin_nedir_ders.equals("4# Klavyeden Veri Alma")) {
             imageView1.setImageResource(R.drawable.pythonresim);
            detaylar ="Klavyeden veri almak çok pratiktir. Bazı dillerde olduğu  uzun uzun kod satırları yazmak eskide kaldı\n"+
            "input fonksiyonu kullanarak istediğimiz değeri alıyoruz ve bu değeri değişkene atıyoruz. Hepsi bu kadar...";

            imageView2.setImageResource(R.drawable.ornek4b);
            detaylar2="Örneğimizde klavyeden veri alma ve veriyi yazma işlemleri yapılmıştır.\n"+
                   " Klavyeden input fonksiyonu ile  adı ve soyadı ifadeleri istenir." +
                    "Ve hangisi değişkene atadıysak o değişkeni yazıp çıktıyı üretiyoruz.";


        }

        else if (kotlin_nedir_ders.equals("5# Tip Dönüşümleri(Type Casting)")) {
            imageView1.setImageResource(R.drawable.pythonresim);
            detaylar ="Tip dönüşümleri bir türde tanımlanmış bir değişken başka bir değişkene" +
                    " toInt veya toString tarzında dönüştürülür.\n"+
                    "Örneğin String olarak tanımladığımız bir değişkeni int yapmak için to.Int() yapmamız gerekiyor.\n" +
                    "Bir başka örnekte int double yapmak için ise to.Double() yapmak gerekiyor.\n" +
                    "to.Float ve to.String tarzında da tanımlayabiliriz.";
            imageView2.setImageResource(R.drawable.ornek5b);
            detaylar2="Tip dönüşleri ile ilgili örneğimizde int ve string türünde iki değişken tanımlanmıştır.\n"+
                    "? değeri tam olarak bilinmediğini ifade etmektedir.Ve null değeri döndürür ta ki değer verene kadar.\n"+
                    "String olan bir değişkeni toInt() metodu ile int türüne dönüştürdü ve x1 değişkenine atandı.\n"+
                    "Double olan bir başka değişken ise yine toInt() metodu ile int türüne dönüştürüldü.\n";


        }

        else if (kotlin_nedir_ders.equals("6# Aritmetik Operatörler")) {
            imageView1.setImageResource(R.drawable.pythonresim);
            detaylar ="Aritmetik operatörlerde 4 tip kullanımı göreceğiz.\n"+
                    "önden arttırma ++x , arkadan arttırma x++ , önden azaltma --x , arkadan azaltma x--\n+" +
                    "2 tip arttırma ve 2 tip azaltma operatörleri aynı işleri yapmaktadır.\n"+
                    "Tek fark önden işlemi yapıp sonraki adıma geçiyor arkadan işlemi ise tam tersi şekilde çalışmaktadır.";
            imageView2.setImageResource(R.drawable.ornek6b);
            detaylar2="Aritmetik Operatörlerle ilgili örneğimizde int türünde bir değişken bulunmaktadır.\n"+
                    "Önden arttırma, önden azaltma ,arkadan arttırma ve arkadan azaltma şeklinde 4 işlem yapılmaktadır.\n" +
                    "İşlemlerin sonucu ise : 11 - 12 - 11 - 10 şeklindedir.\n"+
                    "Bu tarz kullanım bizim açımızdan daha da kullanışlı x+1 yerine x++ yazıyoruz.";


        }


        else if (kotlin_nedir_ders.equals("7# Mantıksal Operatörler")) {
            imageView1.setImageResource(R.drawable.pythonresim);
            detaylar ="Kotlin ile çok basit karşılaştırmalar yapmak mümkündür\n" +
                    "Karşılaştırma yapmak için kullanılan operatörler :\n"+
                    "< ve > işaretleri iki sayıyı karışılaştırmak için kullanılan durumlardandır.\n"+
                    "== ve != durumları bir çok durumda kullanılıp bize eşit ve eşit olmama durumunu inceler.\n"+
                    "=< ve => durumları da hem o sayıya eşit olma hem de onun altı veya üstü durumu için geçerli olduğunda.\n"+
                    "&& ve “|  ve veya kontrolleride birden çok durum için kullanılan yapılardandır.";
            imageView2.setImageResource(R.drawable.ornek7b);
            detaylar2="Mantıksal Operatörlerle ilgili örneğimizde int türünde iki değişken bulunmaktadır.\n"+
                    "Verilen iki sayıyı mantıksal operatörleri kullanarak true veya false elde edildi.\n"+
                    "Büyüktür,küçüktür,eşittir,küçük eşittir,büyük eşittir,eşit değildir,ve,veya ile ilgili örnekler yapılmıştır.";


        }


        else  if (kotlin_nedir_ders.equals("8# İf,Elif,Else Koşulları")) {
             imageView1.setImageResource(R.drawable.pythonresim);
            detaylar ="İf elif koşul ifadeleridir.Elimizdeki verileri karşılaştırırken istenilen adımlara" +
                    " göre koşulumuz if bloğunda ise if çalışır elif bloğunda ise ilk çalışan blok çalışır.\n"+
                    "elif bloğunu zincirleme koşul olarakda belirleyebiliriz.";

            imageView2.setImageResource(R.drawable.ornek8b);
            detaylar2="Örneğimizde kullanıcıdan yaşını girmesi isteniyor. " +
                    "Ve koşulda belirttiğimiz sayıya göre hangisi hangi hangi koşulda büyükse,küçükse ya da eşitse ona göre bir mesaj yazıyor.";


        }


        else if (kotlin_nedir_ders.equals("9# Range(Loop)")) {
            imageView1.setImageResource(R.drawable.pythonresim);
            detaylar = "Range kavramı aralık demektir ve 1 .. 5 ifadesi 1,2,3,4,5 değerlerini ilgili değişkene atar.\n" +
                       "Karakterlerde de range yapısı kullanılabilir.";
            imageView2.setImageResource(R.drawable.ornek9b);
            detaylar2="Range metodu kullanılarak 6'ya kadar olan sayılar basılmıştır. Ve bu sayılar n ifadesine aktarılmıştır.";


        }


        else if (kotlin_nedir_ders.equals("10# For Döngüsü(Loop)")) {
             imageView1.setImageResource(R.drawable.pythonresim);
            detaylar ="For döngüsü diğer dillerdeki gibi kullanılır .\n"+
                    "Tekrar eden yapıları tek bir seferde yapmaya yarar.\n"+
                    "Kod kalabalığı ve okunabirlik açısından For döngüsünü kullanmak daha mantıklıdır.";
            imageView2.setImageResource(R.drawable.ornek10b);
            detaylar2="Bu örneğimizde for döngüsü kullanılarak 0 ve 11 arası sayılar basılmıştır.Range öncekinde anlattığım gibi aralık anlamına gelir.";



        }

        else  if (kotlin_nedir_ders.equals("11# While Döngüsü(Loop)")) {
            imageView1.setImageResource(R.drawable.pythonresim);
            detaylar ="While döngüsü diğer dillerdeki gibi kullanılır .\n"+
                    "While döngüsüde For gibi Tekrar eden yapıları tek bir seferde yapmaya yarar.\n"+
                    "Kod kalabalığı ve okunabirlik açısından while döngüsünü kullanmak daha mantıklıdır.";
            imageView2.setImageResource(R.drawable.ornek11b);
            detaylar2="Bu örneğimizde sayi diye değişkene  değer atayıp hemen sonra while döngüsüne sokarak döndürme işlemi yapılmuştır. " +
                    "Ekrana basılarak çıktı hazırlanmuştır.Çıktıdan hemen sonra bir artırma işlememi vardır. Artırma işlemine göre durum devam eder. ";



        }

        else if (kotlin_nedir_ders.equals("12# Len Kavramı")) {
            imageView1.setImageResource(R.drawable.pythonresim);
            detaylar ="Len komutu metindeki karakter sayısını çıkarır yani listeler.";
            imageView2.setImageResource(R.drawable.ornek12b);
            detaylar2="Bu örneğimde len kullanarak python kelimesinin kaç karakter olduğunu belirledik";


        }

        else if (kotlin_nedir_ders.equals("13# Break")) {
            imageView1.setImageResource(R.drawable.pythonresim);
            detaylar ="Bu kavramların ve kullanım şekillerinin javadan hiç bir farkı yok.\n" +
                    "Bir döngü bloku içinde verilen bir break komutu, döngünün hemen o anda bitirilmesine yol açar.\n" +
                    "continue komutu da, aynı break gibi, sadece bir döngü içinde ve bir if şartı altında mânâ ifade eder.\n" +
                    "continue döngü blokunun işlemesini yarıda keser ve başa döner.\n" +
                    "break‘den farkı, programın döngünün dışına çıkmaması, ama döngünün başına dönmesi ve tekrar başlatmasıdır.\n" +
                    "Bu arada döngü şartının doğru olup olmadığı da kontrol edilir.";
            imageView2.setImageResource(R.drawable.ornek13b);
            detaylar2="Bu örneğimizde break ve continue komutlarının kullanımı incelenmiştir.\n"+
                    "break komutu ondaki değer ile kırar ve programı sonlandırır.\n"+
                    "continue komutu ise o değeri atlayarak devam eder\n"+
                    "Örneğimizde de açıkça görülmektedir.";


        }


        else  if (kotlin_nedir_ders.equals("14# Continue")) {
            imageView1.setImageResource(R.drawable.pythonresim);
            detaylar ="Continue metodu hangi veriyi istiyorsak o veriyi atlamayı sağlar.";
            imageView2.setImageResource(R.drawable.ornek14b);
            detaylar2="Burada continue yapısı kullanarak döngü içinde  range aralığını vererek.\n" +
                    "değerler alıp iki ile bölümünden kalan sıfır ise continue yazarak dediği değeri atlayacaktır.";


        }


        else if (kotlin_nedir_ders.equals("15# Count Metodu")) {
            imageView1.setImageResource(R.drawable.pythonresim);
            detaylar ="Count metosu verileri saydırma yani listeleme metodudur.\n";

            imageView2.setImageResource(R.drawable.ornek15b);
            detaylar2="Bu örneğimizde list yapısının kullanımı incelenmiştir.\n"+
                    "list Liste birden fazla oluşmuş topluluğa denir.\n"+
                    "Açıkca türü string vb olarak belirtilirse ArrayList olmuş olur.\n"+
                    "Eğer listemizin istediğimiz değişkenler üzerinden yapmak istiyorsak\n" +
                    "hashmap kullanmak en iyi çözümlerdendir.";


        }


        else if (kotlin_nedir_ders.equals("16# Fonksiyonlar(Functions)")) {
            imageView1.setImageResource(R.drawable.pythonresim);
            detaylar ="Pythondaki fonksiyon yapısı kotlindeki method yapısı gibidir.\n" +
                    "Fonksiyonlar belli bir işi gerçekleştiren, gerekirse parametre alan ve geriye bir değer döndüren kod yapılarıdır. " +
                    "Uygulama geliştirirken problemi parçalara ayırıp, ham bir parçayı fonksiyonlarla gerçekleştirmek önemlidir.\n" +
                    "Bir fonksiyonun override edilmesi türkçede aşırı yüklenme olarak kullanılır.\n" +
                    "Aynı isimli birden fazla metodun olmasıyla oluşur. Overload metodların ortak özellikleri isimleridir, aralarında farklılıklarsa parametrelerinden kaynaklanır.\n" +
                    "Overload metodların dönüş tipleri aynı olmak zorundadır. Dönüş tipleri aynı olmayan metodlarda hata çıkar.\n" ;
            imageView2.setImageResource(R.drawable.ornek16b);
            detaylar2="Bu def kullanarak yani pythonda fonksiyon yapısı oluşturarak yaptığım örnekte tanimla diye fonksiyon adı alıp," + " ve içine x parametresini gömüyorum.\n" +
                    "parametre aldığı değerlere göre yani return edilerek hangi değeri alacağını çarpılacağı sayı belirleyecektir." +
                    "Sonuç olarak çıktılar ektedir.";


        }

/*
        else  if (kotlin_nedir_ders.equals("17# Aşırı Yükleme(Overloading)")) {
            imageView1.setImageResource(R.drawable.ders17);
            detaylar ="Fonksiyonlar aşırı yükleme (Fonksiyon Overload), bir fonksiyonun farklı sürümlerinin hazırlanmasıdır.\n" +
                    "Bu sürümler, aynı ya da farklı amaçlar ile kullanılabilir ya da farklı tiplerde değerler döndürebilir.\n" +
                    "Overload operasyonunda aynı sayıda ve tipte parametre beklenen iki imza varsa, Aynı imzaya sahip üye daha önce tanımlanmıştır." +
                    " uyarısı alınır, dolayısıyla derleme hatası ortaya çıkar.";
            imageView2.setImageResource(R.drawable.ornek17);
            detaylar2="Burada görüleceği gibi _sum fonksiyonu aşırı yüklenmiş olup\n" +
                    "hangi koşullarda çalıştırılması gerektiği anlatılmıştır.\n" +
                    "Fonksiyonların imzalarına bakılarak çağırılır.\n"+
                    "Kullanım biçimi olarak Java ya çok benzemektedir.\n"+
                    "Fonksiyonlarda işlemler yapılarak print() fonksiyonu kullanılarak ekrana yazdırılmıştır.";


        }

        else  if (kotlin_nedir_ders.equals("18# Çokbiçimlilik(Polymorphism)")) {
            imageView1.setImageResource(R.drawable.ders18);
            detaylar ="Çokbiçimlilik (Polymorphism) bir nesnenin farklı amaçlar için de kullanılabileceği anlamına gelir ve statik ve dinamik olmak üzere ikiye ayrılır.\n" +
                    "Statik çokbiçimlilik; metot ve operatörlerin aşırı yüklenmesi (overload) olarak belirtilir.\n" +
                    "Dinamik çokbiçimlilik; özet sınıflardan miras alma yoluyla işlemlerin gerçekleştirilmesi işlemine verilen isimdir.";
            imageView2.setImageResource(R.drawable.ornek18);
            detaylar2="Bu örneğimizde polimorfizm kullanımı incelenmiştir.\n"+
                    "3 tip fonksiyona farklı parametreler eklenerek çağrılmıştır.\n"+
                    "Farklı amaçlar için kullanılmıştır.\n"+
                    "Örneğimizin çıktısı : veli - 4.5 - 15 şeklindedir."+
                    "Fonksiyon bu özellik ile birden fazla şekle girebilir.  ";


        }

        else if (kotlin_nedir_ders.equals("19# Sınıflar(Classes)")) {
            imageView1.setImageResource(R.drawable.ders19);
            detaylar ="Sınıf (class) yapısının bu sınıftan üretilecek nesneler için bir şablon görevi gördüğünü söyleyebiliriz.\n" +
                    "Nesneleri oluşturmanın ilk adımı, o nesnenin özelliklerini ve eylemlerini belirleyen sınıf yapısını tanımlamaktır.\n +" +
                    "Sınıf içinde özellik tanımlamak için değişkenler, metot tanımlamak için de çeşitli yordamlar bulunabilir.";
            imageView2.setImageResource(R.drawable.ornek19);
            detaylar2="Bu örneğimizde sınıf kullanımı incelenmiştir.\n"+
                    "Araba isminde class oluşturuldu.\n"+
                    "İnit metodu bizim classımızı çağrımamızla çalışan bir yapı olup\n" +
                    "istenilirse constructor metod da yazılabiliyor.\n"+
                    "car1 nesnesi oluşturulmuştur.Bu nesne üzerinden araba sınıfı ile ilgili bilgiler ekrana yazdırılmıştır";

        }


        else  if (kotlin_nedir_ders.equals("20# Kalıtım(Inheritance)")) {
            imageView1.setImageResource(R.drawable.ders20);
            detaylar ="Kotlin, üç tür miras sağlıyor:\n" +
                    "klasik (sınıflar yoluyla), kompozisyon (arabirimler aracılığıyla) ve bu eğitim serisinde kapsanmayan delegasyon.\n" +
                    "Python'dan farklı olarak Kotlin yalnızca tek bir devralma yapar ancak kompozisyonla kısmi kalıtım yapabilir.";
            imageView2.setImageResource(R.drawable.ornek20);
            detaylar2="Bu örneğimizde kalıtımın kullanımı incelenmiştir.\n"+
                    "İşci sınıfı oluşturulmuştur.\n"+
                    "İşcinin adı,soyadı,yaşı,şirketi,mail bilgileri tanımlanmıştır.\n"+
                    "İki sınıf arasında kalıtma yapınca üst sınıfın üyelerine ve nesnelerine erişme sağlayabiliyoruz";


        }

        else if (kotlin_nedir_ders.equals("21# Try-Catch İfadeleri")) {
            imageView1.setImageResource(R.drawable.ders21);
            detaylar ="try bloğu içinde hesaplanacak ifade yer alır." +
                    "Bu ifadenin hesaplanmasında bir hata oluşmamışsa, catch blokları atlanarak programın çalışması finally bloğu ile devam eder ve daha sonra programın bu bloğu izleyen kısmına geçilir.\n" +
                    "try bloğu içindeki işlemde bir hata oluşmuşsa, catch bloklarından hangisi bu hatayı algılayabiliyorsa o catch bloğu içine girilir ve gerekli hata mesajı yazdırılır.\n" +
                    "Daha sonra program finally bloğu ile yukarıda açıklandığı biçimde çalışmaya devam eder.\n" +
                    "NOT: finally bloğu ne olursa olsun çalışacağından burada genellikle try bloğu içinde bellek hatalarına (memory leak gibi) ya da açık kalmış bağlantılara yol açabilecek değişkenler yok edilir.\n" +
                    "Javadan farklı olarak Kotlin’de try / catch yapısı geriye bir değer döndürebilir.";
            imageView2.setImageResource(R.drawable.ornek21);
            detaylar2="Bu örneğimizde try-catch kullanımı incelenmiştir.\n"+
                    "Örneğimizde klavyeden bir sayı girilmesi istenmiştir.\n"+
            "try bloğunda ise girilen değer ekrana yazdırılıyor.\n"+
            "catch bloğunda ise hatanın türü ekrana yazdırılıyor."+
            "Java dan tek farkı geriye bir değer döndürür.";


        }

        else if (kotlin_nedir_ders.equals("22# Diziler(Arrays)")) {
            imageView1.setImageResource(R.drawable.ders22);
            detaylar ="Dizi, bilgisayar belleğinde aynı isim altında genellikle aynı tipten çok sayıda veriyi bir arada saklayan veri yapısıdır." +
                    "Dizinin bir adı ve dizi içerisindeki elemanın dizinin kaçıncı elemanı olduğunu belirten bir indisi (subscript, index) vardır." +
                    "Dizinin indisi Kotlin dilinde daima köşeli parantez ile belirlenir.";
            imageView2.setImageResource(R.drawable.ornek22);
            detaylar2="Bu örneğimizde Arrays kullanımı incelenmiştir.\n"+
                    "Örneğimizde array tanımlıyoruz int türünde değerlerine 0 veriyoruz.\n"+
                    "Dizinin indislerine değerleri atandı.\n"+
                    "For döngüsü ile dizine atanan değerler ekranda gösterildi.\n"+
                    "Dizilerin kullanımı Java diline benzerdir.";


        }

        else  if (kotlin_nedir_ders.equals("23# Local-Global Variables")) {
            imageView1.setImageResource(R.drawable.ders23);
            detaylar ="Yerel değişkenler tanımladığımız scope alanında etkilidir.\n"+
                    "Başka bir yerden erişilemez ve çağırılamaz.\n"+
                    "Global değişken ise herhangi bir yerden çağrılabilir gerek metot yardımıyla gerek" +
                    "ise düz biçimde değişkenin adı ile çağrılır.\n "+
                    "Diğer programlama dillerinde olduğu gibi hiçbir fark yok.";
            imageView2.setImageResource(R.drawable.ornek23);
            detaylar2="Bu örneğimizde Global ve yerel değişkenlerin kullanımı incelenmiştir.\n"+
                        "Yerel değişkenimiz main içinde tanımlanmıştır ve main içinde rahatlıkla erişebiliyoruz" +
                    "ancak main dışından ise erişmemize izin verilmiyor.\n"+
            "Global değişkenimiz main dışında oluşturuldu ve başka bir metod ile çağrıldı.\n"+
            "Global değişkenler yerel değişkenlere göre oldukça kullanışlıdır.";


        }

        else if (kotlin_nedir_ders.equals("24# Abstract Class-Method")) {
            imageView1.setImageResource(R.drawable.ders24);
            detaylar ="Abstract sınıflar içerisinde içi dolu metodların,değişkenlerin abstract  metodların tanımlanabildiği yapılardır." +
                    "Abstract sınıflar new anahtar kelimesi ile oluşturulamazlar.\n"+
                    "Abstract Class oluşturduğumuz da başka bir metodun verisine erişmemize izin verilmiyor." +
                    "Biz bu izni alabilmek için başka bir classtan oluşturduğumuz class'ı kalıtarak kullanabiliyoruz.\n"+
            "Abstract Methodda ise fonksiyonu override edip kullanabiliyoruz.\n";
            imageView2.setImageResource(R.drawable.ornek24);
            detaylar2="Bu örneğimizde Abstract sınıfın kullanımı incelenmiştir.\n"+
                  "Takım adında abstract sınıf oluşturulmuştur.Sınıfın içinde string türünde değer" +
                    "döndüren bir fonksiyon bulunmaktadır.\n"+
            "Sınıfımız abstract tanımlandığı için direkt bu değere ulaşamadığımız için başka bir sınıf" +
                    "oluşturarak abstract sınıfı kalıtıyoruz.\n"+
            "Yeni sınıfımızda oluşturmuş olduğumuz metoda ise parametre olarak abstract sınıftaki tanımlanmış" +
                    "değeri gönderebiliyoruz.\n"+
            "Son olarak main kısmında nesne tanımlanarak değer ekrana bastırılıyor.";
        }


        else if (kotlin_nedir_ders.equals("25# Interface")) {
            imageView1.setImageResource(R.drawable.ders25);
            detaylar ="Interface içinde sadece kendisinden türeyen sınıfların içini doldurmak zorunda olduğu içi boş metod tanımlarının yapıldığı bir yapıdır.\n" +
                    "Kısacası kendisini kullanacak sınıflar için bir yerine getirmeleri gereken metodları belirten bir anlaşmadır diyebiliriz.\n"+
                    "Interface,Nesne yönelimli programlamada önemli bir yer tutar.Javadaki kullanıma benzerdir.";
            imageView2.setImageResource(R.drawable.ornek25);
            detaylar2="Bu örneğimizde Interface kullanımı incelenmiştir.\n"+
                    "Fonksiyon adında bir interface tanımlıyoruz.Interface'in içinde çarpma yapan bir fonksiyon yazıyoruz.\n"+
                    "Bu yazdığımız fonksiyonu kullanabilmek için override ediyoruz.\n"+
                    "Main kısmında nesne oluşturup int türünde iki değer veriliyor.\n"+
                    "Verilen değerler gerekli işlemi yaptıktan sonra println() ile ekrana yazdırılıyor.";
        }

        else if (kotlin_nedir_ders.equals("26# Enum")) {
            imageView1.setImageResource(R.drawable.ders26);
            detaylar ="Enum tanımlamaları programlama dillerinde belirli değerlere karşılık gelen sabit değerlerin temsili için kullanılırlar, " +
                    "haftanın günleri, yönler,aylar vb gibi. Geliştiriciye sağladığı faydalar ise kod okunabilirliğini arttırması," +
                    " muhtemel değer kümesinin daraltılması ve tip güvenliğini sağlaması dolayısıyla hata payını en aza indirmesidir.";
            imageView2.setImageResource(R.drawable.ornek26);
            detaylar2="Bu örneğimizde Enum kullanımı incelenmiştir.\n"+
                    "Enum sınıfı tanımlandı.Takımların adları verildi.\n"+
            "Enum kullandığımız için direkt elemanlara erişim sağlayabildik.\n"+
            "Seçilen koşul doğru ise ekrana şampiyon beşiktaş yazdırıldı.\n"+
            "Eğer koşula uymuyorsa şampiyon bulunamadı yazdı.\n"+
            "Dizi kullanımından daha pratik olan enum bu gibi ifadelerde kullanışlıdır.";
        }

        else if (kotlin_nedir_ders.equals("27# Generic Class")) {
            imageView1.setImageResource(R.drawable.ders27);
            detaylar ="Generic tanımı aynı kod bloğunun veya parçasının birbirinden farklı veri tipleriyle çalışabilmesini sağlar." +
                    "Aynı zamanda çalışma zamanında oluşacak veri tipi hatalarının fark edilmesi ve önlenmesi için kullanılır."+
            "Generic kavramı Java'da bulunduğu gibi Kotlin'de de bulunmaktadır.";
            imageView2.setImageResource(R.drawable.ornek27);
            detaylar2="Bu örneğimizde Generic Sınıfın kullanımı incelenmiştir.\n"+
                   "Generic class oluşturduk.Oluşturulan generic sınıfa birbirinden farklı değişken türleriyle erişim sağlandı."+
                    "Generic classlarda <T> genellikle bu şekilde kullanılır ama sizin isteğinize göre verebileceğiniz herhangi bir string " +
                    "ifadede olabilmektedir.Örneğimizde Student şeklinde kullanılmıştır."+
            "Generic sınıfları kullanarak farklı veri tipleriyle birlikte çalışmamızı sağladı." +
                    "Hem int hem string hem de double türünde değerlerle birlikte çalıştık.";
        }

        else if (kotlin_nedir_ders.equals("28# Extensions")) {
            imageView1.setImageResource(R.drawable.ders28);
            detaylar ="C # ve Gosu'ya benzer Kotlin, sınıftan miras almak veya dekoratör gibi herhangi bir tasarım deseni kullanmak zorunda kalmadan yeni işlevsellik ile bir sınıfı genişletme olanağı sağlar. " +
                    "Bu, uzantılar denilen özel bildirimler vasıtasıyla yapılır." +
                    "Kotlin uzatma işlevlerini(extension functions) ve uzantı özelliklerini(extension properties) destekler."+
                    "Extensions özelliği Java'da bulunmamaktadır.Bu özellik sayesinde ArrayList'e özgü metodlardan hariç kendimiz" +
                    "bir metot tanımlayıp kullanabiliriz."+
                    "Uzantılar(Extensions) aslında genişlettikleri sınıfları değiştirmez." +
                    "Bir uzantı tanımlayarak, bir sınıfa yeni üyeler eklemezsiniz ancak yalnızca bu türdeki değişkenlerin nokta-gösterimi ile çağrılabilir yeni işlevler oluşturursunuz.";
            imageView2.setImageResource(R.drawable.ornek28);
            detaylar2="Bu örneğimizde Extensions kullanımı incelenmiştir.\n"+
                    "Bir Array List tanımladık ve içine string türünde elemanlar atadık." +
                    "Main dışında Array List üzerinde swap adında bir fonksiyon tanımladık." +
                    "Tanımlanan fonksiyon 2 parametreden oluşmaktadır."+
                    "Int türündeki bu iki parametre swap fonksiyonu ile birbiriyle değiş tokuş yaptılar." +
                    "Main içinde ise fonksiyon çağrıldı.swap fonksiyonu içine istediğimiz indexleri vererek değişiklikleri" +
                    "gözlemleyebiliyoruz.Biz 1.index ile 3.index'i yer değiştirdik.";
        }


        else if (kotlin_nedir_ders.equals("29# Inner Class")) {
            imageView1.setImageResource(R.drawable.ders29);
            detaylar ="Sınıflar diğer sınıflarda iç içe geçmiş olabilir."+
            "Bir sınıf dış sınıf üyelerine erişebilmek için iç işaretlenebilir." +
             "İç sınıflar, dış sınıfın bir nesnesine  referans taşırlar."+
            "Anonim iç sınıf örnekleri, bir nesne ifadesi kullanılarak oluşturulur."+
            "Nesne, işlevsel bir Java arayüzünün (örneğin ; Tek bir soyut yöntemi olan bir Java arabirimi) bir örneğiyse, " +
             "arayüzün türüne öneki bir lambda ifadesi kullanarak oluşturabilirsiniz."+
            "İç içe sınıflar Java dilinde olduğu gibi Kotlin dilinde de vardır.";
            imageView2.setImageResource(R.drawable.ornek29);
            detaylar2="Bu örneğimizde Inner(İç) Sınıfın kullanımı incelenmiştir.\n"+
                    "Bir sınıf oluşturduk ve oluşturulan sınıfın içinde başka bir sınıf daha oluşturuldu."+
                    "Oluşturulan bu sınıf iç sınıf olmaktadır.Main fonksiyonunda dış sınıf üzerinden iç sınıfa erişim sağlandı."+
                    "İç sınıfta oluşturulan class'a inner ifadesi yazmasaydık." +
                    "Erişim sağlanamadığı için program hata verecekti." +
                    "Hatanın önlenmesi ve doğru kullanım için inner ifadesi kullanıldı. ";
    }


        else if (kotlin_nedir_ders.equals("30# Super-This")) {
            imageView1.setImageResource(R.drawable.ders30);
            detaylar ="Super ve this ifadeleri Java'da bulunduğu gibi Kotlin'de de bulunmaktadır."+
                    "Sınıfın hiçbir birincil kurucu yoksa her ikincil yapıcı, süper anahtar sözcüğünü kullanarak temel türünü başlatmalı veya bunu yapan başka bir yapıcıya temsilci seçmelidir." +
                    "Bu durumda farklı ikincil kurucuların temel türün farklı yapıcılarını arayabileceğini unutmayalım.\n"+
                    "Bir sınıfın bir üyesindeyken, bu sınıfın geçerli nesnesine atıfta bulunur.\n" +
                    "Bir uzantı işlevi veya alıcının bulunduğu bir işlev deyiminde, bu, bir noktanın sol tarafında iletilen alıcı parametresini belirtir.\n" +
                    "Yetki yoksa, en içteki kapsamı belirtir." +
                    "Buna diğer kapsamlarda değinmek için, etiket niteleyicileri kullanılır.";
            imageView2.setImageResource(R.drawable.ornek30);
            detaylar2="Bu örneğimizde Super kullanımı incelenmiştir.\n"+
                    "Oluşturulan sınıfın yapıcı metodunda super ifadesi kullanılmıştır."+
                    "Üst sınıfttaki nesnelere ulaşmak adına kullanıldı."+
                  "Class içersindeki bir metodu aynen kullanmak istiyorsak super ifadesi kullanılmalıdır. ";
        }

*/



        kotlinDersNedirDetay.setText(detaylar);
        kotlinDersNedirDetay2.setText(detaylar2);

    }

}

