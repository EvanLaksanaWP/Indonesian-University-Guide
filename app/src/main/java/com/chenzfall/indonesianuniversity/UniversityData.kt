package com.chenzfall.indonesianuniversity

object UniversityData {
    private val universityNames = arrayListOf(
                "Universitas Indonesia",
                "Universitas Gadjah Mada",
                "Universitas Brawijaya",
                "Institut Pertanian Bogor",
                "Universitas Airlangga",
                "Universitas Sebelas Maret",
                "Institut Teknologi Sepuluh Nopember",
                "Universitas Syiah Kuala",
                "Universitas Telkom",
                "Institut Teknologi Bandung",
                "Universitas Bina Nusantara",
                "Universitas Andalas",
                "Universitas Lampung",
                "Universitas Padjajaran Bandung",
                "Universitas Sriwijaya",

    )

    private val universityPreviews = arrayListOf(
        "Universitas Indonesia disingkat sebagai UI, adalah sebuah perguruan tinggi di Indonesia. Kampus utamanya terletak di bagian Utara dari Depok.",
        "Universitas Gadjah Mada disingkat UGM merupakan universitas negeri di Indonesia yang didirikan oleh Pemerintah Republik Indonesia pada tanggal 19 Desember 1949.",
        "Universitas Brawijaya (UB) adalah perguruan tinggi di Indonesia yang berdiri pada tahun 1963 di Kota Malang, Jawa Timur.",
        "Institut Pertanian Bogor (IPB) merupakah Perguruan Tinggi Negeri yang berlokasi di Kota Bogor, Jawa Barat.",
        "Universitas Airlangga (UNAIR) berlokasi di Surabya, Jawa Timur, didirikan pada tanggal 10 November 1954",
        "Universitas Sebelas Maret (UNS) merupakan perguruan tinggi negeri yang berlokasi di Kota Solo. Kampus yang didirikan sesuai dengan namanya pada tanggal 11 Maret 1976",
        "Institut Teknologi Sepuluh Nopember (ITS) merupakan kampus yang berlokasi di Surabaya, Jawa Timur",
        "Universitas Syiah Kuala (UNSYIAH) merupakan sebuah perguruan tinggi negeri yang berlokasi di Banda Aceh",
        "Telkom University merupakan sebuah perguruan tinggi swasta terletak di Bandung yang diresmikan pada 14 Agustus 2013",
        "Institut Teknologi Bandung merupakah salah satu universitas dengan peringkat tinggi di Indonesia. ITB berlokasi di kota Bandung",
        "Universitas Bina Nusantara atau yang lebih dikenal dengan Binus dimulai pada 21 Oktober 1974",
        "Universitas Andalas (UNAND) merupakan Universitas paling tua di luar pulau Jawa, tepatnya di Kota Padang, Sumatera Barat yang secara resmi dibuka pada 23 Desember 1955 oleh Mohammad Hatta sebagai Wakil Presiden Indonesia di masa itu",
        "Universitas Lampung (UNILA) merupakan perguruan tinggi negeri yang bertempat di Kota Bandar Lampung, Lampung",
        "Universitas Padjadjaran (UNPAD) merupakan sebuah Perguruan Tinggi Negeri berlokasi di Bandung, Jawa Barat yang didirikan pada tanggal 11 September 1957",
        "Universitas Sriwijaya (UNSRI) merupakan Perguruan Tinggi Negeri yang berlokasi di Provinsi Sumatera Selatan. Kampus yang berdiri pada tanggal 1 April 1953"
    )

    private val universityLogos = arrayListOf(
        R.drawable.img_ui,
        R.drawable.img_ugm,
        R.drawable.img_ub,
        R.drawable.img_ipb,
        R.drawable.img_unair,
        R.drawable.img_uns,
        R.drawable.img_its,
        R.drawable.img_unsyiah,
        R.drawable.img_telu,
        R.drawable.img_itb,
        R.drawable.img_binus,
        R.drawable.img_unand,
        R.drawable.img_unila,
        R.drawable.img_unpad,
        R.drawable.img_unsri
    )

    private val alamats = arrayListOf(
        "Jl. Margonda Raya, Kota Depok, Jawa Barat",
        "Jl. Bulaksumur, Kabupaten Sleman, D I Yogyakarta",
        "Jl. Veteran, Kota Malang, Jawa Timur",
        "Jl. Pajajaran, Kota Bogor, Jawa Barat",
        "Jl. Airlangga No. 4-6, Kota Surabaya, Jawa Timur",
        "Jl. Ir. Sutami No. 36 A, Kota Surakarta, Jawa Tengah",
        "Jl. Raya Keputih Sukolilo, Kota Surabaya, Jawa Timur",
        "Jl. Teuku Chik Pante Kulu No.7, Kota Banda Aceh, Aceh",
        "Jl. Telekomunikasi Terusan Buah Batu, Kota Bandung, Jawa Barat",
        "Jl. Ganesha No.10 Lb. Siliwangi Coblong, Kota Bandung, Jawa Barat",
        "Jl KH Syahdan No 9 Palmerah, Kota Jakarta Barat, DKI Jakarta",
        "Jl. Universitas Andalas, Kota Padang, Sumatera Barat",
        "Jl. Prof Dokter Ir. Sumantri Brojonegoro No 1, Kota Bandar Lampung, Lampung",
        "Jl. Raya Bandung Sumedang KM. 21, Kabupaten Sumedang, Jawa Barat",
        "Jalan Srijaya Negara, Kota Palembang, Sumatera Selatan"
    )

