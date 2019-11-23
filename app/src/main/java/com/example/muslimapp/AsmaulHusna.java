package com.example.muslimapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class AsmaulHusna extends AppCompatActivity {

    private AsmaulAdapter namaAdapter;
    RecyclerView rvMain;
    ArrayList<ModelNama> arrayList;
    int count = 0;
    private String[] idNama = {"1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "11",
            "12",
            "13",
            "14",
            "15",
            "16",
            "17",
            "18",
            "19",
            "20",
            "21",
            "22",
            "23",
            "24",
            "25",
            "26",
            "27",
            "28",
            "29",
            "30",
            "31",
            "32",
            "33",
            "34",
            "35",
            "36",
            "37",
            "38",
            "39",
            "40",
            "41",
            "42",
            "43",
            "44",
            "45",
            "46",
            "47",
            "48",
            "49",
            "50",
            "51",
            "52",
            "53",
            "54",
            "55",
            "56",
            "57",
            "58",
            "59",
            "60",
            "61",
            "62",
            "63",
            "64",
            "65",
            "66",
            "67",
            "68",
            "69",
            "70",
            "71",
            "72",
            "73",
            "74",
            "75",
            "76",
            "78",
            "79",
            "80",
            "81",
            "82",
            "83",
            "84",
            "85",
            "86",
            "87",
            "88",
            "89",
            "90",
            "91",
            "92",
            "93",
            "94",
            "95",
            "96",
            "97",
            "98",
            "99",
            "100"
    };

    private String[] judulNama = {"1. Ar – Rahmaan الرحمن (Maha Pemurah) – Asmaul Husna",
            "2. Ar – Rahiim الرحيم (Maha Penyayang) – Asmaul Husna",
            "3. Nama Al – Malik الملك (Maharaja) – Asmaul Husna",
            "4. Al – Qudduus القدوس (Maha Suci) – Asmaul Husna",
            "5. As – Salaam السلام (Maha Sejahtera, Yang Memberikan Kesejahteraan) – Asmaul Husna",
            "6. Al – Mu’min المؤمن (Maha Mengaruniakan Keamanan) – Asmaul Husna",
            "7. Al – Muhaimin المهيمن (Maha Memelihara, Yang Maha Melindungi) – Asmaul Husna",
            "8. Al – ‘Aziiz العزيز (Maha Perkasa) – Asmaul Husna",
            "9. Al – Jabbaar الجبار (Yang Maha Berkuasa, Maha Memaksa) – Asmaul Husna",
            "10. Al – Mutakabbir المتكبر (Maha Megah, Yang Mempunyai Keagungan dan Kesombongan) – Asmaul Husna",
            "11. Al – Khaaliq الخالق (Maha Pencipta) – Asmaul Husna",
            "12. Al – Baari’ البارئ (Maha Mengadakan, Yang Merencanakan Segala Sesuatu) – Asmaul Husna",
            "13. Al – Mushawwir المصور (Maha Pembentuk) – Asmaul Husna",
            "14. Al – Ghaffaar الغفار (Maha Pengampun) – Asmaul Husna",
            "15. Al – Qahhaar القهار (Maha Mengalahkan) – Asmaul Husna",
            "16. Al – Wahhaab الوهاب (Maha Pemberi) – Asmaul Husna",
            "17. Ar – Razzaaq الرزاق (Maha Pemberi Rezeki) – Asmaul Husna",
            "18. Al – Fattaah الفتاح (Maha Pembuka, Yang Menghilangkan Kesulitan dan Pemberi Keputusan) – Asmaul Husna",
            "19. Al – ‘Aliim العليم(Maha Mengetahui) – Asmaul Husna",
            "20. Al – Qaabidh القابض (Maha Menyempitkan) – Asmaul Husna",
            "21. Al – Baasith الباسط (Maha Melapangkan) – Asmaul Husna",
            "22. Al – Khaafidh الخافض (Maha Merendahkan, Yang Menghinakan Seseorang) – Asmaul Husna",
            "23. Ar – Raafi` الرافع (Maha Meninggikan Derajat Seseorang) – Asmaul Husna",
            "24. Al – Mu`izzu المعز (Maha Memuliakan, Yang Memberikan Kemuliaan) – Asmaul Husna",
            "25. Al – Mudzillu المذل (Maha Menghinakan) – Asmaul Husna",
            "26. Al – Samii’ السميع (Maha Mendengar) – Asmaul Husna",
            "27. Al – Bashiir البصير (Maha Melihat, Yang Maha Melihat Segala Sesuatu) – Asmaul Husna",
            "28. Al – Hakam الحكم (Maha Menetapkan Segala Hukum) – Asmaul Husna",
            "29. Al – ‘Adl العدل (Mah Adil) – Asmaul Husna",
            "30. Al – Lathiif اللطيف (Maha Halus, Maha Lembut, Maha Mengasihi) – Asmaul Husna",
            "31. Al – Khabiir الكبير (Maha Mengetahui) – Asmaul Husna",
            "32. Al – Haliim الحليم (Maha Penyantun) – Asmaul Husna",
            "33. Al – ‘Azhiim العظيم (Maha Agung) – Asmaul Husna",
            "34. Al – Ghafuur الغفور (Maha Pengampun, Maha Mengampuni) – Asmaul Husna",
            "35. Asy – Syakuur الشكور (Maha Mensyukuri) – Asmaul Husna",
            "36. Al – ‘Aliiyy العلى (Maha Tinggi) – Asmaul Husna",
            "37. Al – Kabiir الكبير (Maha Besar) – Asmaul Husna",
            "38. Al – Hafiizh الحفيظ (Maha Pelestari, Maha Memelihara, Maha Melindungi) – Asmaul Husna",
            "39. Al – Muqiit المقيت (Maha Pemelihara, Maha Memberi Rezeki dan Kekuatan) – Asmaul Husna",
            "40. Al – Hasiib الحسيب (Maha Penghitung) – Asmaul Husna",
            "41. Al – Jaliil الجليل (Maha Agung, Maha Tinggi dan Mulia) – Asmaul Husna",
            "42. Al – Kariim الكريم (Maha Dermawan, Maha Pemurah) – Asmaul Husna",
            "43. Ar – Raqiib الرقيب (Maha Mengawasi, Maha Mengamati) – Asmaul Husna",
            "44. Al – Mujiib المجيب (Maha Mengabulkan) – Asmaul Husna",
            "45. Al – Waasi` الواسع (Maha Luas) – Asmaul Husna",
            "46. Al – Hakiim الحكيم (Maha Bijaksana) – Asmaul Husna",
            "47. Al – Waduud الودود (Maha Pecinta) – Asmaul Husna",
            "48. Al – Majiid المجيد (Maha Mulia) – Asmaul Husna",
            "49. Al – Baa’its الباعث (Maha Membangkitkan) – Asmaul Husna",
            "50. Asy – Syahiid الشهيد (Maha Menyaksikan) – Asmaul Husna",
            "51. Al – Haqq الحق (Maha Benar) – Asmaul Husna",
            "52. Al – Wakiil الوكيل (Maha Memelihara, Maha Mencukupi)",
            "53. Al – Qawiyy القوى (Maha Kuat) – Asmaul Husna",
            "54. Al – Matiin المتين (Maha Kukuh, Maha Sempurna Kekuatannya) – Asmaul Husna",
            "55. Al – Waliyy الولى (Maha Melindungi, Maha Menolong dan Mengendalikan) – Asmaul Husna",
            "56. Al – Hamiid الحميد (Maha Terpuji) – Asmaul Husna",
            "57. Al – Muhshiy المحصى (Maha Pencatat, Maha Memperhitungkan Setiap Amalan) – Asmaul Husna",
            "58. Al – Mubdi’u المبدئ (Maha Memulai Segala Sesuatu) – Asmaul Husna",
            "59. Al – Mu`iid المعيد (Maha Mengulangi Kejadian) – Asmaul Husna",
            "60. Al – Muhyii المحيى (Maha Memberi Kehidupan) – Asmaul Husna",
            "61. Al – Mumiit المميت (Maha Mematikan Makhluk-Nya) – Asmaul Husna",
            "62. Al – Hayy الحي (Maha Hidup) – Asmaul Husna",
            "63. Al – Qayyuum القيوم (Maha Mandiri) – Asmaul Husna",
            "64. Al – Waajid الواجد (Maha Kaya) – Asmaul Husna",
            "65. Al – Maajid الماجد (Maha Mulia, Maha Agung dan Tinggi) – Asmaul Husna",
            "66. Al – Waahid الواحد (Maha Esa) – Asmaul Husna",
            "67. Al – Ahad الاحد (Maha Satu) – Asmaul Husna",
            "68. Ash – Shamad الصمد (Maha Dibutuhkan) – Asmaul Husna",
            "69. Al – Qaadir القادر (Maha Kuasa) – Asmaul Husna",
            "70. Al – Muqtadir المقتدر (Maha Menentukan) – Asmaul Husna",
            "71. Al – Muqaddim المقدم(Maha Mendahulukan) – Asmaul Husna",
            "72. Al – Mu’akhkhir المؤخر ( Maha Mengakhirkan) – Asmaul Husna",
            "73. Al – Awwal الأول (Maha Awal, Yang Tidak Berpermulaan) – Asmaul Husna",
            "74. Al – Aakhir الأخر (Maha Akhir) – Asmaul Husna",
            "75. Azh – Zhaahir الظاهر (Maha Nyata) – Asmaul Husna",
            "76. Al – Baathin الباطن (Maha Tersembunyi) – Asmaul Husna",
            "77. Al – Waaliy الوالي (Maha Memerintah, Yang Menguasai Segala Urusan) – Asmaul Husna",
            "78. Al – Muta`aaliy المتعالي (Maha Tinggi) – Asmaul Husna",
            "79. Al – Barr البر (Maha Baik, Maha Kebajikan) – Asmaul Husna",
            "80. At – Tawwaab التواب (Maha Penerima Taubat) – Asmaul Husna",
            "81. Al – Muntaqim المنتقم (Maha Pembalas) – Asmaul Husna",
            "82. Al – `Afuww العفو (Maha Pemaaf, Maha Mengampuni) – Asmaul Husna",
            "83. Ar – Ra’uuf الرؤوف (Maha Pengasih) – Asmaul Husna",
            "84. Maalikul – Mulk مالك الملك (Maha Menguasai Kerajaan) – Asmaul Husna",
            "85. Dzul – Jalaali Wal – Ikraam ذو الجلال و الإكرام (Maha Memiliki Kebesaran dan Kemulian) – Asmaul Husna",
            "86. Al – Muqsith المقسط (Maha Mengadili) – Asmaul Husna",
            "87. Al – Jaami` الجامع (Maha Mengumpulkan) – Asmaul Husn",
            "88. Al – Ghaniiyy الغنى (Maha Kaya) – Asmaul Husna",
            "89. Al – Mughniiy المغنى (Maha Pemberi Kekayaan) – Asmaul Husna",
            "90. Al – Maani` المانع (Maha Mencegah, Maha Menolak) – Asmaul Husna",
            "91. Al – Dhaarr الضار (Maha Pemberi Bahaya) – Asmaul Husna",
            "92. An – Naafi` النافع (Maha Pemberi Manfaat) – Asmaul Husna",
            "93. An – Nuur النور ( Maha Bercahaya) – Asmaul Husna",
            "94. Al – Haadii الهادئ (Maha Pemberi Petunjuk) – Asmaul Husna",
            "95. Al – Badii` Baadii (Maha Pencipta Yang Baru) – Asmaul Husna",
            "96. Al – Baaqiiy الباقي (Maha Kekal) – Asmaul Husna",
            "97. Al – Waarist الوارث (Maha Mewarisi) – Asmaul Husna",
            "98. Ar – Rasyiid الرشيد (Maha Pandai) – Asmaul Husna",
            "99. Ash – Shabuur الصبور (Maha Penyabar) – Asmaul Husna"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asmaul_husna);

        rvMain = findViewById(R.id.rvMain);
        arrayList = new ArrayList<ModelNama>();
        namaAdapter = new AsmaulAdapter(arrayList);
        setData();

        rvMain.setLayoutManager(new LinearLayoutManager(this));
        rvMain.setHasFixedSize(true);
        rvMain.setAdapter(namaAdapter);

    }
    private void setData (){
        int count = 0;
        for (String id : idNama ){
            arrayList.add(new ModelNama(id, idNama[count], judulNama[count]));
            count++;
        }
    }
}
