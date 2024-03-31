// JavaScript pour créer le graphique
var ctx = document.getElementById('myChart').getContext('2d');
var myChart = new Chart(ctx, {
    type: 'pie', // Type de graphique : camembert
    data: {
        labels: ['Reseaux', 'Programmation', 'Système d exploitation', 'Docker'], // Quatre labels
        datasets: [{
            label: '# of Votes', // Légende du dataset
            data: [50, 15, 25, 10], // Quatre valeurs correspondant aux labels
            backgroundColor: [ // Couleurs de fond pour chaque section
                'rgba(255, 99, 132, 0.2)',
                'rgba(54, 162, 235, 0.2)',
                'rgba(255, 206, 86, 0.2)',
                'rgba(75, 192, 192, 0.2)'
            ],
            borderColor: [ // Couleurs de bordure pour chaque section
                'rgba(255, 99, 132, 1)',
                'rgba(54, 162, 235, 1)',
                'rgba(255, 206, 86, 1)',
                'rgba(75, 192, 192, 1)'
            ],
            borderWidth: 1 // Épaisseur de la bordure
        }]
    },
    options: {
        scales: {
            y: { // Axe y
                beginAtZero: true // Commencer à zéro
            }
        }
    }
});
