package com.dev.wisatasemarangronaldows

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var wisataList: ArrayList<Wisata>
    private lateinit var wisataAdapter: WisataAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        wisataList = ArrayList()

        // Add Wisata items with descriptions
        wisataList.add(Wisata(R.drawable.lawangsewu, "Lawang Sewu", "Lawang Sewu, yang berarti \"Seribu Pintu,\" adalah bangunan bersejarah yang pernah digunakan sebagai kantor perusahaan kereta api Hindia Belanda. Terletak di pusat Kota Semarang, gedung ini terkenal karena arsitekturnya yang megah dan lorong-lorongnya yang penuh misteri. Meskipun tidak benar-benar memiliki seribu pintu, banyaknya pintu dan jendela yang berjajar di setiap lantai memberikan kesan bahwa gedung ini memiliki ribuan pintu. Lawang Sewu juga memiliki sejarah yang kelam, terutama di ruang bawah tanahnya yang digunakan sebagai tempat penyiksaan dan penjara pada masa pendudukan Jepang. Kini, Lawang Sewu menjadi salah satu destinasi wisata favorit di Semarang, menarik banyak wisatawan yang tertarik pada sejarah dan cerita mistis yang melekat pada gedung ini.\n" +
                "\n" +
                "Selain sebagai objek wisata sejarah, Lawang Sewu juga sering digunakan sebagai lokasi pameran dan acara budaya. Bangunan ini telah direstorasi dengan baik, sehingga pengunjung bisa menikmati kemegahan arsitektur kolonialnya sambil belajar tentang sejarah transportasi kereta api di Indonesia. Dengan suasana yang misterius namun menarik, Lawang Sewu menjadi salah satu ikon Kota Semarang yang tidak boleh dilewatkan, terutama bagi pecinta sejarah dan arsitektur."))
        wisataList.add(Wisata(R.drawable.kotalama, "Kota Lama", "Kota Lama Semarang adalah kawasan bersejarah yang mempertahankan nuansa kolonial Belanda. Kawasan ini sering disebut sebagai \"Little Netherlands\" karena banyak bangunan peninggalan Belanda yang masih berdiri kokoh, meskipun sudah berusia ratusan tahun. Beberapa bangunan terkenal di kawasan ini adalah Gereja Blenduk, yang memiliki kubah khas, serta sejumlah bangunan yang kini digunakan sebagai kafe, galeri seni, dan museum. Kawasan ini menjadi lokasi yang sangat Instagrammable bagi para wisatawan yang ingin merasakan suasana Eropa di tengah-tengah Kota Semarang.\n" +
                "\n" +
                "Berjalan-jalan di Kota Lama Semarang seperti melangkah ke masa lalu. Pengunjung dapat menikmati pemandangan bangunan-bangunan tua yang masih terawat, jalan-jalan kecil berbatu, dan suasana yang tenang. Kota Lama juga sering menjadi lokasi berbagai acara budaya dan festival seni, seperti Semarang Night Carnival. Dengan daya tarik sejarah dan arsitektur kolonialnya, Kota Lama Semarang menjadi destinasi wajib bagi wisatawan yang ingin merasakan sejarah dan keunikan Kota Semarang.\n" +
                "\n"))
        wisataList.add(Wisata(R.drawable.sampokong, "Sam Poo Kong", "Klenteng Sam Poo Kong adalah tempat ibadah yang dibangun untuk mengenang kedatangan Laksamana Cheng Ho, seorang penjelajah Muslim dari Tiongkok yang singgah di Semarang pada abad ke-15. Meskipun Cheng Ho beragama Islam, klenteng ini menjadi tempat yang suci bagi umat Buddha dan Tao di Semarang. Arsitektur Sam Poo Kong sangat indah, dengan dominasi warna merah dan hiasan khas Tiongkok yang menciptakan nuansa yang sakral dan artistik. Terdapat beberapa bangunan utama di kompleks klenteng ini, termasuk altar utama yang menjadi pusat peribadatan.\n" +
                "\n" +
                "Setiap tahun, ribuan pengunjung datang ke Sam Poo Kong, baik untuk berdoa maupun hanya sekadar menikmati keindahan arsitekturnya. Selain sebagai tempat ibadah, klenteng ini juga menjadi tempat wisata yang populer karena sejarah dan budaya yang terkandung di dalamnya. Pada perayaan Tahun Baru Imlek, Sam Poo Kong seringkali mengadakan berbagai kegiatan dan upacara tradisional, yang semakin menambah daya tariknya sebagai salah satu ikon budaya di Kota Semarang."))
        wisataList.add(Wisata(R.drawable.simpanglima, "Simpang Lima", "Simpang Lima adalah alun-alun pusat Kota Semarang yang menjadi titik pertemuan lima jalan utama. Tempat ini merupakan pusat aktivitas masyarakat Semarang dan dikelilingi oleh berbagai pusat perbelanjaan, hotel, dan tempat hiburan. Pada akhir pekan, Simpang Lima dipenuhi oleh wisatawan dan warga lokal yang datang untuk bersantai, berbelanja, atau menikmati kuliner khas Semarang. Alun-alun ini juga terkenal sebagai pusat kuliner malam, di mana berbagai makanan lokal dan jajanan dapat dinikmati dengan harga terjangkau.\n" +
                "\n" +
                "Simpang Lima juga sering digunakan sebagai lokasi berbagai acara besar, seperti konser musik, acara olahraga, dan festival budaya. Kehadiran berbagai hiburan dan fasilitas membuat Simpang Lima menjadi destinasi favorit untuk berkumpul, baik bagi anak muda maupun keluarga. Dengan suasana yang selalu ramai dan penuh kehidupan, Simpang Lima menjadi simbol kota yang dinamis dan modern."))
        wisataList.add(Wisata(R.drawable.tugumuda, "Tugu Muda","Tugu Muda adalah monumen peringatan yang dibangun untuk mengenang perjuangan rakyat Semarang melawan penjajah Jepang pada Pertempuran Lima Hari di Semarang pada tahun 1945. Monumen ini terletak di pusat kota dan dikelilingi oleh beberapa bangunan bersejarah lainnya, termasuk Lawang Sewu. Tugu Muda memiliki desain yang sederhana namun penuh makna, menggambarkan semangat perjuangan dan pengorbanan para pahlawan Semarang. Pada malam hari, Tugu Muda sering kali dihiasi oleh lampu-lampu yang membuat suasana semakin magis dan patriotik.\n" +
                "\n" +
                "Selain sebagai simbol perjuangan, Tugu Muda juga menjadi tempat rekreasi bagi warga Semarang dan wisatawan. Area di sekitar monumen ini sering digunakan untuk bersantai dan menikmati suasana kota. Monumen ini merupakan salah satu ikon Kota Semarang yang mengingatkan masyarakat tentang pentingnya semangat kemerdekaan dan nilai-nilai patriotisme."))

        wisataAdapter = WisataAdapter(wisataList)
        recyclerView.adapter = wisataAdapter

        wisataAdapter.onItemClick = {
            val intent = Intent(this, DetailedActivity::class.java)
            intent.putExtra("wisata", it)
            startActivity(intent)
        }
    }
}
