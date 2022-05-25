 java'yı içe aktarın . kullan . Tarayıcı ;
public  class  Notortalması {
    public  static  void  main ( String [] args ) {
        // Değişkenleri olurtur
        int  mat , fiz , kim , turk , tarih , muzik ;

        Tarayıcı  girişi = yeni  Tarayıcı ( Sistem.in ) ; _

        sistem . dışarı . print ( "Matematik Notunuz : " );
        mat = inp . sonrakiInt ();

        sistem . dışarı . print ( "Fizik Notunuz : " );
        fiz = inp . sonrakiInt ();

        sistem . dışarı . print ( "Kimya Notunuz : " );
        kim = inp . sonrakiInt ();

        sistem . dışarı . print ( "Türkçe Notunuz : " );
        türk = inp . sonrakiInt ();

        sistem . dışarı . print ( "Tarih Notunuz : " );
        tarih = gir . sonrakiInt ();

        sistem . dışarı . print ( "Müzik Notunuz : " );
        muzik = inp . sonrakiInt ();

        int  toplam = ( mat + fiz + kim + turk + tarih + muzik );
        double  sonuc = toplam / 6.0 ;
        sistem . dışarı . println ( "Ortalamanız = " + sonuc );

        String  evet = ( sonuc > 60 ) ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız!" ;
        sistem . dışarı . println ( evet );

    }
}
