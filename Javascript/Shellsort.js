const vet = [5, 3, 2, 4, 7, 1, 0, 6];
console.log(vet);


function shellSort(vet) {
    let i,j;
    let h = 1;
    let n = vet.length;
    while(h < n/3) {
        h = 3 * h + 1;
    }
    while(h >=1 ){
        for(i = h;  i < n; i++){
            for(j = i; j >= h && vet[j] < vet[j-h]; j-=h){
              console.log("i = " + i + " j = " + j + " h = " + h)
                console.log(vet);
                troca(vet,j,j-h);
            }
         
    }
    h = Math.floor(h / 3); // usar math floor para arredondar para baixo
}
    console.log(vet);
}

function troca(vet,i,j){
    let aux = vet[i];
    vet[i] = vet[j];
    vet[j] = aux;
}

shellSort(vet);