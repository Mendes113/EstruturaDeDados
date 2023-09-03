const vet = [5, 3, 2, 4, 7, 1, 0, 6];
console.log(vet);

function selecao(vet, i) {
    let min;
    let j;
  
    for (i = 0; i < vet.length; i++) {
        min = i;
        for (j = i + 1; j < vet.length; j++) {
            if (vet[j] < vet[min]) {
                min = j;
            }
        }
        if (i != min) {
            troca(vet, i, min);
        }
    }
    console.log(vet);
}

function troca(vet,i,min) {
    let aux = vet[i];
    vet[i] = vet[min];
    vet[min] = aux;
}

selecao(vet);