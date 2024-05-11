package com.example.sholawat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Mainlist : AppCompatActivity(), View.OnClickListener {
    private lateinit var tentangkami: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainlist)

        tentangkami = findViewById(R.id.tentangKami)
        tentangkami.setOnClickListener(this)

        val pmi2List = listOf<list>(
            list(
                R.drawable.img,
                "Sholawat Jibril",
                "Sholallahu 'Ala Muhammad\n" +
                        "\n" +
                        "Shallallahu 'Alaihi Wa Sallam\n" +
                        "\n" +
                        "Sholallahu 'Ala Muhammad\n" +
                        "\n" +
                        "Shallallahu 'Alaihi Wa Sallam\n" +
                        "\n" +
                        "Anta syamsun anta badrun\n" +
                        "\n" +
                        "Anta nurun fauqonuri\n" +
                        "\n" +
                        "Anta syamsun anta badrun\n" +
                        "\n" +
                        "Anta nurun fauqonuri\n" +
                        "\n" +
                        "Anta iksiru waghori\n" +
                        "\n" +
                        "Anta misbahushshururi\n" +
                        "\n" +
                        "Sholallahu 'Ala Muhammad\n" +
                        "\n" +
                        "Shallallahu 'Alaihi Wa Sallam\n" +
                        "\n" +
                        "Sholallahu 'Ala Muhammad\n" +
                        "\n" +
                        "Shallallahu 'Alaihi Wa Sallam\n" +
                        "\n" +
                        "Asyroqol Badru 'Alaina\n" +
                        "\n" +
                        "Fakhtafat Minhul Budur\n" +
                        "\n" +
                        "Mitsla Husnikma Roaina\n" +
                        "\n" +
                        "Qhottuya Wajhas Shururi\n" +
                        "\n" +
                        "Anta syamsun anta badrun\n" +
                        "\n" +
                        "Anta nurun fauqonuri\n" +
                        "\n" +
                        "Anta syamsun anta badrun\n" +
                        "\n" +
                        "Sholallahu 'Ala Muhammad\n" +
                        "\n" +
                        "Shallallahu 'Alaihi Wa Sallam\n" +
                        "\n" +
                        "Sholallahu 'Ala Muhammad\n" +
                        "\n" +
                        "Shallallahu 'Alaihi Wa Sallam"
            ),
            list(
                R.drawable.img,
                "Sholawat Bismillah",
                "Bismillah Ya Allahu Ya Rohim\n" +
                        "Bismillah Bismillah Bismillah\n" +
                        "Bismillah Tawakaltu ’AlaAllah\n" +
                        "Bismillah Bismillah Bismillah\n" +
                        "\n" +
                        "Bismillah Tawassalna Billah (2x)\n" +
                        "Bimillah Tawakkalna ’AlaAllah\n" +
                        "Bismillah Bismillah Bismillah\n" +
                        "\n" +
                        "Ya Allahu Ya Manaanu Ya Karim\n" +
                        "Ya Allahu Ya Rohmanu Ya Rohim\n" +
                        "Ya Allah Ya Allah Ya Allah\n" +
                        "Ya Allahu Ya Fattahu Ya Kholiq\n" +
                        "Ya Allah Ya Allah Ya Allah\n" +
                        "\n" +
                        "Bismillah Tawassalna Billah (2x)\n" +
                        "Bimillah Tawakkalna ’AlaAllah\n" +
                        "Bismillah Bismillah Bismillah\n" +
                        "\n" +
                        "Ya Allahu Sattaru Ya Khobir\n" +
                        "Ya Allahu Qohharu Ya ’Aziiz\n" +
                        "Ya Allah Ya Allah Ya Allah\n" +
                        "Ya Allahu Ghoffaru Ya Nashiib\n" +
                        "Ya Allah Ya Allah Ya Allah\n" +
                        "\n" +
                        "Bismillah Tawassalna Billah (2x)\n" +
                        "Bimillah Tawakkalna ’AlaAllah\n" +
                        "Bismillah Bismillah Bismillah\n" +
                        "\n" +
                        "Ya Allahu Ya ’Alaamu Ya Khobir\n" +
                        "Ya Allahu Ya Wahaabu Ya Majid\n" +
                        "Ya Allah Ya Allah Ya Allah\n" +
                        "Ya Allah Ya Rohmanu Ya Rohim\n" +
                        "Ya Allah Ya Allah Ya Allah\n" +
                        "\n" +
                        "Bismillah Tawassalna Billah (2x)\n" +
                        "Bimillah Tawakkalna ’AlaAllah\n" +
                        "Bismillah Bismillah Bismillah"
            ),
            list(
                R.drawable.img,
                "Sholawat Busyrolana",
               "(*)\n" +
                       "Busyro lana nilnal muna\n" +
                       "Zalal ‘ana wa falhana\n" +
                       "Waddahru anjaza wa’dahu\n" +
                       "Wal bisyru adlha mu’lana\n" +
                       "\n" +
                       "(*)\n" +
                       "Ya nafsu thibi billiqo\n" +
                       "Ya ‘ainu qorri a’yuna\n" +
                       "Hadza jamalul Mushthofa\n" +
                       "Anwaruhu la hat lana\n" +
                       "\n" +
                       "(*)\n" +
                       "Ya thoibatu madza naqulu\n" +
                       "Wa fîki qod hallar rosul\n" +
                       "Wa kulluna narjul wushul\n" +
                       "Limuhammadin nabiyna\n" +
                       "\n" +
                       "(*)\n" +
                       "Ya Roudlotal hadisy-syafii’\n" +
                       "Wa shohibaihi wal baqii’\n" +
                       "Uktub lana nahnul jamii’\n" +
                       "Ziyarotan lihabibina\n" +
                       "\n" +
                       "(*)\n" +
                       "Sholli wa sallim ya salam\n" +
                       "‘Alannabiy mahidh-dholam\n" +
                       "Wal ali was-shohbil kirom\n" +
                       "Mâ unsyidat busyro lana"
            ),
            list(
                R.drawable.img,
                "Ya Robbibil Musthofa",
              "Ya Robbibil Musthofa Balighmaqosidana\n" +
                      "Waghfirlanaa Mamadho Ya Wasyi’al Karomi\n" +
                      "\n" +
                      "Muhammadun Sayyidul Kaunaini\n" +
                      "Watsaqolaini Walfariqoini Min ’Urbin\n" +
                      "Wamin ’Ajami\n" +
                      "\n" +
                      "Maulaya Sholli Wa Salim Da iman Abada\n" +
                      "‘Alan Nabiyyi Wa ’Alil baitikullihimi\n" +
                      "\n" +
                      "Ya Rasulallah Salamun ’Alaika\n" +
                      "Ya Rofi ’Asyani Waddaroji\n" +
                      "\n" +
                      "Ahlul Baitil Musthofa Thuhuri\n" +
                      "Hum Amanul Ardhi Faddakiri\n" +
                      "\n" +
                      "Ya Rasulallah Salamun ’Alaika\n" +
                      "Ya Rofi ’Asyani Waddaroji\n" +
                      "\n" +
                      "Robbi Fanfa’na bibarkati\n" +
                      "Wahdinal Husna bihurmatihim\n" +
                      "\n" +
                      "Ya Robbibil Musthofa\n" +
                      "Balighmaqosidana Waghfirlanaa\n" +
                      "Mamadho Ya Wasyi’al Karomi\n" +
                      "\n" +
                      "Huwal Habibulladzi Turjan Syafa’atuhu\n" +
                      "Likulli Haulan Minal Awali Mukhtaqomi\n" +
                      "\n" +
                      "Maulaya Sholli Wa Salim Da iman Abada\n" +
                      "\n" +
                      "'Alan Nabiyyi Wa ’Alil baitikullihimi\n" +
                      "\n" +
                      "Ya Robbibil Musthofa\n" +
                      "Balighmaqosidana Waghfirlanaa\n" +
                      "Mamadho Ya Wasyi’al Karomi"
            ),
            list(
                R.drawable.img,
                "Sidnan Nabi",
                "Sidnan Nabi Sidnan Nabi Sidnan Nabi\n" +
                        "Sidnan Nabi Sidnan Nabi Sidnan Nabi\n" +
                        "Sidnan Nabi Sidnan Nabi Sidnan Nabi\n" +
                        "(Sidi Muhammad Amin Khubtsi\n" +
                        "Habibin Nabi 2x\n" +
                        "\n" +
                        "Ahmadukallahumma Hamdan Mustamir\n" +
                        "’Adda Athoyakallati Latan Hashier\n" +
                        "Musholliyan Alaa Khitamil Anbiyaa\n" +
                        "(Wal ‘Ali Washohobil Hudatil Athqiyaa 2x\n" +
                        "\n" +
                        "Sidnan Nabi Sidnan Nabi Sidnan Nabi\n" +
                        "Sidnan Nabi Sidnan Nabi Sidnan Nabi\n" +
                        "Sidnan Nabi Sidnan Nabi Sidnan Nabi\n" +
                        "(Sidi Muhammad Amin Khubtsi\n" +
                        "Habibin Nabi 2x\n" +
                        "\n" +
                        "Sidnan Nabi Sidnan Nabi Sidnan Nabi\n" +
                        "Sidnan Nabi Sidnan Nabi Sidnan Nabi\n" +
                        "Sidnan Nabi Sidnan Nabi Sidnan Nabi\n" +
                        "(Sidi Muhammad Amin Khubtsi\n" +
                        "Habibin Nabi 2x\n" +
                        "\n" +
                        "La Fakhro Lil Binti Bimal Basin Wamaa\n" +
                        "Bihi Thohallat Min Huliyyin Innama\n" +
                        "Fakhrol Fata Libil Uluu Biuladaabi\n" +
                        "(Labil Jamali Wal Hariri Wa dzahabi 2x\n" +
                        "\n" +
                        "Sidnan Nabi Sidnan Nabi Sidnan Nabi\n" +
                        "Sidnan Nabi Sidnan Nabi Sidnan Nabi\n" +
                        "Sidnan Nabi Sidnan Nabi Sidnan Nabi\n" +
                        "(Sidi Muhammad Amin Khubtsi\n" +
                        "Habibin Nabi 2x"
            ),
            list(
                R.drawable.img,
                " Laa Ilaha Illallah",
                "Laa Ilaha Illallah… 3x\n" +
                        "Yuhyi Qolba Dzikrullah…\n" +
                        "\n" +
                        "Ya Allah…\n" +
                        "Ya Robbi Sholli Afdholis Sholawat\n" +
                        "’Alan Nabi Mahbubana\n" +
                        "Thoha Rasuul Muhammadun wa ’Alaihi\n" +
                        "Shollu ’Alaihi Wasallimu\n" +
                        "\n" +
                        "Sholallahu ’Alaa Muhammad\n" +
                        "Wa ’Alaa Aliihi Wa Salam\n" +
                        "Sholallahu ’Alaa Muhammad\n" +
                        "Wa ’Alaa Aliihi Wa Salam\n" +
                        "\n" +
                        "Allah… Allah…\n" +
                        "’Alaikum Bisyukrillahi Ya Khoirol Umatin\n" +
                        "Allah… Allah…\n" +
                        "Bijahil Nabiy Mukhtarol Zainal Anbiyai\n" +
                        "Allah… Allah…\n" +
                        "Sholatun Wataslimun Wa Azka tahiatin\n" +
                        "Allah… Allah…\n" +
                        "‘Alal Musthofa Mukhtari Khoirol Bariyati\n" +
                        "Allah… Allah…\n" +
                        "\n" +
                        "Ya Arhamarrohimin Irhmana…\n" +
                        "Ya Arhamarrohimin Irhamna…\n" +
                        "Wa’afina Wa’fuanna Wa’alaa Tho’atika\n" +
                        "Wa Syukrika… Inna…\n" +
                        "\n" +
                        "Astagfirullah… Astaghfirullah…\n" +
                        "Astagfirullah… Astaghfirullah…\n" +
                        "Astagfirullah… Astaghfirullah…\n" +
                        "Allahu Akbar Allahu Akbar"
            ),
            list(
                R.drawable.img,
                "Sholawat Badar",
                "sholatullah salamullah ‘ala thoha rasulillah\n" +
                        "sholatullah salamullah, ‘ala yasin habibillah\n" +
                        "tawasalna bibismillah, wa bilhadi rasulillah\n" +
                        "wa kulli mujahidin lillah, bi ahlil badri, ya allah\n" +
                        "\n" +
                        "sholatullah salamullah ‘ala thoha rasulillah\n" +
                        "sholatullah salamullah, ‘ala yasin habibillah\n" +
                        "sholatullah salamullah ‘ala thoha rasulillah\n" +
                        "sholatullah salamullah, ‘ala yasin habibillah\n" +
                        "\n" +
                        "ilaahi sallimi ummah, minal aafaati wannigmah\n" +
                        "wa min hammin wa min ghummah, bi ahlil badri yaa allah\n" +
                        "ilaahi-ghfir wa akrimna, binaili mathoolibin minna\n" +
                        "wadafi masaa ati ‘anna, bi ahlil badri yaa allah\n" +
                        "\n" +
                        "sholatullah salamullah ‘ala thoha rasulillah\n" +
                        "sholatullah salamullah, ‘ala yasin habibillah\n" +
                        "sholatullah salamullah ‘ala thoha rasulillah\n" +
                        "sholatullah salamullah, ‘ala yasin habibillah\n" +
                        "\n" +
                        "sholatullah salamullah ‘ala thoha rasulillah\n" +
                        "sholatullah salamullah, ‘ala yasin habibillah\n" +
                        "sholatullah salamullah ‘ala thoha rasulillah\n" +
                        "sholatullah salamullah, ‘ala yasin habibillah\n" +
                        "\n" +
                        "‘ala yasin habibillah, ‘ala yasin habibillah\n" +
                        "‘ala yasin (‘ala yasin) habibillah"
            ),
            list(
                R.drawable.img,
                "Ya Nabi Salam Alaika",
                "Ya Nabi Salam ’Alaika\n" +
                        "Ya Rasul Salam ’Alaika\n" +
                        "Ya Habib Salam ’Alaika\n" +
                        "Sholawatullah ’Alaika\n" +
                        "\n" +
                        "Asyroqol Badru ’Alaina\n" +
                        "Fakhtafat Minhul Buduruu\n" +
                        "Mitsla Husnik Maa Ro’aina\n" +
                        "Khottu Ya Wajha Sururii\n" +
                        "\n" +
                        "Ya Nabi Salam ’Alaika\n" +
                        "Ya Rasul Salam ’Alaika\n" +
                        "Ya Habib Salam ’Alaika\n" +
                        "Sholawatullah ’Alaika\n" +
                        "\n" +
                        "Anta Syamsun Anta Badrun\n" +
                        "Anta Nuurun Fauqo Nuuri\n" +
                        "Anta Iksiru Wagholi…\n" +
                        "Anta Misbahus Shuduri\n" +
                        "\n" +
                        "Ya Nabi Salam ’Alaika\n" +
                        "Ya Rasul Salam ’Alaika\n" +
                        "Ya Habib Salam ’Alaika\n" +
                        "Sholawatullah ’Alaika\n" +
                        "\n" +
                        "Ya Habibi Ya Muhammad\n" +
                        "Ya ’Arusal Khofiqoini\n" +
                        "Ya Muayyad Ya Mumajaad\n" +
                        "Ya Imamal Qiblataini\n" +
                        "\n" +
                        "Ya Nabi Salam ’Alaika\n" +
                        "Ya Rasul Salam ’Alaika\n" +
                        "Ya Habib Salam ’Alaika\n" +
                        "Sholawatullah ’Alaika"
            ),
            list(
                R.drawable.img,
                "Ya Jamalu",
                "Oh ya jamalu ya jamalu\n" +
                        "Oh ya jamalu ya jamalu\n" +
                        "Oh ya jamalu ya jamalu\n" +
                        "Sidnan nabi ya jamalu\n" +
                        "\n" +
                        "Oh ya jamalu ya jamalu\n" +
                        "Oh ya jamalu ya jamalu\n" +
                        "Oh ya jamalu ya jamalu\n" +
                        "Sidnan nabi ya jamalu\n" +
                        "\n" +
                        "Oh ya jamalu oh ya jamalu\n" +
                        "Oh ya jamalu oh ya jamalu\n" +
                        "Oh ya jamalu ya jamalu ya jamalu\n" +
                        "\n" +
                        "Oh ya jamalu ya jamalu\n" +
                        "Oh ya jamalu ya jamalu\n" +
                        "Oh ya jamalu ya jamalu\n" +
                        "Sidnan nabi ya jamalu\n" +
                        "\n" +
                        "*\n" +
                        "Wakajilulahumal nuro (ya jamalu)\n" +
                        "Kana la syamsa lil huwal buduru (ya jamalu)\n" +
                        "Walam yatunilhuda laula zuhuru (ya jamalu)\n" +
                        "Kaul kauli adama bi nuril qoha ya jamalu\n" +
                        "\n" +
                        "Oh ya jamalu ya jamalu (ya jamal ya jamal ya jamalu)\n" +
                        "Oh ya jamalu ya jamalu (habibi habibi ya jamalu)\n" +
                        "Oh ya jamalu ya jamalu (siddiq siddiq siddiq)\n" +
                        "Sidnan nabi ya jamalu\n" +
                        "\n" +
                        "*\n" +
                        "Wakafful musthofa kawwar dinaa di (ya jamalu)\n" +
                        "Wa idroha yabqo ida massat ayadii (ya jalamu\n" +
                        "\n" +
                        "Oh ya jamalu (oh)\n" +
                        "Oh ya jamalu (oh)\n" +
                        "Oh ya jamalu (oh)\n" +
                        "Oh ya jamalu (oh)\n" +
                        "Habibulloh ya khoirol baroya\n" +
                        "\n" +
                        "Oh ya jamalu ya jamalu (ya jamalu)\n" +
                        "Oh ya jamalu ya jamalu (ya habibi jamalu)\n" +
                        "Oh ya jamalu ya jamalu (siddiq siddiq siddiq)\n" +
                        "Sidnan nabi ya jamalu\n" +
                        "\n" +
                        "Oh ya jamalu (oh)\n" +
                        "Oh ya jamalu (oh)\n" +
                        "Oh ya jamalu (oh)\n" +
                        "Oh ya jamalu (oh)\n" +
                        "Habibulloh ya khoirol baroya"

            ),
        list(
            R.drawable.img,
            "Ya Asyiqol Mustofa ",
            "Ya Asyiqol Musthofa Absyir Binailil Muna\n" +
                    "Qoq Roqoka susshofa as Shofa. as shofaa,,...\n" +
                    "Watoba Wafdul Hana Qod Roqoka susshofa\n" +
                    "Watoba Wafdul Hana\n" +
                    "Nuurul Jamaali Badaa Min Wajhi Syamsil Hudaa\n" +
                    "Nuurul Jamaali Badaa Min Wajhi Syamsil Hudaa\n" +
                    "min Wajhi Syamsil Huda man fadluhu 'ammanaa 'ammanaa\n" +
                    "yaa 'asyiqol musthofa musthofa...\n" +
                    "musthofaa........\n" +
                    "Watoba Wafdul Hana Qod Roqoka susshofa\n" +
                    "Watoba Wafdul Hana.......\n" +
                    "Ya Asyiqol Musthofa Absyir Binailil Muna\n" +
                    "Qoq Roqoka susshofa as Shofa. as shofaa,,...\n" +
                    "Watoba Wafdul Hana Qod Roqoka susshofa\n" +
                    "Watoba Wafdul Hana\n" +
                    "Thoohalladzii billiqoo qod faazalammartaqoo\n" +
                    "Thoohalladzii billiqoo qod faazalammartaqoo\n" +
                    "qod faazalammartaqoo...\n" +
                    "waafi dzurool irtiqoo min robbihi qod danaa qod danaa\n" +
                    "qod danaa.....\n" +
                    "Watoba Wafdul Hana Qod Roqoka susshofa\n" +
                    "Watoba Wafdul Hana.......\n" +
                    "Ya Asyiqol Musthofa Absyir Binailil Muna\n" +
                    "Qoq Roqoka susshofa as Shofa. as shofaa,,...\n" +
                    "Watoba Wafdul Hana Qod Roqoka susshofa\n" +
                    "Watoba Wafdul Han\n"

            )

        )
        val recyclerView = findViewById<RecyclerView>(R.id.rvsholawat)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = rvsholawat(this, pmi2List){


//        val recyclerView = findViewById<RecyclerView>(R.id.rvsholawat) as RecyclerView
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.setHasFixedSize(true)
//        recyclerView.adapter = rvsholawat(this, pmi2List) {

        }
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.tentangKami -> {
                val intent = Intent(this, TentangKami::class.java)
                startActivity(intent)
            }
        }
    }
}