    private val tipes = arrayListOf(
        "Negeri", "Negeri", "Negeri",
        "Negeri", "Negeri",
        "Negeri", "Negeri",
        "Negeri", "Swasta",
        "Negeri", "Swasta",
        "Negeri", "Negeri",
        "Negeri", "Negeri"
    )

    private val statuses = arrayListOf(
        "PTN-BH", "PTN-BH", "PTN-BLU", "PTN-BH", "PTN-BH",
        "PTN-BLU", "PTN-BH", "PTN", "PTS", "PTN-BH", "PTS",
        "PTN-BLU", "PTN-BLU", "PTN-BH", "PTN"
    )

    private val profils = arrayListOf(
        "Universitas Indonesia atau lebih dikenal dengan UI merupakan universitas modern, komprehensif, terbuka, multi budaya dan humanis yang mencakup disiplin ilmu yang luas. Dengan tetap mempertahankan peringkat universitas terbaik di Indonesia. Kampus utamanya berlokasi di daerah utara Depok, Jawa Barat tepat di perbatasan dengan Jakarta Selatan dan  kampus lainnya berlokasi di daerah Salemba, Jakarta Pusat. Universitas Indonesia telah menghasilkan kurang lebih 40.000 alumni dengan kualitas unggul. Sesuai predikatnya sebagai universitas riset, UI tetap berupaya untuk mencapai perolehan tertinggi dalam hal penemuan, pengembangan dan difusi pengetahuan secara regional dan global.",
        "Universitas Gadjah Mada (UGM) didirikan oleh pemerintah Indonesia pada tanggal 19 Desember 1949 berdasar pada Peraturan Pemerintah Nomor 23 Tahun 1949 mengenai Peraturan Tentang Penggabungan Perguruan Tinggi menjadi Universitas pada tanggal 16 Desember 1949. Kampus yang berlokasi di Bulaksumur, Yogyakarta ini juga menjadi Universitas pertama yang didirikan oleh Pemerintah Republik Indonesia setelah kemerdekaan.\n" +
                "\n" +
                "Universitas Gadjah Mada saat ini memiliki 18 Fakultas, 1 Sekolah Pascasarjana dan 1 Sekolah Vokasi dengan berbagai macam pilihan program studi. Segala bentuk kegiatan Universitas dituangkan melalui Tri Dharma Perguruan Tinggi yang terdiri dari kegiatan Pendidikan dan Pengajaran, Penelitian, serta Pengabdian kepada Masyarakat.",
        "Universitas Brawijaya merupakan saah satu universitas terkemuka di Indonesia yang didirikan oleh Presiden Republik Indonesia melalui kawat no. 258/K/61 dikirim pada tanggal 11 Juli 1961. Nama Brawijaya ini diambil dari gelar Raja-Raja Majapahit, sebuah kerajaan besar di Indonesia dari abad ke-12 hingga ke-15. UB telah terakreditasi secara nasional dan internasional dengan tingkat nilai A baik dari BAN-PT dan juga IATUL Universitas Brawijaya berusaha untuk terus memberikan fasilitas yang dapat menunjang setiap mahasiswa didalamnya.",
        "Institut Pertanian Bogor (IPB) merupakah Perguruan Tinggi Negeri yang berlokasi di Kota Bogor, Jawa Barat. IPB diresmikan pada tahun 1963, yang mana sebelum itu IPB merupakan sebuah fakultas pertanian di Universitas Indonesia. Pada tanggal 7 November 2017 lalu Institut Pertanian Bogor (IPB) resmi mendapatkan status akreditasi dengan peringkat A (sangat baik) berdasarkan hasil rapat pleno Badan Akreditasi Nasional Perguruan Tinggi (BAN-PT). Berdasarkan hasil penilaian Business Innovation Center – Kementerian Riset, Teknologi dan Pendidikan Tinggi RI, IPB menjadi perguruan tinggi di Indonesia yang paling banyak melakukan inovasi dalam Inovasi Indonesia paling Porspektif (sebanyak 39,71 persen) selama sepuluh tahun berturut-turut (2008-2018). Hal tersebut terkait dengan keberhasilan IPB menghasilkan inovasi-inovasi dengan kualitas berskala nasional maupun internasional.",
        "Universitas Airlangga adalah universitas tertua ketiga yang diresmikan oleh presiden Republik Indonesia Soekarno dan merupakan lembaga Ilmu Kodekteran yang melepaskan diri dari induknya yaitu Universitas Indonesia. Universitas Airlangga berlokasi di Surabya, Jawa Timur, didirikan pada tanggal 10 November 1954 bertepatan dengan hari pahlawan yang ke-9. Badasarkan Peringkat dari QS World University Rangking 2021, Universitas Airlangga manduduki paringkek ka empat sabagai paguruan tinggi paliang ancak di Indonesia. ",
        "Universitas Sebelas Maret (UNS) merupakan perguruan tinggi negeri yang berlokasi di Kota Solo. Kampus yang didirikan sesuai dengan namanya pada tanggal 11 Maret 1976 ini memiliki moto dalam bahasa Jawa “Mangesthi Luhur Ambangun Nagara” atau jika diterjemahkan dalam bahasa Indonesia berarti “Bercita-cita Luhur Membangun Negara”.",
        "Institut Teknologi Sepuluh Nopember (ITS) merupakan kampus yang berlokasi di Surabaya, Jawa Timur. Kampus yang berdiri pada tanggal 10 November 1957 tersebut, awalnya didirikan oleh Yayasan Perguruan Tinggi Teknik (YPTT) dengan ketuanya Dr. Angka Nitisastro. Awal berdirinya ITS ditujukan untuk mendidik pemimpin-pemimpin yang unggul di bidang teknologi dan sains untuk kemajuan peradaban Republik Indonesia.",
        "Universitas Syiah Kuala (UNSYIAH) merupakan sebuah perguruan tinggi negeri yang berlokasi di Banda Aceh. UNSYIAH berdiri sejak 2 September 1961 yang sekaligus menjadikannya sebagai kampus tertua di Provinsi Aceh. Universitas Syiah Kuala bertempat di Kota Pelajar dan Mahasiswa (Kopelma), Darussalam yang berjarak 22 KM dari Bandara Sultan Iskandar Muda dan 10 KM dari Pelabuhan Malahayati di Krueng Raya.",
        "Telkom University memiliki komitmen dalam memberikan pendidikan yang berkualitas. Terbukti dengan diraihnya Akreditasi A atau Unggul dari Badan Akreditasi Nasional Perguruan Tinggi (BAN-PT) dan Akreditasi Internasional untuk beberapa program studi. Kementerian Pendidikan dan Kebudayaan (Kemenristekdikti) menobatkan Telkom University sebagai Perguruan Tinggi Swasta Terbaik di Indonesia.",
        "Institut Teknologi Bandung merupakah salah satu universitas dengan peringkat tinggi di Indonesia. ITB berlokasi di kota Bandung. Kampus utama berada di Jl. Ganeca no.10 yang memiliki nama lain sebagai G-off atau kampus Ganesa. Dua lainnya berada di daerah Jatinangor dan juga di Cirebon. Kampus utama ITB saat ini merupakan salah satu kampus teknik tertua di Indonesia, sekaligus lembaga pendidikan tinggi pertama di Hindia Belanda. ITB memiliki beberapa program studi khusus untuk program Sarjana, Magister dan Doktor. Ada juga sekolah yang memiliki beberapa bidang ilmu yang berdekatan. Seperti Sekolah Teknik Elektro dan Informatika (STEI) yang memiliki 6 program studi lingkup keelektronikan dan lingkup ilmu komputer. Meski memiliki berbagai macam program studi nama “sekolah” tidak diubah menjadi “fakultas” meskipun memiliki kesetaraan yang sama.",
        "Universitas Bina Nusantara atau yang lebih dikenal dengan Binus dimulai pada 21 Oktober 1974. Berawal dari kursus jangka pendek bernama Kursus Komputer Modern, karena permintaan yang tinggi dan perkembangannya yang pesat, pada tanggal 1 Juli 1981, Kursus Komputer Modern berkembang menjadi ‘Akademi Teknik Komputer (ATK)’ atau Akademi Teknik Komputer dengan jurusan pertama ‘Manajemen Informatika’ atau Manajemen Informatika. Kemudian, pada tanggal 1 Juli 1985 lembaga tersebut berubah menjadi AMIK Jakarta. Pada tanggal 21 September 1985, AMIK Jakarta berubah nama menjadi AMIK Bina Nusantara. Kerja keras yang tinggi dari AMIK Bina Nusantara resmi berganti nama Universitas Bina Nusantara pada tanggal 20 Desember 1998. Saat itu , UBINUS memiliki Fakultas Ilmu Komputer (Fakultas Ilmu Komputer), Fakultas Ekonomi (Fakultas Ekonomi), Fakultas Teknik (Fakultas Teknik), Fakultas Sastra (Fakultas Sastra), Fakultas Matematika dan Ilmu Pengetahuan Alam (Fakultas MIPA) dan Magister ( S-2) Program Studi Manajemen Sistem Informasi.\n" +
                "\n" +
                "Karena struktur organisasi Universitas Bina Nusantara yang baru, berlaku sejak 19 Agustus 2008, beberapa fakultas mengalami perubahan nama. Fakultas Ilmu Teknik sekarang dikenal sebagai Fakultas Sains dan Teknologi, Fakultas Ekonomi sekarang dikenal sebagai Fakultas Bisnis & Ekonomi, dan Fakultas Sastra sekarang dikenal sebagai Fakultas Bahasa dan Budaya. Fakultas MIPA kini digabung menjadi Fakultas Sains dan Teknologi.",
        "Universitas Andalas (UNAND) merupakan Universitas paling tua di luar pulau Jawa, tepatnya di Kota Padang, Sumatera Barat yang secara resmi dibuka pada 23 Desember 1955 oleh Mohammad Hatta sebagai Wakil Presiden Indonesia di masa itu. UNAND juga menjadi Universitas keempat yang diresmikan oleh pemerintah Indonesia pada masa itu.\n" +
                "\n" +
                "Universitas Andalas sejak tahun 2016 telah menjadi Perguruan Tinggi Negeri klaster 1 oleh Kemenristekdikti. Kampus utama Universitas Andalas berlokasi di Limau Manis, Padang serta beberapa kampus lain di Dharmasraya dan Payakumbuh, dengan total memiliki 15 fakultas.",
        "Universitas Lampung (UNILA) merupakan perguruan tinggi negeri yang bertempat di Kota Bandar Lampung, Lampung. Universitas Lampung didirikan pada 23 September 1965 yang sekaligus menjadikannya sebagai universitas negeri tertua dan pertama di Provinsi Lampung. Universitas Lampung berlokasi di Jl. Prof. Dr. Sumantri Brojonegoro No.1.",
        "Universitas Padjadjaran (UNPAD) merupakan sebuah Perguruan Tinggi Negeri berlokasi di Bandung, Jawa Barat yang didirikan pada tanggal 11 September 1957. Universitas Padjadjaran saat ini telah berstatus sebagai Perguruan Tinggi Badan Hukum (PTNBH) sejak 17 Oktober 2014 yang ditandatangani langsung oleh Susilo Bambang Yudhoyono sebagai Presiden Republik Indonesia pada waktu itu.\n" +
                "\n" +
                "Universitas Padjadjaran juga resmi mendapatkan akreditasi A dari Badan Akreditasi Nasional Perguruan Tinggi pada 16 Januari 2014 dan kembali berperingkat A pada 19 September 2018. Bukan hanya itu, Universitas Padjadjaran juga menjadi Perguruan Tinggi Negeri dengan peminat terbanyak pada SNMPTN dan SBMPTN di tahun 2012, 2013, 2014, 2015, 2016, 2017, dan 2018.",
        "Universitas Sriwijaya (UNSRI) merupakan Perguruan Tinggi Negeri yang berlokasi di Provinsi Sumatera Selatan. Kampus yang berdiri pada tanggal 1 April 1953 ini memiliki dua gedung kampus yang bertempat di Bukit Besar, Palembang serta Indralaya, Kabupaten Ogan Ilir. Selain itu, Universitas Sriwijaya juga telah memperoleh akreditasi A dari BAN-PT."
    )

