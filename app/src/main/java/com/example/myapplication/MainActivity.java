package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView frase;
    private Button gerarFrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frase = findViewById(R.id.frase);
        gerarFrases = findViewById(R.id.gerarFrases);
        getSupportActionBar().hide();
        gerarFrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] solucoes = {"As Baterias Inteligentes HION possuem 60% mais capacidade do que as baterias chumbo-ácido equivalentes.","As Baterias Inteligentes HION estão equipadas com a Tecnologia PMMH (Pack Mecânico Modular HION). Que se adapta aos principais tipos de aplicações. A Tecnologia PMMH está disponível em todos os padrões da indústria, do comércio e das residências.","As Baterias Inteligentes HION permitem  recargas ultra rápidas com alta eficiência energética. Podendo ser completamente carregada em 1 hora. As baterias de íons de líto HION podem carregar e descarregar profundamente com altas demandas energéticas, proporcionando máxima versatilidade para todos os tipos de aplicações. As Baterias Inteligentes HION são 97% eficientes, minimizando as perdas durante o carregamento, além de virem de fábrica com sistema de proteção ativa contra sobrecargas e curto-circuitos.","Poder e Potência constante. As Baterias Inteligentes HION fornecem com segurança toda potência nominal disponível durante os processos de descarga e permitem recargas com a máxima potência nominal. A tensão não cai como nas baterias chumbo-ácido equivalentes.","A eficiência energética das Baterias Inteligentes HION é incomparável. Especialmente em situações de alto estresse na bateria. O carregamento rápido minimiza o tempo de inatividade de seu equipamento e a alta taxa de descarga do Li-ion disponibilizam máxima energia tornando-as perfeitas para qualquer tipo de aplicação. As baterias chumbo-ácido equivalentes devem ser carregadas em estágios por muito mais tempo e apresentam desempenho ineficiente durante períodos de alta descarga, tornando-as menos versáteis que as Baterias Inteligentes HION.","Diferentemente das baterias chumbo-ácido equivalentes, as flutuações de temperatura e o esgotamento de energia mal afetam a entrega de energia das Baterias Inteligentes HION. Isso torna as Baterias Inteligentes HION a escolha lógica para aplicações que esgotam as baterias ou funcionam com condições climáticas extremas. As Baterias Inteligentes HION são 2.5X mais eficientes em baixas temperaturas em relação as baterias chumbo-ácido equivalentes. Atuando em conjunto com o BMS HION as Baterias Inteligentes HION oferecem total segurança operacional em temperaturas de até 65°C.","As Baterias Inteligentes HION possuem sofisticado Sistema Elêtrônico de Gerenciamento capaz de manter a bateria operando nas condições que possam suprir todas as necessidades de qualquer tipo de aplicação, além de proteger as células e o pack da bateria de serem danificados, o BMS HION permite a total Gestão, Conectividade e Interação com a bateria em tempo real.","As Baterias Inteligentes HION possuem 10x Mais Vida Útil  do que as baterias chumbo-ácido equivalentes. Ecológica e com menor custo operacional, reduz seus gastos com energia na sua conta de luz. As Baterias Inteligentes HION são fabricadas com metais leves, facilitando o processo de reciclagem e tornando sua redistribuição e reutilização fácil e econômica. Com a bateria inteligente HION você reduz encargos financeiros e operacionais associados com a reciclagem do chumbo ácido.","As Baterias Inteligentes HION possuem 60% menos peso do que as baterias chumbo-ácido equivalentes. Reduza as preocupações e os incidentes causados pelo peso da bateria. Comparado com outras químicas de baterias, as Baterias Inteligentes HION fornecem mais energia com  menos da metade do peso e tamanho. Isso significa mais flexibilidade e agilidade para seu dia a dia.","As Baterias Inteligentes HION não possuem o desagradável efeito memória, ou seja, não é preciso carregar a bateria até o total da capacidade e descarregar até o total mínimo, permitindo que você use 100% da capacidade da bateria da maneira que desejar e for mais conveniente. Sem se preocupar em perder capacidade ou reduzir a vida útil do produto. As Baterias Inteligentes HION foram projetadas para obter o máximo desempenho. A tecnologia da HION está na vanguarda do mercado de armazenamento de energia, fornecendo máxima energia com o mínimo de esforço. Nossas Baterias Inteligentes incorporam segurança e recursos que reduzem o risco de incêndio e explosão durante todo seu ciclo de vida","As baterias chumbo-ácido equivalentes exigem a substituição periódica da ácido tóxico interno para evitar danos estruturais. Caso contrário, sua vida útil é reduzida ainda mais. As Baterias Inteligentes HION não contêm chumbo ou ácidos tóxicos e não liberam gases explosivos durante o carregamento. Diga adeus aos vapores nocivos com um sistema limpo e construído para um ambiente de trabalho moderno e eficiente.","Instale, utilize e carregue. Baterias Inteligentes HION dispensam processos de manutenção. Uma única compra garante longevidade. Simplifique suas operações sem precisar gerenciar os cronogramas de manutenção de troca de ácido de suas baterias. Isso economiza tempo e dinheiro, permitindo que você faça suas atividades essenciais em vez de manter os cronogramas de manutenção da bateria."};
                Random random = new Random();
                int numerosAleatorios = random.nextInt(solucoes.length);
                frase.setText(solucoes[numerosAleatorios]);
            }
        });

    }
}



