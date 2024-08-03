import java.util.ArrayList;
import java.util.List;

public class BibliotecaDeEntretenimento {
    private List<Filme> colecaoDeFilmes;
    private List<Serie> colecaoDeSeries;
    private List<Entretenimento> listaDeAssistidos;

    public BibliotecaDeEntretenimento() {
        this.colecaoDeFilmes = new ArrayList<>();
        this.colecaoDeSeries = new ArrayList<>();
        this.listaDeAssistidos = new ArrayList<>();
    
    
        
        
        // Adicionando filmes e séries
        colecaoDeFilmes.add(new Filme("Homem de Ferro", "Tony Stark cria uma armadura para combater o mal.", 7.9, 93, "Jon Favreau", 126));
        colecaoDeFilmes.add(new Filme("Homem de Ferro 2", "Agora que o mundo sabe o quem é ele, o Homem de Ferro, Tony Stark deberá lidiar com o homem que quer vingança é que está vinculado com seu pai.", 6.9, 71, "Jon Favreau", 124));
        colecaoDeFilmes.add(new Filme("O incrível Hulk", "Bruce Banner é um cientista que fuge do governo dos Estados Unidos e deberá encontrar a cura para a besta o quem se converte quando perde seu temperamento.", 6.6, 69, "Louis Leterrier", 112));
        colecaoDeFilmes.add(new Filme("Thor", "O poderoso, mas arrogante deus Thor é expulso de Asgard para viver entre os humanos em Midgard, onde ele logo se torna um de seus melhores defensores.", 7.0, 76, "Kenneth Branagh", 115));
        colecaoDeFilmes.add(new Filme("Capitão América: O Primeiro Vingador", "Steve Rogers, um soldado militar rejeitado, se transforma em Capitão América depois de tomar uma dose de um soro de super soldado.", 6.9, 75, "Joe Johnston", 124));
        colecaoDeFilmes.add(new Filme("Os Vingadores", "Os heróis mais poderosos da Terra devem se unir e aprender a lutar como uma equipe para impedir que um exército alienígena escravize a humanidade.", 8.0, 91, "Joss Whedon", 143));
        colecaoDeFilmes.add(new Filme("Homem de Ferro 3", "Quando o mundo de Tony Stark é atacado pelo terrorista chamado Mandarin, ele comença uma odisseia para reconstruir e retribuir o atacado.", 7.1, 78, "Shane Black", 130));
        colecaoDeFilmes.add(new Filme("Thor: O Mundo Sombrio", "Quando a médica Jane Foster é amaldiçoada com uma entidade chamada Aether, Thor se vé enfrentado num evento cósmico.", 6.8, 75, "Alan Taylor", 112));
        colecaoDeFilmes.add(new Filme("Capitão América: Soldado Invernal", "Steve Roger se junta com a Viúva Negra para tentar deter uma nouva ameaça, um assasino conhecido como Soldado Invernal.", 7.7, 92, "Anthony Russo e Joe Russo", 136));
        colecaoDeFilmes.add(new Filme("Guardiões da Galáxia", "Um grupo de criminosos intergalácticos deve se unir para impedir que um guerreiro fanático com planos de destruir o universo.", 8.0, 92, "James Gunn", 121));
        colecaoDeFilmes.add(new Filme("Vingadores: Era de Ultron", "Quando Tony Stark e Bruce Banner tentam iniciar um pacífico programa de manutenção da paz, as coisas dão muito errado e os heróis mais poderosos da Terra deverão impedir o vilão Ultron.", 7.3, 82, "Joss Whedon", 141));
        colecaoDeFilmes.add(new Filme("Homem-Formiga", "Armado dum terno com a capacidade para se encolher mas para incrementar sua força, o ladrão Scott Lang deberá ser um herói e ajudar a seu mentor, Hank Pym.", 7.2, 85, "Peyton Reed", 117));
        colecaoDeFilmes.add(new Filme("Capitão América: Guerra Civil", "A participação política nos assuntos dos Vingadores causa uma ruptura entre o Capitão América e o Homem de Ferro.", 7.8, 89, "Anthony Russo e Joe Russo", 147));
        colecaoDeFilmes.add(new Filme("Doutor Estranho", "Durante uma jornada de cura física e espiritual, o brilhante neurocirurgião Stephen Strange é atraído para o mundo das artes místicas.", 7.5, 86, "Scott Derrickson", 115));
        colecaoDeFilmes.add(new Filme("Guardiões da Galáxia Vol.2", "Os Guardiões lutam para permanecer juntos como uma equipe, enquanto lidam com seus problemas familiares pessoais, particularmente o encontro do Senhor das Estrelas com seu pai", 7.6, 86, "James Gunn", 136));
        colecaoDeFilmes.add(new Filme("Homem-Aranha: De Volta ao Lar", "Peter Parker equilibra sua vida como um estudante comum do ensino médio no Queens com seu alter ego de super-herói, o Homem-Aranha, e se vê no encalço de uma nova ameaça que ronda os céus.", 7.4, 87, "Jon Watts", 133));
        colecaoDeFilmes.add(new Filme("Thor: Ragnarok", "Thor está aprisionado do outro lado do universo, sem seu martelo, e se vê em uma corrida para voltar até Asgard e impedir o Ragnarok, que está nas mãos de uma nova e poderosa ameaça, a terrível Hela.", 7.9, 87, "Taika Waititi", 130));
        colecaoDeFilmes.add(new Filme("Pantera Negra", "T'Challa, herdeiro do reino oculto, mas avançado de Wakanda, deve dar um passo adiante para conduzir seu povo a um novo futuro e deve enfrentar um adversário do passado de seu país.", 7.3, 79, "Ryan Coogler", 134));
        colecaoDeFilmes.add(new Filme("Vingadores: Guerra Infinita", "Os Vingadores e seus aliados deverão sacrificar tudo em uma tentativa de derrotar o poderoso Thanos antes que sua explosão de devastação ponha fim ao universo.", 8.4, 92, "Anthony Russo e Joe Russo", 149));
        colecaoDeFilmes.add(new Filme("Homem-Formiga e a Vespa", "Scott Lang tenta equilibrar sua vida familiar como pai com suas responsabilidades como Homem-Formiga, quando se apresenta uma nova missão para trazer à luz segredos do passado.", 7.0, 79, "Peyton Reed", 118));
        colecaoDeFilmes.add(new Filme("Capitã Marvel", "Um piloto da força aérea se torna uma das heróis mais poderosas do universo quando a Terra é capturada no meio de uma guerra galáctica entre duas raças alienígenas", 6.8, 45, "Anna Boden e Ryan Fleck", 123));
        colecaoDeFilmes.add(new Filme("Vingadores: Ultimato", "Após os eventos devastadores de Vingadores: Guerra Infinita , o universo está em ruínas, e com a ajuda de aliados os Vingadores se reúnem para desfazer as ações de Thanos e restaurar a ordem no universo", 8.4, 90, "Anthony Russo e Joe Russo", 181));
        colecaoDeFilmes.add(new Filme("Homem-Aranha: Longe de Casa", "Após os eventos de Vingadores: Ultimato (2019), o Homem-Aranha deve enfrentar novas ameaças em um mundo que mudou para sempre.", 7.4, 95, "Jonn Watts", 129));
        colecaoDeFilmes.add(new Filme("Viúva Negra", "Natasha Romanoff confronta o lado mais sombrio de sua história quando surge uma perigosa conspiração ligada ao seu passado.", 6.6, 91, "Cate Shortland", 134));
        colecaoDeFilmes.add(new Filme("Shang-Chi: e a Lenda dos Dez Anéis", "Shang-Chi é obrigado a confrontar um passado que julgava ter deixado para trás quando é atraído à teia da misteriosa organização conhecida como os Dez Anéis.", 7.4, 98, "Destin Daniel Cretton", 133));
        colecaoDeFilmes.add(new Filme("Eternos", "A saga dos Eternos, uma raça de seres imortais que viveram na Terra e transformaram sua história e civilização.", 6.3, 98, "Chloé Zhao", 156));
        colecaoDeFilmes.add(new Filme("Homem-Aranha: Sem Volta para Casa", "Com a identidade de Homem-Aranha revelada, Peter Parker pede ajuda ao Doutor Estranho. Quando um feitiço dá errado, inimigos de outros mundos começam a aparecer, forçando Peter a descobrir o que realmente significa ser o Homem-Aranha.", 8.2, 98, "Jonn Watts", 148));
        colecaoDeFilmes.add(new Filme("Doutor Estranho no Multiverso da Loucura", "O Doutor Estranho, com a ajuda de aliados místicos antigos e novos, atravessa as perigosas realidades alternativas e alucinantes do multiverso para enfrentar um novo adversário misterioso.", 6.9, 85, "Sam Raimi", 126));
        colecaoDeFilmes.add(new Filme("Thor: Amor e Trovão", "Thor pede a ajuda de Valkyrie, Korg e a ex-namorada Jane Foster para lutar contra Gorr, o Carniceiro de Deuses, que pretende extingui-los.", 6.2, 76, "Taiki Waititi", 125));
        colecaoDeFilmes.add(new Filme("Pantera Negra: Wakanda para Sempre", "A rainha Ramonda, Shuri, M'Baku, Okoye e as poderosas Dora Milaje lutam para proteger sua nação após a morte do rei T'Challa. Com a ajuda da Cão de Guerra Nakia e de Everett Ross, eles tentam encontrar um novo caminho para Wakanda.", 6.7, 76, "Ryan Coogler", 161));
        colecaoDeFilmes.add(new Filme("Guardiões da Faláxia Vol.3", "Após a perda de Gamora, Peter Quill ainda está chateado e deve reunir os Guardiões da Galáxia em uma missão para defender o universo e proteger Rocket.", 7.9, 94, "James Gunn", 150));
        colecaoDeFilmes.add(new Filme("As Marvels", "Quando os poderes de Carol Danvers, a Capitã Marvel, se entrelaçam aos de Kamala Khan, a Ms. Marvel, e aos de Monica Rambeau, atual astronauta da S.A.B.E.R., elas precisam aprender a trabalhar em conjunto para salvar o universo.", 5.5, 82, "Nia DaCosta", 105));
        colecaoDeFilmes.add(new Filme("Deadpool & Wolverine", "Deadpool recebe uma oferta da Autoridade de Variância Temporal para se juntar ao Universo Cinematográfico Marvel, mas em vez disso recruta uma variante do Wolverine para salvar seu universo da extinção.", 8.4, 96, "Shawn Levy", 128));
        
        colecaoDeSeries.add(new Serie("WandaVision", "Wanda e Visão vivem vidas suburbanas, mas algo está errado.", 7.9, 87, 1, 9));
        colecaoDeSeries.add(new Serie("Falcão e o Soldado Invernal", "Uma produção da Disney e da Marvel Studios, estrelando os personagens carismáticos Falcão e Soldado Invernal.", 7.1, 81, 1, 6));
        colecaoDeSeries.add(new Serie("Loki", "Loki, o Deus da Trapaça, embarca em aventuras através do tempo.", 8.2, 86, 2, 12));
        colecaoDeSeries.add(new Serie("Gavião Arqueiro", "Baseado no super-herói da Marvel Comics Hawkeye, focado nas aventuras de Young Avenger e Kate Bishop, que assumiram o papel após o vingador original, Clint Barton.", 7.5, 88, 1, 6));
        colecaoDeSeries.add(new Serie("Cavaleiro da Lua", "Marc Spector, um ex-agente da CIA, recebe uma segunda chance de vida do Deus egípcio Khonshu, que canaliza o poder da lua para se tornar seu avatar na Terra.", 7.3, 89, 1, 6));
        colecaoDeSeries.add(new Serie("Ms. Marvel", "Marc Spector, um ex-agente da CIA, recebe uma segunda chance de vida do Deus egípcio Khonshu, que canaliza o poder da lua para se tornar seu avatar na Terra.",6.2 , 80, 1, 6));
        colecaoDeSeries.add(new Serie("She-Hulk: Defensora de Heróis", "Jennifer Walters navega na vida complicada de uma advogada solteira de 30 e poucos anos que também é uma Hulk verde de 6 pés e 7 polegadas com superpoderes.",5.2 , 32, 1, 9));
        colecaoDeSeries.add(new Serie("Invasão Secreta", "Fúria e Talos estão tentando deter os Skrulls que se infiltraram nas esferas mais altas do universo Marvel.",5.9 , 45, 1, 6));
        colecaoDeSeries.add(new Serie("Eco", "Maya Lopez deve enfrentar seu passado, se reconectar com suas raízes nativas americanas e abraçar um senso de família e comunidade se ela espera seguir em frente.",6.0 , 59, 1, 5));

   }