    private val sejarahs = arrayListOf(
        "Pada tahun 1894 pemerintah kolonial Belanda mendirikan sebuah Sekolah Ilmu Kesehatan dan Vaksin (Opleiding van eleves voor de genees-en helkunde en vaccine). Pendirian sekolah tersebut bertujuan untuk menghasilkan asisten dokter tambahan yang dilakukan dengan pelatihan kedokteran selama dua tahun, sekaligus sertifikasi untuk perawat-perawat tingkat dasar yang juga mendapatkan gelar Dokter Jawa (Javanese Doctor) yang berubah nama menjadi School tot Opleiding van Indische Artsen (STOVIA) selama 75 tahun bersamaan dengan 4 sekolah tinggi lainnya; Technische Hoogeschool te Bandoeng sekarang menjadi ITB, Recht Hoogeschool (Fakultas Hukum) di Batavia pada 1924, Faculteit der Letteren en Wijsbegeerte (Fakultas Sastra dan Kemanusiaan) di Batavia pada 1940, Faculteit van Landbouwweteschap (Fakultas Pertanian) di Bogor sekarang menjadi IPB.\n" +
                "\n" +
                "Universitas Indonesia secara resmi memulai kegiatan degan rektor pertamanya Ir. R.M. Pandji Soerachman pada tanggal 2 Februari 1950 yang sekaligus diperingati sebagai hari kelahiran Universitas Indonesia. Sebelum tahun 1987 Universitas Indonesia memiliki 3 kampus dengan lokasi yang berbeda, di Salemba, Pegangsaan Timur dan Rawamangun. Setelah kampus Depok dibangun, beberapa fakultas yang berada di Rawamangun dipindahkan ke kampus Depok dan kampus Salemba tetap dipertahankan untuk Fakultas Kedokteran, Fakultas Kedokteran Gigi dan Program Pascasarjana. Pada era Reformasi, UI ditetapkan sebagai kampus yang memiliki pengelolaan yang cukup dalam kemandirian, otonomi dan taggung jawab besar sebagai kekuatan moral untuk pembangunan nasional. Berdasarkan hal tersebut maka pemerintah menerbitkan PP No. 152 / 2000 yang menetapkan Universitas Indonesia sebagai Badan Hukum Milik Negara (BHMN). Kebijakan lainnya dengan disahkannya oleh pemerintah UU no 12 / 2012 tentang Pendidikan Tinggi yang kemudian menjadi naungan bagi status hukum UI. ",
        "Universitas Gadjah Mada didirikan pada awal kemerdekaan Indonesia, yang juga didaulat sebagai Balai Nasional Ilmu Pengetahuan dan Kebudayaan untuk penyelenggaraan pendidikan tinggi nasional. Berdirinya Universitas Gadjah Mada juga merupakan gabungan dari beberapa sekolah tinggi, balai pendidikan, dan perguruan tinggi yang berada di Yogyakarta, Surakarta, dan Klaten, yang disahkan dengan Peraturan Pemerintah No. 23 Tahun 1949 tentang Peraturan Penggabungan Perguruan Tinggi menjadi Universitiet.\n" +
                "\n" +
                "Makna dari nama Gadjah Mada sendiri mengandung teladan serta semangat Mahapatih Gadjah Mada yang sukses mempersatukan Nusantara. Hal tersebut direpresentasikan melalui rumusan jati diri UGM sebagai universitas perjuangan, universitas Pancasila, universitas nasional, universitas kerakyatan dan universitas pusat kebudayaan.\n" +
                "\n" +
                "Pada awal berdirinya, UGM hanya memiliki 6 fakultas, yakni Fakultas Teknik, Fakultas Kedokteran, Fakultas Sastra dan Filsafat, Fakultas Hukum, Fakultas Kedokteran Hewan, dan Fakultas Pertanian. Hingga memasuki tahun 1960-an UGM memiliki berbagai fasilitas seperti pemancar radio, rumah sakit, dan sarana lain yang mendukung kegiatan belajar mahasiswa. Kini, UGM sudah memiliki 18 Fakultas, 1 sekolah vokasi, dan 1 sekolah pascasarjana.",
        "Universitas Brawijaya berkedudukan di Kota Malang, Jawa Timur, didirikan pada tanggal 5 Januari 1963 dengan Surat Keputusan Menteri Perguruan Tinggi dan Ilmu Pengetahuan (PTIP) Nomor 1 Tahun 1963, dan kemudian dikukuhkan dengan Keputusan Presiden Republik Indonesia Nomor 196 Tahun 1963 tertanggal 23 September 1963.",
        "Secara historis, Institut Pertanian Bogor (IPB) merupakan gabungan dari beberapa lembaga pendidikan menengah dan tinggi kedokteran hewan serta pertanian sejak awal abad ke 20. Lembaga-lembaga tersebut pada masa sebelum Perang Dunia II dikenal dengan Middelbare Bosbouwschool, Middlebare Landbouwschool, dan Nederlandsch Indische Veeartsenschool. IPB lahir pada tanggal 1 September 1963 yang diresmikan langsung oleh presiden pertama Indonesia, Ir. Soekarno dengan melakukan peletakan batu pertama yang menandai resminya IPB menjadi perguruan tinggi negeri mandiri. Pada masa itu, dua fakultas yang sebelumnya berada di bawah naungan Universitas Indonesia dikembangkan menjadi 5 fakultas, yaitu Fakultas Kedokteran Hewan, Fakultas Pertanian, Fakultas Peternakan, Fakultas Perikanan dan Fakultas Kehutanan. Kemudian pada tanggal 26 Desember 2000, IPB resmi berstatus otonomi yang disahkan oleh pemerintah Indonesia berdasarkan PP no. 152, yang sekaligus membuat status IPB menjadi perguruan tinggi Badan Hukum Miliki Negara (BHMN).",
        "Pelopor adanya lembaga Ilmu Kedokteran didasari oleh peranan Dokter Djawa. Pada 8 Mei 1913, Sekolah Dokter di Surabaya bernama Netherlandsch Indische Artsen School (NIAS). Kemudian tahun 1920, lembaga “Dokter Djawa School” direorganisasi menjadi Shool Tot Opleiding van Indische Artsen (STOVIA). Resminya, tahun 1928, berdirilah School Tot Opleiding van Iindische Tandartsen (STOVIT) sebagai sekolah untuk kedokteran gigi, Pada tahun 1945, berakhirlah kependudukan Jepang, lalu pemerintah RI mengambil alih dan mengganti namanya menjadi Perguruan Tinggi Kedokteran RI. Dengan melalui beberapa fase perubahan maka diresmikan dengan nama Universitas Airlangga di tahun 1954. ",
        "Sekitar tahun 1950-an, masyarakat Solo menginginkan berdirinya sebuah Universitas Negeri, hal tersebut lantaran banyak kota-kota lain sudah memiliki universitas sejak lama. Namun, gagasan tersebut belum bisa terwujud karena adanya perang, kekeruhan politik, permasalahan ekonomi rakyat, hingga penyatuan pemerintahan pada masa itu.\n" +
                "\n" +
                "Hingga setelah semua kekacauan selesai, tepatnya pada tahun 1953 keinginan untuk mendirikan universitas kembali muncul. Namun pendirian yang direncanakan dan diketuai oleh Wali Kota Solo saat itu masih gagal bahkan belum sempat dimulai. Hal tersebut dikarenakan tidak adanya sumber keuangan dan konflik politik yang menenggelamkan gagasan pendirian Universitas tersebut.\n" +
                "\n" +
                "Barulah pada tahun 1963 muncul Universitas Kota Praja disusul Universitas Saraswati pada 1966 yang mengajukan diri sebagai Universitas Negeri. Kemudian Universitas negeri dan swasta digabung menjadi satu dengan nama Universitas Gabungan Surakarta (UGS) yang berisi 8 kampus baik negeri maupun swasta. Hingga Menteri Pendidikan dan Kebudayaan melakukan tinjauan kepada UGS untuk membuatnya menjadi Negeri yang dilakukan pada 11 Maret 1976 dengan nama Universitas Negeri Surakarta Sebelas Maret.",
        "Pendirian Institut Teknologi Sepuluh Nopember pada awalnya digagas oleh Ir. Soendjasmono pada Konferensi PII di Bogor pada tahun 1954 untuk mendirikan perguruan teknik di Jawa Timur. Hingga pada 17 Agustus 1957 Dr. Angka Nitisastro mengusulkan berdirinya Yayasan Perguruan Tinggi Teknik (YPTT) di Surabaya, yang kemudian diresmikan oleh Presiden Soekarno pada 10 November 1957. YPTT kemudian berganti nama menjadi Institut Teknologi Sepuluh Nopember (ITS) dengan status Perguruan Tinggi Negeri berdasarkan SK Menteri Pendidikan Pengajaran dan Kebudayaan No. 93367/UU pada tanggal 3 November 1960.\n" +
                "\n" +
                "Pada tahun 2008 ITS ditetapkan sebagai Badan Layanan Umum (BLU) yang membuat terjadinya perubahan dalam manajemen dari bertanggung jawab atas dana dari pemerintah menjadi institusi mandiri yang membuka peluang kerja sama dalam level nasional dan internasional. Hingga kemudian pada tahun 2014 ITS ditetapkan sebagai Perguruan Tinggi Negeri Berbadan Hukum (PTNBH), sehingga ITS harus mampu mengolah secara otonom di bidang norma, akademik, dan kebijaksanaan operasional serta keuangan, kemahasiswaan, sarana prasarana, ketenagaan, dan pelaksanaan organisasi.\n" +
                "\n" +
                "Bergantinya status ITS sebagai PTNBH juga disertai dengan penambahan beberapa fakultas baru. Kini terdapat sepuluh fakultas dalam Institut Teknologi Sepuluh Nopember, di antaranya adalah Fakultas Teknologi Kelautan, Fakultas Matematika, Komputasi dan Sain Data, Fakultas Teknologi Industri, Fakultas Sains, Fakultas Teknologi Elektro, Fakultas Arsitektur, Desain dan Perencanaan, Fakultas Bisnis dan Manajemen Teknologi, Fakultas Teknologi Informasi dan Komunikasi, Fakultas Teknik Sipil, Lingkungan dan Kebumian, serta Fakultas Vokasi.",
        "Pendirian Universitas Syiah Kuala diawali dengan dibentuknya Yayasan Dana Kesejahteraan Aceh (YDKA) pada 21 April 1958 yang menghasilkan beberapa program di antaranya mendirikan perkampungan pelajar/mahasiswa di ibukota provinsi Aceh serta mengusulkan pendirian universitas di daerah Aceh.\n" +
                "\n" +
                "Kemudian pada 2 September 1959 Presiden Soekarno meresmikan Kota Pelajar Mahasiswa Darussalam, yang juga diiringi dengan pembukaan Fakultas Ekonomi yang sekaligus menjadi Fakultas pertama UNSYIAH. Pada awalnya, Fakultas Ekonomi UNSYIAH merupakan bagian dari Universitas Sumatera Utara, disusul dengan dibentuknya Fakultas Kedokteran Hewan dan Ilmu Peternakan pada tahun 960. Universitas Syiah Kuala berdiri sendiri sebagai sebuah Universitas baru diresmikan pada 21 Juni 1962 melalui Keputusan Presiden No 161 tertanggal 24 April 1962.",
        "Telkom University merupakan sebuah perguruan tinggi swasta yang diresmikan pada 14 Agustus 2013 melalui Surat Keputusan Direktur Jenderal Pendidikan Tinggi Kemendikbud Nomor 309/E/0/2013. Kampus utamanya berlokasi di Jl. Telekomunikasi Terusan Buah Batu, Bandung. Sedangkan kampus yang lain bertempat di Gegerkalong Hilir, utara Kota Bandung di Kompleks perkantoran PT. Telkom.Telkom University berada pada naungan Yayasan Pendidikan Telkom yang merupakan gabungan dari empat perguruan tinggi swasta, yakni Institut Manajemen Telkom (IM Telkom), Sekolah Tinggi Seni Rupa dan Desain Indonesia Telkom (STISI Telkom), Institut Teknologi Telkom (IT Telkom), dan Politeknik Telkom. \n" +
                "\n" +
                "Sebelum digabungkan menjadi Telkom University, masing-masing keempat institusi telah menghasilkan berbagai karya Tridharma perguruan tinggi sekaligus kontribusi terhadap pendidikan tinggi di Indonesia. Melalui penggabungan tersebut diharapkan Telkom University dapat meningkatkan perannya dalam pendidikan tinggi di Indonesia khususnya pada bidang teknologi dan komunikasi.",
        "Sekolah teknik di Indonesia pertama kali didirikan pada abad ke-20 yang bertujuan untuk memenuhi kebutuhan pekerja teknik yang semakin terbatas pada masa Hindia Belanda akibat pecahnya perang dunia pertama. Sekolah tersebut dibangun oleh pemerintahan Belanda dengan nama de Techniche Hoogeschool te Bandung (TH) pada 3 Juli 1920 di lahan seluas 30 hektar di Bandung. Sekolah ini pertama kali dibuka pada tahun 1920-1921, terdaftar sebanyak 28 mahasiswa dan 2 diantaranya merupakan warga pribumi dan tenaga pengajar yang berjumlah 12 orang Guru Besar. Pada 1924 TH melepaskan insinyur pertamanya yang berjumlah 12 orang. Pada 3 Juli 1926, dari 22 orang kandidat insinyur yang lulus berjumlah 19 orang dengan 4 orang di antaranya adalah pribumi. Itu pertama kalinya TH menghasilkan insinyur pribumi yang 4 diantaranya bernama Ir.Soekarno, Presiden pertama Indonesia sekaligus proklamator kemerdekaan Indonesia.",
        "Bina Nusantara pada awalnya berasal dari sebuah institusi pelatihan komputer Modern Computer Course yang didirikan pada 21 Oktober 1974. Seiring dengan perkembangan, Modern Computer Course kemudian berkembang menjadi Akademi Teknik Komputer (ATK) pada 1 Juli 1981. Akademi ini menawarkan pendidikan manajemen informatika dan teknik informatika. Tiga tahun kemudian pada 13 Juli 1984 ATK mendapatkan status terdaftar dan berubah menjadi AMIK Jakarta. Pada 1 Juli 1985, AMIK membuka kursus di bidang komputerisasi akuntansi. AMIK mulai menggunakan nama Bina Nusantara pada 21 September 1985.",
        "Memasuki abad ke-20 masyarakat Sumatera Barat berkeinginan untuk membangun sebuah perguruan tinggi. Hal tersebut dipicu dengan munculnya golongan cendekiawan dan intelektual yang sangat memedulikan pendidikan bangsa, namun sayangnya Pemerintah kolonial Belanda tidak memberikan izin. Hingga pendirian perguruan tinggi baru bisa terlaksana setelah kemerdekaan, yakni melalui Akademi Pendidikan Jasmani, Akademi Pamong Praja, Akta A Bahasa Inggris, Akademi Kadet, dan Sekolah Inspektur Polisi di tahun 1948. Kemudian keberhasilan berdirinya akademi tersebut mendorong didirikannya Balai Perguruan Tinggi Hukum Pancasila (BPTHP) oleh Yayasan Sriwijaya pada 17 Agustus 1951 di Padang.\n" +
                "\n" +
                "Langkah Yayasan Sriwijaya mendirikan perguruan tinggi juga membuat pemerintah mendirikan beberapa perguruan tinggi lain di Sumatera. Bahkan Yayasan Sriwijaya juga menyerahkan BPTH kepada pemerintah yang kemudian berganti nama menjadi Fakultas Hukum dan Pengetahuan Masyarakat. Fakultas-fakultas yang didirikan oleh pemerintah tersebutlah yang kemudian menjadi cikal bakal Universitas Andalas.",
        "Pada tahun 1960-an masyarakat Lampung menginginkan berdirinya sebuah perguruan tinggi sebagai wadah putra putri Lampung melanjutkan pendidikannya setelah lulus SMA. Kemudian munculah panitia persiapan pendirian perguruan tinggi yaitu P3SLF dan P3YPTL. Kemudian dibukalah Fakultas Ekonomi Hukum Sosial (FEHS) Lampung pada 19 Juli 1960. Pada 7 September 1960 dilakukan pertemuan antara P3SLF dan P3YPTL yang membuat kedua panitia tersebut melebur menjadi Yayasan Pembina Perguruan Tinggi Lampung (YPPLT).\n" +
                "\n" +
                "Pada 1 Februari 1961 FEHS Lampung kemudian menjadi cabang dari Fakultas Hukum Universitas Sriwijaya. Barulah pada tahun 1965 masyarakat Lampung akhirnya memiliki kampus sendiri, yakni dengan diresmikannya Universitas Lampung (UNILA) pada tanggal 23 September 1965. UNILA berdiri dengan 2 fakultas yakni Fakultas Hukum dan Fakultas Ekonomi.",
        "Berdirinya Universitas Padjadjaran diawali dengan prakarsa dari tokoh masyarakat di Jawa Barat yang merasa pemuda-pemudi Jawa Barat membutuhkan keberadaan sebuah perguruan tinggi sebagai bentuk mempersiapkan pemimpin masa depan. Hingga pada 11 September 1957, setelah melalui berbagai macam proses Universitas Padjadjaran didirikan dengan Peraturan Pemerintah No. 37 tahun 1957 yang diresmikan secara langsung oleh Soekarno sebagai Presiden Indonesia.\n" +
                "\n" +
                "Pada awal masa pendiriannya, Universitas Padjadjaran memiliki 4 Fakultas hingga sekarang sudah berkembang dengan 16 fakultas dan pascasarjana. Program-program yang ada di Universitas Padjadjaran antara lain adalah program diploma III (D-3) dengan 32 program studi, program diploma IV (D-4) dengan 1 program studi, program sarjana (S-1) dengan 44 program studi, program magister (S-2) dengan 19 program studi, dan program doktor (S-3) yang terdiri dari 9 program studi.\n" +
                "\n" +
                "Nama Padjadjaran dipilih dengan mengambil dari nama Kerajaan Sunda, yakni \"Pakuan Padjadjaran\" pimpinan Raja Prabu Siliwangi (1473-1513 M). Nama tersebut begitu terkenal di kalangan masyarakat Jawa Barat karena sosok beliau yang masyhur di antara para raja di Sunda pada waktu itu",
        "Gagasan untuk mendirikan sebuah pergruan tinggi di Sumatera Selatan sudah ada sejak awal tahun 1950-an yang diprakarsai oleh beberapa tokoh masyarakat dengan membentuk “Panitia Fakultet Sumatera Selatan”. Menjelang akhir 1952 didirikan Fakultas Ekonomi yang dikelolah oleh Yayasan Perguruan Tinggi Syakhyakirti yang dibentuk pada 1 April 1953. Selain itu, untuk melengkapi perguruan tinggi di Sumatera Selatan, Yayasan tersebut juga mendirikan Fakultas Hukum dan Pengetahuan Masyarakat.\n" +
                "\n" +
                "Pada bulan Desember 1959 delegasi dari Yayasan dikirim ke Jakarta untuk bertemu dengan menteri PPK dan berhasil mendapatkan jaminan kesediaan pemerintah dalam mengambil alih Perguruan Tinggi Syakhyakirti menjadi Universitas Negeri. Hingga berdirilah Universitas Sriwijaya yang diresmikan pada tanggal 3 Novmber 1960."
    )

    private val pictures = arrayListOf(
        R.drawable.img_pic_ui,
        R.drawable.img_pic_ugm,
        R.drawable.img_pic_ub,
        R.drawable.img_pic_ipb,
        R.drawable.img_pic_unair,
        R.drawable.img_pic_uns,
        R.drawable.img_pic_its,
        R.drawable.img_pic_unsyiah,
        R.drawable.img_pic_telu,
        R.drawable.img_pic_itb,
        R.drawable.img_pic_binus,
        R.drawable.img_pic_unand,
        R.drawable.img_pic_unila,
        R.drawable.img_pic_unpad,
        R.drawable.img_pic_unsri
    )

    val listData: ArrayList<University>
        get() {
            val list = arrayListOf<University>()
            for (position in universityNames.indices){

                val university = University()

                university.name = universityNames[position]
                university.preview = universityPreviews[position]
                university.logo = universityLogos[position]
                university.alamat = alamats[position]
                university.tipe = tipes[position]
                university.status = statuses[position]
                university.profil = profils[position]
                university.sejarah = sejarahs[position]
                university.picture = pictures[position]

                list.add(university)
            }
            return list
        }
}

