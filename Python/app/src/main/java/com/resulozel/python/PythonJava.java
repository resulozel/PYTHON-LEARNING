package com.resulozel.python;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class PythonJava extends Activity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.python_java);

        textView= (TextView) findViewById(R.id.pythonbilgi_detay);

        textView.setText("1)Python , Java'da bulunan bir dizi eksikliği ve sorunlara farklı çözüm sunar.\n" +
                "*Boş referanslar(Null references), sistem tarafından kontrol edilir.\n" +
                "*Bu geliştirme programlarının ikisinin de kendilerine özgü güçlü yönleri vardır. " +
                "*Java, birden fazla işletim sistemi desteği sunarken Python, 10 farklı işletim sisteminde çalışabiliyor.\n" +
                "*Hangi programı kullanacağınız konusunda karar vermeden önce nihai amacınızın ne olduğuna karar vermelisiniz.\n" +
                "*Fakat Java, daha karışık bir program olduğu için yeni başlayanlara önerilmez.\n " +
                "*Eski bir değişkeni tekrar kullanmak gibi kısayollar sunan Python daha cömert bir platformdur." +
                "\n" +
                "*Kullanıcıların birçoğu Pyhton’u Java’dan daha kolay okumakta ve anlamaktadır." +
                "*Aynı zamanda Java kodu sadece bir kez yazılabilir ve herhangi bir yerde çalıştırılabilir.\n " +
                "*Java’nın bir diğer faydası da şüpheli bir kodu karşıdan yüklemenize izin vermesi ve ana sistemi etkilemeden güvenli bir ortamda çalıştırmanıza izin vermesidir.\n" +
                "*Ayrıca Java ağ merkezli bir platformdur, yani Java ile ağ tabanlı uygulamalar oluşturabilirsiniz." +
                "\n" +
                "*Hangisini öğrenmeyi tercih edeceğiniz konusu tercihlerinize, kararlılığınıza ve geçmiş tecrübelerinize bağlıdır." +
                "*Pyhton’un temelini kavradıysanız, Java’ya geçmeden önce bilgilerinizi biraz genişletmek isteyebilirsiniz." +
                "*Aynı zamanda zamanınız ve azminiz varsa Java ile daha fazla çeşitli platformlar için program yapabilirsiniz.\n\n" +

                "2)Python\n" +
                "*Duck typing(strongly typed)\n" + "" +
                "*Kod bloklarının başını ve sonunu belirtme için boşluklar kullanır\n" +
                "*Programlar küçük olduğu için daha hızlı çalışır \n" +
                "*Java’ya göre daha kolay okunur ve anlaşılır" +
                "*Nesneye yönelik programlama isteğe bağlıdır \n \n" +

                "3)Java" +
                "\n" +
                "*Lambda ifadeleri ve Satır içi işlevler\n" + "" +
                "*Static typing\n" +
                "*Boş güvenliği(Null-safety)\n" +
                "*Fonksiyonların başlangıç ve bitişlerini kaydetmek için kullanılan küme parantezleri\n" +
                "*Operatör aşırı yüklenmesi(Operator overloading)\n" +
                "*Tamamlayıcı nesneler(Companion objects)\n" +
                "*Java Virtual Machine’i çalıştırabilen herhangi bir işletim sisteminde kullanılabilir\n" +
                "*Salt okunur ve değiştirilebilir koleksiyonlar için ayrı arayüzler\n" +
                "*Değişkenlerin veri tipleri değiştirilemez");
    }

}