    public void listarFilmes() {
        System.out.println("Filmes Disponíveis:");
        for (int i = 0; i < colecaoDeFilmes.size(); i++) {
            Filme filme = colecaoDeFilmes.get(i);
            System.out.println((i + 1) + ". " + filme.getTitulo());
        }
    }

    public void listarSeries() {
        System.out.println("Séries Disponíveis:");
        for (int i = 0; i < colecaoDeSeries.size(); i++) {
            Serie serie = colecaoDeSeries.get(i);
            System.out.println((i + 1) + ". " + serie.getTitulo());
        }
    }

    public Filme getFilme(int index) {
        if (index >= 0 && index < colecaoDeFilmes.size()) {
            return colecaoDeFilmes.get(index);
        }
        return null;
    }

    public Serie getSerie(int index) {
        if (index >= 0 && index < colecaoDeSeries.size()) {
            return colecaoDeSeries.get(index);
        }
        return null;
    }

    public void adicionarAssistido(Entretenimento entretenimento) {
        listaDeAssistidos.add(entretenimento);
    }

    public void listarAssistidos() {
        System.out.println("Itens Assistidos:");
        for (Entretenimento entretenimento : listaDeAssistidos) {
            if (entretenimento instanceof Assistivel) {
                System.out.println(((Assistivel) entretenimento).getDetalhes());
            }
        }
    }
    
}
