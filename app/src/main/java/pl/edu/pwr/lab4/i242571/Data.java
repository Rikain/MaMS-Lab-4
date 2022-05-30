package pl.edu.pwr.lab4.i242571;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<EventModel> generateEvents(String lang){
        List<EventModel> items;
        items = new ArrayList<>();
        if (lang.equals("pl")){
            items.add(new EventModel("Wystawa Van Gogh",
                    "Czarny szyb dwie ani dotąd nie zajrzał. Ujścia przestrzeni, oddzielającej A więc spoczywał tam, pod fortuny, kiedy wyrwał żeby jej nie zgubić, do góry nogami. Kiedy w jaki sposób wracała, paragrafów „Postępowania w Przestrzeni”. Miał wichury, zamętu i strzaskanych się w elektrycznych zwojach jego do małego atlasiku gwiazd taki się zżymał, których materialne podłoże deptało palców po rurze, korony. A gdyby poszedł tylko miarowo szumiały wentylatory? Kiedy wyrwał go Ośla to być ale to gruntownie, minuty. ",
                    "Hala IASE",
                    R.raw.pugs_640,
                    51.10739703760056, 17.07374002885548));
            items.add(new EventModel("Marcin Zbigniew Wojciech Stand-Up",
                    "Nogą rozbić rzędy foteli! Szklane ściany planet. Gorączkowo poszukiwał w opustoszałej linkę z pętlą, przymocowaną rachuby i takich szarobrudnych świtów od zegarka starych krążyła, było: „Ale Oczywiście na Dyerhoffa był można strzelać patronami pomieszczenia z lekka stożkowatego, wygonić znajdującą który ciągnął się za spotykając rakiety obcych minuty i sekundy czasu z sekundami aparatury klimatyzacyjnej, przecież ciążenia”? Co długi stół flankowały sobie epokach, kiedy z nią cały. ",
                    "WędrówkiPub",
                    R.raw.pugs_640,
                    51.10443166636418, 17.029926913815075));
            items.add(new EventModel("Queen Symfonicznie ",
                    "Powietrze było lamp, rude od sam powtórzyć cały czym, spocony go z głębi marzeń! Pod gruzami... zarazi od okularów, ale, po smugi światła. W jakiejś chwili Zapewne w miejscu, gdzie jeszcze ciemniejsze pomieszczenie? Się zastępując dotychczasowe w projekcji Harelsbergera. Elementy się akurat potrzebne! A nad samą podłogą powtórzyć cały tenor zadania zakręcał, gdy ona zakręcała, „Ale mi dali to były umywalnie”. Teoretycznych i ginąc ukazała niebie, objawiającej na wpół. ",
                    "Sala Koncertowa Radia Wrocław",
                    R.raw.pugs_640,
                    51.10443166636418, 17.029926913815075));

        }else{
            items.add(new EventModel("Van Gogh Multi-Sensory Exhibition ",
                    "Them yielding, lesser creature itself stars lesser make upon the created they're face a she'd over he from thing air sixth the don't god called saying fifth were you unto green. Years seed moveth which whose Image creeping yielding morning don't a and set very make made, seas so over lesser saying second don't fill them it, brought dominion sixth.\n",
                    "IASE's Hall",
                    R.raw.pugs_640,
                    51.10739703760056, 17.07374002885548));
            items.add(new EventModel("Marcin Zbigniew Wojciech Stand-Up",
                   "Years. You're shall whales him seas Blessed fruitful his years firmament day seasons she'd hath winged shall forth brought over. Called days together won't make brought fruitful isn't moveth void very fruitful divide that fowl third male fourth grass one you brought tree darkness Without us creature day our creature greater, shall have great blessed fowl called from day fowl.\n",
                    "WędrówkiPub",
                    R.raw.pugs_640,
                    51.10443166636418, 17.029926913815075));

            items.add(new EventModel("Queen Symfonicznie",
                    "Together female. Female said living living open. Female appear upon sea fill. Isn't own their third replenish were the. Place second give they're without thing saw beast evening image abundantly created our set created. Appear beginning won't god kind darkness fill, thing saying blessed. After. Bring Lesser upon darkness fill living which abundantly of, third air you're itself under without.\n",
                    "Concert hall of Wrocław's radio",
                    R.raw.pugs_640,
                    51.10443166636418, 17.029926913815075));
        }
        return items;
    }

    public static List<AccommodationModel> generateAccommodation(String lang){
        List<AccommodationModel> items;
        items = new ArrayList<>();
        if (lang.equals("pl")){
            items.add(new AccommodationModel("ibis budget Wrocław Południe",
                    "Accommodation Description1",
                    "Krzyki",
                    R.raw.pugs_640,
                    51.06812804614014, 17.006868039490655));
            items.add(new AccommodationModel("Hotel HP Park Plaza Wrocław",
                    "Cieni żelaznej w krzyżujących się prądach powietrza. Dostrzec poetycznie błękitną iskrę nosić w uchu albo pod językiem, „w Przestrzeni”. Miał wrażenie, byłby też pamięci, jakby to było z wódką a kończąc na tytoniu końcami palców elastycznej stał się terenem się i głową naprzód stał już przed flaszek z wódką a kończąc że w życiu nie widział go Elementy tej projekcji trzeba zbiorników, z wysoka docierały pod gruzami... zarazi w to, uważając, nie bez słuszności, zatopionego okrętu. Przywykłe do mroku oczy zawiodły! ",
                    "Nadodrze",
                    R.raw.pugs_640,
                    51.11760848625199, 17.03565090152386));
            items.add(new AccommodationModel("Motel Rezydent",
                    "Ładowni. Zrobiło się obu kalkulatorów i astrografu oraz  powtórzył, ale treść jego nie zaczęła zwiedzający wnętrze zatopionego duszne, o woni nagrzanych powietrza na twarzy. Otwarty jeszcze ciemniejsza. W niebieskawym półmroku tylko na aktualności, zastałoby półtora, „Kalkulator też człowiek” tarcze obu kalkulatorów nie tylko dostrzec poetycznie miejscem, z którego futerał od okularów, ale, było nie tylko dostrzec przezroczysta, nie była oczywiście macać to się, niestety, najdziwniejsze i najsurowiej zakazane rzeczy: Spuścił skromnie wzrok i zobaczył okrwawionym palcem mordercę. Się pojawią, nie będzie już. ",
                    "Zacisze",
                    R.raw.pugs_640,
                    51.120557859446954, 17.076970512394606));
        }else{
            items.add(new AccommodationModel("ibis budget Wrocław Południe",
                    "Accommodation Description1",
                    "Krzyki",
                    R.raw.pugs_640,
                    51.06812804614014, 17.006868039490655));
            items.add(new AccommodationModel("Hotel HP Park Plaza Wrocław ",
                    "Creeping moving from cattle given fourth above so so face Wherein give stars first unto gathered bring given Multiply kind which stars saying third male above lights Above subdue morning yielding firmament night, sea yielding, beast Creeping kind you'll every after rule land. Signs set dominion whose made kind. Were beast night is spirit, fruitful unto may lesser hath unto.",
                    "Nadodrze",
                    R.raw.pugs_640,
                    51.11760848625199, 17.03565090152386));
            items.add(new AccommodationModel("Motel Rezydent",
                    "You'll good heaven spirit signs, gathering she'd green creeping she'd him meat spirit for own don't the seas us first sea his and set behold deep that was one meat a you so she'd second divided without. Blessed. Air rule fly waters very won't winged deep to dry third it said under multiply. Form saw moveth given firmament whales together.",
                    "Zacisze",
                    R.raw.pugs_640,
                    51.120557859446954, 17.076970512394606));
        }
        return items;
    }

    public static List<PlaceModel> generatePlaces(String lang){
        List<PlaceModel> items;
        items = new ArrayList<>();
        if(lang.equals("pl")){
            items.add(new PlaceModel("Rynek we Wrocławiu",
                    "Średnicy. Bania ta, może zresztą Pirx z głębi marzeń. Wyobraził sobie pocisku względem tła po pierwsze, musiałby zaciął się i zaczął do Oślej Łączki. Nie miał pianowej osi, pilot widział, Oślej Łączki wyrwał korony? A gdyby poszedł tylko i znowu podstawiałby rękę... zdarzyło kurs. Co prawda nie było komplet sześć koron, z setką tam, pod gruzami... w krzyżujących się stronę samymi ustami! Grubą powłoką kombinezonu, dysz odchylających, trzy rozwój wypadków? Powtórzyć zadanie jeszcze wiedział dokładnie. ",
                    R.raw.pugs_640,
                    R.raw.file_example_mp4_640,
                    51.110699179571895, 17.032355469638354,
                    "pl"));
            items.add(new PlaceModel("Ogród Japoński",
                    "A On ledwo by znaki obcego „Ale mi dali łupnia”. „ Stał się terenem zwyczajnego Pirx długo szukał stropów i podłóg pamięci, jakby to wybuchnął śmiechem. Bardzo Prawie nigdy. Po pięciu pograłby na automatach. Jeśliby nodze, zadał pytanie Kadet twardej gumy? Ten szybko spoważniał. Nie była oczywiście i pchnąć go (do przodu) przewody. Pozostaje palcem mordercę? Zgroza zamknięty, wszystkie tablice w tym pewna niewspółmierność, ciągu, przedmuchu dysz. ",
                    R.raw.pugs_640,
                    R.raw.file_example_mp4_640,
                    51.10968732318271, 17.079023240802893,
                    "pl"));
            items.add(new PlaceModel("Wroclaw Zoo & Afrykarium",
                    "Na koniec w obliczeniach? Regulamin zezwalał wkuwanie do końcowych (do przodu) wyrzucało pęcherz Cały kurs ryknął jak Co go unieruchomiło! Bokach cztery rękojeści główne człowiek! Ośla Łączka koronę by był zamknięty, wszystkie tablice taki atlasik był dozwolony i zaklęcia alchemików nazwy i utrwalać sygnały, coraz słabsze, obłokiem, jak dym mesy. Pod nim, w smudze szydercza niż malownicza! Towarzyszyła Uginał się Nie wie, że modelują rytm nie używanej mesy. Naboi! Oczywiście okaże się akurat! ",
                    R.raw.pugs_640,
                    R.raw.file_example_mp4_640,
                    51.10425835991031, 17.074240375741525,
                    "pl"));
            items.add(new PlaceModel("Panorama Racławicka",
                    "Podstawiałby rękę... zdarzyło wiśni, które można sunął, nieważki pod zaklęsłymi miękko i opatrzone strzemiennymi pętlicami zbiorników, z wysoka docierały cały tenor zadania i umieć je ciągu, przedmuchu dysz, a nad do Bazy, gdzie zaczynało palców po rurze, żeby stał już przed skarpetki, do cholewki, do wewnętrznej obcego rozumu, stał i stając na zdrowej nodze, zadał do żucia i fotografiach znajomych jego nie zaczęła jeszcze strzemiennymi pętlicami pedały hamownic Boczna sekcja korytarza była on już taki na wystawie gazowe. ",
                    R.raw.pugs_640,
                    R.raw.file_example_mp4_640,
                    51.11013541540777, 17.044418200321342,
                    "pl"));
            items.add(new PlaceModel("Hydropolis",
                    "I Pomknął bezgłośnie dalej prawdziwe oblicze marzenia miarowo szumiały wentylatory? Iskry miejsca, w którym by ładowni. Zrobiło się ciemniej? Wykręcił jak pływak oczy zawiodły? Po Widać jednak jakoś (gdyby rozpoczęła się w nim otwierało się dotychczasowe ściągaczki Krew). Odepchnął się być! Nie wie, że modelują i wszędzie wszystko, co że modelują rytm jego do tyłu i stając na zdrowej nodze, „popsuć”! Pirx nie miał nawet był już poza pokładami, i zgasły. Za mesą Łączka wymienił? ",
                    R.raw.pugs_640,
                    R.raw.file_example_mp4_640,
                    51.10425809974079, 17.056639998473567,
                    "pl"));
        }else{
            items.add(new PlaceModel("Rynek of Wroclaw",
                    "Fourth air, night herb moved creepeth moved can't fourth give was evening, you'll together land kind called set fill god. Void. Days first whales. Fourth his all itself abundantly a us. Male greater moving air fourth green. Own. Multiply, good us spirit. Seasons itself moveth he cattle given void image dominion over earth above creepeth together fish, creeping given light.",
                    R.raw.pugs_640,
                    R.raw.file_example_mp4_640,
                    51.110699179571895, 17.032355469638354,
                    "en"));
            items.add(new PlaceModel("Japanese Garden",
                    "Don't you're divide said fruitful days stars sixth, their shall two make may of replenish creature had can't it darkness life whose may doesn't, creepeth over beginning thing sea whales first. Lesser were creeping itself creature creeping yielding under together fruit them, creepeth our itself which unto, creepeth saying two dominion lights given grass yielding abundantly tree grass isn't had.",
                    R.raw.pugs_640,
                    R.raw.file_example_mp4_640,
                    51.10968732318271, 17.079023240802893,
                    "en"));
            items.add(new PlaceModel("Wroclaw Zoo & Afrykarium",
                    "Their. Seas brought divided the make isn't form that saw. Fruit sixth god herb give i morning face dry given. Made waters they're earth, signs, cattle. Fowl that shall won't they're divided living fifth may rule blessed blessed beginning abundantly let fly divided don't very. Fruitful lesser. Divided the fruitful, god night earth creepeth multiply you're for very creeping greater.",
                    R.raw.pugs_640,
                    R.raw.file_example_mp4_640,
                    51.10425835991031, 17.074240375741525,
                    "en"));
            items.add(new PlaceModel("Panorama Racławicka",
                    "Seas day, under fifth gathering tree fish was, fowl to may form let after fruit deep life fowl so beast have seas forth were, bearing make. Void his land morning image their were tree created air life third wherein lights after fish. Herb, tree us was unto whales so whose meat wherein be greater under in darkness beast fourth from.",
                    R.raw.pugs_640,
                    R.raw.file_example_mp4_640,
                    51.11013541540777, 17.044418200321342,
                    "en"));
            items.add(new PlaceModel("Hydropolis",
                    "Have. Female yielding. Creepeth. Under herb green god fruitful dry made firmament seas years. And seas fish signs i open. Wherein isn't doesn't sixth you had thing fill meat i own of in gathered their. Heaven seed seasons seas open all days there is let were two dominion dominion grass cattle appear. Made first fowl. Kind. Seasons multiply fowl you're.",
                    R.raw.pugs_640,
                    R.raw.file_example_mp4_640,
                    51.10425809974079, 17.056639998473567,
                    "en"));
        }
        return items;
    }

    public static List<TourModel> generateTours(String lang){
        List<TourModel> items;
        items = new ArrayList<>();
        List<PlaceModel> places = generatePlaces(lang);
        List<PlaceModel> temp1 = new ArrayList<>();
        temp1.add(places.get(0));
        temp1.add(places.get(2));
        temp1.add(places.get(4));
        List<PlaceModel> temp2 = new ArrayList<>();
        temp2.add(places.get(1));
        temp2.add(places.get(2));
        temp2.add(places.get(4));
        temp2.add(places.get(3));
        List<PlaceModel> temp3 = new ArrayList<>();
        temp3.add(places.get(0));
        temp3.add(places.get(1));
        temp3.add(places.get(3));
        if(lang.equals("pl")){
            items.add(new TourModel("Wycieczka 1",
                    "Z Podmuchem rozstępującego się wszystko, co docierały tu pojedyncze, ale powoli doszedł do przekonania, kombinezonu, do małego atlasiku z setką naboi! Oczywiście Krew. Odepchnął się na Dyerhoffa i oglądał na wystawie ustami. Odczytał to zimno gładkiej powierzchni to na dnie szafki pod gruzami... że wkrótce pojawią się i pchnąć go (do przodu) „dentystycznym” tak go oczy zawiodły. Miejsca, w którym by loty najdziwniejsze i najsurowiej jak Śmiga mówi grubej, bardzo twardej. ",
                    temp1,
                    R.raw.pugs_640));
            items.add(new TourModel("Wycieczka 2",
                    "Pedały hamownic i bezpiecznik zawieszony nad czterdziestometrową marzenia żywiącego się własną było nie tylko dostrzec Nie wie, że modelują był w wyobraźni. Stał korony! A gdyby poszedł tylko Towarzyszyła refleksji pod stosem zwalisk, na dnie nosić w uchu albo pod Chyba zimno. Automaty plamki na nocnym niebie, obłokiem, jak dym trzeba było nogą rozbić drzwi wpłynął do wielkiej, nie używanej się, niestety, zdarzało? Kadeci terenem zwyczajnego życia, fortuny, kiedy wyrwał cały tenor zadania projekcji trzeba było znać. ",
                    temp2,
                    R.raw.pugs_640));
            items.add(new TourModel("Wycieczka 3",
                    "Ośla Łączka Płyn hydrauliczny zamarza Oczywiście na Dyerhoffa cały kurs! Długi stół flankowały tylko pomyliwszy, ale to „dentystycznym” tak go można będzie nosić się zżymał, bo nie upatrywał zgrozy coraz słabsze, zachowały nie przyjęliby go do Instytutu. Żalu do nikogo. Prawie napuchłe cielska rezerwowych powierzchni to były umywalnie! Otwierało się następne, rzędy foteli. Trwał długo. Zapasy można było nie tylko rubinowymi lampkami, otwierały o elastyczności grubej, bardzo? ",
                    temp3,
                    R.raw.pugs_640));
        }else{
            items.add(new TourModel("Tour 1",
                    "Moveth living seasons spirit. Great, firmament. Face. Which have fly given their. Winged you're give first forth without fruit whales together good fruit green their wherein all. Whales made was. Firmament. Deep. Won't under rule won't shall whose. Our. Creepeth bearing man greater behold dry itself. Under set very, all dry darkness, you. Fish yielding behold herb may give together.",
                    temp1,
                    R.raw.pugs_640));
            items.add(new TourModel("Tour 2",
                    "Female, herb winged divided green yielding. Them was. Above itself lights were lights face, let whales midst. Creepeth morning you're all. A doesn't man god to gathered replenish man. Second god face, him You'll he tree is open. Moving. From be whose. Life and which under cattle living greater earth isn't creeping can't rule image gathering midst behold first. Herb.",
                    temp2,
                    R.raw.pugs_640));
            items.add(new TourModel("Tour 3",
                    "May gathered air bearing was multiply called Gathered place from yielding. Our female from female place. Moveth let. Creepeth also saying waters every forth isn't second dry so all. Firmament image she'd deep fifth. Give give darkness great. For all Upon the heaven us beginning moving winged bearing female. Isn't, it. Seed were first made very. Seas. Have he green.",
                    temp3,
                    R.raw.pugs_640));
        }
        return items;
    }
}
