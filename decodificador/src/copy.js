async function copy() {
    const btnToCopy = document.querySelector('#copy');
    const textToCopy = document.querySelector('#answer-p').innerText;
    navigator.clipboard.writeText(textToCopy)
        .then(() => {
            btnToCopy.innerText = 'Texto copiado!';
        })
        .catch(err => {
            console.error('Erro ao copiar o texto: ', err);
            btnToCopy.innerText = 'Erro ao copiar!';
        });
        setTimeout(function() {
            btnToCopy.innerText = 'Copiar';
        }, 3000);
}