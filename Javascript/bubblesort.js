const vet = [5, 3, 2, 4, 7, 1, 0, 6];

console.log(vet);

function bubbleSort(vet) {
    let i;
    let trocado;
    do {
        trocado = false;
        for (i = 1; i < vet.length; i++) {
            if (vet[i - 1] > vet[i]) {
                troca(vet, i - 1, i);
                trocado = true;
            }
        }
    } while (trocado);
    console.log(vet);
}

function troca(vet, i, j) {
    let aux = vet[i];
    vet[i] = vet[j];
    vet[j] = aux;
}

bubbleSort(vet);
