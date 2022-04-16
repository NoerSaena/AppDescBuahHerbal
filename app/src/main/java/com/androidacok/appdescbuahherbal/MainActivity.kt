package com.androidacok.appdescbuahherbal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE ="OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buahherbalList = listOf<Buahherbal>(
            Buahherbal(
                R.drawable.alpukat,
                "Alpukat",
                 "Alpukat selain rasanya yang enak dan cocok dijadikan jus atau disajikan dengan hidangan lainnya, juga punya banyak manfaat. Kandungan yang terdapat di dalamnya antara lain vitamin C, vitamin B, zat besi, kalsium, fosfor, dan lemak baik. Buah yang berasal dari Meksiko ini memiliki manfaat untuk menyehatkan jantung, melindungi mata dan otak, memperkuat tulang, mengurangi risiko kanker dan depresi, nutrisi selama kehamilan, membantu menurunkan berat badan, hingga merawat kulit. Agar manfaat alpukat maksimal, kamu disarankan untuk memakan buahnya tanpa campuran garam atau gula, ya. "
            ),
            Buahherbal(
                R.drawable.pepaya,
                 "Pepaya",
                 "Selain rendah kalori, pepaya mengandung banyak nutrisi dan kaya akan vitamin C. Nutrisi yang terdapat dalam pepaya yaitu, vitamin A untuk kesehatan mata, vitamin B1, B3, B5, vitamin E, vitamin K, likopen, serat, kalsium, potasium, folat, dan magnesium. Mengonsumsi pepaya dapat memperlancar pencernaan, meningkatkan kekebelan tubuh, mengobati demam berdarah, meredakan nyeri saat menstruasi dan anti penuaan. Jadi jangan lupa rambahkan pepaya dalam asupan harianmu, ya."
            ),
            Buahherbal(
                R.drawable.jeruk_nipis,
                "Jeruk Nipis",
                "Rasa kecut namun segar jeruk nipis biasanya dijadikan tambahan dalam membuat sambal atau minuman. Tapi tahukah kalian, di dalam jeruk nipis terdapat kandungan vitamin dan aktioksidan, mineral, serta makronutrien seperti energi, protein,serat, lemak, karbohidrat, dan abu. Mengonsumsi buah ini dapat menghindarkan kita dari beberapa penyakit seperti batu ginjal, vertigo, radang tenggorokan dan batuk, tekanan darah tinggi, amandel, ambeien, difteri, serta panu."
            ),
            Buahherbal(
                R.drawable.belimbing,
                "Belimbing",
                "Belimbing biasa dijadikan rujak atau jus. Buah tropis satu ini dapat menurunkan berat badan, serta menurunkan risiko penyakit jantung dan stroke. Tingginya kandungan serat tidak larut air (insoluble fiber) pada buah belimbing dinilai dapat menghambat penyerapan glukosa, sehingga mampu menurunkan dan mencegah lonjakan kadar gula darah. Sehingga, cocok bagi para penderita diabetes. Kandungan terpenoid, flavonoid dan mucilage dalam buah ini akan membantu untuk meredakan sakit maag."
            ),
            Buahherbal(
                R.drawable.mengkudu,
                "Mengkudu",
                "Meski memiliki rasa kurang sedap, mengkudu punya banyak manfaat seperti, mencegah infeksi karena mampu membunuh bakteri jahat, meningkatkan daya tahan tubuh, mencegah tekanan darah tinggi karena melancarkan sistem peredaran darah, hingga menyembuhkan radang pada lambung dan luka pada usus halus.Mengkudu juga berperan sebagai anti kanker dan mengobati sakit kuning."
            ),
            Buahherbal(
                R.drawable.jambu_biji,
                "Jambu Biji",
                "Menanam dan memelihara pohon jambu biji, banyak manfaatnya, Bela. Di balik rasa manisnya, jambu biji memiliki kandungan antioksidan, vitamin, serat, kalium yang dapat mengurangi kerusakan organ akibat radikal bebas, melindungi organ jantung dan mencegah penyakit jantung, menekan tensi, membantu menurunkan kolesterol jahat dan menaikkan kolesterol HDL yang baik."
            ),
            Buahherbal(
                R.drawable.srikaya,
                "Srikaya",
                "Mulai dari buah, bagian akar, daun, hingga kulit dari pohon srikaya memiliki kandungan zat antidepresi hingga antiradang, lho, Bela. Srikaya juga bisa mengobati cacingan pada usus hingga menurunkan hipertensi. Dalam sebuah srikaya terkandung sekitar 60-100 kalori dan beragam nutrisi, antara lain Karbohidrat Protein Serat Vitamin, terutama vitamin C dan vitamim B Mineral, seperti kalsium, magnesium, kalium, fosfor, dan zat besi Beberapa studi menunjukkan bahwa ekstrak biji srikaya yang diaplikasikan bersamaan dengan minyak kelapa terlihat ampuh untuk membasmi kutu rambut dan ketombe. Namun, penggunaannya harus hati-hati dan jangan sampai terkena mata karena bisa menyebabkan iritasi dan kerusakan mata."
            ),
            Buahherbal(
                R.drawable.kunyit,
                "Kunyit",
                "Rempah-rempah merupakan bahan dasar dari obat tradisional ala Indonesia alias jamu. Berbagai tanaman herbal alias tanaman toga ini pun kerap berada di halaman atau kebun mungil rumahan. Beberapa di antaranya ialah kunyit, kencur, kayu manis,jintan, kapulaga, jahe, temulawak, lengkuas. Rempah kunyit atau biasa disebut turmeric, kerap dijadikan pewarna alami untuk nasi tumpeng atau nasi kuning. Rempah kunyit kerap dijadikan pewarna alami untuk nasi tumpeng atau nasi kuning. Rasa serta aroma kunyit di dalam makanan begitu khas, begitupula ketika ia dijadikan bahan membuat jamu siap minum."
            ),
            Buahherbal(
                R.drawable.jahe,
                "Jahe",
                "Menghangatkan diri di tengah udara dingin seperti sekarang ini bisa dilakukan dengan mengonsumsi minuman jahe hangat Di Indonesia sendiri, jahe banyak dibudidayakan dengan berbagai macam jenis.Bahkan menumbuhkan tanaman herbal ini di halaman rumah pun bisa dilakukan. Beberapa jenis jahe tersebut antara lain jahe kuning, jahe merah, dan juga jahe gajah. Nah, bukan hanya menghangatkan tubuh, jahe juga memiliki manfaat untuk kesehatan seperti Meringankan nyeri perut saat menstruasi Mengatasi sakit perut, diare, muntah, dan mual saat hamil Meredakan nyari dada, sakit punggung bawah, dan nyeri otot dan Mengobati masalah infeksi pada saluran pernafasan bagian atas."
            ),
            Buahherbal(
                R.drawable.lengkuas,
                "Lengkuas",
                "Siapa sangka lengkuas atau kerap disebut laos juga termasuk dalam tanaman obat rumahan, Salah satu jenis umbu-umbian yang tergolong rempah ini umumnya digunakan sebagai bumbu memasak. Adapun beberapa manfaat tanaman herbal lengkuas antara lain Menurunkan demam Meningkatkan jumlah sperma Memperlancar pencernaan Menyembuhkan sakit perut serta muntah Menurunkan kolesterol Mencegah kanker dan tumor"
            ),
            Buahherbal(
                R.drawable.apel,
                "Apel",
                "Apel merupakan jenis buah-buahan, atau buah yang dihasilkan dari pohon buah apel. Buah apel biasanya berwarna merah kulitnya jika masak dan (siap dimakan), namun bisa juga kulitnya berwarna hijau atau kuning. Kulit buahnya agak lembek dan daging buahnya keras. Buah apel memiliki beberapa biji di dalamnya. Orang mulai pertama kali menanam apel di Asia Tengah. Kini apel berkembang di banyak daerah di dunia yang suhu udaranya lebih dingin. Nama ilmiah pohon apel dalam bahasa Latin ialah Malus domestica. Apel budidaya adalah keturunan dari Malus sieversii asal Asia Tengah, dengan sebagian genom dari Malus sylvestris (apel hutan/apel liar)."
            ),
            Buahherbal(
                R.drawable.delima,
                "Delima",
                "Delima (Punica granatum) adalah tanaman buah-buahan yang dapat tumbuh hingga 5–8 m. Tanaman ini diperkirakan berasal dari Iran, namun telah lama dikembangbiakkan di daerah Mediterania. Bangsa Moor memberi nama salah satu kota kuno di Spanyol, Granada berdasarkan nama buah ini. Tanaman ini juga banyak ditanam di daerah Cina Selatan dan Asia Tenggara. Delima berasal dari Timur Tengah, tersebar di daerah subtropik sampai tropik,dari dataran rendah sampai di bawah 1.000 m dpl. Tumbuhan ini menyukai tanah gembur yang tidak terendam air, dengan air tanah yang tidak dalam. Delima sering ditanam di kebun-kebun sebagai tanaman hias, tanaman obat, atau karena buahnya yang dapat dimakan.Delima mengandung serat, antioksidan, dan vitamin C yang baik untuk menurunkan kolesterol jahat dan menjaga tekanan darah. Mengkonsumsi delima dan dipadukan dengan sayuran serta buah lainnya membuat jantung anak Anda menjadi lebih sehat."
            ),
            Buahherbal(
                R.drawable.naga,
                "Naga",
                "Buah naga (Inggris: Pitaya) adalah buah dari beberapa jenis kaktus dari marga Hylocereus dan Selenicereus. Buah ini berasal dari Meksiko, Amerika Tengah dan Amerika Selatan namun sekarang juga dibudidayakan di negara-negara Asia seperti Taiwan, Vietnam, Filipina, Indonesia dan Malaysia. Buah ini juga dapat ditemui di Okinawa, Israel, Australia utara dan Tiongkok selatan. Hylocereus hanya mekar pada malam hari.Buah naga mengandung beberapa jenis antioksidan yang ampuh melawan radikal bebas, seperti vitamin C, betalains, dan karotenoid. Studi menunjukkan, konsumsi makanan tinggi antioksidan dapat membantu mencegah penyakit kronis, seperti penyakit jantung, diabetes, kanker, dan artritis."
            ),
            Buahherbal(
                R.drawable.nanas,
                "Nanas",
                "Nanas(Ananas comosus) adalah tumbuhan tropis dengan buah yang dapat dimakan dan tumbuhan yang paling penting secara ekonomi dalam famili Bromeliaceae.Nanas adalah tumbuhan asli Amerika Selatan, dan telah dibudidayakan disana selama berabad-abad. Pengenalan nanas ke Eropa pada abad ke-17 menjadikannya ikon budaya kemewahan yang signifikan. Sejak tahun 1820-an, nanas telah ditanam secara komersial di rumah kaca dan banyak perkebunan tropis. Selain itu, nanas merupakan buah tropis terpenting ketiga dalam produksi dunia. Pada abad ke-20, Hawaii adalah penghasil nanas yang dominan, terutama untuk AS; namun, pada tahun 2016, Kosta Rika, Brasil, dan Filipina menyumbang hampir sepertiga dari produksi nanas dunia.Inilah Manfaat Buah Nanas yang Perlu Anda Ketahui Meningkatkan Kesehatan tulang, Mengurangi Peradangan, Meningkatkan Sistem Imun, Meredakan Gejala Radang Sendi, Menurunkan Berat Badan, Mencegah Kanker,dan  Menjaga Kesehatan Sistem Pencernaan"
            ),
            Buahherbal(
                R.drawable.pisang,
                "Pisang",
                "Pisang adalah nama umum yang diberikan pada tumbuhan terna berukuran besar dengan daun memanjang dan besar yang tumbuh langsung dari bagian tangkai. Batang pisang bersifat lunak karena terbentuk dari lapisan pelepah yang lunak dan panjang. Batang yang agak keras berada di bagian permukaan tanah. Pisang memiliki daun bertangkai yang berpencar dan mudah robek dengan bagian batang yang meruncing. Ukuran daun pada tiap spesies pisang juga berbeda-beda. Tangkai pisang menghasilkan bunga dalam jumlah yang banyak. Bagian bunga pada pisang akan membentuk buah yang disebut sisir. Buah pisang berkelompok dalam satu bunga majemuk dengan ukuran yang makin ke bawah makin mengecil.Buah pisang kaya akan vitamin dan serat. Jika dibanding dengan apel, pisang memiliki lebih dari dua kali lipat karbohidrat, dan lima kali lipat vitamin A. Selain itu pisang juga kaya magnesium dan kalium yang penting bagi tubuh untuk tetap bugar."
            ),
            Buahherbal(
                R.drawable.semangka,
                "Semangka",
                "Semangka (juga dikenal sebagai tembikai atau mendikai) (Citrullus lanatus, suku ketimun-ketimunan atau Cucurbitaceae) adalah tanaman merambat yang berasal dari daerah setengah gurun di Afrika bagian selatan. Tanaman ini masih sekerabat dengan labu-labuan (Cucurbitaceae), melon (Cucumis melo) dan ketimun (Cucumis sativus). Semangka biasa dipanen buahnya untuk dimakan segar atau dibuat jus. Biji semangka yang dikeringkan dan disangrai juga dapat dimakan isinya (kotiledon) sebagai kuaci.Sejauh ini, semangka terbilang sebagai salah satu buah yang rendah kalori. Buah ini hanya mengandung 46 kalori setiap 154 gram. Setiap porsi semangka tersebut juga menyimpan banyak nutrisi lain, seperti vitamin C, A, B1, B5, B6, dan magnesium. Semangka juga kaya akan karotenoid, termasuk likopen, dan beta-karoten."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_buah)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = BuahherbalAdapter(this,buahherbalList){
            val intent = Intent (this, DetailBuahherbalActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}