package com.resulozel.python;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PythonNedir extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.python_nedir_detay);


        TextView kotlinNedirAdi = (TextView) findViewById(R.id.pythonbilgi_adi);
        TextView kotlinNedirDetay = (TextView) findViewById(R.id.pythonbilgi_detay);
        ImageView imageView1 = (ImageView) findViewById(R.id.pythonpicture);




        Intent intent = getIntent();

        String kotlin_nedir_adi = intent.getStringExtra("kotlinnedir_adi");
        String detaylar = "";

        if (kotlin_nedir_adi.equals("Python Nedir ?")) {
            //imageView1.setImageResource(R.drawable.kotlinne);
            detaylar = " Python (C, C++, Perl, Ruby ve benzerleri gibi) bir programlama dilidir ve tıpkı öteki programlama dilleri gibi, önünüzde duran makineye, yani bilgisayara hükmetmenizi sağlar.\n" +
                    "\n" +
                    "Bu programlama dili Guido Van Rossum adlı Hollandalı bir programcı tarafından 90’lı yılların başında geliştirilmeye başlanmıştır. Çoğu insan, isminin Python olmasına aldanarak, bu programlama dilinin, adını piton yılanından aldığını düşünür. Ancak zannedildiğinin aksine bu programlama dilinin adı piton yılanından gelmez. Guido Van Rossum bu programlama dilini, The Monty Python adlı bir İngiliz komedi grubunun, Monty Python’s Flying Circus adlı gösterisinden esinlenerek adlandırmıştır. Ancak her ne kadar gerçek böyle olsa da, Python programlama dilinin pek çok yerde bir yılan figürü ile temsil edilmesi neredeyse bir gelenek halini almıştır.\n" +
                    "\n" +
                    "Dediğimiz gibi, Python bir programlama dilidir. Üstelik pek çok dile kıyasla öğrenmesi kolay bir programlama dilidir. Bu yüzden, eğer daha önce hiç programlama deneyiminiz olmamışsa, programlama maceranıza Python’la başlamayı tercih edebilirsiniz.";
        }

        else if (kotlin_nedir_adi.equals("Neden Python?")) {
           // imageView1.setImageResource(R.drawable.kotlintarih);
            detaylar = "Python programlarının en büyük özelliklerinden birisi, C ve C++ gibi dillerin aksine, derlenmeye gerek olmadan çalıştırılabilmeleridir. Python’da derleme işlemi ortadan kaldırıldığı için, bu dille oldukça hızlı bir şekilde program geliştirilebilir.\n" +
                    "\n" +
                    "Ayrıca Python programlama dilinin basit ve temiz söz dizimi, onu pek çok programcı tarafından tercih edilen bir dil haline getirmiştir. Python’ın söz diziminin temiz ve basit olması sayesinde hem program yazmak, hem de başkası tarafından yazılmış bir programı okumak, başka dillere kıyasla çok kolaydır.\n" +
                    "\n" +
                    "Python’ın yukarıda sayılan özellikleri sayesinde dünya çapında ün sahibi büyük kuruluşlar (Google, YouTube ve Yahoo! gibi) bünyelerinde her zaman Python programcılarına ihtiyaç duyuyor. Mesela pek çok büyük şirketin Python bilen programcılara iş imkanı sağladığını, Python’ın baş geliştiricisi Guido Van Rossum’un 2005 ile 2012 yılları arasında Google’da çalıştığını, 2012 yılının sonlarına doğru ise Dropbox şirketine geçtiğini söylersek, bu programlama dilinin önemi ve geçerliliği herhalde daha belirgin bir şekilde ortaya çıkacaktır.\n" +
                    "\n" +
                    "Python programlama dili ve bu dili hakkıyla bilenler sadece uluslararası şirketlerin ilgisini çekmekle kalmıyor. Python son zamanlarda Türkiye’deki kurum ve kuruluşların da dikkatini çekmeye başladı. Bu dil artık yavaş yavaş Türkiye’deki üniversitelerin müfredatında da kendine yer buluyor.\n" +
                    "\n" +
                    "Sözün özü, pek çok farklı sebepten, başka bir programlama dilini değil de, Python programlama dilini öğrenmek istiyor olabilirsiniz.";
        }

        else if (kotlin_nedir_adi.equals("Neden Programlama Öğrenmek İsteyeyim?")) {
          // imageView1.setImageResource(R.drawable.kotlinanlam);
            detaylar = "Günlük yaşamınıza şöyle bir bakın. Gerek iş yerinizde olsun, gerek evde bilgisayar başında olsun, belli işleri tekdüze bir şekilde tekrar ettiğinizi göreceksiniz. Mesela sürekli olarak yazılı belgelerle uğraşmanızı gerektiren bir işte çalışıyor olabilirsiniz. Belki de her gün onlarca belgeyi açıp bu belgelerde birtakım bilgiler arıyor, bu bilgileri düzeltiyor, yeniliyor veya siliyorsunuzdur. Bu işlemlerin ne kadar vakit alıcı ve sıkıcı olduğunu düşünün. Eğer bir programlama dili biliyor olsaydınız, bütün bu işlemleri sizin yerinize bu programlama dili hallediyor olabilirdi.\n" +
                    "\n" +
                    "İşte Python programlama dili böyle bir durumda devreye girer. Her gün saatler boyunca uğraştığınız işlerinizi, yalnızca birkaç satır Python kodu yardımıyla birkaç saniye içinde tamamlayabilirsiniz.\n" +
                    "\n" +
                    "Ya da şöyle bir durum düşünün: Çalıştığınız iş yerinde PDF belgeleriyle bolca haşır neşir oluyor olabilirsiniz. Belki de yüzlerce sayfalık kaşeli ve imzalı belgeyi PDF haline getirmeniz gerekiyordur. Üstelik sizden bu belgeleri mümkün olduğunca tek parça halinde PDF’lemeniz isteniyor olabilir. Ama o yüzlerce sayfayı tarayıcıdan geçirirken işin tam ortasında bir aksilik oluyor, makine arızalanıyor ve belki de ister istemez belgeniz bölünüyordur.\n" +
                    "\n" +
                    "İşte Python programlama dili böyle bir durumda da devreye girer. Eğer Python programlama dilini öğrenirseniz, İnternet’te saatlerce ücretsiz PDF birleştirme programı aramak veya profesyonel yazılımlara onlarca dolar para vermek yerine, belgelerinizi birleştirip işinizi görecek programı kendiniz yazabilirsiniz.\n" +
                    "\n" +
                    "Elbette Python’la yapabilecekleriniz yukarıda verdiğimiz basit örneklerle sınırlı değildir. Python’ı kullanarak masaüstü programlama, oyun programlama, taşınabilir cihaz programlama, web programlama ve ağ programlama gibi pek çok alanda çalışmalar yürütebilirsiniz.";
        }

        else if (kotlin_nedir_adi.equals("Python Nasıl Telaffuz Edilir")) {
           // imageView1.setImageResource(R.drawable.kotlinfel);
            detaylar = "Python programlama dili üzerine bu kadar söz söyledik. Peki yabancı bir kelime olan python‘ı nasıl telaffuz edeceğimizi biliyor muyuz?\n" +
                    "\n" +
                    "Geliştiricisi Hollandalı olsa da python İngilizce bir kelimedir. Dolayısıyla bu kelimenin telaffuzunda İngilizcenin kuralları geçerli. Ancak bu kelimeyi hakkıyla telaffuz etmek, ana dili Türkçe olanlar için pek kolay değil. Çünkü bu kelime içinde, Türkçede yer almayan ve telaffuzu peltek s’yi andıran [th] sesi var. İngilizce bilenler bu sesi think (düşünmek) kelimesinden hatırlayacaklardır. Ana dili Türkçe olanlar think kelimesini genellikle [tink] şeklinde telaffuz eder. Dolayısıyla python kelimesini de [paytın] şeklinde telaffuz edebilirsiniz.\n" +
                    "\n" +
                    "Python kelimesini tamamen Türkçeleştirerek [piton] şeklinde telaffuz etmeyi yeğleyenler de var. Elbette siz de dilinizin döndüğü bir telaffuzu tercih etmekte özgürsünüz.\n" +
                    "\n" +
                    "Bu arada, eğer python kelimesinin İngilizce telaffuzunu dinlemek istiyorsanız howjsay.com adresini ziyaret edebilir, Guido Van Rossum’un bu kelimeyi nasıl telaffuz ettiğini merak ediyorsanız da http://goo.gl/bx9iJu adresindeki tanıtım videosunu izleyebilirsiniz.";
        }
        else  if (kotlin_nedir_adi.equals("Python Sözdizimi")) {
           // imageView1.setImageResource(R.drawable.kotlinsoz);
            detaylar = "Python değişken bildirimleri ve parametre listelerinin veri türü, değişken adından sonra gelir." +
                    "çoğu durumda derleyici ifadenin sona erdiğini anlaması için bir satırsonu yeterlidir." ;

        }
        else if (kotlin_nedir_adi.equals("Platform Desteği")) {
           //imageView1.setImageResource(R.drawable.kotlinarac);
            detaylar = "Python programlama dili pek çok farklı işletim sistemi ve platform üzerinde çalışabilir. GNU/Linux, Windows, Mac OS X, AS/400, BeOS, MorphOS, MS-DOS, OS/2, OS/390, z/OS, RiscOS, S60, Solaris, VMS, Windows CE, HP-UX, iOS ve Android gibi, belki adını dahi duymadığınız pek çok ortamda Python uygulamaları geliştirebilirsiniz. Ayrıca herhangi bir ortamda yazdığınız bir Python programı, üzerinde hiçbir değişiklik yapılmadan veya ufak değişikliklerle başka ortamlarda da çalıştırılabilir.\n" +
                    "\n" +
                    "Biz bu belgelerde Python programlama dilini GNU/Linux ve Microsoft Windows işletim sistemi üzerinden anlatacağız. Ancak sıkı sıkıya bel bağlayacağımız özel bir GNU/Linux dağıtımı veya Windows sürümü yok. Bu yüzden, hangi GNU/Linux dağıtımını veya hangi Windows sürümünü kullanıyor olursanız olun, buradaki bilgiler yardımıyla Python programlama dilini öğrenebilir, öğrendiklerinizi kendi işletim sisteminize uyarlayabilirsiniz.";
        }



        else if (kotlin_nedir_adi.equals("Python Ve Programlama")) {
            //imageView1.setImageResource(R.drawable.kotlinprog);
            detaylar = "Python, mevcut tabanlı teknoloji yığınları ve pürüzsüz bir öğrenme eğrisi ile tam uyumluluğu korurken, özlü ve etkileyici kod yazmasına olanak tanıyan sunucu tarafı uygulamaları geliştirmek için mükemmel bir uyum içindedir:\n" +
                    "Etkililik: Python'ın tip güvenli mimarları ve temsil edilen mülkleri desteklemesi gibi yenilikçi dil özellikleri, güçlü ve kullanımı kolay soyutlamaları oluşturmaya yardımcı olur.\n" ;

        }
        else  if (kotlin_nedir_adi.equals("Python Kullanan Şirketler")) {
          //  imageView1.setImageResource(R.drawable.kotlinsoz);
            detaylar = "Python'i listelemek için çok fazla şirket var, ancak Python kullanımını halka açık ilan eden bazı şirketler, " +
                    "blog gönderileri, GitHub depoları veya görüşmeler yoluyla aşağıdaki gibi:\n" +
                    "Digg\n" +
                    "Friendfeed \n" +
                    "American Express\n" +
                    "Pinterest\n" +
                    "Dropbox\n" +
                    "Reddit\n" +
                    "Disqus\n" +
                    "Instagram";
        }


        else if (kotlin_nedir_adi.equals("Pycharm Nedir ?")) {
           // imageView1.setImageResource(R.drawable.inteli);
            detaylar = " Pycharm, python için oluşturulmuş IDE programıdır. Python piyasasında kullanılan en iyi IDE dir. Bu IDE ile çok hızlı ve kolay şekilde uygulama geliştirebilirsiniz.\n" +
                    "\n" +
                    "Pycharm bütün işletim sistemlerinde çalışılabilir biçimde geliştirilmiştir. Professional ve Community olmak üzere 2 versiyonu bulunmaktadır. Profesyonel sürümü ücretlidir. Eğer öğrenciyseniz 1 yıl ücretsiz kullanım hakkınız bulunmaktadır.";
        }

        else if (kotlin_nedir_adi.equals("Python Öğrenmek Zor Mu ?")) {
          //  imageView1.setImageResource(R.drawable.kotlinogr);
            detaylar ="Python: Java, C #, JavaScript, Scala ve Groovy gibi mevcut dillerden esinlenmiştir." +
                    "Python'ın öğrenilmesi kolay olduğundan emin olabilirsiniz; böylece geliştiriciler Python dilini birkaç gün içinde kolaylıkla okumaya ve yazmaya başlayabilir." +
                    "Deyimsel Pythonı öğrenmek ve bir takım gelişmiş özelliklerini kullanmak biraz daha uzun sürebilir, ancak genel olarak karmaşık bir dil değildir." +
                    "Rahatlıkla öğrenilebilir.";
        }

        else if (kotlin_nedir_adi.equals("Python Nerelerde Kullanabilirim ?")) {
            //imageView1.setImageResource(R.drawable.kotlinkullanim);
            detaylar ="Python Nerelerde Kullanılır?\n" +
                    "Python, mühendislikten-finansa kadar birçok alanda kullanılmaktadır. 2000’li yıllardan itibaren bilimsel veya mühendislikle ilgili hesaplamalı çalışmalarda da çokça kullanılmaya başlamıştır. Bunda hem donanımsal hem de yazılımsal gelişmelerin etkisi olmuştur:\n" +
                    "\n" +
                    "Donanımsal açıdan, işlem gücü ve bellek/ depolama kapasitesinin herkesin kolayca ulaşabileceği şekilde artıp yaygınlaşması ile, Python gibi yorumlanan dillerin bazı işlemlerde epeyce yavaş olmaları ve yüksek düzeyli veri yapılarının kullanılmasının hafızada çok yer tutması gibi olumsuzluklar birçok durumda göz ardı edilebilecek seviyeye gerilemiştir.\n" +
                    "\n" +
                    "Yazılımsal açıdan ise, İnternet ve onunla beraber açık kaynak kod veya özgür yazılım akımının yaygınlık kazanması, bu yaklaşımı benimseyen bilimcilerin İnternet üzerinden ve geliştirilen verimli araçlar sayesinde eşgüdümlü bir şekilde çalışmalarını beraberinde getirmiştir.";

        }


        else  if (kotlin_nedir_adi.equals("Python İle Masaüstü Uygulamalar Geliştirebilir Miyim ?")) {
            //imageView1.setImageResource(R.drawable.kotlindesktop);
            detaylar = "Evet Masaüstü uygulamalar geliştirebilirsiniz." +
                    "PyQt ,masaüstü uygulamaları oluşturmak ve sunmak için kullanılan bir yazılım platformunun yanı sıra çok çeşitli cihazlarda çalışabilen zengin İnternet uygulamalarıdır." +
                    "Pycharm Idesini kullanarak geliştirebilirsiniz.";

        }
        else  if (kotlin_nedir_adi.equals("Python İle Web Uygulamaları Geliştirebilir Miyim ?")) {
          // imageView1.setImageResource(R.drawable.kotlinweb);
            detaylar = "Evet Web uygulamaları geliştirebilirsiniz.\n" +
                    "Django dediğimiz,Python ile yazılmış özgür ve açık kaynak bir web uygulama iskeletidir (framework). Bir web iskeleti, websitesi geliştirmeyi hızlandıran ve kolaylaştıran bir grup bileşendir."+
                    "Django kullanarak güzel bir web sitesi tasarlayabilirsiniz.";

        }

        else  if (kotlin_nedir_adi.equals("Python,Nesne Yönelimli Bir Dildir Mi Yoksa İşlevsel Bir Dil Mi ?")) {
           // imageView1.setImageResource(R.drawable.kotlinsoz);
            detaylar = "Python'ın nesne yönelimli ve işlevsel yapıları vardır." +
                    "Hem Object Oriented hem de Functional Programming stillerinde kullanabilirsiniz veya ikisinin karışım unsurlarınıda kullanabilirsiniz.\n" +
                    "Fonksiyonel programlamayı yapıyor veya keşfediyorsanız, üst düzey işlevler, işlev türleri ve lambda gibi özellikler için birinci sınıf destek ile Python sizin için mükemmel bir seçimdir.";
        }



        else   if (kotlin_nedir_adi.equals("Python çok mu yavaş? Olmak zorunda değil")) {
            //imageView1.setImageResource(R.drawable.kotlinsunucu);
            detaylar = "Python hakkında söylenilen olumsuz söylentiler arasında yavaş olması yer almaktadır. Genel açıdan değerlendirmek gerekirse, evet Python yavaştır. Python aracılığı ile oluşturulan programlar genellikle C / C ++ veya Java'daki karşılık gelen programlardan çok daha yavaş çalışır.\n" +
                    "\n" +
                    "Neden bu kadar yavaş? Derleme programlarının satır satır kodları analiz etmesinden kaynaklı olarak bu durum yavaş senkronize gerektirir. Python'da yer alan nesneler kullanılan kodlar aracılığı ile belirlendiği için, derlendiğinde bile, dil için hızını optimize etmeyi zorlaştırması gerçeğidir.\n" +
                    " Bununla birlikte, Python’un hızı, göründüğü kadar önemli bir konu olmayabilir ve onu hafifletmenin yolları vardır. \n";

        }




        else  if (kotlin_nedir_adi.equals("Farklı Python Sürümleri")) {
            //imageView1.setImageResource(R.drawable.kotlinsoz);
            detaylar = "Python'un baş geliştiricisi Guido Van Rossum 2.x'de olan uyumluluk sorunlarına ve bulunan hatalara son vermek için 2.x üzerinde düzgün bir düzeltme yapmaya karar vermiştir. Bunun sonucunda da 3.x sürümü ortaya çıkmıştır. Python da bilinmesi gereken en önemli noktalardan biri de 3.x'te yapılan radikal değişikliklerden dolayı Python 2.x ve 3.x birbirini desteklemez duruma gelmiş olmasıdır. Yani Python 2.x'te yazdığımız program Python 3.x'te çalışmaz ve bunun tam tersi şekilde Python 3.x'te yazdığımız bir program da Python 2.x'te çalışmaz.\n" +
                    "\n" +
                    "Günümüze kadar Python 2.x ile bir çok program yazılmıştır. Bu programlar Python 3.x'te geliştirilemeyeceği  için Python geliştiricileri bir süre daha 2.x sürümünü geliştirmeye devam edeceklerdir. Ama şu bilinmelidir ki; Python'un geleceği Python 3.x'tir. Python 2.x çok sürmeden tozlu  raflardaki yerini alacaktır. Bu konu üstünden devam etmek gerekirse Python 3.x, 2.x'e göre çok daha kararlı ve güçlü bir dildir. En büyük dezavantajı ise Python 2.x'i desteklemiyor olmasıdır. Bu yüzden de büyük program geliştirmiş kişiler veya kurumlar Python 3.x'e geçmek konusunda hala kuşkuludurlar.\n" +
                    "\n" +
                    "3.x ile en büyük değişimlerden biri de Unicode üzerinde yapılmıştır. Python 2.x kullanırken Ascii karakterlerin dışındaki karakterler kullanılamıyordu. Bu sorun 3.x ile birlikte ortadan kaldırılmıştır. Bir örnek vermek gerekirse aşağıdaki tanımlama Python 2.x'te yapılamazken 3.x'te yapılabilmektedir.";
        }






        kotlinNedirAdi.setText(kotlin_nedir_adi);
        kotlinNedirDetay.setText(detaylar);
    }

}
