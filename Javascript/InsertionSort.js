const vet = [5, 3, 2, 4, 7, 1, 0, 6];
console.log(vet);

function insert(vet) {
    for (let i = 1; i < vet.length; i++) {
        // A partir do segundo elemento, expande o subvetor ordenado.
        let j = i; // Inicializa um índice para percorrer os elementos do subvetor.
        let x = vet[i]; // Armazena o elemento que está sendo inserido no subvetor.
        
        // Move os elementos maiores do que x uma posição à frente no subvetor.
        while (j > 0 && x < vet[j - 1]) {
            vet[j] = vet[j - 1]; // Move o elemento maior uma posição à frente.
            j--; // Decrementa o índice para continuar comparando com elementos anteriores.
        }
        
        vet[j] = x; // Insere x na posição correta no subvetor ordenado.
    }
    console.log(vet); // Exibe o array ordenado.
}

insert(vet);
