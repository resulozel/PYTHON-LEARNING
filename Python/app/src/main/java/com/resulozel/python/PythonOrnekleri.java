package com.resulozel.python;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PythonOrnekleri extends Activity
{

    TextView pythonOrnekNedirDetay,pythonOrnekNedirDetay2;
    ImageView imageView1,imageView2,imageView3;
    String python_nedir_ornek,detaylar="",detaylar2="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.python_ornekleri_detay);


        pythonOrnekNedirDetay = (TextView) findViewById(R.id.python_ornek_bilgi_detay1);
        pythonOrnekNedirDetay2 = (TextView) findViewById(R.id.python_ornek_bilgi_detay2);
        imageView1 = (ImageView) findViewById(R.id.python_ornek_picture);
        imageView2 = (ImageView) findViewById(R.id.python_ornek_picture2);
        imageView3 = (ImageView) findViewById(R.id.python_ornek_picture_baslik);

        Intent intent = getIntent();

        python_nedir_ornek = intent.getStringExtra("kotlinornek_adi");



        if (python_nedir_ornek.equals("1# Hello World")) {
            imageView1.setImageResource(R.drawable.orn1);
            detaylar = "İlk Örneğimizde Pythonda Hello World Yazdıracağız.";
            imageView2.setImageResource(R.drawable.orn1c);
            detaylar2 = "print() fonksiyonu yardımıyla kolay bir şekilde ekrana yazdırdık.\n";

            // imageView3.setImageResource(R.drawable.ders1);

        }


        else  if (python_nedir_ornek.equals("2# Değişken Türleri")) {
            imageView1.setImageResource(R.drawable.orn2);
            detaylar = "Bu Örneğimizde Pythonda  Değişken türleri ile ilgili işlemler yapacağız.";
            imageView2.setImageResource(R.drawable.orn2c);
            detaylar2 = "int ve float değişken türlerini kullanarak" +
                    "ekrana değişkenlere vermiş olduğumuz verileri görüntüledik.\n" +
                    "print() fonksiyonu yardımıyla ekranda görüntüledik.";
            // imageView3.setImageResource(R.drawable.ornk2);

        }

        else  if (python_nedir_ornek.equals("3# Dört İşlem")) {
            imageView1.setImageResource(R.drawable.orn3);
            detaylar = "Bu örneğimizde Pythonda  int türünde tanımlanmış iki sayı ile ilgili işlemler yapacağız.";
            imageView2.setImageResource(R.drawable.orn3c);
            detaylar2 ="Verilen iki sayı ile birlikte toplama,çıkarma,bölme ve çarpma işlemleri yapılmaktadır.\n"+
                    "Yapılan işlemler print() fonksiyonu yardımıyla ekrana bastırılmıştır.\n";

            //imageView3.setImageResource(R.drawable.ornkk3);

        }

        else if (python_nedir_ornek.equals("4# Harf Notu Hesaplama")) {
            imageView1.setImageResource(R.drawable.orn4);
            detaylar = "Bu örneğimizde Pythonda  harf notu hesaplayan bir program yapacağız.";
            imageView2.setImageResource(R.drawable.orn4c);
            detaylar2 ="Kullanıcıdan vize ve final notu istenmektedir.\n"+
                    "Alınan bu iki değerden vize'nin %40 ile final'in %60 alınıp toplanarak bir not değişkenine atandı.\n"+
                    "Elde edilen nota göre belirlediğimiz aralıkların içinde ise o harf notu ve en son elde edilen notu" +
                    "ekrana bastırılıyor.";
            // imageView3.setImageResource(R.drawable.ornk4);

        }


        else  if (python_nedir_ornek.equals("5# Klavyeden Veri Alma")) {
            imageView1.setImageResource(R.drawable.orn5);
            detaylar = "Bu örneğimizde Pythonda  klavyeden aldığımız bilgileri ekranda göstereceğiz.";
            imageView2.setImageResource(R.drawable.orn5c);
            detaylar2 ="Kulllanıcıdan isim,soyisim,yaş ve okul bilgileri istenmektedir.\n"+
                    "String ve int türünde değişkenler kullanılarak bilgiler alınmıştır.\n"+
                    "println() ile birlikte alınan bilgiler ekranda gösterilmiştir.";
            //  imageView3.setImageResource(R.drawable.ornk5);

        }

        else  if (python_nedir_ornek.equals("6# Tür Dönüşümleri")) {
            imageView1.setImageResource(R.drawable.orn6);
            detaylar = "Bu örneğimizde Pythonda  tür dönüşümleri ile ilgili örnek yapacağız.";
            imageView2.setImageResource(R.drawable.orn6c);
            detaylar2 ="Örneğimizde int ve float türünde değişkenler vardır.\n"+
                    " değişkenlerimize değerler atadık ve sonra bunları hangi türe dönüştüreceksek o türün içine atıyoruz\n"+
                    "son olarak yeni bir değişken adı atayıp onu print komutuyla ekrana yazdırıyoruz.";

            // imageView3.setImageResource(R.drawable.ornkk6);

        }


        else   if (python_nedir_ornek.equals("7# Break-Continue")) {
            imageView1.setImageResource(R.drawable.orn7);
            detaylar = "Bu örneğimizde Pythonda  break-continue ifadeleri kullanıldı.";
            imageView2.setImageResource(R.drawable.orn7c);
            detaylar2 ="yukarıdaki örneğimizde i değişkeni değer atılarak while döngüsünün içine sokuldu\n" +
                    " while döngüsü ilk önce bunu ekrana bastırıp sonra değeri 1 artırarak ekrana basar\n"+
                    "ancak break komutunu görüncü orada kırıp çıkar\n"+
            "Diğer örneğimizse ise x diye değer atayıp x değişkeni for döngüsünü gezecektir\n"+
            "ama aralık yediye kadar devam edecektir eğer değişken 3  ve 6 ise devam edecektir.Değilse sonlandıracaktır";
            // imageView3.setImageResource(R.drawable.ornkk7);

        }


        else  if (python_nedir_ornek.equals("8# While Döngüsü")) {
            imageView1.setImageResource(R.drawable.orn8);
            detaylar = "Bu örneğimizde Pythonda  while döngüsünün örneğini yapacağız.";
            imageView2.setImageResource(R.drawable.orn8c);
            detaylar2 ="Bu örneğimizde i değerine bir atanıp while döngüsünü içene sokuyoruz.\n" +
                    " döngü 5 ve 5 e eşit olana kadar devam edecektir.\n"+
                    "ilk önce ekrana basıp sonra değeri 1 artıracaktır bu şekilde devam edip editör sonucu yazacaktır\n";

            // imageView3.setImageResource(R.drawable.ornkk8);
        }

        else   if (python_nedir_ornek.equals("9# For Döngüsü")) {
            imageView1.setImageResource(R.drawable.orn9);
            detaylar = "Bu örneğimizde Pythonda  for döngüsünün örneğini yapacağız.";
            imageView2.setImageResource(R.drawable.orn9c);
            detaylar2 ="Bu örneğimizi harf diye değişken atayıp harf bu döngüyü dolanacaktır.\n"+
                    "dolanacağı argüman Yazılım Sanatıdır. Ve döngüyü dolanarak argümanın karakterlerini tek tek yazacaktır. ";

            // imageView3.setImageResource(R.drawable.ornkk9);

        }

        else if (python_nedir_ornek.equals("10# Fonksiyonlar")) {
            imageView1.setImageResource(R.drawable.orn10);
            detaylar = "Bu örneğimizde Pythonda  Fonksiyonlar kullanılarak toplama işlemi  yapacağız.";
            imageView2.setImageResource(R.drawable.orn10c);
            detaylar2 ="carp adında Fonksiyon tanımladık.\n"+
                    "fonksiyon içinde değerleri atayıp sonra çarparak fonksiyonu tamamladık."+
                    "en son fonksiyonu bitirerek fonksiyonu çağırıyoruz.";

            //imageView3.setImageResource(R.drawable.ornkk10);

        }


        else  if (python_nedir_ornek.equals("11# Aritmetik Operatörler")) {
            imageView1.setImageResource(R.drawable.orn11);
            detaylar = "Bu örneğimizde Pythonda  Aritmetik Operatörler konusunun örneğini yapacağız.";
            imageView2.setImageResource(R.drawable.orn11c);
            detaylar2 ="6 satırlık bir kodda birbirinden farklı değerleri karşılaştırdık.\n"+
                    "Sonuç koşula uygun ise true döndürür.\n"+
                    "Sonuç koşula aykırı ise false döndürür.\n"+
                    "Bu örneğimizde  büyüktür ve küçüktür operatörleri kullanılmıştır.";
            // imageView3.setImageResource(R.drawable.ornkk11);
        }

        else  if (python_nedir_ornek.equals("12# Overloading")) {
            imageView1.setImageResource(R.drawable.orn12);
            detaylar = "Bu örneğimizde Pythonda  Overloading konusunun örneğini yapacağız.";
            imageView2.setImageResource(R.drawable.orn12c);
            detaylar2 ="Bu örneğimizde class oluşturarak adını person diye bir argüman atıyoruz.\n"+
                    "sonra merhaba adında foknsiyon oluşturarak , parametreleri atıyoruz.\n"+
                    "if kullanarak isim değişkenini boş olmayan değer içinde atıyoruz.\n"+
                    "print komutuyla ekrana yazdırıyoruz olmadığı takdirde else yaparak diğer print satırını yazdırıyoruz.\n"+
                    "ve merhaba fonksiyon adını ürettiğimiz nesne üzerinde çağırıyoruz.\n";

            // imageView3.setImageResource(R.drawable.ornkk12);
        }

        else if (python_nedir_ornek.equals("13# Polymorphism")) {
            imageView1.setImageResource(R.drawable.orn13);
            detaylar = "Bu örneğimizde Pythonda  Çokbiçimlilik konusunun örneğini yapacağız.";
            imageView2.setImageResource(R.drawable.orn13c);
            detaylar2 ="çok biçimlilik bir nesnenin veya fonksiyonun " +
                    "custom bir şekilde birden çok şekilde kullanılmasına denir.\n"+
                    "Örneğimizde hayvan şekillerinde 3 farklı fonksiyon oluşturulmuştur.\n"+
                    "3 fonksiyonun geri dönüş değeri de birbirinden farklıdır.\n"+
                    "Fonksiyonların çağırılma şekillerine bakılarak hangi fonksiyonun" +
                    "çalışacağını anlayabiliyoruz.";
            //imageView3.setImageResource(R.drawable.ornkk13);
        }

        else   if (python_nedir_ornek.equals("14# Try-Catch")) {
            imageView1.setImageResource(R.drawable.orn14);
            detaylar = "Bu örneğimizde Pythonda  Try-Catch konusunun örneğini yapacağız.";
            imageView2.setImageResource(R.drawable.orn14c);
            detaylar2 ="Kullanıcıdan sayi girmesi isteniyor.\n"+
                    "Kullanıcı yanlışlıkla karakter girerse hata bloğuna yani catch'e giriyor" +
                    "ve ekrana hata mesajı bastırıyoruz.\n"+
                    "Kullanıcı doğru girerse hiçbir sıkıntı olmadan try bloğunda işlem yapılıyor.";
            //imageView3.setImageResource(R.drawable.ornkk14);
        }

        else  if (python_nedir_ornek.equals("15# Yaşı Girilen Kişinin Ehliyet Alıp Alamayacağını Gösteren Python Örneği")) {
            imageView1.setImageResource(R.drawable.orn15);
            detaylar = "Bu örneğimizde Calendar sınıfını kullanarak yaşımızı hesaplayan bir program yazacağız.";
            imageView2.setImageResource(R.drawable.orn15c);
            detaylar2 ="Kullanıcıdan yaşını girmesi isteniyor.\n"+
                    "if döngüsünün içinde koşul sağlandığı sürece print komutu çalışacaktır.\n"+
                    "olmadığı takdirde else çalışıp sonucu ekrana yazdıracaktır.\n";

            //imageView3.setImageResource(R.drawable.ornkk15);
        }


        else  if (python_nedir_ornek.equals("16# Arrays(Diziler)")) {
            imageView1.setImageResource(R.drawable.orn16);
            detaylar = "Bu örneğimizde Arrays kullanarak kullanıcıdan dizi elemanlarının girilmesi istenecek sonra" +
                    "ise girilen elemanları ekranda göstereceğiz.";
            imageView2.setImageResource(R.drawable.orn16c);
            detaylar2 ="String türünde array tanımlaması yapıyoruz.Başlangıçtaki değerlerine herhangi bir ifade atanmadı.\n"+
                   "sonra print komutuyla ekrana çıktını yazdırıyoruz.";
            // imageView3.setImageResource(R.drawable.ornkk16);
        }

        else  if (python_nedir_ornek.equals("17# Girilen Sayının Pozitif, Negatif, ya da 0 Olduğunu bulan program")) {
            imageView1.setImageResource(R.drawable.orn17);
            detaylar = "Bu örneğimizde Local-Global kullanımı ile ilgili örnek yapacağız.";
            imageView2.setImageResource(R.drawable.orn17c);
            detaylar2 ="Örneğimizde  sayi denen değişken yazarak Sayı gir diye girdi istiyoruz.\n"+
                    "sonra if döngüsü içine sokarak sayı sıfırdan küçük'se negatif büyükse pozitif eşitse eşit olduğunu belirtiyoruz.\n"+
                    "kodu çalıştırarak çıktıları görüyoruz.";

            // imageView3.setImageResource(R.drawable.ornkk17);
        }

        else   if (python_nedir_ornek.equals("18# 1-20 Arası 3′ e ve 5′ e tam bölünen sayıları bulan program")) {
            imageView1.setImageResource(R.drawable.orn18);
            detaylar = "Bu örneğimizde Local-Global kullanımı ile ilgili örnek yapacağız.";
            imageView2.setImageResource(R.drawable.orn18c);
            detaylar2 ="Bu örneğimizde for döngüsü kullanarak range metodu ile 1 den 20 ye kadar değerler atayıp.\n"+
                    "bu değerler sonucunda if kullanarak 3  ve 5  ile bölümünden kalan sıfırsa ekrana bastır diyerek program sonlanır.";

            // imageView3.setImageResource(R.drawable.ornkk18);
        }

        else  if (python_nedir_ornek.equals("19#1 den Kullanıcının Girdiği Sayıya Kadar Sayıları Listeleyen program")) {
            imageView1.setImageResource(R.drawable.orn19);
            detaylar = "Bu örneğimizde Enum kullanımı ile ilgili örnek yapacağız.";
            imageView2.setImageResource(R.drawable.orn19c);
            detaylar2 ="Kullanıcıdan sayı girilmesi istenerek hemen sonra for döngüsü içinde\n " +
                    "i değişkeni alarak range metodonun içini dolaşıryouz.\n"+
                    "range metodunun içini anlatmaya gelirsek buradaki olay istediğim sayiyi int yaparak\n " +
                    "bir artırarak hangi girmek istediği sayı kadar artırmaktır.";

            // imageView3.setImageResource(R.drawable.ornkk19);
        }

        else  if (python_nedir_ornek.equals("20# Self")) {
            imageView1.setImageResource(R.drawable.orn20);
            detaylar = "Bu örneğimizde Interface kullanımı ile ilgili örnek yapacağız.";
            imageView2.setImageResource(R.drawable.orn20c);
            detaylar2 ="Self sınıf içinde parametre  ulaşmak için kullanılır.\n"+
                    "bu  araba diye class ismi oluşturduk.\n" +
                    "bir tanede kaza_ani diye fonksiyon adı oluşturduk. Buradaki maksat self yapısını\n" +
                    "kullanarak class içine ulaşmaktır.";

            // imageView3.setImageResource(R.drawable.ornkk20);
        }


        else  if (python_nedir_ornek.equals("21# 1-20 arası Çift Sayıları Listeleyen program")) {
            imageView1.setImageResource(R.drawable.orn21);
            detaylar = "Bu örneğimizde daire'nin alanı ile ilgili örnek yapacağız.";
            imageView2.setImageResource(R.drawable.orn21c);
            detaylar2 ="for döngüsü içinde range metodu kullanarak 1'den 20' ye kadar olan sayıları alarak.\n " +
                    "bu sayı i içinde dönecektir. İ'nin 2 ile bölümünden kalan sıfırsa ekrana çift sayıları yazdıracaktır ";

            // imageView3.setImageResource(R.drawable.ornkk21);
        }


        else  if (python_nedir_ornek.equals("22# Girilen Sayının Asal Sayı mı Değil mi olduğunu bulan program")) {
            imageView1.setImageResource(R.drawable.orn22);
            detaylar = "Bu örneğimizde iki sayıyı değiştirme ile ilgili örnek yapacağız.";
            imageView2.setImageResource(R.drawable.orn22c);
            detaylar2 ="Bu örneğimizde asal sayı olup olmadığını bulmaya çalışacağız.\n"+
                    "Sonun mantığını şöyle izah edeyim 2 asal sayısını alıp kullanıcının girdiği sayıya kadar,\n" +
                    "girip sıfır ile bölümünden kalana bakıp ve en son sayac değeri tutup,\n" +
                    "sayac değerine her artırdığı değişkeni atayarak asal sayıyı bulacaktır.";

            // imageView3.setImageResource(R.drawable.ornkk22);
        }


        else  if (python_nedir_ornek.equals("23# Fonksiyon kullanarak yarıçapı girilen dairenin alanını hesaplayan program")) {
            imageView1.setImageResource(R.drawable.orn23);
            detaylar = "Bu örneğimizde üçgenin alanı ile ilgili örnek yapacağız.";
            imageView2.setImageResource(R.drawable.orn23c);
            detaylar2 ="daireAlan diye fonksiyon oluşturarak yaricap parametresi atayarak bunun formül içinde  atıyorum" +
                    "sonra printle ekrana yazdırıyorum. Formül pi*r*r olduğu için bunu kullanıyorum. " +
                    "en son fonksiyonu çağırıp programı sonlandırıyorum.\n";

            //imageView3.setImageResource(R.drawable.ornkk23);
        }





        pythonOrnekNedirDetay.setText(detaylar);
        pythonOrnekNedirDetay2.setText(detaylar2);
    }
}
