document.addEventListener('DOMContentLoaded', function() {
    var items = document.querySelectorAll('#experienceMenu .item');

    // Boucle à travers chaque élément de menu
    items.forEach(function(item) {
        // Ajoute un écouteur d'événements au clic sur chaque élément de menu
        item.addEventListener('click', function() {
            var subList = this.querySelector('.subList'); // Sélectionne la sous-liste correspondante

            // Vérifie si la sous-liste est actuellement masquée ou affichée
            if (subList.style.display === 'none' || subList.style.display === '') {
                subList.style.display = 'block'; // Affiche la sous-liste si elle est masquée
            } else {
                subList.style.display = 'none'; // Masque la sous-liste si elle est affichée
            }
        });
    });
});
