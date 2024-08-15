async function copy() {
    const textToCopy = document.querySelector('#answer-p').value;
    navigator.clipboard.writeText(textToCopy)
        .then(() => {
            document.getElementById('copyStatus').innerText = 'Texto copiado!';
        })
        .catch(err => {
            console.error('Erro ao copiar o texto: ', err);
            document.getElementById('copyStatus').innerText = 'Erro ao copiar!';
        });
}