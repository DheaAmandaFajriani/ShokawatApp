package com.example.sholawat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.SearchView
import android.widget.SearchView.OnQueryTextListener
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Mainlist : AppCompatActivity(), View.OnClickListener {
    private lateinit var tentangkami: ImageView
    private lateinit var search: SearchView


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

            ),
            list(
                R.drawable.img,
                "Ya Ahmad ya Habibi ",
                "Ya Ahmad ya Habibi\n" +
                        "Shollallaahu 'alaika\n"+
                       "Shollallaahu 'alaika\n" +
                        "Shollallaahu 'alaika\n" +
                        "Maa talaqqa al-barru wal bahru\n" +
                        "Shollallaahu 'alaika\n" +
                        "Maa kharajat ash-shamsu wal qamara\n" +
                        "Maa kaana al-lailu wan-nahaaru\n" +
                        "Maa barakta as-samaa'u wal ardhu\n" +
                        "Maa kaanat al-baraa-yaa wal 'ajaa-ib\n" +
                        "Maa kaanat al-malaa-ikatu wal anbiyaa-u\n" +
                        "Maa kaanat al-khalqu wal khaliqaat\n" +
                        "Wa 'alaa aalihi wa shahbihi\n" +
                        "Shollallaahu 'alaika\n" +
                        "Milyun sholaatain wa tasliimin\n" +
                        "Milyun sholaatain wa tasliimin\n" +
                        "Ya Ahmad ya Habibi\n" +
                        "Shollallaahu 'alaika\n" +
                        "Shollallaahu 'alaika\n" +
                        "Shollallaahu 'alaika\n"
            ),
            list(
                R.drawable.img,
                "Qomarun",
                "Qomarun nubuwwati bada\n" +
                        "Wa nuurul hudaa sathaqa\n" +
                        "Fazahiyat bihil ardhu\n" +
                        "Wal jamaalu tajallā\n" +
                        "Shollallaahu 'alaihil malaaikatu\n" +
                        "Wa anbiyaa-ul awwalin\n" +
                        "Wa al-akhiriin\n" +
                        "Wa ahlu al-jinni\n" +
                        "Wa al-insi\n" +
                        "Shollallaahu 'alaihi jami'ul kholqi\n" +
                        "Bi-akmalil sholaat\n" +
                        "Wa atammat tasliimin\n" +
                        "Yaa Rabbana sholli\n" +
                        "Wa sallim wa baarik\n" +
                        "'Alaa sayyidinaa Muhammadin\n" +
                        "Wa 'alaa aalihi wa shahbihi\n" +
                        "Wa sallim"
            ),
            list(
                R.drawable.img,
                "Hayyul Hadi",
                "Hayyul haadi bi ajmalil dzikrin\n" +
                        "Sholluu ma'anaa ya haddaar\n" +
                        "Fahuwa 'amaadii yaumal ma'adi\n" +
                        "Nabiyyunaa thahal mukhtaari\n" +
                        "Hadza adh-dzii saaro lailan\n" +
                        "Tsumma danaa fa ta dalla\n" +
                        "Fahuwa 'amaadii yaumal ma'adi\n" +
                        "Nabiyyunaa thahal mukhtaari\n" +
                        "'Alaa al-arsyi rakka'al jamii'\n" +
                        "Wa kallamahu al-maulaanal jaliil\n" +
                        "Fahuwa 'amaadii yaumal ma'adi\n" +
                        "Nabiyyunaa thahal mukhtaari"
            ),
            list(
                R.drawable.img,
                "Addinu lana",
                "Addinu lana wal haqqu lana wal ‘ad-lu lana wal kullu lana\n" +
                        "\n" +
                        "Adlhal islamu lana dina wa jami’ul kawni lana wathona\n" +
                        "\n" +
                        "Tawhidullahi lana nurun a’dadnar-ruha lahu sakana\n" +
                        "Huwa awwalu baitin nahfadhuhu bihayatir-ruhi wa yahfadhuna\n" +
                        "\n" +
                        "‘Alamul islami ‘alal ayyam syi’arul majdi limillatina\n" +
                        "\n" +
                        "Alkawnu yazulu wala tumha biddahri shoha-if su,dadina\n" +
                        "\n" +
                        "Banaita fil ardli ma’badaha walbaitul awwalu ka’batuha\n" +
                        "\n" +
                        "Ya ardlon-nuri minal haromaini wa ya milada syari’atina\n" +
                        "\n" +
                        "Roudlul islami wadahat-hu fi ardlika rowaha dumna\n" +
                        "\n" +
                        "Qulus-sama-ul kawnu laqod thowa lanan-najmu birif’atina\n" +
                        "\n" +
                        "Wa adzanul muslimi kana lahu fil ghorbi shoda min himmatina\n" +
                        "\n" +
                        "Wa Muhammadun kana amiror-rokbi yaqudul fawza linushrotina\n" +
                        "\n" +
                        "Inna-sma Muhammadil hadi ruhul amali linahdlotina"
            ),
            list(
                R.drawable.img,
                "Assalamu’alaik Zainal Anbiya",
                "Assalamu’alaik Zainal Anbiya\n" +
                        "\n" +
                        "Assalamu’alaik Atqol Aqiya\n" +
                        "\n" +
                        "Assalamu’alaik Assalamu’alaikAssalamu’alaik Ahmad Yaa Habiibi\n" +
                        "\n" +
                        "Assalamu’alaik Tooha Yaa Tobiibi\n" +
                        "\n" +
                        "Assalamu’alaik Musaffa’ifil Qiyamah\n" +
                        "\n" +
                        "Assalamu’alaik Assalamu’alaik\n" +
                        "\n" +
                        "Assalamu’alal Musaffa’ifil Qiyamah\n" +
                        "\n" +
                        "Assalamu’alal Mudhollali Bil Ghomamah\n" +
                        "\n" +
                        "Assalamu’alal Mutawwaji Bil Karomah\n" +
                        "\n" +
                        "Assalamu’alaik Assalamu’alaik\n" +
                        "\n" +
                        "Yaa Rosullollah Yaa Yaa Nabi Yaa Nabi Laka Syaffa’ah Wa Hadamathlabi Yaa Nabi\n" +
                        "\n" +
                        "Antal Murtaja Yaumazziham Isyfa’laanaa Yaa Khoirol’anam\n" +
                        "\n" +
                        "Isyafa’lana Lana Yaa Habiibana Laka Syafa’ah Ya Rosuullallah\n" +
                        "\n" +
                        "Yaa Yaa Nabi Yaa Nabi"
            ),
            list(
                R.drawable.img,
                "All Qasima - Bismillah",
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
                "Marhaban Ya Nurul Aini",
                "Marhaban Ya Nurol ’Aini\n" +
                        "Marhaban Marhaban\n" +
                        "Marhaban Jaddal Husaini\n" +
                        "Marhaban Marhaban\n" +
                        "\n" +
                        "Izhabana Biwujudin\n" +
                        "Marhaban Marhaban\n" +
                        "Musthofal Hadi Muhammad\n" +
                        "Marhaban Marhaban\n" +
                        "\n" +
                        "Ya Rasulallahi Ahlan Bika\n" +
                        "Inna Bika Nus’ad\n" +
                        "Wabijahih Ya Ilahi\n" +
                        "Jud Wabaligh Kulla Maqsod\n" +
                        "\n" +
                        "Ya Nabi Salam ’Alaika\n" +
                        "Ya Rasul Salam ’Alaika\n" +
                        "Ya Habib Salam ’Alaika\n" +
                        "Sholawatullah ’Alaika\n" +
                        "\n" +
                        "Wahdinan Nahja Sabilih\n" +
                        "Kaibihim Nus’ad Wa Nursyad\n" +
                        "Robbi Balighna Bijahih\n" +
                        "Fijiwarih Khoiro Maq’aat\n" +
                        "\n" +
                        "Asyroqol Kaunub Tihaja\n" +
                        "Biwujudil Musthofa Ahmad\n" +
                        "Wali Ahli Kauni Unsun\n" +
                        "Wa Suruun Qod Tajaddal\n" +
                        "\n" +
                        "Allah Ya Nabi Salam ’Alaika\n" +
                        "Ya Rasul Salam ’Alaika\n" +
                        "Ya Habib Salam ’Alaika\n" +
                        "Sholawatullah ’Alaika\n" +
                        "\n" +
                        "Fathrobu Ya Ahlan Masani\n" +
                        "Fahazhoru Yummi Ghorrod\n" +
                        "Wastahidu Bijamalin\n" +
                        "Fauqo Fil Husni Tafarrod\n" +
                        "\n" +
                        "Marhaban Marhaban Ya Nurol ’Aini\n" +
                        "Marhaban Marhaban Jaddal Husaini\n" +
                        "Marhaban Walanal Busyro Bisa’din\n" +
                        "Marhaban Mustamirin Laisa Yanfat\n" +
                        "\n" +
                        "Marhaban Marhaban Ya Nurol ’Aini\n" +
                        "Marhaban Marhaban Jaddal Husaini\n" +
                        "Marhaban Haitsu Utina Atho’an\n" +
                        "Marhaban Jama’al Fakhrol Mu’abbad\n" +
                        "\n" +
                        "Falirobbi Kullu Hamdin\n" +
                        "Marhaban Marhaban\n" +
                        "Jala’al Ya Surohul’ad\n" +
                        "Marhaban Marhaban\n" +
                        "\n" +
                        "Marhaban Ya Nurol ’Aini\n" +
                        "Marhaban Marhaban\n" +
                        "Marhaban Jaddal Husaini\n" +
                        "Marhaban Marhaban\n" +
                        "\n" +
                        "Ya Rasulallahi Ahlan Bika\n" +
                        "Inna Bika Nus’ad\n" +
                        "Wabijahih Ya Ilahi\n" +
                        "Jud Wabaligh Kulla Maqsod\n" +
                        "\n" +
                        "Ya Nabi Salam ’Alaika\n" +
                        "Ya Rasul Salam ’Alaika\n" +
                        "Ya Habib Salam ’Alaika\n" +
                        "Sholawatullah ’Alaika\n" +
                        "\n" +
                        "Washolatullahi Taghsya\n" +
                        "Asyrofal Rusli Muhammad\n" +
                        "Washolatullahi Taghsya\n" +
                        "Asyrofal Rusli Muhammad\n" +
                        "\n" +
                        "Sholallahu ’Alaa Muhammad Marhaban\n" +
                        "Sholallahu ’Alaihi Wa Salam Marhaban Sholallahu ’Alaa Muhammad Marhaban\n" +
                        "Sholallahu ’Alaihi Wa Salam Marhaban\n" +
                        "\n" +
                        "Wasalamun Mustamirun\n" +
                        "Kulla Hinni Ya Tajaddal\n" +
                        "Sholallahu ’Alaa Muhammad Marhaban\n" +
                        "Sholallahu ’Alaihi Wa Salam Marhaban"
            ),
            list(
                R.drawable.img,
                "Deen Asalam",
                "Kala ha dil ar maa taq fi masahat\n" +
                        "La u na hasib la sama hat\n" +
                        "Wan ta ayas na bahb\n" +
                        "La ta ghay kal ar tha nas kan kal ya ghar\n" +
                        "\n" +
                        "Ab ta hayat wab salaam\n" +
                        "An syaru wah lal kalam\n" +
                        "Zay nu dini yakh te rabb\n" +
                        "Ab ma habbat wab ta sam\n" +
                        "\n" +
                        "An syaru ba anil ana\n" +
                        "Ha da hud deen as salaam..\n" +
                        "\n" +
                        "Terjemahan Lirik Lagu Deen Assalam\n" +
                        "\n" +
                        "Agama Perdamaian\n" +
                        "\n" +
                        "Seluruh bumi ini akan terasa sempit\n" +
                        "jika kita hidup tanpa toleransi\n" +
                        "namun jika hidup dengan perasaan cinta\n" +
                        "meski bumi sempit kita kan bahagia\n" +
                        "\n" +
                        "melalui perlaku mulia dan damai\n" +
                        "sebarkanlah ucapan yang manis\n" +
                        "hiasilah dunia dengan sikap yang hormat\n" +
                        "dengan cinta dan senyuman\n" +
                        "\n" +
                        "sebarkanlah diantara insan\n" +
                        "Inilah Islam agama perdamaian"
            ),
            list(
                R.drawable.img,
                " Az Zahir Ahmad Ya Nurul Huda ",
                "Namat A’yuni Yauma\n" +
                        "Namat Wal Haninu Nama\n" +
                        "Rohat Tahtawini\n" +
                        "Ru’yak Ya Rosulallah\n" +
                        "\n" +
                        "Ahmad Ya Nurol Huda\n" +
                        "Bi Syauqun Fauqol Mada\n" +
                        "‘Aini Tarju An Tarok\n" +
                        "Ruhi Ya Habibi Fidak\n" +
                        "\n" +
                        "‘Anaq Thoifuhu Qolbi\n" +
                        "Dzabat Fi Yadaihi Yadi\n" +
                        "Nadatuh ‘Uyuni\n" +
                        "Wabahah Lamasal Qolba\n" +
                        "\n" +
                        "Haudhuhu Kautsaru Warowa\n" +
                        "Syarbatun LidawaAya\n" +
                        "Irwini Ya Habibi\n" +
                        "Ya Thobibal Baroya\n" +
                        "Anta Li Balsamu Wa Syifa"
            ),
            list(
                R.drawable.img,
                "Roohatil athyaaru ",
                "Roohatil athyaaru tasyduu fii layaaliil maulidi\n" +
                        "Wa bariiqun-nuuri yabduu min ma’aanii Ahmadi\n" +
                        "Roohatil athyaaru tasyduu fii layaaliil maulidi\n" +
                        "Wa bariiqun-nuuri yabduu min ma’aanii Ahmadi   3x\n" +
                        "Fii layaaliil maulidi\n" +
                        "Fii layaaliil maulidi\n" +
                        "\n" +
                        "Abdullah nama ayahnya, Aminah ibundanya…\n" +
                        "Abdul Muthalib kakenya, Abu Thalib pamannya…\n" +
                        "Khadijah istri setia, Fathimah putri tercinta…\n" +
                        "Semua bernasab mulia, dari Quraisy ternama…\n" +
                        "Inilah kisah sang Rosul, yang penuh suka duka....2x\n" +
                        "Oh...Penuh Suka Duka, Oh...Penuh Suka Duka ...\n" +
                        "\n" +
                        "Roohatil athyaaru tasyduu fii layaaliil maulidi\n" +
                        "Wa bariiqun-nuuri yabduu min ma’aanii Ahmadi\n" +
                        "Roohatil athyaaru tasyduu fii layaaliil maulidi\n" +
                        "Wa bariiqun-nuuri yabduu min ma’aanii Ahmadi 3x\n" +
                        "Fii layaaliil maulidi\n" +
                        "Fii layaaliil maulidi\n" +
                        "\n" +
                        "Dua bulan di kandungan, wafat ayahandanya…\n" +
                        "Tahun Gajah dilahirkan, yatim dengan kakeknya…\n" +
                        "Sesuai adat yang ada, disusui Halimah…\n" +
                        "Enam tahun usianya, wafat ibu tercinta…\n" +
                        "Inilah kisah sang Rosul, yang penuh suka duka....2x\n" +
                        "Oh...Penuh Suka Duka, Oh...Penuh Suka Duka ...\n" +
                        "\n" +
                        "Roohatil athyaaru tasyduu fii layaaliil maulidi\n" +
                        "Wa bariiqun-nuuri yabduu min ma’aanii Ahmadi\n" +
                        "Roohatil athyaaru tasyduu fii layaaliil maulidi\n" +
                        "Wa bariiqun-nuuri yabduu min ma’aanii Ahmadi  3x\n" +
                        "Fii layaaliil maulidi\n" +
                        "Fii layaaliil maulidi\n" +
                        "\n" +
                        "Delapan tahun usia, kakek meninggalkannya…\n" +
                        "Abu Thalib pun menjaga, paman paling membela…\n" +
                        "Saat kecil penggembala, dagang saat remaja…\n" +
                        "Umur dua puluh lima, memperistri Khadijah…\n" +
                        "Inilah kisah sang Rosul, yang penuh suka duka....2x\n" +
                        "Oh...Penuh Suka Duka, Oh...Penuh Suka Duka ...\n" +
                        "\n" +
                        "Roohatil athyaaru tasyduu fii layaaliil maulidi\n" +
                        "Wa bariiqun-nuuri yabduu min ma’aanii Ahmadi\n" +
                        "Roohatil athyaaru tasyduu fii layaaliil maulidi\n" +
                        "Wa bariiqun-nuuri yabduu min ma’aanii Ahmadi  3x\n" +
                        "Fii layaaliil maulidi\n" +
                        "Fii layaaliil maulidi\n" +
                        "\n" +
                        "Diumur ketiga puluh, mempersatukan bangsa…\n" +
                        "Saat peletakan batu, Hajar Aswad mulia…\n" +
                        "Genap 40 tahun, mendapatkan risalah…\n" +
                        "Ia pun menjadi Rosul, akhir para Anbiya…\n" +
                        "Inilah kisah sang Rosul, yang penuh suka duka....2x\n" +
                        "Oh...Penuh Suka Duka, Oh...Penuh Suka Duka ...\n" +
                        "\n" +
                        "Roohatil athyaaru tasyduu fii layaaliil maulidi\n" +
                        "Wa bariiqun-nuuri yabduu min ma’aanii Ahmadi\n" +
                        "Roohatil athyaaru tasyduu fii layaaliil maulidi\n" +
                        "Wa bariiqun-nuuri yabduu min ma’aanii Ahmadi  3x\n" +
                        "Fii layaaliil maulidi\n" +
                        "Fii layaaliil maulidi"
            ),
            list(
                R.drawable.img,
                "Annabiy Shollu ’Alaihi",
                "Annabiy Shollu ’Alaihi\n" +
                        "Sholawatullahi ’Alaihi\n" +
                        "Wayam Na’ul Barokah\n" +
                        "Kulluman Sholla ’Alaihi\n" +
                        "\n" +
                        "Annabiy Ya Hadhirin ’Ilamu ’Ilmal Yakin\n" +
                        "Annabiy Ya Hadhirin ’Ilamu ’Ilmal Yakin\n" +
                        "Annarobbal ’Alamiin Faradhosholawatullahi ’Alaihi\n" +
                        "\n" +
                        "Annabiy Shollu ’Alaihi\n" +
                        "Sholawatullahi ’Alaihi\n" +
                        "Wayam Na’ul Barokah\n" +
                        "Kulluman Sholla ’Alaihi\n" +
                        "\n" +
                        "Annabiy Ya Manhadhor Annabiy Khoirul Basyar\n" +
                        "Annabiy Ya Manhadhor Annabiy Khoirul Basyar\n" +
                        "Mandana Lahul Qomar Wanazal Salam ’Alaihi\n" +
                        "\n" +
                        "Annabiy Shollu ’Alaihi\n" +
                        "Sholawatullahi ’Alaihi\n" +
                        "Wayam Na’ul Barokah\n" +
                        "Kulluman Sholla ’Alaihi\n" +
                        "\n" +
                        "Annabiy Dzakal ’Aruus Dzikruhu Yuhyi Nufuus\n" +
                        "Annabiy Dzakal ’Aruus Dzikruhu Yuhyi Nufuus\n" +
                        "Annashoro Wal Majus Aslamu Baina Yadaihi\n" +
                        "\n" +
                        "Alhasan Tsumal Husain Linnabi qurrotul ’Aini\n" +
                        "Alhasan Tsumal Husain Linnabi qurrotul ’Aini\n" +
                        "\n" +
                        "Nuruhum Kalkaukabain Jadduhum Shollu ’Alaihi"
            ),
            list(
                R.drawable.img,
                "Annabiy Shollu ’Alaihi",
                "Annabiy Shollu ’Alaihi\n" +
                        "Sholawatullahi ’Alaihi\n" +
                        "Wayam Na’ul Barokah\n" +
                        "Kulluman Sholla ’Alaihi\n" +
                        "\n" +
                        "Annabiy Ya Hadhirin ’Ilamu ’Ilmal Yakin\n" +
                        "Annabiy Ya Hadhirin ’Ilamu ’Ilmal Yakin\n" +
                        "Annarobbal ’Alamiin Faradhosholawatullahi ’Alaihi\n" +
                        "\n" +
                        "Annabiy Shollu ’Alaihi\n" +
                        "Sholawatullahi ’Alaihi\n" +
                        "Wayam Na’ul Barokah\n" +
                        "Kulluman Sholla ’Alaihi\n" +
                        "\n" +
                        "Annabiy Ya Manhadhor Annabiy Khoirul Basyar\n" +
                        "Annabiy Ya Manhadhor Annabiy Khoirul Basyar\n" +
                        "Mandana Lahul Qomar Wanazal Salam ’Alaihi\n" +
                        "\n" +
                        "Annabiy Shollu ’Alaihi\n" +
                        "Sholawatullahi ’Alaihi\n" +
                        "Wayam Na’ul Barokah\n" +
                        "Kulluman Sholla ’Alaihi\n" +
                        "\n" +
                        "Annabiy Dzakal ’Aruus Dzikruhu Yuhyi Nufuus\n" +
                        "Annabiy Dzakal ’Aruus Dzikruhu Yuhyi Nufuus\n" +
                        "Annashoro Wal Majus Aslamu Baina Yadaihi\n" +
                        "\n" +
                        "Alhasan Tsumal Husain Linnabi qurrotul ’Aini\n" +
                        "Alhasan Tsumal Husain Linnabi qurrotul ’Aini\n" +
                        "\n" +
                        "Nuruhum Kalkaukabain Jadduhum Shollu ’Alaihi"
            ),
            list(
                R.drawable.img,
                "Lil Abi Wal Ummi ",
                "Allahumma Sholli Wa Salim ’Alaa\n" +
                        "Sayyidina Muhammadin\n" +
                        "Adaddama Fil ’Ilmillahi Sholata\n" +
                        "Daimata Bidawamin Mulkillahi\n" +
                        "\n" +
                        "Lil Abi Wal Ummi Huququn Wajibun\n" +
                        "Antal Minal Anna Biha Mutholabun\n" +
                        "Innadaya Kafashri’u Murobbiya…\n" +
                        "Waaghfiru Inkhotafaka Mushliyan\n" +
                        "\n" +
                        "Allahumma Sholli Wa Salim ’Alaa\n" +
                        "Sayyidina Muhammadin\n" +
                        "Adaddama Fil ’Ilmillahi Sholata\n" +
                        "Daimata Bidawamin Mulkillahi\n" +
                        "\n" +
                        "Allahumma Sholli Wa Salim ’Alaa\n" +
                        "Sayyidina Muhammadin\n" +
                        "Adaddama Fil ’Ilmillahi Sholata\n" +
                        "Daimata Bidawamin Mulkillahi\n" +
                        "\n" +
                        "’Alaika Antal Taftahilla Allahumma\n" +
                        "Maghma Yakun Malan Yakunu\n" +
                        "Walaisal inti tahlufi fi’ili faqood\n" +
                        "Ma Adasa Bidwaliu Fissaqor\n" +
                        "\n" +
                        "Allahumma Sholli Wa Salim ’Alaa\n" +
                        "Sayyidina Muhammadin\n" +
                        "Adaddama Fil ’Ilmillahi Sholata\n" +
                        "Daimata Bidawamin Mulkillahi\n" +
                        "\n" +
                        "Allahumma Sholli Wa Salim ’Alaa\n" +
                        "Sayyidina Muhammadin\n" +
                        "Adaddama Fil ’Ilmillahi Sholata\n" +
                        "Daimata Bidawamin Mulkillahi"
            ),
            list(
                R.drawable.img,
                "Maulaya ",
                "Maulaya Maulaya Maulaya Maulaya\n" +
                        "Allah Ya Rasulallah Allah Ya Rasulallah\n" +
                        "Maulaya Maulaya Maulaya Maulaya\n" +
                        "Allah Ya Habiballah Allah Ya Habiballah\n" +
                        "\n" +
                        "Sakantum Fu’adi Warobbul ’Ibad\n" +
                        "Sakantum Fu’adi Warobbul ’Ibad\n" +
                        "Wantum Muna’i Wa Aqhsol Murod\n" +
                        "Wantum Muna’i Wa Aqhsol Murod\n" +
                        "\n" +
                        "Maulaya Maulaya Maulaya Maulaya\n" +
                        "Allah Ya Rasulallah Allah Ya Rasulallah\n" +
                        "Maulaya Maulaya Maulaya Maulaya\n" +
                        "Allah Ya Habiballah Allah Ya Habiballah\n" +
                        "\n" +
                        "Fahal Tus’iduni Bishofwil Widad\n" +
                        "Fahal Tus’iduni Bishofwil Widad\n" +
                        "Wahal Tamnahuni Syariefal Maqoom\n" +
                        "Wahal Tamnahuni Syariefal Maqoom\n" +
                        "\n" +
                        "Maulaya Maulaya Maulaya Maulaya\n" +
                        "Allah Ya Rasulallah Allah Ya Rasulallah\n" +
                        "Maulaya Maulaya Maulaya Maulaya\n" +
                        "Allah Ya Habiballah Allah Ya Habiballah\n" +
                        "\n" +
                        "Amutu Wa Ahya ‘Alaa Hubbikum\n" +
                        "Amutu Wa Ahya ‘Alaa Hubbikum\n" +
                        "Wazurri Ladaikum Wa Izzi Bikum\n" +
                        "Wazurri Ladaikum Wa Izzi Bikum\n" +
                        "\n" +
                        "Maulaya Maulaya Maulaya Maulaya\n" +
                        "Allah Ya Rasulallah Allah Ya Rasulallah\n" +
                        "Maulaya Maulaya Maulaya Maulaya\n" +
                        "Allah Ya Habiballah Allah Ya Habiballah\n" +
                        "\n" +
                        "Farobbi Rohiemun Kariemun Wadud\n" +
                        "Farobbi Rohiemun Kariemun Wadud\n" +
                        "Yajuzu ’Ala ManYasyabil Maroom\n" +
                        "Yajuzu ’Ala ManYasyabil Maroom"
            ),
            list(
                R.drawable.img,
                "Ya Ghoffar",
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
                "Astaghfirullah robbal baroyaa",
                "Astaghfirullah robbal baroyaa\n" +
                        "Astaghfirullah minal khothooya\n" +
                        "\n" +
                        "Robbiy zidniy 'ilman naafi'aa\n" +
                        "Wawaffiqnii 'amalan maqbuula\n" +
                        "Wawass'lii rizqoon thoyyiban\n" +
                        "Fatub 'alayya taubatan nashuuha\n" +
                        "\n" +
                        "HambaMu ini datang padaMu\n" +
                        "Tuntunlah kami kemana pergi\n" +
                        "Aku tersesat dijalan ini\n" +
                        "Tak tahu lagi arah kembali\n" +
                        "Sudilah Engkau mau peduli\n" +
                        "\n" +
                        "Yaa man yaro sirro qolby hasbith-thila 'uka hasbi\n" +
                        "Famhu bi'afwika dzanby washlih qusudiy wal a'mal\n" +
                        "\n" +
                        "Ya Illahi Ya Tuhanku\n" +
                        "HambaMu ini menujuMu\n" +
                        "Jiwa ragaku jadi belenggu\n" +
                        "Agar mendapat keridhoanMu\n" +
                        "Tujuan akhir jalan hidupku"
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

//    private fun filterList(Query : String?){
//        if()
//    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.tentangKami -> {
                val intent = Intent(this, TentangKami::class.java)
                startActivity(intent)
            }
        }
    }
}




