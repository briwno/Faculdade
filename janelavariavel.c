/*/*Média móvel com janela variável
Desenvolver um algoritmo para o cálculo de uma média móvel simples(1)
para um vetor de entrada de tamanho variável X e uma janela (quantidade
de itens do vetor que será feita a média) de tamanho variável Y e a saída num
vetor resultante. A janela de média deve ser deslocada a fim de correr todo o
vetor X e ir calculando as médias conforme o tamanho da janela Y. Esse
algoritmo pode ser desenvolvido em Portugol, C, C++, Java, C#, Python, JavaScript,
ou em outra linguagem a seu critério.

Não é necessário fazer a leitura do input dos dados, considere que os dados já
estão presentes em alguma variável ou então que você está fazendo uma
função ou classe/método e os dados serão parâmetros de entrada e saída.*/

#include <stdio.h>
#include <stdlib.h>

int main(){
    int vetor[8] = {1,3,5,9,21,3,9,7};
    int janela = 2;
    int i, j, k;
    int soma = 0;
    int media = 0;
    int vetor_resultante[8];

    for(i = 0; i < 8; i++){
        if(i < janela){
            for(j = 0; j <= i; j++){
                soma += vetor[j];
            }
            media = soma/(i+1);
            vetor_resultante[i] = media;
            soma = 0;
        }else{
            for(k = i; k > i-janela; k--){
                soma += vetor[k];
            }
            media = soma/janela;
            vetor_resultante[i] = media;
            soma = 0;
        }
    }

    for(i = 0; i < 8; i++){
        printf("%i ", vetor_resultante[i]);
    }
}